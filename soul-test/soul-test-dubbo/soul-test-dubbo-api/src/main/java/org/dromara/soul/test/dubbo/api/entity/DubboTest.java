/*
 *   Licensed to the Apache Software Foundation (ASF) under one or more
 *   contributor license agreements.  See the NOTICE file distributed with
 *   this work for additional information regarding copyright ownership.
 *   The ASF licenses this file to You under the Apache License, Version 2.0
 *   (the "License"); you may not use this file except in compliance with
 *   the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package org.dromara.soul.test.dubbo.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.net.URLEncoder;

/**
 * DubboTest.
 * @author xiaoyu(Myth)
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DubboTest implements Serializable {

    private String id;

    private String name;

    private Address address;


    public static void main(String[] args)  throws Exception{
        System.out.println(URLEncoder.encode("安徽","UTF-8"));

        String json = "{" +
                "  \"interfaceName\":\"org.dromara.soul.test.dubbo.api.service.DubboTestService\",\n" +
                "  \"method\":\"testEntityStringParam\",\n" +
                "  \"timeout\":\"50000\",\n" +
                "  \"paramClass\":\"[org.dromara.soul.test.dubbo.api.entity.DubboTest]\",\n" +
                "  \"classParams\":[{\n" +
                "    \"id\":\"xxx\",\n" +
                "    \"name\":\"xiaoyu\"\n" +
                "  }],\n" +
                "  \"params\":{" +
                "    \"java.lang.String\":\"666\",\n" +
                "    \"java.lang.Integer\":\"1\"\n" +
                "  }\n" +
                "}";

        System.out.println(json);

        String json2 = "{\n" +
                "    \"interfaceName\": \"org.dromara.soul.test.dubbo.api.service.DubboTestService\", \n" +
                "    \"method\": \"testListEntity\", \n" +
                "    \"timeout\": \"5000\", \n" +
                "    \"paramClass\": [\n" +
                "        \"java.util.List\"\n" +
                "    ], \n" +
                "    \"classParams\": [\n" +
                "        {\n" +
                "            \"id\": \"xxxx\", \n" +
                "            \"name\": \"y\", \n" +
                "            \"class\": \"org.dromara.soul.test.dubbo.api.entity.DubboTest\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"id\": \"xxx\", \n" +
                "            \"name\": \"y\", \n" +
                "            \"class\": \"org.dromara.soul.test.dubbo.api.entity.DubboTest\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        System.out.println(json2);

    }



}