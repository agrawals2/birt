/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.designer.internal.ui.views.data.providers;

import org.eclipse.birt.report.designer.internal.ui.util.UIUtil;
import org.eclipse.birt.report.designer.internal.ui.views.DefaultNodeProvider;
import org.eclipse.birt.report.designer.ui.IReportGraphicConstants;
import org.eclipse.birt.report.model.api.ResultSetColumnHandle;

/**
 * Deals with dataset column
 */

public class ResultSetColumnProvider extends DefaultNodeProvider
{

	/**
	 * Returns the right ICON name constant of given elemen
	 * 
	 * @param model
	 * @return icon name
	 */
	public String getIconName( Object model )
	{
		return IReportGraphicConstants.ICON_DATA_COLUMN;
	}

	/**
	 * Gets the children element of the given model using visitor
	 * 
	 * @param object
	 *            the handle
	 */
	public Object[] getChildren( Object object )
	{
		return new Object[]{};
	}

	/*
	 * (non-Javadoc
	 * 
	 * @see org.eclipse.birt.report.designer.internal.ui.views.INodeProvider#getNodeDisplayName(java.lang.Object)
	 */
	public String getNodeDisplayName( Object model )
	{
		return UIUtil.getColumnDisplayName( ( (ResultSetColumnHandle) model ) );
	}

}
