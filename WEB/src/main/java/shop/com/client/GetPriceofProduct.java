
package shop.com.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getPriceofProduct complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="getPriceofProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "getPriceofProduct", propOrder = {
    "prodId"
})
public class GetPriceofProduct {

    protected int prodId;

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
