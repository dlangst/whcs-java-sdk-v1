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
 * Procedure.
 */
public class Procedure extends DynamicModel<Object> {
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
  @SerializedName("sectionNormalizedName")
  protected String sectionNormalizedName;
  @SerializedName("dateInMilliseconds")
  protected String dateInMilliseconds;
  @SerializedName("snomedConceptId")
  protected String snomedConceptId;
  @SerializedName("procedureSurfaceForm")
  protected String procedureSurfaceForm;
  @SerializedName("procedureNormalizedName")
  protected String procedureNormalizedName;
  @SerializedName("sectionSurfaceForm")
  protected String sectionSurfaceForm;
  @SerializedName("disambiguationData")
  protected Disambiguation disambiguationData;
  @SerializedName("insightModelData")
  protected InsightModelData insightModelData;
  @SerializedName("temporal")
  protected List<Temporal> temporal;

  public Procedure() {
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
   * Gets the sectionNormalizedName.
   *
   * @return the sectionNormalizedName
   */
  public String getSectionNormalizedName() {
    return this.sectionNormalizedName;
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
   * Gets the procedureSurfaceForm.
   *
   * @return the procedureSurfaceForm
   */
  public String getProcedureSurfaceForm() {
    return this.procedureSurfaceForm;
  }

  /**
   * Gets the procedureNormalizedName.
   *
   * @return the procedureNormalizedName
   */
  public String getProcedureNormalizedName() {
    return this.procedureNormalizedName;
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
   * Returns the value from Procedure annotation by specified key.
   *
   * @param key the name of the field to get
   */
  @Override
  public Object get(String key) {
	  Object value = super.get(key);
	  if (value == null) {
		  try {
			  Field field = Procedure.class.getDeclaredField(key);
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
