package Exercice5;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Point5 p1=new Point5(1,2);
		Point5 p2=p1;
		Point5 p3=new Point5(1,2);	
		Point5 p4=new Point5(1,3);	
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		System.out.println(p1.isSame(p2));
		System.out.println(p1.isSame(p3));
		System.out.println(p1.isSame(p4));

		ArrayList<Point5> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
	}
}