
package client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ExpressionService", targetNamespace = "http://service.expressionproject/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ExpressionService {


    /**
     * 
     * @param expression
     * @return
     *     returns double
     * @throws DevisionByZeroException_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "calculate", targetNamespace = "http://service.expressionproject/", className = "client.Calculate")
    @ResponseWrapper(localName = "calculateResponse", targetNamespace = "http://service.expressionproject/", className = "client.CalculateResponse")
    public double calculate(
        @WebParam(name = "expression", targetNamespace = "")
        Expression expression)
        throws DevisionByZeroException_Exception
    ;

}
