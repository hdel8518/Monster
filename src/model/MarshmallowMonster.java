package model;

public class MarshmallowMonster
{
	//-------------Declaration section------------
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	
	
	public MarshmallowMonster()
	{
		//Default constructor
		//Generally boring and not as helpful
	}
	
	public MarshmallowMonster(String name)
	{
		this.name = name;
	}
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNose, int arms)
	{
		this.name = name; 
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNose;
		this.armCount = arms;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getLegCount()
	{ 
		return legCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public boolean getHasNose()
	{
		return hasNoses;
	}
	
	public int getArms()
	{
		return armCount;
	}
	
	
	
	public String toString()
	{
		String description = "This monster is named " + name
				             + " and it has " + legCount + " legs..... " + eyeCount + " eyes... "   
				             + " it's favorite silly/scary/spooky thing to say is: "
                             + " I hate you! ";		
		
		return description;
	}

}
