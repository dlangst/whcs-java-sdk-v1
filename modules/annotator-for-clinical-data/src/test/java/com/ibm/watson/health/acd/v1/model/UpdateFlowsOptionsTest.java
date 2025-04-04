/* ***************************************************************** */
/*                                                                   */
/* (C) Copyright Merative US L.P. and others 2020, 2023              */
/*                                                                   */
/* SPDX-License-Identifier: Apache-2.0                               */
/*                                                                   */
/* ***************************************************************** */

package com.ibm.watson.health.acd.v1.model;

import static org.testng.Assert.assertEquals;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.watson.health.acd.v1.utils.TestUtilities;

/**
 * Unit test class for the UpdateFlowsOptions model.
 */
public class UpdateFlowsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateFlowsOptions() throws Throwable {
    FlowEntry flowEntryModel = new FlowEntry.Builder().build();

    ConfigurationEntity configurationEntityModel = new ConfigurationEntity.Builder()
      .id("testString")
      .type("testString")
      .uid(Long.valueOf("26"))
      .mergeid(Long.valueOf("26"))
      .build();
    assertEquals(configurationEntityModel.id(), "testString");
    assertEquals(configurationEntityModel.type(), "testString");
    assertEquals(configurationEntityModel.uid(), Long.valueOf("26"));
    assertEquals(configurationEntityModel.mergeid(), Long.valueOf("26"));

    Flow flowModel = new Flow.Builder()
      .elements(new ArrayList<FlowEntry>(Arrays.asList(flowEntryModel)))
      .async(true)
      .build();
    assertEquals(flowModel.elements(), new ArrayList<FlowEntry>(Arrays.asList(flowEntryModel)));
    assertEquals(flowModel.async(), Boolean.valueOf(true));

    AnnotatorFlow annotatorFlowModel = new AnnotatorFlow.Builder()
      .profile("testString")
      .flow(flowModel)
//      .id("testString")
//      .type("testString")
//      .data(new java.util.HashMap<String,List<Entity>>(){{put("foo", new ArrayList<Entity>(Arrays.asList(entityModel))); }})
//      .metadata(new java.util.HashMap<String,Object>(){{put("foo", "testString"); }})
//      .globalConfigurations(new ArrayList<ConfigurationEntity>(Arrays.asList(configurationEntityModel)))
//      .uid(Long.valueOf("26"))
      .build();
    assertEquals(annotatorFlowModel.profile(), "testString");
    assertEquals(annotatorFlowModel.flow(), flowModel);
//    assertEquals(annotatorFlowModel.id(), "testString");
//    assertEquals(annotatorFlowModel.type(), "testString");
//    assertEquals(annotatorFlowModel.data(), new java.util.HashMap<String,List<Entity>>(){{put("foo", new ArrayList<Entity>(Arrays.asList(entityModel))); }});
//    assertEquals(annotatorFlowModel.metadata(), new java.util.HashMap<String,Object>(){{put("foo", "testString"); }});
//    assertEquals(annotatorFlowModel.globalConfigurations(), new ArrayList<ConfigurationEntity>(Arrays.asList(configurationEntityModel)));
//    assertEquals(annotatorFlowModel.uid(), Long.valueOf("26"));

    UpdateFlowsOptions updateFlowsOptionsModel = new UpdateFlowsOptions.Builder()
      .id("testString")
      .newId("testString")
      .newName("testString")
      .newDescription("testString")
      .newPublishedDate("testString")
      .newPublish(true)
      .newVersion("testString")
      .newCartridgeId("testString")
      .newAnnotatorFlows(new ArrayList<AnnotatorFlow>(Arrays.asList(annotatorFlowModel)))
      .build();
    assertEquals(updateFlowsOptionsModel.id(), "testString");
    assertEquals(updateFlowsOptionsModel.newId(), "testString");
    assertEquals(updateFlowsOptionsModel.newName(), "testString");
    assertEquals(updateFlowsOptionsModel.newDescription(), "testString");
    assertEquals(updateFlowsOptionsModel.newPublishedDate(), "testString");
    assertEquals(updateFlowsOptionsModel.newPublish(), Boolean.valueOf(true));
    assertEquals(updateFlowsOptionsModel.newVersion(), "testString");
    assertEquals(updateFlowsOptionsModel.newCartridgeId(), "testString");
    assertEquals(updateFlowsOptionsModel.newAnnotatorFlows(), new ArrayList<AnnotatorFlow>(Arrays.asList(annotatorFlowModel)));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateFlowsOptionsError() throws Throwable {
    new UpdateFlowsOptions.Builder().build();
  }

}
