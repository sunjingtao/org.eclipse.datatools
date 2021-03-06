/*******************************************************************************
 * Copyright (c) 2001, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.connectivity.apache.derby.internal.ui.util;

import java.util.ResourceBundle;

/**
 * @author ljulien
 */
public class ResourceLoader
{
	private static final String RESOURCE_PATH = "org/eclipse/datatools/connectivity/apache/derby/internal/ui/l10n/"; //$NON-NLS-1$
	private static final String UI_RESOURCES = "derbyUI"; //$NON-NLS-1$
	private static final String NO_RESOURCE_FOUND = "NO_RESOURCE_FOUND"; //$NON-NLS-1$

	private ResourceBundle bundle;
	
	public static final ResourceLoader INSTANCE = new ResourceLoader ();
	
	private ResourceLoader()
    {
        this.bundle = ResourceBundle.getBundle(RESOURCE_PATH + UI_RESOURCES);
    }
	
    /**
     * @param stringID - the key to look for
     * @return - the localized string
     */
    public String queryString (String stringID)
    {
        try
        {
            String resource = null;
            resource = this.bundle.getString(stringID);
            return (resource);
        }
        catch (Throwable e)
        {
        	return NO_RESOURCE_FOUND;
        }
    }
}
