/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.resources.models;

public class ResourceManagementError {
    private String code;
    
    /**
    * Required. Gets or sets the error code returned from the server.
    * @return The Code value.
    */
    public String getCode() {
        return this.code;
    }
    
    /**
    * Required. Gets or sets the error code returned from the server.
    * @param codeValue The Code value.
    */
    public void setCode(final String codeValue) {
        this.code = codeValue;
    }
    
    private String message;
    
    /**
    * Required. Gets or sets the error message returned from the server.
    * @return The Message value.
    */
    public String getMessage() {
        return this.message;
    }
    
    /**
    * Required. Gets or sets the error message returned from the server.
    * @param messageValue The Message value.
    */
    public void setMessage(final String messageValue) {
        this.message = messageValue;
    }
    
    private String target;
    
    /**
    * Optional. Gets or sets the target of the error.
    * @return The Target value.
    */
    public String getTarget() {
        return this.target;
    }
    
    /**
    * Optional. Gets or sets the target of the error.
    * @param targetValue The Target value.
    */
    public void setTarget(final String targetValue) {
        this.target = targetValue;
    }
    
    /**
    * Initializes a new instance of the ResourceManagementError class.
    *
    */
    public ResourceManagementError() {
    }
    
    /**
    * Initializes a new instance of the ResourceManagementError class with
    * required arguments.
    *
    * @param code Gets or sets the error code returned from the server.
    * @param message Gets or sets the error message returned from the server.
    */
    public ResourceManagementError(String code, String message) {
        if (code == null) {
            throw new NullPointerException("code");
        }
        if (message == null) {
            throw new NullPointerException("message");
        }
        this.setCode(code);
        this.setMessage(message);
    }
}