import java.util.*;
public class odev7_alisveris_tutar {
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);
        System.out.println("Ürünlerden nekadar arlmak istediğinizi girin");
        System.out.print("Armut: ");
        double armut = input.nextDouble();
        System.out.print("Elma: ");
        double elma = input.nextDouble();
        System.out.print("Domates: ");
        double domates = input.nextDouble();
        System.out.print("Muz: ");
        double muz = input.nextDouble();
        System.out.print("Patlıcan: ");
        double patlican = input.nextDouble();
        double tutar = (armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5);
        System.out.println("Tutar: ");
    }
}