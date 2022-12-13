//@author EmreHatip
package Giris;
import java.util.Scanner;
public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        int mat,fiz,kim,tur,tar,muz;
        double ort;
        Scanner input=new Scanner(System.in);
        System.out.println("MATEMATİK NOTUNUZU GİRİNİZ: ");
        mat=input.nextInt();
        System.out.println("FİZİK NOTUNUZU GİRİNİZ: ");
        fiz=input.nextInt();
        System.out.println("KİMYA NOTUNUZU GİRİNİZ: ");
        kim=input.nextInt();
        System.out.println("TÜRKÇE NOTUNUZU GİRİNİZ: ");
        tur=input.nextInt();
        System.out.println("MÜZİK NOTUNUZU GİRİNİZ: ");
        muz=input.nextInt();
        System.out.println("TARİH NOTUNUZU GİRİNİZ: ");
        tar=input.nextInt();
        System.out.println("NOT ORTALAMANIZ :"+(mat+fiz+kim+tur+tar+muz)/6);
        ort=(mat+fiz+kim+tur+tar+muz)/6;
        System.out.println(ort>=60?("TEBRİKLER GEÇTİNİZ"):("KALDINIZ"));

    }


}