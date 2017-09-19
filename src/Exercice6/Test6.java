package Exercice6;

import javax.swing.plaf.synth.SynthSeparatorUI;

import Exercice5.Point5;

public class Test6 {
	public static void main(String[] args) {
		Point5 p1=new Point5(1,2);
		Point5 p2=p1;
		Point5 p3=new Point5(1,2);	
		Point5 p4=new Point5(1,3);	
		Point5 tab[]= new Point5[10];
		LigneBrisee lb= new LigneBrisee(tab);
		//lb.lister();
		lb.addPoint(p1);
		//lb.addPoint(p2);
		//lb.addPoint(p3);
		lb.addPoint(p4);
		lb.lister();
		lb.capacity();
		//System.out.println(lb.contains(p2)); // true car regarde si la REFERENCE est présente
		System.out.println(lb.contains(p2));
		//System.out.println(lb.contains(p3)); WHY ???
		
		System.out.println(lb.contains(null)); 


		/*Checks that the specified object reference is not null. This method is designed primarily for doing parameter validation in methods and constructors, as demonstrated below:

     public Foo(Bar bar) {
         this.bar = Objects.requireNonNull(bar);
     }
		 */


	}


}
