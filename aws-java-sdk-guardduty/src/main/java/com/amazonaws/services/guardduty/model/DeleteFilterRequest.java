/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFilterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The unique ID that specifies the detector where you want to delete a filter. */
    private String detectorId;
    /** The name of the filter. */
    private String filterName;

    /**
     * The unique ID that specifies the detector where you want to delete a filter.
     * 
     * @param detectorId
     *        The unique ID that specifies the detector where you want to delete a filter.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * The unique ID that specifies the detector where you want to delete a filter.
     * 
     * @return The unique ID that specifies the detector where you want to delete a filter.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * The unique ID that specifies the detector where you want to delete a filter.
     * 
     * @param detectorId
     *        The unique ID that specifies the detector where you want to delete a filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFilterRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * The name of the filter.
     * 
     * @param filterName
     *        The name of the filter.
     */

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * The name of the filter.
     * 
     * @return The name of the filter.
     */

    public String getFilterName() {
        return this.filterName;
    }

    /**
     * The name of the filter.
     * 
     * @param filterName
     *        The name of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFilterRequest withFilterName(String filterName) {
        setFilterName(filterName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getFilterName() != null)
            sb.append("FilterName: ").append(getFilterName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFilterRequest == false)
            return false;
        DeleteFilterRequest other = (DeleteFilterRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getFilterName() == null ^ this.getFilterName() == null)
            return false;
        if (other.getFilterName() != null && other.getFilterName().equals(this.getFilterName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFilterRequest clone() {
        return (DeleteFilterRequest) super.clone();
    }

}
