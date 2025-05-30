/* ***************************************************************** */
/*                                                                   */
/* (C) Copyright Merative US L.P. and others 2020, 2023              */
/*                                                                   */
/* SPDX-License-Identifier: Apache-2.0                               */
/*                                                                   */
/* ***************************************************************** */

package com.ibm.watson.health.acd.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createFlows options.
 */
public class CreateFlowsOptions extends GenericModel {

  protected String id;
  protected String name;
  protected String description;
  protected String publishedDate;
  protected Boolean publish;
  protected String version;
  protected String cartridgeId;
  protected List<AnnotatorFlow> annotatorFlows;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String name;
    private String description;
    private String publishedDate;
    private Boolean publish;
    private String version;
    private String cartridgeId;
    private List<AnnotatorFlow> annotatorFlows;

    private Builder(CreateFlowsOptions createFlowsOptions) {
      this.id = createFlowsOptions.id;
      this.name = createFlowsOptions.name;
      this.description = createFlowsOptions.description;
      this.publishedDate = createFlowsOptions.publishedDate;
      this.publish = createFlowsOptions.publish;
      this.version = createFlowsOptions.version;
      this.cartridgeId = createFlowsOptions.cartridgeId;
      this.annotatorFlows = createFlowsOptions.annotatorFlows;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateFlowsOptions.
     *
     * @return the new CreateFlowsOptions instance
     */
    public CreateFlowsOptions build() {
      return new CreateFlowsOptions(this);
    }

    /**
     * Adds an annotatorFlows to annotatorFlows.
     *
     * @param annotatorFlows the new annotatorFlows
     * @return the CreateFlowsOptions builder
     */
    public Builder addAnnotatorFlows(AnnotatorFlow annotatorFlows) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(annotatorFlows,
        "annotatorFlows cannot be null");
      if (this.annotatorFlows == null) {
        this.annotatorFlows = new ArrayList<AnnotatorFlow>();
      }
      this.annotatorFlows.add(annotatorFlows);
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateFlowsOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateFlowsOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateFlowsOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the publishedDate.
     *
     * @param publishedDate the publishedDate
     * @return the CreateFlowsOptions builder
     */
    public Builder publishedDate(String publishedDate) {
      this.publishedDate = publishedDate;
      return this;
    }

    /**
     * Set the publish.
     *
     * @param publish the publish
     * @return the CreateFlowsOptions builder
     */
    public Builder publish(Boolean publish) {
      this.publish = publish;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the CreateFlowsOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set the cartridgeId.
     *
     * @param cartridgeId the cartridgeId
     * @return the CreateFlowsOptions builder
     */
    public Builder cartridgeId(String cartridgeId) {
      this.cartridgeId = cartridgeId;
      return this;
    }

    /**
     * Set the annotatorFlows.
     * Existing annotatorFlows will be replaced.
     *
     * @param annotatorFlows the annotatorFlows
     * @return the CreateFlowsOptions builder
     */
    public Builder annotatorFlows(List<AnnotatorFlow> annotatorFlows) {
      this.annotatorFlows = annotatorFlows;
      return this;
    }

    /**
     * Set the acdFlow.
     *
     * @param acdFlow the acdFlow
     * @return the CreateFlowsOptions builder
     */
    public Builder acdFlow(AcdFlow acdFlow) {
      this.id = acdFlow.id();
      this.name = acdFlow.name();
      this.description = acdFlow.description();
      this.publishedDate = acdFlow.publishedDate();
      this.publish = acdFlow.publish();
      this.version = acdFlow.version();
      this.cartridgeId = acdFlow.cartridgeId();
      this.annotatorFlows = acdFlow.annotatorFlows();
      return this;
    }
  }

  protected CreateFlowsOptions(Builder builder) {
    id = builder.id;
    name = builder.name;
    description = builder.description;
    publishedDate = builder.publishedDate;
    publish = builder.publish;
    version = builder.version;
    cartridgeId = builder.cartridgeId;
    annotatorFlows = builder.annotatorFlows;
  }

  /**
   * New builder.
   *
   * @return a CreateFlowsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the publishedDate.
   *
   * @return the publishedDate
   */
  public String publishedDate() {
    return publishedDate;
  }

  /**
   * Gets the publish.
   *
   * @return the publish
   */
  public Boolean publish() {
    return publish;
  }

  /**
   * Gets the version.
   *
   * @return the version
   */
  public String version() {
    return version;
  }

  /**
   * Gets the cartridgeId.
   *
   * @return the cartridgeId
   */
  public String cartridgeId() {
    return cartridgeId;
  }

  /**
   * Gets the annotatorFlows.
   *
   * @return the annotatorFlows
   */
  public List<AnnotatorFlow> annotatorFlows() {
    return annotatorFlows;
  }
}

