package Exercice5;

public class Point5 {

	private int x;
	private int y;
	public static int cpt=0;
	
	public Point5(int x, int y){
		this.x=x;
		this.y=y;
		cpt++;
	}
	public Point5(Point5 p){
		this.x=p.getX();
		this.y=p.getY();
		cpt++;
	}
	
	public boolean isSame(Point5 p){
		if(p.getX()==this.getX() && p.getY()==this.getY()){
			return true;
		}
		return false;
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
