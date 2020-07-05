
package com.exemple.webservice.userservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserDetail" type="{http://com/exemple/webservice/userservice}User"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userDetail"
})
@XmlRootElement(name = "UserDetailResponse")
public class UserDetailResponse {

    @XmlElement(name = "UserDetail", required = true)
    protected User userDetail;

    /**
     * Obtém o valor da propriedade userDetail.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUserDetail() {
        return userDetail;
    }

    /**
     * Define o valor da propriedade userDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUserDetail(User value) {
        this.userDetail = value;
    }

}
