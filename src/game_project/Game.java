package game_project;
import java.util.Scanner;

public class Game {
	Weapon pressButton()
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the Score: ");
	   int score=sc.nextInt();
	   if(score<=400) {
		  Scanner s = new Scanner(System.in);
		  int num=s.nextInt();
		  switch(num) {
		  case 1 :		  
		 System.out.println("already you got knife");
		   System.out.println("You Got the Knife");
		   Knife k=new Knife();
		   return k;
		    default:
		    	System.out.println(" By default you have knife ");
		  }
	   }
	   else if(score<=800) {
		   Scanner b= new Scanner(System.in);
		   int num1=b.nextInt();
		   switch(num1) {
		   case 1 :
			   System.out.println("you can also take knife");
			   Knife k= new Knife();
			   return k;
		   
		   case 2 :{
		   System.out.println("You got the Gun");
		   Gun g=new Gun();
		   return g;
		   }
		   default :
			   System.out.println("you have knife");
			   return null;
		   
		   }
	   }
	   else {
		   Scanner pc= new Scanner(System.in);
		   int num2=pc.nextInt();
		   switch(num2)
		   {
		   case 1:
			   System.out.println("You have gote the knife");
			   Knife k=new Knife();
			   return k;
		   case 2 :
			   System.out.println("you have option to chose gun");
			   Gun g= new Gun();
			   return g;
			   
		   case 3 :
			   System.out.println("you can choose bomb...!!!");
			   Bomb b= new Bomb();
			   return b;
		   default :
			   System.out.println("you gote default weapon Knife..!!!");
			   return null;
		   }
	   }
	return null;
	}
}
