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
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.watson.health.acd.v1.utils.TestUtilities;

/**
 * Unit test class for the ConfigurationEntity model.
 */
public class ConfigurationEntityTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigurationEntity() throws Throwable {
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

    String json = TestUtilities.serialize(configurationEntityModel);

    ConfigurationEntity configurationEntityModelNew = TestUtilities.deserialize(json, ConfigurationEntity.class);
    assertTrue(configurationEntityModelNew instanceof ConfigurationEntity);
    assertEquals(configurationEntityModelNew.id(), "testString");
    assertEquals(configurationEntityModelNew.type(), "testString");
    assertEquals(configurationEntityModelNew.uid(), Long.valueOf("26"));
    assertEquals(configurationEntityModelNew.mergeid(), Long.valueOf("26"));
  }
}
