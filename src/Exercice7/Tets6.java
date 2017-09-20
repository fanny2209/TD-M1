package Exercice7;

import Exercice5.Point5;

public class Tets6 {

	public static void main(String[] args) {
	
			Point6 p1=new Point6(1,2);
			//Point6 p2=p1;
			Point6 p3=new Point6(1,2);	
			Point6 p4=new Point6(1,3);	
			//System.out.println(p1);
			//p1.translate(2,4);
			//System.out.println(p1);
			/*Cercle c1= new Cercle(p3, 10);
			System.out.println(c1.toString());
			c1.translate(2, 2);
			System.out.println(c1.toString());*/
			Point6 p=new Point6(1,2);
			Point6 p2= new Point6(1,2);
			Cercle c=new Cercle(p,1);
			Cercle c2=new Cercle(p2,1);
			System.out.println(c.equals(c2));
			//c2.translate(1,1);
			System.out.println(c+""+c2);
			Cercle c3=new Cercle(new Point6(1,2), 1);
			c3.getPoint().translate(5,2);
			System.out.println(c);
			System.out.println(c2.aire());
			System.out.println(c2.contains(p));
	}

}
