import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println("yes");
        else
            System.out.println("no");
    }

}