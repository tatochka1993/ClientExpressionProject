
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package.
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

    private final static QName _DevisionByZeroException_QNAME = new QName("http://service.expressionproject/", "DevisionByZeroException");
    private final static QName _Expression_QNAME = new QName("http://service.expressionproject/", "expression");
    private final static QName _CalculateResponse_QNAME = new QName("http://service.expressionproject/", "calculateResponse");
    private final static QName _Calculate_QNAME = new QName("http://service.expressionproject/", "calculate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Expression }
     * 
     */
    public Expression createExpression() {
        return new Expression();
    }

    /**
     * Create an instance of {@link DevisionByZeroException }
     * 
     */
    public DevisionByZeroException createDevisionByZeroException() {
        return new DevisionByZeroException();
    }

    /**
     * Create an instance of {@link CalculateResponse }
     * 
     */
    public CalculateResponse createCalculateResponse() {
        return new CalculateResponse();
    }

    /**
     * Create an instance of {@link Calculate }
     * 
     */
    public Calculate createCalculate() {
        return new Calculate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevisionByZeroException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.expressionproject/", name = "DevisionByZeroException")
    public JAXBElement<DevisionByZeroException> createDevisionByZeroException(DevisionByZeroException value) {
        return new JAXBElement<DevisionByZeroException>(_DevisionByZeroException_QNAME, DevisionByZeroException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Expression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.expressionproject/", name = "expression")
    public JAXBElement<Expression> createExpression(Expression value) {
        return new JAXBElement<Expression>(_Expression_QNAME, Expression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.expressionproject/", name = "calculateResponse")
    public JAXBElement<CalculateResponse> createCalculateResponse(CalculateResponse value) {
        return new JAXBElement<CalculateResponse>(_CalculateResponse_QNAME, CalculateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calculate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.expressionproject/", name = "calculate")
    public JAXBElement<Calculate> createCalculate(Calculate value) {
        return new JAXBElement<Calculate>(_Calculate_QNAME, Calculate.class, null, value);
    }

}
