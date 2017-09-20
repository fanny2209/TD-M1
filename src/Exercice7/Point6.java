package Exercice7;

import Exercice4.Point;
import Exercice5.Point5;

public class Point6 {

	private int x;
	private int y;
	public static int cpt=0;
	
	public Point6(int x, int y){
		this.x=x;
		this.y=y;
		cpt++;
	}
	public Point6(Point6 p){
		this.x=p.getX();
		this.y=p.getY();
		cpt++;
	}
	
	public boolean isSame(Point6 p){
		if(p.getX()==this.getX() && p.getY()==this.getY()){
			return true;
		}
		return false;
	}
	

	
	public void translate(int dx, int dy){
		this.setX((this.getX())+dx);
		this.setY((this.getY())+dy);
	}
	
	public String toString(){
		return "("+getX()+";"+getY()+")";
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

