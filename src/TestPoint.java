import Exercice4.Point;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p= new Point(3,4);
		System.out.println(p.getX()+"  "+p.getY());
		System.out.println(Point.cpt);
		Point pCopy= new Point(p);
		System.out.println(p);
		System.out.println(p.getX());
		System.out.println(pCopy);
		System.out.println(pCopy.getX());
	}

}
