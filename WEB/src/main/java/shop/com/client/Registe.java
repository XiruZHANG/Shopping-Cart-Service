
package shop.com.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Registe complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmotDePasse���Ե�ֵ��
     * 
     */
    public int getMotDePasse() {
        return motDePasse;
    }

    /**
     * ����motDePasse���Ե�ֵ��
     * 
     */
    public void setMotDePasse(int value) {
        this.motDePasse = value;
    }

}
