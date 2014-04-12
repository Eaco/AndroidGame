package com.benmorris.framework;

import com.benmorris.framework.Graphics.ImageFormat;

public interface Image {
	public int getWidth();
	
	public int getHeight();
	
	public ImageFormat getFormat();
	
	public void dispose();
	
}
