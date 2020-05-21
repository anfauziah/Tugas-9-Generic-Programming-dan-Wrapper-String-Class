public class Maintransportasi {
    public void cektransportasi (transportasi mtrans){
        mtrans.jalan();
        mtrans.transpor();
    }
    
    public static void main(String[] args) {
        Maintransportasi ttransportasi = new Maintransportasi();        
        
        ttransportasi.cektransportasi(new Darat("motor dengan 2 roda"));       
        
        System.out.println("-----------------------------------------");                              
        ttransportasi.cektransportasi(new Udara ("pesawat dengan satu gear depan","Dua gear dibelakang"));
        
        System.out.println("-----------------------------------------");        
        tMakhlukHidup.cekMakhlukHidup(new Air ("boat"));
        
    }
}