import java.util.Scanner;

public class OddNumberAdd {
    public static void main(String[] args) {
        int i,total = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Bir Rakam Giriniz: ");
            i = input.nextInt();
            if (i % 2 == 0 || i % 4 == 0){
                total += i;
            }
        }while(i % 2 == 0);
        System.out.println("Toplam Değer: " + total + ".");
    }
}

