/*******************************************************************************
 * Copyright (c) 2005 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.model.simpleapi;

import org.eclipse.birt.report.model.api.ResultSetColumnHandle;
import org.eclipse.birt.report.model.api.elements.structures.ResultSetColumn;
import org.eclipse.birt.report.model.api.simpleapi.IResultSetColumn;

/**
 * 
 * Implements of ResultSetColumn.
 * 
 */

public class ResultSetColumnImpl implements IResultSetColumn
{

	/**
	 * ResultSetColumn instance.
	 */

	private ResultSetColumn column;

	/**
	 * ResultSetColumn instance.
	 */

	private ResultSetColumnHandle columnHandle;

	/**
	 * Constructor
	 * 
	 */

	public ResultSetColumnImpl( )
	{
		this.column = createResultSetColumn( );
	}

	/**
	 * Constructor
	 * 
	 * @param columnHandle
	 */

	public ResultSetColumnImpl( ResultSetColumnHandle columnHandle )
	{

		if ( columnHandle == null )
		{
			this.column = createResultSetColumn( );
		}
		else
		{
			this.columnHandle = columnHandle;
			this.column = (ResultSetColumn) columnHandle.getStructure( );
		}
	}

	/**
	 * Create instance of <code>ResultSetColumn</code>
	 * 
	 * @return instance
	 */

	private ResultSetColumn createResultSetColumn( )
	{
		ResultSetColumn c = new ResultSetColumn( );
		return c;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.report.engine.api.script.element.IResultSetColumn#getColumnDataType()
	 */

	public String getColumnDataType( )
	{
		return column.getDataType( );
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.report.engine.api.script.element.IResultSetColumn#getName()
	 */

	public String getName( )
	{
		return column.getColumnName( );
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.report.engine.api.script.element.IResultSetColumn#getNativeDataType()
	 */

	public Integer getNativeDataType( )
	{
		return column.getNativeDataType( );
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.report.engine.api.script.element.IResultSetColumn#getPosition()
	 */

	public Integer getPosition( )
	{
		return column.getPosition( );
	}

}
