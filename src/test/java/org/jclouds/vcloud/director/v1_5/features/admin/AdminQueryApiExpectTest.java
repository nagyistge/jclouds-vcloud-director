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
package org.jclouds.vcloud.director.v1_5.features.admin;

//import static org.testng.Assert.assertEquals;
//
//import java.net.URI;
//
//import org.jclouds.http.HttpRequest;
//import org.jclouds.http.HttpResponse;
//import org.jclouds.vcloud.director.v1_5.VCloudDirectorMediaType;
//import org.jclouds.vcloud.director.v1_5.admin.VCloudDirectorAdminApi;
//import org.jclouds.vcloud.director.v1_5.domain.Link;
//import org.jclouds.vcloud.director.v1_5.domain.query.QueryResultRecords;
//import org.jclouds.vcloud.director.v1_5.domain.query.QueryResultRoleRecord;
//import org.jclouds.vcloud.director.v1_5.internal.VCloudDirectorAdminApiExpectTest;
//import org.testng.annotations.Test;
//
//import com.google.common.net.HttpHeaders;
//
///**
// * Test the {@link AdminQueryApi} by observing its side effects.
// */
//@Test(groups = { "unit", "admin" }, singleThreaded = true, testName = "AdminQueryApiExpectTest")
//public class AdminQueryApiExpectTest extends VCloudDirectorAdminApiExpectTest {
//
//   // TODO Write expect tests for all other admin-query operations
//
//   @Test
//   public void testQueryAllGroups() {
//
//      // TODO Need an example /admin/groups/query that actually contains records!
//
//      HttpRequest queryRequest = HttpRequest.builder()
//              .method("GET")
//              .endpoint(endpoint + "/admin/groups/query")
//              .addHeader("Accept", "*/*")
//              .addHeader("x-vcloud-authorization", token)
//              .addHeader(HttpHeaders.COOKIE, "vcloud-token=" + token)
//              .build();
//
//      HttpResponse queryResponse = HttpResponse.builder()
//              .statusCode(200)
//              .payload(payloadFromResourceWithContentType("/query/admin/allGroups.xml", VCloudDirectorMediaType.QUERY_RESULT_RECORDS + ";version=1.5"))
//              .build();
//
//      VCloudDirectorAdminApi api = requestsSendResponses(loginRequest, sessionResponse, queryRequest, queryResponse);
//
//      QueryResultRecords expected = QueryResultRecords.builder()
//            .href(URI.create("https://vcloudbeta.bluelock.com/api/admin/groups/query?page=1&pageSize=25&format=records"))
//            .type("application/vnd.vmware.vcloud.query.records+xml")
//            .name("group")
//            .page(1)
//            .pageSize(25)
//            .total(0L)
//            .link(Link.builder()
//                        .rel("alternate")
//                        .type("application/vnd.vmware.vcloud.query.references+xml")
//                        .href(URI.create("https://vcloudbeta.bluelock.com/api/admin/groups/query?page=1&pageSize=25&format=references"))
//                        .build())
//            .link(Link.builder()
//                        .rel("alternate")
//                        .type("application/vnd.vmware.vcloud.query.idrecords+xml")
//                        .href(URI.create("https://vcloudbeta.bluelock.com/api/admin/groups/query?page=1&pageSize=25&format=idrecords"))
//                        .build())
//            .build();
//
//      assertEquals(api.getQueryApi().groupsQueryAll(), expected);
//   }
//
////   <?xml version="1.0" encoding="UTF-8"?>
////   <QueryResultRecords xmlns="http://www.vmware.com/vcloud/v1.5" total="4" pageSize="25" page="1" name="role" type="application/vnd.vmware.vcloud.query.records+xml" href="https://vcloudbeta.bluelock.com/api/admin/roles/query?page=1&amp;pageSize=25&amp;format=records" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.vmware.com/vcloud/v1.5 http://vcloudbeta.bluelock.com/api/v1.5/schema/master.xsd">
////       <Link rel="alternate" type="application/vnd.vmware.vcloud.query.references+xml" href="https://vcloudbeta.bluelock.com/api/admin/roles/query?page=1&amp;pageSize=25&amp;format=references"/>
////       <Link rel="alternate" type="application/vnd.vmware.vcloud.query.idrecords+xml" href="https://vcloudbeta.bluelock.com/api/admin/roles/query?page=1&amp;pageSize=25&amp;format=idrecords"/>
////       <RoleRecord name="vApp Author" isReadOnly="false" href="https://vcloudbeta.bluelock.com/api/admin/role/1bf4457f-a253-3cf1-b163-f319f1a31802"/>
////   </QueryResultRecords>
//
//   @Test
//   public void testQueryAllRoles() {
//
//      HttpRequest queryRequest = HttpRequest.builder()
//              .method("GET")
//              .endpoint(endpoint + "/admin/roles/query")
//              .addHeader("Accept", "*/*")
//              .addHeader("x-vcloud-authorization", token)
//              .addHeader(HttpHeaders.COOKIE, "vcloud-token=" + token).build();
//
//      HttpResponse queryResponse = HttpResponse.builder()
//              .statusCode(200)
//              .payload(payloadFromResourceWithContentType("/query/admin/allRoles.xml", VCloudDirectorMediaType.QUERY_RESULT_RECORDS + ";version=1.5"))
//              .build();
//
//      VCloudDirectorAdminApi api = requestsSendResponses(loginRequest, sessionResponse, queryRequest, queryResponse);
//
//      QueryResultRecords expected = QueryResultRecords.builder()
//            .href(URI.create("https://vcloudbeta.bluelock.com/api/admin/roles/query?page=1&pageSize=25&format=records"))
//            .type("application/vnd.vmware.vcloud.query.records+xml")
//            .name("role")
//            .page(1)
//            .pageSize(25)
//            .total(1L)
//            .link(Link.builder()
//                        .rel("alternate")
//                        .type("application/vnd.vmware.vcloud.query.references+xml")
//                        .href(URI.create("https://vcloudbeta.bluelock.com/api/admin/roles/query?page=1&pageSize=25&format=references"))
//                        .build())
//            .link(Link.builder()
//                        .rel("alternate")
//                        .type("application/vnd.vmware.vcloud.query.idrecords+xml")
//                        .href(URI.create("https://vcloudbeta.bluelock.com/api/admin/roles/query?page=1&pageSize=25&format=idrecords"))
//                        .build())
//            .record(QueryResultRoleRecord.builder()
//                        .href(URI.create("https://vcloudbeta.bluelock.com/api/admin/role/1bf4457f-a253-3cf1-b163-f319f1a31802"))
//                        .name("vApp Author")
//                        .isReadOnly(false)
//                        .build())
//            .build();
//
//      assertEquals(api.getQueryApi().rolesQueryAll(), expected);
//   }
//}
		
