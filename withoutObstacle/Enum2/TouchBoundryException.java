package com.lyraedu.sample.Enum2;

public class TouchBoundryException extends Exception{

	private static final long serialVersionUID = -8195358826413210544L;

	public TouchBoundryException() {
		// TODO Auto-generated constructor stub
		super("Touch bondary.");
	}
	
	public TouchBoundryException(String msg) {
		super(msg);
	}

}
