/* ***************************************************************** */
/*                                                                   */
/* (C) Copyright Merative US L.P. and others 2018, 2023              */
/*                                                                   */
/* SPDX-License-Identifier: Apache-2.0                               */
/*                                                                   */
/* ***************************************************************** */

package com.ibm.watson.health.acd.v1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.ibm.cloud.sdk.core.http.HttpConfigOptions;
import com.ibm.cloud.sdk.core.security.BearerTokenAuthenticator;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.watson.health.acd.v1.common.Constants;

/**
 * Utility class to test the ACD Java SDK.
 */
public abstract class WatsonServiceTest {

	/** The prop. */
	private static Properties properties = null;
	private static final String DEFAULT_PROPERTIES = "config.properties";
	private static final String LOCAL_PROPERTIES = ".config.properties";

	/** The Constant CONTENT_TYPE. */
	protected static final String CONTENT_TYPE = "Content-Type";

	/**
	 * Gets the valid property.
	 *
	 * @param property
	 *            the property
	 * @return the valid property
	 */
	public String getProperty(String property) {
		return properties.getProperty(property);
	}

	private void loadProperties() {
		properties = new Properties();

		InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream(LOCAL_PROPERTIES);
		if (input == null) {
			input = Thread.currentThread().getContextClassLoader().getResourceAsStream(DEFAULT_PROPERTIES);
		} 
		else {
			System.out.println("Using " + LOCAL_PROPERTIES);
		}
		
		if (input == null) {
			System.out.println(DEFAULT_PROPERTIES + " was not found.");
			return;
		}
		
		// load a properties file from class path, inside static method
		try {
			properties.load(input);
		} catch (IOException e) {
			System.out.println("Error loading the config.properties");
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException ioe){
					System.out.println("failed to close input stream.");
				}
			}
		}
	}	

	private static AnnotatorForClinicalData service;
	
	/**
	 * Sets up the service connections.
	 *
	 * @throws Exception
	 *             the exception
	 */
	public void setUp() throws Exception {

                if (getProperty(Constants.BEARER_TOKEN) != null) {
			service = new AnnotatorForClinicalData(getProperty(Constants.VERSION),
				"AnnotatorForClinicalData", new BearerTokenAuthenticator(getProperty(Constants.BEARER_TOKEN)));
			service.setServiceUrl(getProperty(Constants.URL));
			HttpConfigOptions options = new HttpConfigOptions.Builder().disableSslVerification(true).build();
			service.configureClient(options);
		}
		else if ((getProperty(Constants.APIKEY) == null) || getProperty(Constants.APIKEY).trim().length() == 0) {
			service = new AnnotatorForClinicalData(getProperty(Constants.VERSION),
				"AnnotatorForClinicalData", new NoAuthAuthenticator());
			service.setServiceUrl(getProperty(Constants.URL));
			HttpConfigOptions options = new HttpConfigOptions.Builder().disableSslVerification(true).build();
			service.configureClient(options);
		} else {
			service = new AnnotatorForClinicalData(getProperty(Constants.VERSION),
			"AnnotatorForClinicalData", new IamAuthenticator.Builder()
			.apikey(getProperty(Constants.APIKEY))
			.disableSSLVerification(Boolean.parseBoolean(Constants.DISABLE_SSL))
			.build());
			service.setServiceUrl(getProperty(Constants.URL));
		}
	}

	/**
	 * Retrieves service instance.
	 * @return the service
	 */
	public AnnotatorForClinicalData getServiceInstance()  throws Exception {
		loadProperties();
		setUp();
		return service;
	}

}
