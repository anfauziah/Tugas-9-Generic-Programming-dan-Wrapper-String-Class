public class Air extends transportasi {
    private String boat;
    public Air (String boat){
        this.boat = boat;
    }
    public void jalan (){
        System.out.println("manusia suka melintasi pulau dengan   :  "+boat);
    }
}