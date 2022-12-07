import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double KMbasi=2.20,GidilenMesafe,TaksimetreTutari;
        int minTutar=20,TaksiMetreAcilis=10;

        System.out.println("KM Başı Taksimetre Tutarı:" + KMbasi);
        System.out.println("İndi Bindi Ücreti:" + minTutar);
        System.out.println("Taksimetre Açılış:" +TaksiMetreAcilis);


        Scanner input=new Scanner(System.in);
        System.out.print("Gidilen Mesafe KM Değeri Giriniz:");
        GidilenMesafe=input.nextDouble();
        TaksimetreTutari=TaksiMetreAcilis+(GidilenMesafe*KMbasi);

        if (TaksimetreTutari>20){
            System.out.print("Taksimetre Borcu:"+TaksimetreTutari);
        }

        else System.out.println("Taksimetre Borcu:"+minTutar);

    }
}