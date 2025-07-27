import java.util.Scanner;

public class ScannerInp {
    Scanner input = new Scanner(System.in);

    public void getNumber() {
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        // System.out.println("Double: " + (num * 2));
        if (num % 2 == 0) {
            System.out.println("Even");
            return;
        } 
        System.out.println("Odd");

    }

}
