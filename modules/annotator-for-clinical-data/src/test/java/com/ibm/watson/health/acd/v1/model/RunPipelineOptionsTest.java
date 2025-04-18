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
import java.util.Map;

import org.testng.annotations.Test;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.watson.health.acd.v1.utils.TestUtilities;

/**
 * Unit test class for the RunPipelineOptions model.
 */
public class RunPipelineOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRunPipelineOptions() throws Throwable {
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
      .build();
    assertEquals(annotatorFlowModel.profile(), "testString");
    assertEquals(annotatorFlowModel.flow(), flowModel);

    UnstructuredContainer unstructuredContainerModel = new UnstructuredContainer.Builder()
      .text("testString")
      .id("testString")
      .type("testString")
      .data(new ContainerAnnotation())
      .metadata(new java.util.HashMap<String,Map>(){{put("foo", new HashMap()); }})
      .uid(Long.valueOf("26"))
      .build();
    assertEquals(unstructuredContainerModel.text(), "testString");
    assertEquals(unstructuredContainerModel.id(), "testString");
    assertEquals(unstructuredContainerModel.type(), "testString");
    assertEquals(unstructuredContainerModel.data(), new ContainerAnnotation());
    assertEquals(unstructuredContainerModel.metadata(), new java.util.HashMap<String,Map>(){{put("foo", new HashMap()); }});
    assertEquals(unstructuredContainerModel.uid(), Long.valueOf("26"));

    RunPipelineOptions runPipelineOptionsModel = new RunPipelineOptions.Builder()
      .unstructured(new ArrayList<UnstructuredContainer>(Arrays.asList(unstructuredContainerModel)))
      .annotatorFlows(new ArrayList<AnnotatorFlow>(Arrays.asList(annotatorFlowModel)))
      .debugTextRestore(true)
      .returnAnalyzedText(true)
      .build();
    assertEquals(runPipelineOptionsModel.unstructured(), new ArrayList<UnstructuredContainer>(Arrays.asList(unstructuredContainerModel)));
    assertEquals(runPipelineOptionsModel.annotatorFlows(), new ArrayList<AnnotatorFlow>(Arrays.asList(annotatorFlowModel)));
    assertEquals(runPipelineOptionsModel.debugTextRestore(), Boolean.valueOf(true));
    assertEquals(runPipelineOptionsModel.returnAnalyzedText(), Boolean.valueOf(true));
  }
}
