import java.util.Scanner;

public class Mai {
    public static void main(String[] args) {
        Double mat, fiz, türk, kim, müz, durum;

        Scanner utp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz.");
        mat = utp.nextDouble();
        System.out.print("Fizik notunuzu giriniz.");
        fiz = utp.nextDouble();
        System.out.print("Turkce notunuzu giriniz.");
        türk = utp.nextDouble();
        System.out.print("Kimya notunuzu giriniz.");
        kim = utp.nextDouble();
        System.out.print("Muzik notunuzu giriniz.");
        müz = utp.nextDouble();

        durum=(mat+fiz+türk+kim+müz)/5;

        if (durum >= 55){
            System.out.print("Gectiniz"+ durum);
        }
        else {
            System.out.print("Kaldiniz"+ durum);
        }
    }
}
