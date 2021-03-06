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
package org.jclouds.vcloud.director.v1_5.domain.query;

import javax.xml.bind.annotation.XmlRootElement;

import com.google.common.base.Objects;

/**
 * Represents the results from a vCloud query as references.
 *
 * <pre>
 * &lt;complexType name="QueryResultReferences" /&gt;
 * </pre>
 */
@XmlRootElement(name = "CatalogReferences")
public class CatalogReferences extends QueryResultReferences {

   public static Builder<?> builder() {
      return new ConcreteBuilder();
   }

   @Override
   public Builder<?> toBuilder() {
      return builder().fromCatalogReferences(this);
   }

   private static class ConcreteBuilder extends Builder<ConcreteBuilder> {
   }
   
   public static class Builder<B extends Builder<B>> extends QueryResultReferences.Builder<B> {

      @Override
      public CatalogReferences build() {
         return new CatalogReferences(this);
      }

      public B fromCatalogReferences(CatalogReferences in) {
         return fromQueryResultReferences(in);
      }
   }

   protected CatalogReferences(Builder<?> builder) {
      super(builder);
   }

   protected CatalogReferences() {
      // for JAXB
   }

   @Override
   public boolean equals(Object o) {
      if (this == o)
         return true;
      if (o == null || getClass() != o.getClass())
         return false;
      CatalogReferences that = CatalogReferences.class.cast(o);
      return super.equals(that);
   }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode());
    }
}
