import java.util.Scanner;
public class odev5_daire_dilimi_alan {
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;
        System.out.println("Bir daire diliminin yarıçapını ve merkez açısının ölçüsünü girin: ");
        System.out.print("Yarıçapı Girin: ");
        int r = input.nextInt();
        System.out.print("Merkez Açıyı Girin: ");
        double q = input.nextInt();
        double alan = (r*r*PI)*(q/360);
        System.out.println("Daire Diliminin Alanı: "+alan);
    }
}
