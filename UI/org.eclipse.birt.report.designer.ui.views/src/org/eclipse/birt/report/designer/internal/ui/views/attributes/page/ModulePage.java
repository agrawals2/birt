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

package org.eclipse.birt.report.designer.internal.ui.views.attributes.page;

import org.eclipse.birt.report.designer.internal.ui.views.attributes.provider.PathDescriptorProvider;
import org.eclipse.birt.report.designer.internal.ui.views.attributes.provider.SimpleComboPropertyDescriptorProvider;
import org.eclipse.birt.report.designer.internal.ui.views.attributes.provider.TextPropertyDescriptorProvider;
import org.eclipse.birt.report.designer.internal.ui.views.attributes.section.SeperatorSection;
import org.eclipse.birt.report.designer.internal.ui.views.attributes.section.SimpleComboSection;
import org.eclipse.birt.report.designer.internal.ui.views.attributes.section.TextAndButtonSection;
import org.eclipse.birt.report.designer.internal.ui.views.attributes.section.TextSection;
import org.eclipse.birt.report.designer.nls.Messages;
import org.eclipse.birt.report.designer.ui.IReportGraphicConstants;
import org.eclipse.birt.report.model.api.ModuleHandle;
import org.eclipse.birt.report.model.api.ReportDesignHandle;
import org.eclipse.birt.report.model.api.elements.ReportDesignConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;

/**
 * The general attribute page of Module element.
 */
public class ModulePage extends AttributePage
{

	public void buildUI( Composite parent  )
	{
		super.buildUI( parent );
		container.setLayout( WidgetUtil.createGridLayout( 4 ) );

		TextPropertyDescriptorProvider authorProvider = new TextPropertyDescriptorProvider( ModuleHandle.AUTHOR_PROP,
				ReportDesignConstants.MODULE_ELEMENT );
		TextSection authorSection = new TextSection( authorProvider.getDisplayName( ),
				container,
				true );
		authorSection.setProvider( authorProvider );
		authorSection.setWidth( 500 );
		authorSection.setGridPlaceholder( 2, true );
		addSection( PageSectionId.MODULE_AUTHOR, authorSection );

		TextPropertyDescriptorProvider createdByProvider = new TextPropertyDescriptorProvider( ModuleHandle.CREATED_BY_PROP,
				ReportDesignConstants.MODULE_ELEMENT );
		TextSection createdBySection = new TextSection( createdByProvider.getDisplayName( ),
				container,
				true );
		createdBySection.setProvider( createdByProvider );
		createdBySection.setWidth( 500 );
		createdBySection.setGridPlaceholder( 2, true );
		addSection( PageSectionId.MODULE_CREATED_BY, createdBySection );

		PathDescriptorProvider pathProvider = new PathDescriptorProvider( );
		TextSection pathSection = new TextSection( pathProvider.getDisplayName( ),
				container,
				true );
		pathSection.setProvider( pathProvider );
		pathSection.setWidth( 500 );
		pathSection.setGridPlaceholder( 2, true );
		addSection( PageSectionId.MODULE_PATH, pathSection );

		TextPropertyDescriptorProvider titleProvider = new TextPropertyDescriptorProvider( ModuleHandle.TITLE_PROP,
				ReportDesignConstants.MODULE_ELEMENT );
		TextSection titleSection = new TextSection( titleProvider.getDisplayName( ),
				container,
				true );
		titleSection.setProvider( titleProvider );
		titleSection.setWidth( 500 );
		titleSection.setGridPlaceholder( 2, true );
		addSection( PageSectionId.MODULE_TITLE, titleSection );

		// WidgetUtil.buildGridControl( this,
		// propertiesMap,
		// ReportDesignConstants.MODULE_ELEMENT,
		// ModuleHandle.UNITS_PROP,
		// 2,
		// 500 );

		TextPropertyDescriptorProvider resourceProvider = new TextPropertyDescriptorProvider( ModuleHandle.INCLUDE_RESOURCE_PROP,
				ReportDesignConstants.MODULE_ELEMENT );
		TextSection resourceSection = new TextSection( resourceProvider.getDisplayName( ),
				container,
				true );
		resourceSection.setProvider( resourceProvider );

		resourceSection.setWidth( 500 );
		resourceSection.setGridPlaceholder( 2, true );
		addSection( PageSectionId.MODULE_RESOURCE, resourceSection );

		SeperatorSection seperatorSection = new SeperatorSection( container,
				SWT.HORIZONTAL );
		addSection( PageSectionId.MODULE_SEPERATOR, seperatorSection );

		SimpleComboPropertyDescriptorProvider themeProvider = new SimpleComboPropertyDescriptorProvider( ModuleHandle.THEME_PROP,
				ReportDesignConstants.MODULE_ELEMENT );
		SimpleComboSection themeSection = new SimpleComboSection( themeProvider.getDisplayName( ),
				container,
				true );
		themeSection.setProvider( themeProvider );
		themeSection.setWidth( 500 );
		themeSection.setGridPlaceholder( 2, true );
		addSection( PageSectionId.MODULE_THEME, themeSection );


		createSections( );
		layoutSections( );
	}

}