import java.util.Scanner;
public class odev3_alan_hesapla {
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);
        System.out.println("Üç adet kenar bilgisini yazın ve bu üçgenin alanını hesaplayalım");
        System.out.print("Birinci kenarın uzunluğunu girin: ");
        int a = input.nextInt();
        System.out.print("İkinci kenarın uzunluğunu girin: ");
        int b = input.nextInt();
        System.out.print("Üçüncü kenarın uzunluğunu girin: ");
        int c = input.nextInt();
        boolean ucgen = (a+b<=c || b+c<=a || a+c<=b) ? false : true ;
        float u = (float)(a+b+c)/2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println(ucgen ? "Üçgenin alanı "+ alan : "Böyle bir üçgen oluşturulamaz");
    }
}

