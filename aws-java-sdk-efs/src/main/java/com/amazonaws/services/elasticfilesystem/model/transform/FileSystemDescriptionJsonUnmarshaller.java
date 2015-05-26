/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticfilesystem.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.elasticfilesystem.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * File System Description JSON Unmarshaller
 */
public class FileSystemDescriptionJsonUnmarshaller implements Unmarshaller<FileSystemDescription, JsonUnmarshallerContext> {

    public FileSystemDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        FileSystemDescription fileSystemDescription = new FileSystemDescription();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("OwnerId", targetDepth)) {
                    context.nextToken();
                    fileSystemDescription.setOwnerId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationToken", targetDepth)) {
                    context.nextToken();
                    fileSystemDescription.setCreationToken(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FileSystemId", targetDepth)) {
                    context.nextToken();
                    fileSystemDescription.setFileSystemId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    fileSystemDescription.setCreationTime(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LifeCycleState", targetDepth)) {
                    context.nextToken();
                    fileSystemDescription.setLifeCycleState(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    fileSystemDescription.setName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NumberOfMountTargets", targetDepth)) {
                    context.nextToken();
                    fileSystemDescription.setNumberOfMountTargets(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SizeInBytes", targetDepth)) {
                    context.nextToken();
                    fileSystemDescription.setSizeInBytes(FileSystemSizeJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }

            token = context.nextToken();
        }
        
        return fileSystemDescription;
    }

    private static FileSystemDescriptionJsonUnmarshaller instance;
    public static FileSystemDescriptionJsonUnmarshaller getInstance() {
        if (instance == null) instance = new FileSystemDescriptionJsonUnmarshaller();
        return instance;
    }
}
    