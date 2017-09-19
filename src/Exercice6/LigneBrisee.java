package Exercice6;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import Exercice5.Point5;

public class LigneBrisee {

	private Point5 maLigneBrisee[];

	public LigneBrisee(Point5 tab[]){
		this.maLigneBrisee=tab;
	}

	public int addPoint(Point5 p){
		for(int i = 0; i < this.maLigneBrisee.length; i++){
			if( (maLigneBrisee[i] instanceof Point5)==false){
				maLigneBrisee[i]=p;
				return 1;
			}
		}
		return 0;
	}

	public void capacity(){
		System.out.println(this.getMaLigneBrisee().length);

	}

	public void lister(){
		int cpt=0;
		for(int i = 0; i < this.getMaLigneBrisee().length; i++){
			if(this.maLigneBrisee[i]!=null){
				cpt++;
				System.out.println("case "+(i+1)+" ["+this.maLigneBrisee[i]+"]");
			}
			else{
			System.out.println("case "+(i+1)+" [VIDE]");
			}

		}
			System.out.println("Nombre total de point sur la ligne : " +cpt);

	}
	
	public boolean contains(Point5 p){
		for (Point5 item : this.maLigneBrisee) {
		    if(item.equals(p)){
		    	return true;
		    }
		}
		return false;
	}



	public Point5[] getMaLigneBrisee() {
		return maLigneBrisee;
	}
	public void setMaLigneBrisee(Point5[] maLigneBrisee) {
		this.maLigneBrisee = maLigneBrisee;
	}
}
