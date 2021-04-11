
package com.asw.ws.ex1.webservice;

import java.util.List;
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
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Billing", targetNamespace = "http://endpoint.ex1.ws.asw.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Billing {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addNewCard", targetNamespace = "http://endpoint.ex1.ws.asw.com/", className = "com.asw.ws.ex1.webservice.AddNewCard")
    @ResponseWrapper(localName = "addNewCardResponse", targetNamespace = "http://endpoint.ex1.ws.asw.com/", className = "com.asw.ws.ex1.webservice.AddNewCardResponse")
    @Action(input = "http://endpoint.ex1.ws.asw.com/Billing/addNewCardRequest", output = "http://endpoint.ex1.ws.asw.com/Billing/addNewCardResponse")
    public void addNewCard(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Card> arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.asw.ws.ex1.webservice.Card
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCard", targetNamespace = "http://endpoint.ex1.ws.asw.com/", className = "com.asw.ws.ex1.webservice.GetCard")
    @ResponseWrapper(localName = "getCardResponse", targetNamespace = "http://endpoint.ex1.ws.asw.com/", className = "com.asw.ws.ex1.webservice.GetCardResponse")
    @Action(input = "http://endpoint.ex1.ws.asw.com/Billing/getCardRequest", output = "http://endpoint.ex1.ws.asw.com/Billing/getCardResponse")
    public Card getCard(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "processOperation", targetNamespace = "http://endpoint.ex1.ws.asw.com/", className = "com.asw.ws.ex1.webservice.ProcessOperation")
    @ResponseWrapper(localName = "processOperationResponse", targetNamespace = "http://endpoint.ex1.ws.asw.com/", className = "com.asw.ws.ex1.webservice.ProcessOperationResponse")
    @Action(input = "http://endpoint.ex1.ws.asw.com/Billing/processOperationRequest", output = "http://endpoint.ex1.ws.asw.com/Billing/processOperationResponse")
    public void processOperation(
        @WebParam(name = "arg0", targetNamespace = "")
        List<CardOperation> arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addMoney", targetNamespace = "http://endpoint.ex1.ws.asw.com/", className = "com.asw.ws.ex1.webservice.AddMoney")
    @ResponseWrapper(localName = "addMoneyResponse", targetNamespace = "http://endpoint.ex1.ws.asw.com/", className = "com.asw.ws.ex1.webservice.AddMoneyResponse")
    @Action(input = "http://endpoint.ex1.ws.asw.com/Billing/addMoneyRequest", output = "http://endpoint.ex1.ws.asw.com/Billing/addMoneyResponse")
    public void addMoney(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

}
