/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.redshift.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * HsmStatus StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HsmStatusStaxUnmarshaller implements Unmarshaller<HsmStatus, StaxUnmarshallerContext> {

    public HsmStatus unmarshall(StaxUnmarshallerContext context) throws Exception {
        HsmStatus hsmStatus = new HsmStatus();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return hsmStatus;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("HsmClientCertificateIdentifier", targetDepth)) {
                    hsmStatus.setHsmClientCertificateIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HsmConfigurationIdentifier", targetDepth)) {
                    hsmStatus.setHsmConfigurationIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    hsmStatus.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return hsmStatus;
                }
            }
        }
    }

    private static HsmStatusStaxUnmarshaller instance;

    public static HsmStatusStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new HsmStatusStaxUnmarshaller();
        return instance;
    }
}
