/**
 * Copyright (C) 2013-2015 Vasilis Vryniotis <bbriniotis@datumbox.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datumbox.framework.statistics.survival.nonparametrics.independentsamples;

import com.datumbox.common.dataobjects.FlatDataCollection;
import com.datumbox.common.dataobjects.TransposeDataCollection;
import com.datumbox.tests.bases.BaseTest;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vasilis Vryniotis <bbriniotis@datumbox.com>
 */
public class CoxMantelTest extends BaseTest {

    /**
     * Test of test method, of class CoxMantel.
     */
    @Test
    public void testTest() {
        logger.info("test");
        //Example from Dimaki's Survival Non-parametrics notes. It should reject the null hypothesis and return true.
        TransposeDataCollection transposeDataCollection = new TransposeDataCollection();
        transposeDataCollection.put(0, new FlatDataCollection(Arrays.asList(new Object[]{23,"16+","18+","20+","24+"})));
        transposeDataCollection.put(1, new FlatDataCollection(Arrays.asList(new Object[]{15,18,19,19,20.0})));
        boolean is_twoTailed = true;
        double aLevel = 0.05;
        boolean expResult = true;
        boolean result = CoxMantel.test(transposeDataCollection, is_twoTailed, aLevel);
        assertEquals(expResult, result);
    }
    
}
