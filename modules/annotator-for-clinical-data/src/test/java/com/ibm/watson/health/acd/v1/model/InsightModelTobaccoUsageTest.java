/* ***************************************************************** */
/*                                                                   */
/* (C) Copyright Merative US L.P. and others 2021, 2023              */
/*                                                                   */
/* SPDX-License-Identifier: Apache-2.0                               */
/*                                                                   */
/* ***************************************************************** */

package com.ibm.watson.health.acd.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.watson.health.acd.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InsightModelTobaccoUsage model.
 */
public class InsightModelTobaccoUsageTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInsightModelTobaccoUsage() throws Throwable {
	  InsightModelTobaccoUsage insightModelTobaccoUsageModel = new InsightModelTobaccoUsage();
	  assertNull(insightModelTobaccoUsageModel.getUseScore());
	  assertNull(insightModelTobaccoUsageModel.getNoneScore());
	  assertNull(insightModelTobaccoUsageModel.getUnknownScore());
	  assertNull(insightModelTobaccoUsageModel.getDiscussedScore());
  }
}
