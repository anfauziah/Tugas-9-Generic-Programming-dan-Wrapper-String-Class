public class Klien {


	public static void main(String[] args) {
	//Orang<String> orangGen = new Orang<String>("azmi");
	Orang<String,Integer> orangGen=new Orang<>("azmi",120);
			orangGen.setNama("fauziah");
	
		orangGen.setNim(123);
		System.out.println(orangGen.getNama());
		System.out.println(orangGen.getNim());

	}

}