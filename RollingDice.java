
public class RollingDice {

	
	
	public static void main(String[] arg)
	{	
		
		int firstroll;
		int secondroll;
		int totalRoll;
	    firstroll= (int) (Math.random()*6)+1;
	    secondroll= (int) (Math.random()*6)+1;	    
	    totalRoll=firstroll+secondroll;	    
	    System.out.println("The first die comes up " + firstroll);
        System.out.println("The second die comes up " + secondroll);
        System.out.println("Your total roll is " + totalRoll);
	}
	
}
