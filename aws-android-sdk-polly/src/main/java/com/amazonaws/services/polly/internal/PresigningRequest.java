/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.polly.internal;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.auth.AWSCredentials;

/**
 * Empty request object useful for setting request level credentials without
 * having the user facing pre-siging request extend from {@link AmazonWebServiceRequest}.
 */
public class PresigningRequest extends AmazonWebServiceRequest {
    public PresigningRequest withRequestCredentials(AWSCredentials credentials) {
        setRequestCredentials(credentials);
        return this;
    }
}
