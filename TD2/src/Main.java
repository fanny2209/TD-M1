class Main {
	public static void main(String[] args) {
		Mere mere = new Mere();
		System.out.println(mere.meth()); //42

		Fille fille = new Fille();
		System.out.println(fille.meth());//24
		
		Mere mereFille = new Fille();
		System.out.println(mereFille.meth());//24
		
		//System.out.println(fille.);

	}
}