import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {

        int Akg, Ekg, Dkg, Mkg, Pkg;
        double brmKg, Total, Armut=2.14, Elma=3.67, Domates=1.11, Muz=0.95, Patlıcan=5.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        Akg = input.nextInt();

        System.out.print("Elma Kaç Kilo ? : ");
        Ekg = input.nextInt();

        System.out.print("Domates Kaç Kilo ? : ");
        Dkg = input.nextInt();

        System.out.print("Muz Kaç Kilo ? : ");
        Mkg = input.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        Pkg = input.nextInt();

        Total = ((Armut*Akg) + (Elma*Ekg) + (Domates*Dkg) + (Muz*Mkg) + (Patlıcan*Pkg));
        System.out.print("Toplam Ödenecek Tutar : " + Total + " TL ");
    }
}