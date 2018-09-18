package monstre;

import model.MarshmallowMonster;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MonsterController
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	private Scanner inputScanner;
	
	//Constructors initialize data members!
	public MonsterController()
	{
		//name,legs,eyes,nose,arms
		myMonster = new MarshmallowMonster("monstie", 2.5, 3, true, 1); 
		userMonster = new MarshmallowMonster();
		inputScanner = new Scanner(System.in);
	}

	public void start()
	{
		JOptionPane.showInputDialog(null,myMonster);
		System.out.println(myMonster);
		
		String userInput = JOptionPane.showInputDialog(null, "NAME?????");
		String name = userInput;
		userMonster.setName(name);
		//System.out.println("What would you like to name your monster?");
		//String name = inputScanner.nextLine();
		//userMonster.setName(name);
		
		userInput = JOptionPane.showInputDialog(null, "How many legs");
		int legs = 0;
		if (validInt(userInput))
		{
			
			userMonster.setLegCount(legs);
			System.out.println("Your monster has " + userMonster.getLegCount() + " legs!");
			
		}
		
		userMonster.setLegCount(legs);
		//System.out.println("How many legs does " + name + " have?");
		//double legs = inputScanner.nextDouble();
		//System.out.println("Your monster has " + userMonster.getLegCount() + "legs!");
		
		//System.out.println("How many eyes does " + name + " have?");
		//int eyes = inputScanner.nextInt();
		
		//System.out.println("Your monster has " + userMonster.getEyeCount() + "eyes!");
		
		userInput = JOptionPane.showInputDialog(null, "Does your monster have noses?");
		boolean noses;
		noses = Boolean.parseBoolean(userInput);
		
		userMonster.setHasNoses(noses);
		
		
		//System.out.println("Does your monster have a nose?");
		//boolean noses = inputScanner.hasNextBoolean();
		
		//System.out.println("Your monster has " + userMonster.getHasNose() + " noses!"); 
		
		//JOptionPane.showMessageDialog(null, "How many arms?");
		//System.out.println("How many arms does your monster have?");
		//JOptionPane.showMessageDialog(null, "How \nmany \narms?");
		//int arms = inputScanner.nextInt();
		
		userInput = JOptionPane.showInputDialog(null, "How many arms for your monster?");
		int arms = 0;
		if (validInt(userInput))
		{
			userMonster.setArmCount(arms);
			System.out.println("Your monster has " + userMonster.getArmCount() + " arms!");
		}
		
		userMonster .setArmCount(arms);
		
		//System.out.println("Your monster has " + userMonster.getArmCount() + " arms!");
	
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number ");
		}
	
		return isValid;
	}
	
	public boolean validDouble(String mightBeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type in a decimal vlue AKA  a number with a . in the middle ");
		}
		
		return isValid;
	}
}



