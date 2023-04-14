
package shop.com.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the shop.com.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Order_QNAME = new QName("http://www.com.shop", "Order");
    private final static QName _OrderResponse_QNAME = new QName("http://www.com.shop", "OrderResponse");
    private final static QName _Registe_QNAME = new QName("http://www.com.shop", "Registe");
    private final static QName _RegisteResponse_QNAME = new QName("http://www.com.shop", "RegisteResponse");
    private final static QName _AddProductCart_QNAME = new QName("http://www.com.shop", "addProductCart");
    private final static QName _AddProductCartResponse_QNAME = new QName("http://www.com.shop", "addProductCartResponse");
    private final static QName _GetPriceofProduct_QNAME = new QName("http://www.com.shop", "getPriceofProduct");
    private final static QName _GetPriceofProductResponse_QNAME = new QName("http://www.com.shop", "getPriceofProductResponse");
    private final static QName _RemoveProductCart_QNAME = new QName("http://www.com.shop", "removeProductCart");
    private final static QName _RemoveProductCartResponse_QNAME = new QName("http://www.com.shop", "removeProductCartResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: shop.com.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link OrderResponse }
     * 
     */
    public OrderResponse createOrderResponse() {
        return new OrderResponse();
    }

    /**
     * Create an instance of {@link Registe }
     * 
     */
    public Registe createRegiste() {
        return new Registe();
    }

    /**
     * Create an instance of {@link RegisteResponse }
     * 
     */
    public RegisteResponse createRegisteResponse() {
        return new RegisteResponse();
    }

    /**
     * Create an instance of {@link AddProductCart }
     * 
     */
    public AddProductCart createAddProductCart() {
        return new AddProductCart();
    }

    /**
     * Create an instance of {@link AddProductCartResponse }
     * 
     */
    public AddProductCartResponse createAddProductCartResponse() {
        return new AddProductCartResponse();
    }

    /**
     * Create an instance of {@link GetPriceofProduct }
     * 
     */
    public GetPriceofProduct createGetPriceofProduct() {
        return new GetPriceofProduct();
    }

    /**
     * Create an instance of {@link GetPriceofProductResponse }
     * 
     */
    public GetPriceofProductResponse createGetPriceofProductResponse() {
        return new GetPriceofProductResponse();
    }

    /**
     * Create an instance of {@link RemoveProductCart }
     * 
     */
    public RemoveProductCart createRemoveProductCart() {
        return new RemoveProductCart();
    }

    /**
     * Create an instance of {@link RemoveProductCartResponse }
     * 
     */
    public RemoveProductCartResponse createRemoveProductCartResponse() {
        return new RemoveProductCartResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Order }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.com.shop", name = "Order")
    public JAXBElement<Order> createOrder(Order value) {
        return new JAXBElement<Order>(_Order_QNAME, Order.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.com.shop", name = "OrderResponse")
    public JAXBElement<OrderResponse> createOrderResponse(OrderResponse value) {
        return new JAXBElement<OrderResponse>(_OrderResponse_QNAME, OrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registe }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Registe }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.com.shop", name = "Registe")
    public JAXBElement<Registe> createRegiste(Registe value) {
        return new JAXBElement<Registe>(_Registe_QNAME, Registe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.com.shop", name = "RegisteResponse")
    public JAXBElement<RegisteResponse> createRegisteResponse(RegisteResponse value) {
        return new JAXBElement<RegisteResponse>(_RegisteResponse_QNAME, RegisteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductCart }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddProductCart }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.com.shop", name = "addProductCart")
    public JAXBElement<AddProductCart> createAddProductCart(AddProductCart value) {
        return new JAXBElement<AddProductCart>(_AddProductCart_QNAME, AddProductCart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductCartResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddProductCartResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.com.shop", name = "addProductCartResponse")
    public JAXBElement<AddProductCartResponse> createAddProductCartResponse(AddProductCartResponse value) {
        return new JAXBElement<AddProductCartResponse>(_AddProductCartResponse_QNAME, AddProductCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPriceofProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPriceofProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.com.shop", name = "getPriceofProduct")
    public JAXBElement<GetPriceofProduct> createGetPriceofProduct(GetPriceofProduct value) {
        return new JAXBElement<GetPriceofProduct>(_GetPriceofProduct_QNAME, GetPriceofProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPriceofProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPriceofProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.com.shop", name = "getPriceofProductResponse")
    public JAXBElement<GetPriceofProductResponse> createGetPriceofProductResponse(GetPriceofProductResponse value) {
        return new JAXBElement<GetPriceofProductResponse>(_GetPriceofProductResponse_QNAME, GetPriceofProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProductCart }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveProductCart }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.com.shop", name = "removeProductCart")
    public JAXBElement<RemoveProductCart> createRemoveProductCart(RemoveProductCart value) {
        return new JAXBElement<RemoveProductCart>(_RemoveProductCart_QNAME, RemoveProductCart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProductCartResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveProductCartResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.com.shop", name = "removeProductCartResponse")
    public JAXBElement<RemoveProductCartResponse> createRemoveProductCartResponse(RemoveProductCartResponse value) {
        return new JAXBElement<RemoveProductCartResponse>(_RemoveProductCartResponse_QNAME, RemoveProductCartResponse.class, null, value);
    }

}
