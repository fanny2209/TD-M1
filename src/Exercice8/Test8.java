package Exercice8;

import Exercice7.Cercle;
import Exercice7.Point6;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point6 p1=new Point6(1,2);
		Point6 p3=new Point6(1,2);	
		Point6 p4=new Point6(1,3);	
	
		Point6 p=new Point6(1,2);
		Point6 p2= new Point6(1,1);
		Point6 p5= new Point6(4,2);
		Cercle c=new Cercle(p,1);
		Cercle c2=new Cercle(p2,1);
		Cercle c3=new Cercle(new Point6(1,2), 1);
			
		Ring r1= new Ring(p1, 10, 2);
		Ring r2= new Ring(p2, 10, 2);
		Ring r3= new Ring(p1, 10, 2);
		Ring r4= r1;
		//System.out.println(r1.equals(r2));
		//System.out.println(r1.equals(r4));
		//System.out.println(c);
		//System.out.println(r1);
		System.out.println(r1.contains(p2));
		System.out.println(r1.contains(p5));
		
		
		
	}

}
