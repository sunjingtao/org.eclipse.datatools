/**
 * Author: dpchou
 * Purpose: As demo code for EclipseWorld 2005, not liable for any consequences
 * as the result of using this code. 
 */
package org.eclipse.datatools.enablement.sybase.asa.virtual;

import org.eclipse.datatools.connectivity.sqm.core.ui.explorer.providers.content.virtual.VirtualNode;
import org.eclipse.datatools.enablement.sybase.asa.containment.DBEventGroupID;
import org.eclipse.datatools.enablement.sybase.asa.providers.IWebServicesFolder;


public class WebServicesFolder extends VirtualNode implements IWebServicesFolder{
	
    public WebServicesFolder(String name, String displayName, Object parent)
    {
    	super(name,displayName,parent);
    }

    public String getGroupID()
    {
        return DBEventGroupID.ASAWEBSERVICE;
    }

}
