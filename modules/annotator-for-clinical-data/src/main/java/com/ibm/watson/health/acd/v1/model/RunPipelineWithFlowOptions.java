/* ***************************************************************** */
/*                                                                   */
/* (C) Copyright Merative US L.P. and others 2020, 2023              */
/*                                                                   */
/* SPDX-License-Identifier: Apache-2.0                               */
/*                                                                   */
/* ***************************************************************** */

package com.ibm.watson.health.acd.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The runPipelineWithFlow options.
 */
public class RunPipelineWithFlowOptions extends GenericModel {

  protected String flowId;
  protected Boolean returnAnalyzedText;
  protected AnalyticFlowBeanInput analyticFlowBeanInput;
  protected String body;
  protected String contentType;
  protected Boolean debugTextRestore;
  protected Boolean debug;

  /**
   * Builder.
   */
  public static class Builder {
    private String flowId;
    private Boolean returnAnalyzedText;
    private AnalyticFlowBeanInput analyticFlowBeanInput;
    private String body;
    private String contentType;
    private Boolean debugTextRestore;
    private Boolean debug;

    private Builder(RunPipelineWithFlowOptions runPipelineWithFlowOptions) {
      this.flowId = runPipelineWithFlowOptions.flowId;
      this.returnAnalyzedText = runPipelineWithFlowOptions.returnAnalyzedText;
      this.analyticFlowBeanInput = runPipelineWithFlowOptions.analyticFlowBeanInput;
      this.body = runPipelineWithFlowOptions.body;
      this.contentType = runPipelineWithFlowOptions.contentType;
      this.debugTextRestore = runPipelineWithFlowOptions.debugTextRestore;
      this.debug = runPipelineWithFlowOptions.debug;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param flowId the flowId
     * @param returnAnalyzedText the returnAnalyzedText
     */
    public Builder(String flowId, Boolean returnAnalyzedText) {
      this.flowId = flowId;
      this.returnAnalyzedText = returnAnalyzedText;
    }

    /**
     * Builds a RunPipelineWithFlowOptions.
     *
     * @return the new RunPipelineWithFlowOptions instance
     */
    public RunPipelineWithFlowOptions build() {
      return new RunPipelineWithFlowOptions(this);
    }

    /**
     * Set the flowId.
     *
     * @param flowId the flowId
     * @return the RunPipelineWithFlowOptions builder
     */
    public Builder flowId(String flowId) {
      this.flowId = flowId;
      return this;
    }

    /**
     * Set the returnAnalyzedText.
     *
     * @param returnAnalyzedText the returnAnalyzedText
     * @return the RunPipelineWithFlowOptions builder
     */
    public Builder returnAnalyzedText(Boolean returnAnalyzedText) {
      this.returnAnalyzedText = returnAnalyzedText;
      return this;
    }

    /**
     * Set the debugTextRestore.
     *
     * @param debugTextRestore the debugTextRestore
     * @return the RunPipelineWithFlowOptions builder
     */
    public Builder debugTextRestore(Boolean debugTextRestore) {
      this.debugTextRestore = debugTextRestore;
      return this;
    }

    /**
     * Set the analyticFlowBeanInput.
     *
     * @param analyticFlowBeanInput the analyticFlowBeanInput
     * @return the RunPipelineWithFlowOptions builder
     */
    public Builder analyticFlowBeanInput(AnalyticFlowBeanInput analyticFlowBeanInput) {
      this.analyticFlowBeanInput = analyticFlowBeanInput;
      this.contentType = "application/json";
      return this;
    }

    /**
     * Set the text.
     *
     * @param text the text
     * @return the RunPipelineWithFlowOptions builder
     */
    public Builder text(String text) {
      this.body = text;
      this.contentType = "text/plain";
      return this;
    }

    /**
     * Set the debug flag.
     *
     * @param debug enable the analyze debug flag
     * @return the RunPipelineWithFlowOptions builder
     */
    public Builder debug(Boolean debug) {
      this.debug = debug;
      return this;
    }
  }

  protected RunPipelineWithFlowOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.flowId,
      "flowId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.returnAnalyzedText,
      "returnAnalyzedText cannot be null");
    flowId = builder.flowId;
    returnAnalyzedText = builder.returnAnalyzedText;
    analyticFlowBeanInput = builder.analyticFlowBeanInput;
    body = builder.body;
    contentType = builder.contentType;
    debugTextRestore = builder.debugTextRestore;
    debug = builder.debug;
  }

  /**
   * New builder.
   *
   * @return a RunPipelineWithFlowOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the flowId.
   *
   * flow identifier .
   *
   * @return the flowId
   */
  public String flowId() {
    return flowId;
  }

  /**
   * Gets the returnAnalyzedText.
   *
   * Set this to true to show the analyzed text in the response.
   *
   * @return the returnAnalyzedText
   */
  public Boolean returnAnalyzedText() {
    return returnAnalyzedText;
  }

  /**
   * Gets the analyticFlowBeanInput.
   *
   * Input request data in TEXT or JSON format .
   *
   * @return the analyticFlowBeanInput
   */
  public AnalyticFlowBeanInput analyticFlowBeanInput() {
    return analyticFlowBeanInput;
  }

  /**
   * Gets the body.
   *
   * Input request data in TEXT or JSON format .
   *
   * @return the body
   */
  public String body() {
    return body;
  }

  /**
   * Gets the contentType.
   *
   * The type of the input. A character encoding can be specified by including a `charset` parameter. For example,
   * 'text/plain;charset=utf-8'.
   *
   * @return the contentType
   */
  public String contentType() {
    return contentType;
  }

  /**
   * Gets the debugTextRestore.
   *
   * If true, any ReplaceTextChange annotations will be left in the container and the modified text before restoring to
   * original form will be returned in the metadata.  Otherwise, these annotations and modified text will be removed
   * from the container.
   *
   * @return the debugTextRestore
   */
  public Boolean debugTextRestore() {
    return debugTextRestore;
  }

  /**
   * Gets the debug flag.
   *
   * @return the debug
   */
  public Boolean debug() {
    return debug;
  }
}

