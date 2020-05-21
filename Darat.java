public class Darat extends transportasi {
    private String rodaDua;
    public Darat(String rodaDua){
        this.rodaDua = rodaDua;
    }
    public void jalan (){
        System.out.println("Trasportasi motor merupakan transportasi dengan :  "+rodaDua);
    }
}