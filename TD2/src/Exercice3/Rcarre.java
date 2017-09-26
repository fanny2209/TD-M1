package Exercice3;

public class Rcarre implements Expr {
		private final Expr e1;
		private final Expr e2;
		
		public Rcarre(Expr e1, Expr e2) {
			this.e1 = e1;
			this.e2 = e2;
		}
		
		public double eval(){
			return e1.eval()*Math.sqrt(e2.eval());
		}
		
		public String toString(){
			return e1.toString()+" \u221a " + e2.toString();
		}

	}


