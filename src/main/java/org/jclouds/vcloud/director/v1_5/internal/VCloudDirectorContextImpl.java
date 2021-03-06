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
import javax.inject.Inject;
import javax.inject.Singleton;

import org.jclouds.annotations.Name;
import org.jclouds.domain.Credentials;
import org.jclouds.lifecycle.Closer;
import org.jclouds.location.Provider;
import org.jclouds.providers.ProviderMetadata;
import org.jclouds.rest.ApiContext;
import org.jclouds.rest.Utils;
import org.jclouds.rest.internal.ApiContextImpl;
import org.jclouds.vcloud.director.v1_5.VCloudDirectorContext;
import org.jclouds.vcloud.director.v1_5.admin.VCloudDirectorAdminApi;
<<<<<<< HEAD
import org.jclouds.vcloud.director.v1_5.user.VCloudDirectorApi;
=======
import org.jclouds.vcloud.director.v1_5.admin.VCloudDirectorAdminAsyncApi;
import org.jclouds.vcloud.director.v1_5.VCloudDirectorApi;
import org.jclouds.vcloud.director.v1_5.user.VCloudDirectorAsyncApi;
>>>>>>> Refactor vcloud-director

import com.google.common.base.Supplier;
import com.google.inject.Injector;
import com.google.inject.TypeLiteral;

@Singleton
public class VCloudDirectorContextImpl extends ApiContextImpl<VCloudDirectorApi> implements VCloudDirectorContext {
   private final ApiContext<VCloudDirectorAdminApi> adminContext;

   @Inject
   VCloudDirectorContextImpl(@Name String name, ProviderMetadata providerMetadata,
         @Provider Supplier<Credentials> creds, Utils utils, Closer closer, Injector injector,
         ApiContext<VCloudDirectorAdminApi> adminContext) {
      super(name, providerMetadata, creds, utils, closer, injector, TypeLiteral.get(VCloudDirectorApi.class));
      this.adminContext = adminContext;
   }
   
   @Override
   public ApiContext<VCloudDirectorAdminApi> getAdminContext() {
      return adminContext;
   }
}
*/
