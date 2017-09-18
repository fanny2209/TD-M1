package Exercice3;
import java.util.ArrayList;

public class PrimeCollection {

	private ArrayList<Integer> list;



	public void initRandom(int nbInteger, int maxValue){
		this.list=new ArrayList<>();
		int random;
		for(int i=0; i<nbInteger; i++){
			random=(int) (Math.random() * ( maxValue ));
			System.out.println(random+'\n');
			list.add(random);
		}
	}
	
	public boolean isPrime(int p){
		 int cpt = 0;
	        int tmp;
	        if (p<2){
	            return false;
	        }
	        for (int i = p-1; i>2; i--){
	            tmp = p%i;
	            if (tmp==0){
	                cpt++;
	            }
	        }
	        if(cpt>0){
	            return false;
	        }else{
	            return true;
	        }
		
	}

	public ArrayList<Integer> getList() {
		return list;
	}

	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}

}
