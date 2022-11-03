import java.util.*;

class odev1_not_ortalama{
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);
        int matematik, fizik, kimya, turkce, tarih, muzik;
        System.out.print("Lütfen matematik notunu girin: ");
        matematik = input.nextInt();
        System.out.print("Lütfen fizik notunu girin: ");
        fizik = input.nextInt();
        System.out.print("Lütfen kimya notunu girin: ");
        kimya = input.nextInt();
        System.out.print("Lütfen türkçe notunu girin: ");
        turkce = input.nextInt();
        System.out.print("Lütfen tarih notunu girin: ");
        tarih = input.nextInt();
        System.out.print("Lütfen müzik notunu girin: ");
        muzik = input.nextInt();
        float ortalama = (float)(matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalamanız: "+ortalama+(ortalama>60?" Sınıfı Geçti":" Sınıfta Kaldı"));
    }
}