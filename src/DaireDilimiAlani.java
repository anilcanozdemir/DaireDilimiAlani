import java.util.Scanner;

/**
 * @author ANIL CAN ÖZDEMİR
 * Ödev
 * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
 *
 * 𝜋 sayısını = 3.14 alınız.
 *
 * Formül : (𝜋 * (r*r) * 𝛼) / 360
 */
public class DaireDilimiAlani {
    public static void main(String[] args) {
        System.out.print("Yaricapi giriniz:");
        Scanner input=new Scanner(System.in);
        double r=input.nextDouble();
        System.out.print("Merkez acisinin olcusunu giriniz:");
        double a=input.nextDouble();
        System.out.println("Alan:"+(Math.PI*r*r*a/360));
    }
}
