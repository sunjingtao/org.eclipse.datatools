/*******************************************************************************
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.enablement.internal.oracle;

import org.eclipse.datatools.connectivity.drivers.jdbc.JDBCPasswordPropertyPersistenceHook;

public class OracleDBPropertiesPersistenceHook extends
		JDBCPasswordPropertyPersistenceHook {

	public String getConnectionPropertiesPageID() {
		return "org.eclipse.datatools.enablement.oracle.profileProperties"; //$NON-NLS-1$
	}
}
