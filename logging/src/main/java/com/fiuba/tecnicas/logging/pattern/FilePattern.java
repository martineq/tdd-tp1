package com.fiuba.tecnicas.logging.pattern;


public class FilePattern  extends Pattern{

	@Override
	public String getMessage() {
		String message = "";
		for(String fileName : log.getFilePaths()){
			message += fileName;
			message += " ";
		}
		message += this.attribute;
		return message;
	}

}