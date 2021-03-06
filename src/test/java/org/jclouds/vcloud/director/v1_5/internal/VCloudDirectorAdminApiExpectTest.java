/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.vcloud.director.v1_5.internal;

/*
import org.jclouds.http.HttpRequest;
import org.jclouds.http.HttpResponse;
import org.jclouds.vcloud.director.v1_5.VCloudDirectorContext;
import org.jclouds.vcloud.director.v1_5.admin.VCloudDirectorAdminApi;

import com.google.common.base.Function;
import com.google.inject.Module;

public abstract class VCloudDirectorAdminApiExpectTest extends
         BaseVCloudDirectorExpectTest<VCloudDirectorAdminApi> implements
         Function<VCloudDirectorContext, VCloudDirectorAdminApi> {

   @Override
   public VCloudDirectorAdminApi createClient(Function<HttpRequest, HttpResponse> fn, Module module, Properties props) {
      return apply(createVCloudDirectorContext(fn, module, props));
   }

   @Override
   public VCloudDirectorAdminApi apply(VCloudDirectorContext input) {
      return input.getAdminContext().getApi();
   }

   private VCloudDirectorContext createVCloudDirectorContext(Function<HttpRequest, HttpResponse> fn, Module module,
         Properties props) {
      return createInjector(fn, module, props).getInstance(VCloudDirectorContext.class);
   }
}
*/
