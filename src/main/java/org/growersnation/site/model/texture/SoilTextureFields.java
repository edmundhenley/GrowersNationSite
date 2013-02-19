package org.growersnation.site.model.texture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * <p>DTO to provide the following to {@link FeatureInfoResponse}:</p>
 * <ul>
 * <li>Storage of state of soil texture data</li>
 * </ul>
 *
 * @since 0.0.1
 *         
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class SoilTextureFields {

  @XmlAttribute(name = "OBJECTID")
  private String objectId;

  @XmlAttribute(name = "Shape")
  private String shape;

  @XmlAttribute(name = "GEN_PMLITH")
  private String genPMLith;

  @XmlAttribute(name = "ESB_DESC")
  private String esbDescription;

  @XmlAttribute(name = "GRAINSIZE")
  private String grainSize;

  @XmlAttribute(name = "SOIL_GROUP")
  private String soilGroup;

  @XmlAttribute(name = "SOIL_DEPTH")
  private String soilDepth;

  @XmlAttribute(name = "CAC03_RANK")
  private String cac03Rank;

  @XmlAttribute(name = "PMM_UID")
  private String pmmUID;

  @XmlAttribute(name = "ESB_CODE")
  private String esbCode;

  @XmlAttribute(name = "LEX_RCS")
  private String lexRCS;

  @XmlAttribute(name = "Shape_Length")
  private String shapeLength;

  @XmlAttribute(name = "Shape_Area")
  private String shapeArea;

  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public String getShape() {
    return shape;
  }

  public void setShape(String shape) {
    this.shape = shape;
  }

  public String getGenPMLith() {
    return genPMLith;
  }

  public void setGenPMLith(String genPMLith) {
    this.genPMLith = genPMLith;
  }

  public String getEsbDescription() {
    return esbDescription;
  }

  public void setEsbDescription(String esbDescription) {
    this.esbDescription = esbDescription;
  }

  public String getGrainSize() {
    return grainSize;
  }

  public void setGrainSize(String grainSize) {
    this.grainSize = grainSize;
  }

  public String getSoilGroup() {
    return soilGroup;
  }

  public void setSoilGroup(String soilGroup) {
    this.soilGroup = soilGroup;
  }

  public String getSoilDepth() {
    return soilDepth;
  }

  public void setSoilDepth(String soilDepth) {
    this.soilDepth = soilDepth;
  }

  public String getCac03Rank() {
    return cac03Rank;
  }

  public void setCac03Rank(String cac03Rank) {
    this.cac03Rank = cac03Rank;
  }

  public String getPmmUID() {
    return pmmUID;
  }

  public void setPmmUID(String pmmUID) {
    this.pmmUID = pmmUID;
  }

  public String getEsbCode() {
    return esbCode;
  }

  public void setEsbCode(String esbCode) {
    this.esbCode = esbCode;
  }

  public String getLexRCS() {
    return lexRCS;
  }

  public void setLexRCS(String lexRCS) {
    this.lexRCS = lexRCS;
  }

  public String getShapeLength() {
    return shapeLength;
  }

  public void setShapeLength(String shapeLength) {
    this.shapeLength = shapeLength;
  }

  public String getShapeArea() {
    return shapeArea;
  }

  public void setShapeArea(String shapeArea) {
    this.shapeArea = shapeArea;
  }
}