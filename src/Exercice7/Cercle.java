package Exercice7;

public class Cercle {
	private Point6 point;
	private double rayon;
	
	
	public Cercle(Point6 p, double r){
		this.point=p;
		this.rayon=r;
	}
	
	public void translate(int dx, int dy){
		this.getPoint().setX(this.getPoint().getX()+dx);
		this.getPoint().setY(this.getPoint().getY()+dy);
	}
	
	public String toString(){
		return "Centre du cercle en "+this.getPoint().toString()+ "\nRayon du cercle : "+this.getRayon()+"\n";
	}
	
	public float aire(){
		return (float) ((this.getRayon()*this.getRayon())*3.14);
	}
	public boolean equals(Cercle c){
		if(this.getPoint().getY()==c.getPoint().getY()&&this.getPoint().getX()==c.getPoint().getX() && this.getRayon()==c.getRayon()) return true;
		return false;
	}
	

	public boolean contains(Point6 p){

		if( ( ( (p.getX()-this.getPoint().getX())*(p.getX()-this.getPoint().getX()) ) + ( (p.getY()-this.getPoint().getY())*(p.getY()-this.getPoint().getY()) )) <=this.getRayon())
			return true;
		
		return false;
	}
	
	
	public void setPoint(Point6 point) {
		this.point = point;
	}
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	public Point6 getPoint() {
		return point;
	}
	public double getRayon() {
		return rayon;
	}}
