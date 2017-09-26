package Exercice3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expr val = new Value(1337.0);
		System.out.println(val.eval()); //affiche 1337.0
		Expr add = new Add(new Value(327.0), val);
		System.out.println(add.eval()); //affiche 1664.0
		Expr e = new Mult(new Value(350.0), add);
		System.out.println(e.eval()); //affiche 2014.0
		Expr e2 = new Rcarre(new Value(350.0), add);
		System.out.println(e2.eval()); //affiche 2014.0
	}

}
