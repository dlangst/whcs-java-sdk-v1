/* ***************************************************************** */
/*                                                                   */
/* (C) Copyright Merative US L.P. and others 2020, 2023              */
/*                                                                   */
/* SPDX-License-Identifier: Apache-2.0                               */
/*                                                                   */
/* ***************************************************************** */

package com.ibm.watson.health.acd.v1.model;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.watson.health.acd.v1.utils.TestUtilities;

/**
 * Unit test class for the Annotator model.
 */
public class AnnotatorTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAnnotator() throws Throwable {
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

    Annotator annotatorModel = new Annotator.Builder()
      .name("testString")
      .parameters(new java.util.HashMap<String,List<String>>(){{put("foo", new ArrayList<String>(Arrays.asList("testString"))); }})
      .configurations(new ArrayList<ConfigurationEntity>(Arrays.asList(configurationEntityModel)))
      .build();
    assertEquals(annotatorModel.name(), "testString");
    assertEquals(annotatorModel.parameters(), new java.util.HashMap<String,List<String>>(){{put("foo", new ArrayList<String>(Arrays.asList("testString"))); }});
    assertEquals(annotatorModel.configurations(), new ArrayList<ConfigurationEntity>(Arrays.asList(configurationEntityModel)));

    String json = TestUtilities.serialize(annotatorModel);

    Annotator annotatorModelNew = TestUtilities.deserialize(json, Annotator.class);
    assertTrue(annotatorModelNew instanceof Annotator);
    assertEquals(annotatorModelNew.name(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAnnotatorError() throws Throwable {
    new Annotator.Builder().build();
  }

}
