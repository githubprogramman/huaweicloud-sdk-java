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
package com.huawei.openstack4j.openstack.ims.v2.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.huawei.openstack4j.model.ModelEntity;
import lombok.*;

import java.util.List;

/**
 * Created on 2018/8/29.
 */
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@JsonRootName("volume")
public class ImageCreateByInstance implements ModelEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4953322640558725194L;

	/**
     * 系统盘镜像名称
     */
    @JsonProperty("name")
    private String name;

    /**
     *镜像描述信息
     */
    @JsonProperty("description")
    private String description;

    /**
     *需要转换的云服务器ID
     */
    @JsonProperty("instance_id")
    private String instanceId;

    /**
     *需要转换的数据盘信息，其中，当使用云服务器上的数据盘进行私有数据盘镜像创建时，该字段必选
     */
    @JsonProperty("data_images")
    private List<DataImage> dataImages;

    /**
     *镜像标签列表
     */
    @JsonProperty("tags")
    private List<String> tags;


}