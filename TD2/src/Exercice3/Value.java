package Exercice3;

public class Value implements Expr {
	private final double val;

	public Value(double val) {
		
		this.val = val;
	}

	@Override
	public double eval() {
		return this.val;
	}

	public double getVal() {
		return val;
	}
	
	public String toString(){
		return ""+val;
	}
	
}