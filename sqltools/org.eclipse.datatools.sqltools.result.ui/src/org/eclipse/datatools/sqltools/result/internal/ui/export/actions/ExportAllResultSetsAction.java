/*******************************************************************************
 * Copyright (c) 2005 Sybase, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *    Sybase, Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.sqltools.result.internal.ui.export.actions;


import org.eclipse.datatools.help.HelpUtil;
import org.eclipse.datatools.sqltools.result.internal.ui.Messages;
import org.eclipse.datatools.sqltools.result.internal.ui.export.ResultExportWizard;
import org.eclipse.datatools.sqltools.result.model.IResultInstance;
import org.eclipse.datatools.sqltools.result.ui.IHelpConstants;
import org.eclipse.datatools.sqltools.result.ui.ResultsViewUIPlugin;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

/**
 * Exports all the result set objects in a result instance into an external file
 * 
 *  @author Dafan Yang
 */
public class ExportAllResultSetsAction extends Action
{
    IResultInstance		_result;
    Shell				_shell;

    public ExportAllResultSetsAction(Shell shell, IResultInstance result)
    {
        super(Messages.AllResultSetAction_Title); 
        this._shell = shell;
        _result = result;
        
        PlatformUI.getWorkbench().getHelpSystem().setHelp(this, HelpUtil.getContextId(IHelpConstants.ACTION_EXPORT_ALL_RESULTSETS, ResultsViewUIPlugin.getDefault().getBundle().getSymbolicName()));
    }

    Shell getShell()
    {
        return _shell;
    }

    IResultInstance getResultSetObject()
    {
        return _result;
    }

    public void run()
    {
        WizardDialog dialog = new WizardDialog(getShell(), new ResultExportWizard(getResultSetObject()));
        dialog.open();
    }
}
