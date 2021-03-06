/*
 * Copyright (C) 2015 Sebastian Daschner, sebastian-daschner.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sebastian_daschner.jaxrs_analyzer.analysis.project.methods.testclasses.resource.response;

import com.sebastian_daschner.jaxrs_analyzer.model.elements.HttpResponse;

import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import java.util.*;

public class TestClass18 {

    // test not particularly useful; only testing generic map support
    public Response method() {
        final Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        GenericEntity<Map<String, String>> genericEntity = new GenericEntity<>(map, Map.class);
        return Response.ok(genericEntity).build();
    }

    public static Set<HttpResponse> getResult() {
        final HttpResponse result = new HttpResponse();

        result.getStatuses().addAll(Arrays.asList(200));
        result.getEntityTypes().addAll(Arrays.asList("javax.ws.rs.core.GenericEntity<java.util.Map<java.lang.String, java.lang.String>>"));

        return Collections.singleton(result);
    }

}
