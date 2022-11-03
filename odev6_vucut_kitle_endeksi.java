import java.util.*;
public class odev6_vucut_kitle_endeksi {
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);
        System.out.println("Boy ve kilo değerlerini girin ve vücut kitle indeksi hesaplansın");
        System.out.print("Kilonuzu Girin(kg): ");
        double kilo = input.nextDouble();
        System.out.print("Boyunuzu Girin(m): ");
        double boy = input.nextDouble();
        double indeks = kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz: "+indeks);
    }
}
