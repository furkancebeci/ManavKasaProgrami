import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armutPrice = 2.14, elmaPrice = 3.67, domatesPrice = 1.11, muzPrice = 0.95, patlicanPrice = 5.00,
                armutV, elmaV, domatesV, muzV, patlicanV;

        Scanner input = new Scanner(System.in);
        System.out.print("Armutun kilo miktarini giriniz: ");
        armutV = input.nextDouble();
        System.out.print("Elmanin kilo miktarini giriniz: ");
        elmaV = input.nextDouble();
        System.out.print("Domatesin kilo miktarini giriniz: ");
        domatesV = input.nextDouble();
        System.out.print("Muzun kilo miktarini giriniz: ");
        muzV = input.nextDouble();
        System.out.print("Patlicanin kilo miktarini giriniz: ");
        patlicanV = input.nextDouble();

        System.out.print("Toplam = " + ((armutV*armutPrice)+(elmaV*elmaPrice)+(domatesV*domatesPrice)+(muzV*muzPrice)+(patlicanV*patlicanPrice)));
    }
}
