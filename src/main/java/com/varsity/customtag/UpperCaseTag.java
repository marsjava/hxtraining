package com.varsity.customtag;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class UpperCaseTag extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		StringWriter sw = new StringWriter();
		//To hold the text specified in the custom tag
		getJspBody().invoke(sw);
		//This will load the custom tag text into the StringWriter obj
		
		String bodyText = sw.toString();
		JspWriter out = getJspContext().getOut();
		out.println(bodyText.toUpperCase());
	}
}
