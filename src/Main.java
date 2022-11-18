import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k;
        int total = 1;

        Scanner inp = new Scanner(System.in);
        System.out.println("Üssü Alınacak Sayıyı Yazınız : ");
        n = inp.nextInt();
        System.out.println("Üs OLacak Sayıyı Yazınız : ");
        k = inp.nextInt();
        for (int i =1; k >=i; i++){
            total *= n;
        }
        System.out.println("Sonuç : " + total);
    }
}