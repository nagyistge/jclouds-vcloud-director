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
package org.jclouds.vcloud.director.v1_5.compute.functions;

import static com.google.common.base.Preconditions.checkNotNull;
import java.net.URI;
import java.util.concurrent.ExecutionException;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Singleton;

import org.jclouds.logging.Logger;
import org.jclouds.vcloud.director.v1_5.domain.dmtf.Envelope;
import org.jclouds.vcloud.director.v1_5.functions.NetworkSectionForVAppTemplate;

import com.google.common.base.Function;
import com.google.common.cache.LoadingCache;

@Singleton
public class ValidateVAppTemplateAndReturnEnvelopeOrThrowIllegalArgumentException implements
        Function<URI, Envelope> {

   @Resource
   protected Logger logger = Logger.NULL;

   private final LoadingCache<URI, Envelope> envelopes;
   private final NetworkSectionForVAppTemplate findNetworkSectionForVAppTemplate;

   @Inject
   protected ValidateVAppTemplateAndReturnEnvelopeOrThrowIllegalArgumentException(LoadingCache<URI, Envelope> envelopes,
                                                                                  NetworkSectionForVAppTemplate findNetworkSectionForVAppTemplate) {
      this.envelopes = checkNotNull(envelopes, "envelopes");
      this.findNetworkSectionForVAppTemplate = checkNotNull(findNetworkSectionForVAppTemplate, "findNetworkSectionForVAppTemplate");
   }

   @Override
   public Envelope apply(URI from) {
      //checkArgument(from.getChildren().size() == 1, "multiple vms are not supported: %s", from);

      // TODO
      /*
      checkArgument(findNetworkSectionForVAppTemplate.apply(from).getNetworks().size() == 1,
               "multiple network connections are not supported: %s", from);
      */
      //checkArgument(from.isOvfDescriptorUploaded(), "ovf descriptor is not uploaded: %s", from);
      Envelope ovf = getOVFForVAppTemplateAndValidate(from);
      return ovf;
   }

   private Envelope getOVFForVAppTemplateAndValidate(URI from) throws IllegalArgumentException {
      Envelope ovf;
      try {
         ovf = envelopes.get(from);
         // TODO
         //checkArgument(ovf.getVirtualSystem().getVirtualHardwareSections().size() > 0, "no hardware sections exist in ovf %s", ovf);
      } catch (ExecutionException e) {
         throw new IllegalArgumentException("no ovf envelope found for: " + from, e);
      }
      return ovf;
   }
}

