package Exercice3;

public class Mult implements Expr {
	private final Expr e1;
	private final Expr e2;
	
	public Mult(Expr e1, Expr e2) {
		this.e1 = e1;
		this.e2 = e2;
	}
	
	public double eval(){
		return e1.eval()*e2.eval();
	}
	
	public Expr getE1() {
		return e1;
	}

	public Expr getE2() {
		return e2;
	}

	public String toString(){
		return "("+e1.toString()+" * " + e2.toString()+")";
	}
	

}
