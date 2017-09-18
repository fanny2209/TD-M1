package Exercice4;

public class Point {

	private int x;
	private int y;
	public static int cpt=0;
	
	public Point(int x, int y){
		this.x=x;
		this.y=y;
		cpt++;
	}
	public Point(Point p){
		this.x=p.getX();
		this.y=p.getY();
		cpt++;
	}
	
	public String toString(){
		return "("+getX()+";"+getY()+")";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p= new Point(2,3);
		System.out.println(p.getX()+"  "+p.getY());
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
