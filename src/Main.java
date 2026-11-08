import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float bos;
        float net;
        // TODO: 1. Kullanıcıdan doğru ve yanlış sayısını alın
 System.out.println("sinav basari hesaplama aracina hosgeldiniz. Dogru sayinizi giriniz.");
        float dogru = sc.nextFloat();
        System.out.println("Yanlis sayinizi giriniz");
        float yanlis = sc.nextFloat();
        // TODO: 2. Girdileri kontrol edin (negatif, toplam > 20, tam sayı)
 if(dogru<0 || yanlis<0 || dogru+yanlis>20) {System.out.println("gecersiz giris");
        }
        // TODO: 3. Boş sayısını hesaplayın
  bos=(20-(dogru+yanlis));
        // TODO: 4. Neti hesaplayın
  net=(dogru-yanlis/4);
        // TODO: 5. Başarı durumunu belirleyin ve sonucu ekrana yazdırın
if (net<=5) {System.out.println("20 soru icerisinden " + dogru + " dogru, " + yanlis + " yanlis yaptiniz. Bos sayiniz " + bos + ". Net sayiniz " + net + ". Basari durumunuz gelistirilmeli");
       }else if (net>5 && net<=10) {System.out.println("20 soru icerisinden " + dogru + " dogru, " + yanlis + " yanlis yaptiniz. Bos sayiniz " + bos + ". Net sayiniz " + net + ". Basari durumunuz orta");
       }else if (net>10 && net<=15) {System.out.println("20 soru icerisinden " + dogru + " dogru, " + yanlis + " yanlis yaptiniz. Bos sayiniz " + bos + ". Net sayiniz " + net + ". Basari durumunuz iyi");
       }else if (net>15 && net<=20) {System.out.println("20 soru icerisinden " + dogru + " dogru, " + yanlis  +" yanlis yaptiniz. Bos sayiniz " + bos + ". Net sayiniz " + net + ". Basari durumunuz gelistirilmeli");

                                     
                                      scanner.close();
                                     
                                     
       }
    }

    }

        

       
    

