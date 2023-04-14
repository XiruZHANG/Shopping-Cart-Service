package com.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(targetNamespace="http://www.com.shop")
public class fonction {
	private static final String DB_URL = "jdbc:mysql://mysql-qichen.alwaysdata.net:3306/qichen_webprojet";
    private static final String DB_USER = "qichen";
    private static final String DB_PASSWORD = "shaoqichen12345";
    
    @WebMethod
	public static String Registe(@WebParam(name="username") int username, @WebParam(name="motDePasse") int motDePasse) {
    	Connection conn = null;
		PreparedStatement preparedStatement = null;
		ResultSet rowsAffected = null;
    	try {
    		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
		
	        String query = "SELECT * FROM compte where username=? and motDePasse=?";
            preparedStatement = conn.prepareStatement(query);
            //setvalue
            preparedStatement.setInt(1,username);
            preparedStatement.setInt(2,motDePasse);
            rowsAffected = preparedStatement.executeQuery();
		    // verifier
            if(rowsAffected.next()) {
            	String user = rowsAffected.getString("username");
            	return user;
            }
            else {
            	return "echecs";
            }
		    
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
   }
    
    @WebMethod
	public static int getPriceofProduct(@WebParam(name="prodId") int prodId) {
    	Connection conn = null;
		PreparedStatement preparedStatement = null;
		ResultSet rowsAffected=null;
    	try {
    		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
			String query = "SELECT * FROM produit where prodId=?";
            preparedStatement = conn.prepareStatement(query);
            //setvalue
            preparedStatement.setInt(1,prodId);
            rowsAffected = preparedStatement.executeQuery();
        	
		    if (rowsAffected.next()) {
		    	System.out.println("getprice avec succes！");
		    	return rowsAffected.getInt("price");
		    } else {
		    	System.out.println("echecs！");
		    	return rowsAffected.getInt("price");
		    }
		}catch(SQLException e) {
			e.printStackTrace();
		}
    	
		return prodId;
		
	}
    
    
    @WebMethod
	public static void addProductCart(@WebParam(name="username") int username, @WebParam(name="prodId") int prodId) {
    	Connection conn = null;
		PreparedStatement preparedStatementselect = null;
		
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
			//id augmenter automatiquement
			int id_add=1;
			String queryselect = "SELECT * FROM cart";
            preparedStatementselect = conn.prepareStatement(queryselect);
            //setvalue
            ResultSet rows = preparedStatementselect.executeQuery();
		    while (rows.next()) {
		    	id_add=rows.getInt("id");
		    	id_add++;
		    }
			
			String query = "INSERT INTO cart (id,username,prodId,ord) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            //setvalue
            preparedStatement.setInt(1,id_add);//id_add
            preparedStatement.setInt(2, username);
            preparedStatement.setInt(3, prodId);
            preparedStatement.setString(4, null);
            int rowsAffected=preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
		    	System.out.println("add avec succes！");
		    } else {
		    	System.out.println("faute！");
		    }    
            preparedStatement.close();
            conn.close();
			id_add++;
		}catch(SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
    
    @WebMethod
	public static void removeProductCart(@WebParam(name="id") int id) {
    	Connection conn = null;
		PreparedStatement preparedStatement = null;
    	try {
    		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
		    //sql
		    String sql = "DELETE FROM cart WHERE id = ?";
		    // cree
		     preparedStatement = conn.prepareStatement(sql);    
		    // parametre
		    preparedStatement.setInt(1, id);        
		    // supprimer
		    int rowsAffected = preparedStatement.executeUpdate();
		    // verifier
		    if (rowsAffected > 0) {
		    	System.out.println("supprimer avec succes！");
		    } else {
		    	System.out.println("faute！");
		    }    
            // close
	        preparedStatement.close();
	        conn.close();
	        } 
		catch (SQLException e) {
	            e.printStackTrace();
	        }
	}
	
	@WebMethod
	public static void Order(@WebParam(name="id") int id) {
		Connection conn = null;
		PreparedStatement preparedStatement = null;
    	try {
    		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
		    //sql
		    String sql = "UPDATE cart SET ord = ? WHERE id = ?";
		    // creer
		    preparedStatement = conn.prepareStatement(sql);    
		    // augmenter
		    preparedStatement.setString(1, "True"); 
		    preparedStatement.setInt(2, id);
		    // order
		    int rowsAffected = preparedStatement.executeUpdate();
		    // verfier
		    if (rowsAffected > 0) {
		    	System.out.println("order avec succes！");
		    } else {
		    	System.out.println("echecs！");
		    }    
            // close
	        preparedStatement.close();
	        conn.close();
	        } 
		catch (SQLException e) {
	            e.printStackTrace();
	        }
		
	}
    
	public static void main(String[] args) {
	Registe(111,20);
	int price =getPriceofProduct(1);
	System.out.print(price);
	addProductCart(111,2);
	removeProductCart(3);
	Order(3);
}
}
