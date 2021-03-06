/*******************************************************************************
 * 	Copyright 2016 ContainX and OpenStack4j                                          
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
package com.huawei.openstack4j.openstack.database.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huawei.openstack4j.model.ModelEntity;
import com.huawei.openstack4j.openstack.database.constants.ReplicationMode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Model represent attributes of HA (high available)
 *
 * @author QianBiao.NG
 * @date   2017-07-31 11:12:39
 */
@Getter
@ToString
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class HA implements ModelEntity {

	private static final long serialVersionUID = 5294355671374520846L;

	/**
	 * is HA enabled
	 */
	@JsonProperty("enable")
	Boolean enable;
	
	
	/**
	 * Specifies the replication parameters on the standby DB instance. 
	 * 
	 * Valid value: The value cannot be empty. 
	 * When MySQL is used, the value must be async or semisync. 
	 * When PostgreSQL is used, the value must be async or sync. 
	 * 
	 * async indicates the standby DB instance is asynchronous. 
	 * semisync indicates semi-synchronous. 
	 * sync indicates synchronous.
	 * 
	 */
	@JsonProperty("replicationMode")
	ReplicationMode replicationMode;

}
