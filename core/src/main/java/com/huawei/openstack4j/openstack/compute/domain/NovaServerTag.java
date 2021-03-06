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
package com.huawei.openstack4j.openstack.compute.domain;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.MoreObjects;

import com.huawei.openstack4j.model.ModelEntity;

public class NovaServerTag implements ModelEntity {
	private static final long serialVersionUID = 1L;

	private List<String> tags = new ArrayList<String>();

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public void addTag(String... tags) {
		for(String tag: tags) {
			this.tags.add(tag);
		}
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).omitNullValues().add("tags", tags).toString();
	}

}
