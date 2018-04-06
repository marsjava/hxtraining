package com.varsity.customtag;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CurrentTime extends SimpleTagSupport {
	private String format;
	
	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public void doTag() throws JspException, IOException {
		Date today = new Date();
		SimpleDateFormat sdf = null;
		String now = null;
		if(format!=null) {
			sdf = new SimpleDateFormat(format);
			now = sdf.format(today);
		}else {
			sdf = new SimpleDateFormat("dd-MM-yy hh:mm a");
			now = sdf.format(today);
		}
		JspWriter out = getJspContext().getOut();
		out.println(now);
	}
}
