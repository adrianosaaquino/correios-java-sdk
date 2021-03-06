//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.03.07 at 04:22:37 PM BRT
//


package br.com.correios.api.postagem.xml;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlMarshalNullRepresentation;
import org.eclipse.persistence.oxm.annotations.XmlNullPolicy;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}tipo_arquivo"/>
 *         &lt;element ref="{}versao_arquivo"/>
 *         &lt;element ref="{}plp"/>
 *         &lt;element ref="{}remetente"/>
 *         &lt;element ref="{}forma_pagamento"/>
 *         &lt;element ref="{}objeto_postal" maxOccurs="1000"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tipoArquivo",
    "versaoArquivo",
    "plp",
    "remetente",
    "formaPagamento",
    "objetoPostal"
})
@XmlRootElement(name = "correioslog")
public class Correioslog {

    @XmlElement(name = "tipo_arquivo", required = true)
    @XmlNullPolicy(emptyNodeRepresentsNull = true, nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE)
    protected String tipoArquivo;

    @XmlElement(name = "versao_arquivo", required = true)
    @XmlNullPolicy(emptyNodeRepresentsNull = true, nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE)
    protected BigDecimal versaoArquivo;

    @XmlElement(required = true)
    @XmlNullPolicy(emptyNodeRepresentsNull = true, nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE)
    protected DadosPlp plp;

    @XmlElement(required = true)
    @XmlNullPolicy(emptyNodeRepresentsNull = true, nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE)
    protected Remetente remetente;

    @XmlElement(name = "forma_pagamento", required = true)
    @XmlNullPolicy(emptyNodeRepresentsNull = true, nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE)
    protected String formaPagamento;

    @XmlElement(name = "objeto_postal", required = true)
    @XmlNullPolicy(emptyNodeRepresentsNull = true, nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE)
    protected List<ObjetoPostal> objetoPostal;

    /**
     * Gets the value of the tipoArquivo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoArquivo() {
        return tipoArquivo;
    }

    /**
     * Sets the value of the tipoArquivo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoArquivo(String value) {
        this.tipoArquivo = value;
    }

    /**
     * Gets the value of the versaoArquivo property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVersaoArquivo() {
        return versaoArquivo;
    }

    /**
     * Sets the value of the versaoArquivo property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVersaoArquivo(BigDecimal value) {
        this.versaoArquivo = value;
    }

    /**
     * Gets the value of the plp property.
     *
     * @return
     *     possible object is
     *     {@link DadosPlp }
     *
     */
    public DadosPlp getPlp() {
        return plp;
    }

    /**
     * Sets the value of the plp property.
     *
     * @param value
     *     allowed object is
     *     {@link DadosPlp }
     *
     */
    public void setPlp(DadosPlp value) {
        this.plp = value;
    }

    /**
     * Gets the value of the remetente property.
     *
     * @return
     *     possible object is
     *     {@link Remetente }
     *
     */
    public Remetente getRemetente() {
        return remetente;
    }

    /**
     * Sets the value of the remetente property.
     *
     * @param value
     *     allowed object is
     *     {@link Remetente }
     *
     */
    public void setRemetente(Remetente value) {
        this.remetente = value;
    }

    /**
     * Gets the value of the formaPagamento property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * Sets the value of the formaPagamento property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFormaPagamento(String value) {
        this.formaPagamento = value;
    }

    /**
     * Gets the value of the objetoPostal property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objetoPostal property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjetoPostal().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjetoPostal }
     *
     *
     */
    public List<ObjetoPostal> getObjetoPostal() {
        if (objetoPostal == null) {
            objetoPostal = new ArrayList<>();
        }
        return this.objetoPostal;
    }

}
