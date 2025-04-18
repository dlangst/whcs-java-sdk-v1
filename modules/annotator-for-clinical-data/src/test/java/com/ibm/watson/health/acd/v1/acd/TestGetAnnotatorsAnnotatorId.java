/* ***************************************************************** */
/*                                                                   */
/* (C) Copyright Merative US L.P. and others 2018, 2023              */
/*                                                                   */
/* SPDX-License-Identifier: Apache-2.0                               */
/*                                                                   */
/* ***************************************************************** */

package com.ibm.watson.health.acd.v1.acd;

import org.junit.Assert;
import org.junit.Test;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.watson.health.acd.v1.AnnotatorForClinicalData;
import com.ibm.watson.health.acd.v1.WatsonServiceTest;
import com.ibm.watson.health.acd.v1.common.Constants;
import com.ibm.watson.health.acd.v1.model.Annotator;
import com.ibm.watson.health.acd.v1.model.GetAnnotatorOptions;
import com.ibm.watson.health.acd.v1.model.GetAnnotatorOptions.Builder;
import com.ibm.watson.health.acd.v1.model.GetAnnotatorsByIdOptions;

public class TestGetAnnotatorsAnnotatorId extends WatsonServiceTest {
	private AnnotatorForClinicalData service;

	public TestGetAnnotatorsAnnotatorId() {
		super();
		try {
			service = this.getServiceInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetAnnotator() {
		GetAnnotatorsByIdOptions options = new GetAnnotatorsByIdOptions.Builder().id(Constants.CONCEPT_DETECTION_NAME).build();

		ServiceCall<Annotator> sc = service.getAnnotatorsById(options);
		Response<Annotator> response = sc.execute();
		Annotator annotator = response.getResult();
		if (annotator.description() !=  null) {
			Assert.assertTrue(annotator.description().length() > 0);
		}
		Assert.assertNull(annotator.configurations());

	}

	@Test
	public void testGetAnnotatorBuilder() {
		GetAnnotatorsByIdOptions options = new GetAnnotatorsByIdOptions.Builder().id(Constants.CONCEPT_DETECTION_NAME).build();

		ServiceCall<Annotator> sc = service.getAnnotatorsById(options);
		Response<Annotator> response = sc.execute();
		Annotator annotator = response.getResult();
		if (annotator.description() !=  null) {
			Assert.assertTrue(annotator.description().length() > 0);
		}
		Assert.assertNull(annotator.configurations());

	}

	@Test
	public void testBuilderFromOptions() {
		GetAnnotatorOptions options = new GetAnnotatorOptions.Builder(Constants.CONCEPT_DETECTION_NAME).build();
		Builder builder = options.newBuilder();
		Assert.assertNotNull(builder);
	}
}
