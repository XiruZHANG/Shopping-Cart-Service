
package com.shop.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.5.5
 * Fri Apr 14 22:55:50 CEST 2023
 * Generated source version: 3.5.5
 */

@XmlRootElement(name = "addProductCart", namespace = "http://www.com.shop")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addProductCart", namespace = "http://www.com.shop", propOrder = {"username", "prodId"})

public class AddProductCart {

    @XmlElement(name = "username")
    private int username;
    @XmlElement(name = "prodId")
    private int prodId;

    public int getUsername() {
        return this.username;
    }

    public void setUsername(int newUsername)  {
        this.username = newUsername;
    }

    public int getProdId() {
        return this.prodId;
    }

    public void setProdId(int newProdId)  {
        this.prodId = newProdId;
    }

}

