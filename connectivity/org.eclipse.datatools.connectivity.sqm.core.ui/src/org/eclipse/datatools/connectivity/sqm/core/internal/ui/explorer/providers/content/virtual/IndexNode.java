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
package org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.providers.content.virtual;

import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.virtual.IIndexNode;
import org.eclipse.datatools.connectivity.sqm.core.internal.ui.icons.ImageDescription;
import org.eclipse.datatools.connectivity.sqm.core.internal.ui.util.resources.ResourceLoader;
import org.eclipse.datatools.connectivity.sqm.core.ui.explorer.providers.content.virtual.VirtualNode;
import org.eclipse.datatools.connectivity.sqm.internal.core.containment.GroupID;
import org.eclipse.datatools.modelbase.sql.constraints.SQLConstraintsPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.resource.ImageDescriptor;


/**
 * @author ljulien
 */
public class IndexNode extends VirtualNode implements IIndexNode
{
	/**
	 * @param name
	 * @param displayName
	 */
	public IndexNode(String name, String displayName, Object parent)
	{
		super(name, displayName, parent);
	}

    public String getGroupID ()
    {
        return GroupID.INDEX;
    }
    
	//@Override
	public ImageDescriptor[] getCreateImageDescriptor() {
		return new ImageDescriptor[] { 
				ImageDescription.getIndexDescriptor()
		};
	}

	//@Override
	public String[] getCreateLabel() {
		return new String[] {
				ResourceLoader.getResourceLoader().queryString("SCHEMA_MANAGEMENT_CREATE_INDEX")
		};
	}

	//@Override
	public EClass[] getCreateType() {
		return new EClass[] {
				SQLConstraintsPackage.eINSTANCE.getIndex()
		};
	}

	//@Override
	public boolean shouldDisplayCreate() {
		return true;
	}

	//@Override
	public boolean shouldDisplayAdd() {
		return false;
	}

}
