
package com.soapboxrace.jaxb.http;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reward complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reward">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rep" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Tokens" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reward", propOrder = {
    "rep",
    "tokens"
})
public class Reward {

    @XmlElement(name = "Rep")
    protected int rep;
    @XmlElement(name = "Tokens")
    protected int tokens;

    /**
     * Gets the value of the rep property.
     * 
     */
    public int getRep() {
        return rep;
    }

    /**
     * Sets the value of the rep property.
     * 
     */
    public void setRep(int value) {
        this.rep = value;
    }

    /**
     * Gets the value of the tokens property.
     * 
     */
    public int getTokens() {
        return tokens;
    }

    /**
     * Sets the value of the tokens property.
     * 
     */
    public void setTokens(int value) {
        this.tokens = value;
    }

}
