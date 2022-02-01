import java.util.Scanner;
public class UcakBiletiFiyatHesap {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi ;
        double tutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünde giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipi tek yön ise 1e gidiş dönüş ise 2ye basın : ");
        yolculukTipi = input.nextInt();

        tutar = mesafe*0.10;

        if (mesafe<0){
            System.out.println("Hatalı giriş yaptınız!");

        }
        else if (yas<0){
            System.out.println("Hatalı giriş yaptınız!");
        }
        else if (yolculukTipi<0){
            System.out.println("Hatalı giriş yaptınız!");
        }
        else if (yolculukTipi>2){
            System.out.println("Hatalı giriş yaptınız!");
        }
        else {
            switch (yolculukTipi){
                case 1:
                    if (yas<12){
                        tutar = tutar*0.5;

                    }
                    else if (yas>13){
                        if (yas<24){
                            tutar = tutar*0.90;

                        }
                        else if (yas>65){

                            tutar = tutar*0.70;

                        }

                    }
                    break;
                case 2:
                    if (yas<12){
                        tutar = tutar*0.5;

                    }
                    else if (yas>13){
                        if (yas<24){
                            tutar = tutar*0.90;

                        }
                        else if (yas>65){

                            tutar = tutar*0.70;

                        }

                    }
                    tutar = tutar*0.80;
                    tutar = tutar*2;
                    break;

            }


            System.out.println(tutar);
        }
    }
}
