package com.fiuba.tecnicas.logging;



public class LevelPattern extends Pattern {

	@Override
	public String getMessage() {
		return this.log.getLevel();
	}
		
}
