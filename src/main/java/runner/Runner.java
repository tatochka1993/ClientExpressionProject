package runner;

import client.DevisionByZeroException_Exception;
import client.Expression;
import client.ExpressionService;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;


public class Runner {

    public static void main(String[] args) {
        try {
            URL wsdlURL = new URL("http://localhost:8080/ws/expressionService?wsdl");
            QName qname = new QName("http://impl.service.expressionproject/", "expressionService");

            javax.xml.ws.Service service = javax.xml.ws.Service.create(wsdlURL, qname);
            ExpressionService expressionService = service.getPort(ExpressionService.class);

            Expression expression1 = new Expression();
            expression1.setNumber1(2);
            expression1.setNumber2(3);
            expression1.setOperation("*");

            Expression expression2 = new Expression();
            expression2.setNumber1(2);
            expression2.setNumber2(3);
            expression2.setOperation("+");

            Expression expression3 = new Expression();
            expression3.setNumber1(2);
            expression3.setNumber2(3);
            expression3.setOperation("-");

            Expression expression4 = new Expression();
            expression4.setNumber1(2);
            expression4.setNumber2(0);
            expression4.setOperation("/");

            System.out.println(expressionService.calculate(expression1));
            System.out.println(expressionService.calculate(expression2));
            System.out.println(expressionService.calculate(expression3));
            System.out.println(expressionService.calculate(expression4));

            System.out.println(expressionService);
        }  catch (DevisionByZeroException_Exception e) {
            System.out.println("caught exception 'Devision by zero'");
        }  catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
