/* ***************************************************************** */
/*                                                                   */
/* (C) Copyright Merative US L.P. and others 2018, 2023              */
/*                                                                   */
/* SPDX-License-Identifier: Apache-2.0                               */
/*                                                                   */
/* ***************************************************************** */

package com.ibm.watson.health.acd.v1.model;

import java.lang.reflect.Field;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * SymptomDisease.
 */
public class SymptomDisease extends DynamicModel<Object> {
  @SerializedName("id")
  protected String id;
  @SerializedName("type")
  protected String type;
  @SerializedName("uid")
  protected Long uid;
  @SerializedName("begin")
  protected Long begin;
  @SerializedName("end")
  protected Long end;
  @SerializedName("coveredText")
  protected String coveredText;
  @SerializedName("negated")
  protected Boolean negated;
  @SerializedName("hypothetical")
  protected Boolean hypothetical;
  @SerializedName("cui")
  protected String cui;
  @SerializedName("icd10Code")
  protected String icd10Code;
  @SerializedName("sectionNormalizedName")
  protected String sectionNormalizedName;
  @SerializedName("modality")
  protected String modality;
  @SerializedName("symptomDiseaseSurfaceForm")
  protected String symptomDiseaseSurfaceForm;
  @SerializedName("dateInMilliseconds")
  protected String dateInMilliseconds;
  @SerializedName("snomedConceptId")
  protected String snomedConceptId;
  @SerializedName("ccsCode")
  protected String ccsCode;
  @SerializedName("symptomDiseaseNormalizedName")
  protected String symptomDiseaseNormalizedName;
  @SerializedName("sectionSurfaceForm")
  protected String sectionSurfaceForm;
  @SerializedName("icd9Code")
  protected String icd9Code;
  @SerializedName("hccCode")
  protected String hccCode;
  @SerializedName("disambiguationData")
  protected Disambiguation disambiguationData;
  @SerializedName("insightModelData")
  protected InsightModelData insightModelData;
  @SerializedName("temporal")
  protected List<Temporal> temporal;
  @SerializedName("date")
  protected String date;
  @SerializedName("dateSource")
  protected String dateSource;

  public SymptomDisease() {
	  super(new TypeToken<Object>() { });
  }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public String getType() {
    return this.type;
  }

  /**
   * Gets the uid.
   *
   * @return the uid
   */
  public Long getUid() {
    return this.uid;
  }

  /**
   * Gets the begin.
   *
   * @return the begin
   */
  public Long getBegin() {
    return this.begin;
  }

  /**
   * Gets the end.
   *
   * @return the end
   */
  public Long getEnd() {
    return this.end;
  }

  /**
   * Gets the coveredText.
   *
   * @return the coveredText
   */
  public String getCoveredText() {
    return this.coveredText;
  }

  /**
   * Gets the negated.
   *
   * @return the negated
   */
  public Boolean isNegated() {
    Boolean negated = this.negated;
    if (negated == null) {
      negated = false;
    }
    return negated;
  }

  /**
   * Gets the hypothetical.
   *
   * @return the hypothetical
   */
  public Boolean isHypothetical() {
    Boolean hypothetical = this.hypothetical;
    if (hypothetical == null) {
      hypothetical = false;
    }
    return hypothetical;
  }

  /**
   * Gets the cui.
   *
   * @return the cui
   */
  public String getCui() {
    return this.cui;
  }

  /**
   * Gets the icd10Code.
   *
   * @return the icd10Code
   */
  public String getIcd10Code() {
    return this.icd10Code;
  }

  /**
   * Gets the sectionNormalizedName.
   *
   * @return the sectionNormalizedName
   */
  public String getSectionNormalizedName() {
    return this.sectionNormalizedName;
  }

  /**
   * Gets the modality.
   *
   * @return the modality
   */
  public String getModality() {
    return this.modality;
  }

  /**
   * Gets the symptomDiseaseSurfaceForm.
   *
   * @return the symptomDiseaseSurfaceForm
   */
  public String getSymptomDiseaseSurfaceForm() {
    return this.symptomDiseaseSurfaceForm;
  }

  /**
   * Gets the dateInMilliseconds.
   *
   * @return the dateInMilliseconds
   */
  public String getDateInMilliseconds() {
    return this.dateInMilliseconds;
  }

  /**
   * Gets the snomedConceptId.
   *
   * @return the snomedConceptId
   */
  public String getSnomedConceptId() {
    return this.snomedConceptId;
  }

  /**
   * Gets the ccsCode.
   *
   * @return the ccsCode
   */
  public String getCcsCode() {
    return this.ccsCode;
  }

  /**
   * Gets the symptomDiseaseNormalizedName.
   *
   * @return the symptomDiseaseNormalizedName
   */
  public String getSymptomDiseaseNormalizedName() {
    return this.symptomDiseaseNormalizedName;
  }

  /**
   * Gets the sectionSurfaceForm.
   *
   * @return the sectionSurfaceForm
   */
  public String getSectionSurfaceForm() {
    return this.sectionSurfaceForm;
  }

  /**
   * Gets the icd9Code.
   *
   * @return the icd9Code
   */
  public String getIcd9Code() {
    return this.icd9Code;
  }

  /**
   * Gets the hccCode.
   *
   * @return the hccCode
   */
  public String getHccCode() {
    return this.hccCode;
  }

  /**
   * Gets the disambiguationData.
   *
   * @return the disambiguationData
   */
  public Disambiguation getDisambiguationData() {
    return this.disambiguationData;
  }

  /**
   * Gets the insightModelData.
   * @return the insightModelData
   */
  public InsightModelData getInsightModelData() {
    return this.insightModelData;
  }

  /**
   * Gets the temporal.
   *
   * @return the temporal
   */
  public List<Temporal> getTemporal() {
	  return this.temporal;
  }

  /**
   * Gets the date.
   *
   * @return the date
   */
  public String getDate() {
    return this.date;
  }

  /**
   * Gets the dateSource.
   *
   * @return the dateSource
   */
  public String getDateSource() {
    return this.dateSource;
  }

  /**
   * Returns the value from SymptomDisease annotation by specified key.
   *
   * @param key the name of the field to get
   */
  @Override
  public Object get(String key) {
	  Object value = super.get(key);
	  if (value == null) {
		  try {
			  Field field = SymptomDisease.class.getDeclaredField(key);
			  value = field.get(this);
		  } catch (NoSuchFieldException e) {
			  return null;
		  } catch (Exception e1) {
			  e1.printStackTrace();
		  }
	  }
	  return value;
  }
}
