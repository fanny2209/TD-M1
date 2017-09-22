package Exercice8;

import Exercice4.Point;
import Exercice5.Point5;
import Exercice7.Cercle;
import Exercice7.Point6;

public class Ring extends Cercle{
	
	private double rayonInterne;

	public Ring(Point6 p, double r, double rI) {
		super(p, r);
		if(rI>=r){
			System.out.println("erreur");
		}
		rayonInterne=rI;
		
	}
	
	public boolean equals(Ring r){
		 return this.getPoint().getX()==r.getPoint().getX() &&
				this.getPoint().getY()==r.getPoint().getY() &&
				this.getRayon()==r.getRayon() &&
				this.getRayonInterne()==r.rayonInterne;
	}
	
	public String toString(){
		return super.toString()+"Rayon interne du cercle : "+ this.getRayonInterne();
	}
	
	public boolean contains(Point6 p) {
		return super.contains(p) && 
				!( ( (p.getX()-this.getPoint().getX())*(p.getX()-this.getPoint().getX()) ) + ( (p.getY()-this.getPoint().getY())*(p.getY()-this.getPoint().getY()) ) <=this.getRayonInterne());
	}
	
	public boolean contains(Point6 p, Ring...rings){
		return false;
	}
	
	@Override
	public Point6 getPoint() {
		// TODO Auto-generated method stub
		return super.getPoint();
	}
	@Override
	public double getRayon() {
		// TODO Auto-generated method stub
		return super.getRayon();
	}
	public double getRayonInterne() {
		return rayonInterne;
	}
	@Override
	public void setPoint(Point6 point) {
		// TODO Auto-generated method stub
		super.setPoint(point);
	}
	@Override
	public void setRayon(double rayon) {
		// TODO Auto-generated method stub
		super.setRayon(rayon);
	}
	public void setRayonInterne(double rayonInterne) {
		this.rayonInterne = rayonInterne;
	}
	
		

}
