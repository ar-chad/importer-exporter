//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.11.18 um 03:45:53 PM CET 
//


package org.collada._2005._11.colladaschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 			Creates an instance of a structured class.
 * 			
 * 
 * <p>Java-Klasse für cg_setuser_type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="cg_setuser_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}cg_param_type"/&gt;
 *           &lt;element name="array" type="{http://www.collada.org/2005/11/COLLADASchema}cg_setarray_type"/&gt;
 *           &lt;element name="usertype" type="{http://www.collada.org/2005/11/COLLADASchema}cg_setuser_type"/&gt;
 *           &lt;element name="connect_param" type="{http://www.collada.org/2005/11/COLLADASchema}cg_connect_param"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="setparam" type="{http://www.collada.org/2005/11/COLLADASchema}cg_setparam" maxOccurs="unbounded"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}cg_identifier" /&gt;
 *       &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cg_setuser_type", propOrder = {
    "boolOrBool1OrBool2",
    "setparam"
})
public class CgSetuserType {

    @XmlElementRefs({
        @XmlElementRef(name = "bool", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool1x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool1x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool1x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool1x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool2x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool2x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool2x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool2x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool3x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool3x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool3x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool3x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool4x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool4x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool4x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bool4x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float1x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float1x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float1x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float1x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float2x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float2x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float2x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float2x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float3x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float3x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float3x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float3x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float4x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float4x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float4x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "float4x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int1x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int1x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int1x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int1x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int2x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int2x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int2x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int2x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int3x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int3x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int3x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int3x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int4x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int4x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int4x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int4x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half1x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half1x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half1x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half1x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half2x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half2x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half2x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half2x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half3x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half3x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half3x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half3x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half4x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half4x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half4x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "half4x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed1x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed1x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed1x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed1x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed2x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed2x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed2x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed2x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed3x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed3x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed3x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed3x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed4x1", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed4x2", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed4x3", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixed4x4", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "surface", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sampler1D", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sampler2D", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sampler3D", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "samplerRECT", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "samplerCUBE", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "samplerDEPTH", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "string", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "enum", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "array", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "usertype", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "connect_param", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> boolOrBool1OrBool2;
    protected List<CgSetparam> setparam;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "source", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String source;

    /**
     * Gets the value of the boolOrBool1OrBool2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boolOrBool1OrBool2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoolOrBool1OrBool2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link Float }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Float }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link CgSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CgSampler1D }{@code >}
     * {@link JAXBElement }{@code <}{@link CgSampler2D }{@code >}
     * {@link JAXBElement }{@code <}{@link CgSampler3D }{@code >}
     * {@link JAXBElement }{@code <}{@link CgSamplerRECT }{@code >}
     * {@link JAXBElement }{@code <}{@link CgSamplerCUBE }{@code >}
     * {@link JAXBElement }{@code <}{@link CgSamplerDEPTH }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link CgSetarrayType }{@code >}
     * {@link JAXBElement }{@code <}{@link CgSetuserType }{@code >}
     * {@link JAXBElement }{@code <}{@link CgConnectParam }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getBoolOrBool1OrBool2() {
        if (boolOrBool1OrBool2 == null) {
            boolOrBool1OrBool2 = new ArrayList<JAXBElement<?>>();
        }
        return this.boolOrBool1OrBool2;
    }

    public boolean isSetBoolOrBool1OrBool2() {
        return ((this.boolOrBool1OrBool2 != null)&&(!this.boolOrBool1OrBool2 .isEmpty()));
    }

    public void unsetBoolOrBool1OrBool2() {
        this.boolOrBool1OrBool2 = null;
    }

    /**
     * Gets the value of the setparam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setparam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetparam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CgSetparam }
     * 
     * 
     */
    public List<CgSetparam> getSetparam() {
        if (setparam == null) {
            setparam = new ArrayList<CgSetparam>();
        }
        return this.setparam;
    }

    public boolean isSetSetparam() {
        return ((this.setparam!= null)&&(!this.setparam.isEmpty()));
    }

    public void unsetSetparam() {
        this.setparam = null;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Ruft den Wert der source-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Legt den Wert der source-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    public boolean isSetSource() {
        return (this.source!= null);
    }

    public void setBoolOrBool1OrBool2(List<JAXBElement<?>> value) {
        this.boolOrBool1OrBool2 = value;
    }

    public void setSetparam(List<CgSetparam> value) {
        this.setparam = value;
    }

}
