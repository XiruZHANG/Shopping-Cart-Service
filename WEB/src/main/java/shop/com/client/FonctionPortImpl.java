
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package shop.com.client;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.5
 * 2023-04-14T23:01:26.995+02:00
 * Generated source version: 3.5.5
 *
 */

@javax.jws.WebService(
                      serviceName = "fonctionService",
                      portName = "fonctionPort",
                      targetNamespace = "http://www.com.shop",
                      wsdlLocation = "file:/D:/eclipse-jee-2022-12-R-win32-x86_64/workspace/WEB/src/main/webapp/wsdl/fonction.wsdl",
                      endpointInterface = "shop.com.client.Fonction")

public class FonctionPortImpl implements Fonction {

    private static final Logger LOG = Logger.getLogger(FonctionPortImpl.class.getName());

    /* (non-Javadoc)
     * @see shop.com.client.Fonction#getPriceofProduct(int prodId)*
     */
    public int getPriceofProduct(int prodId) {
        LOG.info("Executing operation getPriceofProduct");
        System.out.println(prodId);
        try {
            int _return = -554057174;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see shop.com.client.Fonction#removeProductCart(int id)*
     */
    public void removeProductCart(int id) {
        LOG.info("Executing operation removeProductCart");
        System.out.println(id);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see shop.com.client.Fonction#order(int id)*
     */
    public void order(int id) {
        LOG.info("Executing operation order");
        System.out.println(id);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see shop.com.client.Fonction#registe(int username, int motDePasse)*
     */
    public java.lang.String registe(int username, int motDePasse) {
        LOG.info("Executing operation registe");
        System.out.println(username);
        System.out.println(motDePasse);
        try {
            java.lang.String _return = "_return163702015";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see shop.com.client.Fonction#addProductCart(int username, int prodId)*
     */
    public void addProductCart(int username, int prodId) {
        LOG.info("Executing operation addProductCart");
        System.out.println(username);
        System.out.println(prodId);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
