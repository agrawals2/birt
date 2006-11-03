
package org.eclipse.birt.report.designer.internal.ui.views.attributes.provider;

import java.net.URL;

import org.eclipse.birt.report.designer.core.model.SessionHandleAdapter;
import org.eclipse.birt.report.designer.nls.Messages;
import org.eclipse.birt.report.designer.util.DEUtil;
import org.eclipse.birt.report.model.api.IResourceLocator;
import org.eclipse.birt.report.model.api.TemplateReportItemHandle;
import org.eclipse.birt.report.model.api.activity.SemanticException;

public class TemplateDescriptorProvider implements IResourceKeyDescriptorProvider
{


	public String getBaseName( )
	{
		return SessionHandleAdapter.getInstance( )
				.getReportDesignHandle( )
				.getIncludeResource( );
	}

	public URL getResourceURL( )
	{
		return SessionHandleAdapter.getInstance( )
				.getReportDesignHandle( )
				.findResource( getBaseName( ), IResourceLocator.MESSAGE_FILE );
	}

	public String getBrowserText( )
	{
		return "...";
	}

	public String getResetText( )
	{
		return Messages.getString( "ResourceKeyDescriptor.text.Reset" );
	}

	public boolean isEnable( )
	{
		return !( DEUtil.getInputSize( input ) > 1 );
	}

	public String getDisplayName( )
	{
		return Messages.getString( "TemplateReportItemPageGenerator.List.TextKey" );
	}

	public Object load( )
	{
		String key = "";
		if (DEUtil.getInputSize( input ) == 1
				&& DEUtil.getInputFirstElement( input ) instanceof TemplateReportItemHandle )
		{
			TemplateReportItemHandle handle = (TemplateReportItemHandle) DEUtil.getInputFirstElement( input );
			key = ( handle.getDescriptionKey( ) == null ) ? ""
					: handle.getDescriptionKey( ).trim( );
		}
		return key;
	}

	public void save( Object value ) throws SemanticException
	{
		if (value!=null && DEUtil.getInputSize( input ) == 1
				&& DEUtil.getInputFirstElement( input ) instanceof TemplateReportItemHandle )
		{
			TemplateReportItemHandle handle = (TemplateReportItemHandle) DEUtil.getInputFirstElement( input );
			if(handle!=null)handle.setDescriptionKey( value.toString( ) );
		}
		
	}

	private Object input;
	public void setInput( Object input )
	{
		this.input = input;
	}

}
