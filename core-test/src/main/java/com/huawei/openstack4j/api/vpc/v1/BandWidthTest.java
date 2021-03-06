 /*******************************************************************************
 * 	Copyright 2018 Huawei Technologies Co.,Ltd.                                         
 * 	                                                                                 
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not      
 * 	use this file except in compliance with the License. You may obtain a copy of    
 * 	the License at                                                                   
 * 	                                                                                 
 * 	    http://www.apache.org/licenses/LICENSE-2.0                                   
 * 	                                                                                 
 * 	Unless required by applicable law or agreed to in writing, software              
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT        
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the         
 * 	License for the specific language governing permissions and limitations under    
 * 	the License.                                                                     
 *******************************************************************************/
package com.huawei.openstack4j.api.vpc.v1;

import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

import com.huawei.openstack4j.api.AbstractTest;
import com.huawei.openstack4j.openstack.vpc.v1.domain.VirtualBandWidths;


@Test(suiteName = "VPC/BandWidth")
public class BandWidthTest extends AbstractTest{
	
	
	private static final String JSON_BANDWIDTH = "/vpc/v1/bandwidth.json";
	
	@Override
	protected Service service() {
		return Service.VPC;
	}
	
	
	public void getBandWidthTest() throws Exception{
		respondWith(JSON_BANDWIDTH);
		VirtualBandWidths resp = osv3().vpc().bandwidths().get("TestId");
		assertNotNull(resp);
	}
	
}