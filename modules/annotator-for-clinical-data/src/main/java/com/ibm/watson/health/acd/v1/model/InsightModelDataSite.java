/* ***************************************************************** */
/*                                                                   */
/* (C) Copyright Merative US L.P. and others 2018, 2023              */
/*                                                                   */
/* SPDX-License-Identifier: Apache-2.0                               */
/*                                                                   */
/* ***************************************************************** */

package com.ibm.watson.health.acd.v1.model;

import java.lang.reflect.Field;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * InsightModelData Site.
 */
public class InsightModelDataSite extends DynamicModel<Object> {

	@SerializedName("begin")
	protected Long begin;
	@SerializedName("end")
	protected Long end;
	@SerializedName("coveredText")
	protected String coveredText;
	@SerializedName("type")
	protected String type;

	public InsightModelDataSite() {
		super(new TypeToken<Object>() { });
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
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return this.type;
	}

	/**
   * Returns the value from InsightModelDataSite annotation by specified key.
   *
   * @param key the name of the field to get
   */
  @Override
  public Object get(String key) {
	  Object value = super.get(key);
	  if (value == null) {
		  try {
			  Field field = InsightModelDataSite.class.getDeclaredField(key);
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
