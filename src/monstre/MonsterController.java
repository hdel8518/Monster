package monstre;

import model.MarshmallowMonster;

public class MonsterController
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;
	
	//Constructors initialize data members!
	public MonsterController()
	{
		//name,legs,eyes,nose,arms
		myMonster = new MarshmallowMonster("monstie", 2.5, 3, true, 1); 
	}


	public void start()
	{
		System.out.println(myMonster);
	}
}
