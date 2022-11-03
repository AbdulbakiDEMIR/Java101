import java.util.Scanner;
public class odev2_kdv_hesap {
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);
        System.out.print("KDV tutarını hesaplamak istediğiniz tutarı girin: ");
        int fiyat = input.nextInt();
        int kdv_tutar = fiyat > 1000? (fiyat/100)*8 : (fiyat/100)*18 ;
        System.out.println("KDV tutarı "+kdv_tutar); 
    }
}
