
package shop.com.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>addProductCart complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取username属性的值。
     * 
     */
    public int getUsername() {
        return username;
    }

    /**
     * 设置username属性的值。
     * 
     */
    public void setUsername(int value) {
        this.username = value;
    }

    /**
     * 获取prodId属性的值。
     * 
     */
    public int getProdId() {
        return prodId;
    }

    /**
     * 设置prodId属性的值。
     * 
     */
    public void setProdId(int value) {
        this.prodId = value;
    }

}
