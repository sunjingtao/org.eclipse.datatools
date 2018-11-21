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
package org.eclipse.datatools.connectivity.sqm.core.rte;

import java.sql.Connection;

import org.eclipse.datatools.modelbase.sql.schema.Database;

public interface ICatalogObject {
	public void refresh();
	public Connection getConnection();
	public Database getCatalogDatabase();
}