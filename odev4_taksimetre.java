import java.util.Scanner;
public class odev4_taksimetre {
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);
        System.out.print("Gidiceğiniz kilometre uzunluğunu girin: ");
        int km = input.nextInt();
        boolean min_tutar = (10+km*2.2 < 20) ? true : false;
        double tutar = (min_tutar) ? 20 : 10+km*2.2;
        System.out.println("Tutar: "+tutar);

    }
}
