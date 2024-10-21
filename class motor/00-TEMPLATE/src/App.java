class MOTOR{
    String merk;
    int tahun;
    String noPolisi;
    String warna;

 public MOTOR (String merek, int tahun, String noPolisi, String warna){
     this.merk = merek;
     this.tahun = tahun;
     this.noPolisi = noPolisi;
     this.warna = warna;
}
void showInfoMotor(){
    System.out.println("merek : "+ this.merk);
    System.out.println("Tahun : "+ this.tahun);
    System.out.println("No polisi : "+ this.noPolisi);
    System.out.println("warna : "+ this.warna);
  }
}


    public class App {
    public static void main(String[] args) throws Exception {
        MOTOR mtr1 = new MOTOR("Honda GL Pro",1997,"G 5879","Hitam");
        mtr1.showInfoMotor();
       
    }
}
