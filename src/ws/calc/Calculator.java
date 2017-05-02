
package ws.calc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Calculator", targetNamespace = "http://calc.ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculator {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sum", targetNamespace = "http://calc.ws/", className = "ws.calc.Sum")
    @ResponseWrapper(localName = "sumResponse", targetNamespace = "http://calc.ws/", className = "ws.calc.SumResponse")
    @Action(input = "http://calc.ws/Calculator/sumRequest", output = "http://calc.ws/Calculator/sumResponse")
    public int sum(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "greet", targetNamespace = "http://calc.ws/", className = "ws.calc.Greet")
    @ResponseWrapper(localName = "greetResponse", targetNamespace = "http://calc.ws/", className = "ws.calc.GreetResponse")
    @Action(input = "http://calc.ws/Calculator/greetRequest", output = "http://calc.ws/Calculator/greetResponse")
    public String greet(
        @WebParam(name = "arg0", targetNamespace = "")
        Person arg0);

}