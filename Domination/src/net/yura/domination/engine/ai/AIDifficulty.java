package net.yura.domination.engine.ai;

public abstract class AIDifficulty extends AbstractAI {
 	
	protected int type;
	protected String command;
	
	public int getType(){
		return type;
	}
	
	public String getCommand(){
		return command;
	}
	
}
