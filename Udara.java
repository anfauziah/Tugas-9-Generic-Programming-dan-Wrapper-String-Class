public class Udara extends transportasi {
    private String satuGearRoda, duaGearRoda ;
    public Hewan(String satuGearRoda,, String duaGearRoda){
        this.satuGearRoda = satuGearRoda;
        this.duaGearRoda   = duaGearRoda;
    }
    
    public void jalan (){
        System.out.println("Pesawat mempunyai 3 gear roda ");
        System.out.println("bagian depan terdapat    :  " + satuGearRoda);
	System.out.println("dan bagian belakang terdapat    :  " + duaGearRoda);
    }    
}