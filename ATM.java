
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int balance = 1000; // ATM'deki başlangıç bakiyesi
        
        while (true) {
            System.out.println("1 - Para Yatırma");
            System.out.println("2 - Para Çekme");
            System.out.println("3 - Bakiye Sorgulama");
            System.out.println("4 - Çıkış");
            System.out.print("Seçiminiz: ");
            
            int choice = input.nextInt();
            
            if (choice == 1) {
                System.out.print("Yatırmak istediğiniz miktarı girin: ");
                int depositAmount = input.nextInt();
                balance += depositAmount;
                System.out.println("Yeni bakiyeniz: " + balance);
            } else if (choice == 2) {
                System.out.print("Çekmek istediğiniz miktarı girin: ");
                int withdrawAmount = input.nextInt();
                if (withdrawAmount > balance) {
                    System.out.println("Bakiyeniz yetersiz!");
                } else {
                    balance -= withdrawAmount;
                    System.out.println("Yeni bakiyeniz: " + balance);
                }
            } else if (choice == 3) {
                System.out.println("Bakiyeniz: " + balance);
            } else if (choice == 4) {
                System.out.println("Çıkış yapılıyor...");
                break;
            } else {
                System.out.println("Geçersiz seçim!");
            }
            
            System.out.println();
        }
        
        input.close();

    }

}

