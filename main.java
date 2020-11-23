import java.util.Scanner;
class Adress{
    String Street;
    String House;
    String Coprus;
    String Kvartira;

     public Adress(String S,String H,String C,String K){
        this.Street=S;
        this.House=H;
        this.Coprus=C;
        this.Kvartira=K;
     }

    @Override
    public String toString() {
        return "Adress{" +
                "Street='" + Street + '\'' +
                ", House='" + House + '\'' +
                ", Coprus='" + Coprus + '\'' +
                ", Kvartira='" + Kvartira + '\'' +
                '}';
    }
}
public class main {

    public static void main(String[] args) {
        String[] s=new String[10];
            Scanner scan = new Scanner(System.in);
            s = scan.nextLine().split(",");

        Adress A=new Adress(s[0],s[1],s[2],s[3]);
        System.out.println(A);
    }
}
