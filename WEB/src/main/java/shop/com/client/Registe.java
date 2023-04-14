
package shop.com.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Registe complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Registe"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="motDePasse" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Registe", propOrder = {
    "username",
    "motDePasse"
})
public class Registe {

    protected int username;
    protected int motDePasse;

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
     * 获取motDePasse属性的值。
     * 
     */
    public int getMotDePasse() {
        return motDePasse;
    }

    /**
     * 设置motDePasse属性的值。
     * 
     */
    public void setMotDePasse(int value) {
        this.motDePasse = value;
    }

}
