/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.compute.models;

import java.util.List;

/**
 * The Virtual Machine Scale Set List Skus operation response.
 */
public class VirtualMachineScaleSetListSkusResult {
    /**
     * Gets the list of skus available for the virtual machine scale set.
     */
    private List<VirtualMachineScaleSetSku> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<VirtualMachineScaleSetSku> getValue() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     */
    public void setValue(List<VirtualMachineScaleSetSku> value) {
        this.value = value;
    }

}