/*******************************************************************************
 * Copyright (c) 2008 Sybase, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 *     Brian Fitzpatrick - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.enablement.sqlite.connection;

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.db.generic.JDBCConnection;

/**
 * @author brianf
 *
 */
public class SQLITEJDBCConnection extends JDBCConnection {

	/**
	 * @param profile
	 * @param factoryClass
	 */
	public SQLITEJDBCConnection(IConnectionProfile profile,
										Class factoryClass) {
		super(profile, factoryClass);
	}
}
