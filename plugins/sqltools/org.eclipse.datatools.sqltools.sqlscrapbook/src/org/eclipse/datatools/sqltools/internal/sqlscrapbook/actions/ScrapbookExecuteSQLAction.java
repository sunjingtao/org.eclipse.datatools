/***********************************************************************************************************************
 * Copyright (c) 2009 Sybase, Inc. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License 2.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors: Sybase, Inc. - initial API and implementation
 **********************************************************************************************************************/
package org.eclipse.datatools.sqltools.internal.sqlscrapbook.actions;

import java.sql.Connection;

import org.eclipse.datatools.sqltools.internal.sqlscrapbook.editor.SQLScrapbookEditor;
import org.eclipse.datatools.sqltools.sqleditor.internal.actions.ExecuteSQLAction;
import org.eclipse.datatools.sqltools.sqleditor.internal.actions.ExecuteSelectionSQLAction;

/**
 * Action for executing all SQL statements in SQL Scrapbook editor.
 * 
 * @author juewu
 */
public class ScrapbookExecuteSQLAction extends ExecuteSQLAction
{
    public ScrapbookExecuteSQLAction(SQLScrapbookEditor targetEditor)
    {
        super(targetEditor);
    }

    /**
     * @see ExecuteSelectionSQLAction#getExecutionConnection()
     */
    protected Connection getExecutionConnection()
    {
        if (_sqlEditor instanceof SQLScrapbookEditor)
        {
            return ((SQLScrapbookEditor) _sqlEditor).getConnection();
        }

        return super.getExecutionConnection();
    }
}
