package Exercice3;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		PrimeCollection pc = new PrimeCollection();
		pc.initRandom(100, 100);
		ArrayList<Integer> myArray= pc.getList();
		for(int i=0; i<myArray.size(); i++){
			if(pc.isPrime(myArray.get(i))){
				System.out.println("number "+myArray.get(i)+" is prime :D \n");
			}
		}
	}
}

