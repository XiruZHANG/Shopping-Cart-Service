
package shop.com.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>addProductCart complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="addProductCart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="prodId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addProductCart", propOrder = {
    "username",
    "prodId"
})
public class AddProductCart {

    protected int username;
    protected int prodId;

    /**
     * ��ȡusername���Ե�ֵ��
     * 
     */
    public int getUsername() {
        return username;
    }

    /**
     * ����username���Ե�ֵ��
     * 
     */
    public void setUsername(int value) {
        this.username = value;
    }

    /**
     * ��ȡprodId���Ե�ֵ��
     * 
     */
    public int getProdId() {
        return prodId;
    }

    /**
     * ����prodId���Ե�ֵ��
     * 
     */
    public void setProdId(int value) {
        this.prodId = value;
    }

}
