/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.cxf.testmodels.artistregistry;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "artistArray", propOrder = "item")
public class ArtistArray
{
    @XmlElement(nillable = true)
    protected List<Artist> item;

    public List<Artist> getItem()
    {
        if(item == null)
        {
            item = new ArrayList<Artist>();
        }
        return item;
    }
}
