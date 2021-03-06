/*******************************************************************************
 * Copyright (c) 2008, 2011 Sybase, Inc. and others.
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0 which
 * accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors: 
 *      brianf - initial API and implementation
 *      Actuate Corporation - support for OSGi-less platform (Bugzilla 338997)
 ******************************************************************************/

package org.eclipse.datatools.connectivity.apache.internal.derby.driver;

import java.net.URL;

import org.eclipse.core.runtime.IPath;
import org.eclipse.datatools.connectivity.drivers.DefaultDriverValuesProvider;
import org.eclipse.datatools.connectivity.drivers.IDriverValuesProvider;
import org.eclipse.datatools.connectivity.services.PluginResourceLocator;

public class DerbyClientDriverValuesProvider extends DefaultDriverValuesProvider {

	public String createDefaultValue(String key) {
		/**
		 * Check to see if the org.apache.derby.core wrapper plug-in is 
		 * in the installed environment. If it is (most recently with 10.3 support),
		 * we'll use it and grab the derby client jar from there.
		 */
		if (key.equals(IDriverValuesProvider.VALUE_CREATE_DEFAULT)) {
		    URL url = PluginResourceLocator.getPluginEntry( "org.apache.derby.core",  //$NON-NLS-1$
		                "derbyclient.jar" ); //$NON-NLS-1$
            if (url != null)
                return Boolean.toString(true);
		}

		if (key.equals(IDriverValuesProvider.VALUE_JARLIST)) {
		    IPath path = PluginResourceLocator.getPluginEntryPath( "org.apache.derby.core",  //$NON-NLS-1$
                            "derbyclient.jar" ); //$NON-NLS-1$
            if (path != null) 
                return path.toOSString();			
		}

		return super.createDefaultValue(key);
	}

}
