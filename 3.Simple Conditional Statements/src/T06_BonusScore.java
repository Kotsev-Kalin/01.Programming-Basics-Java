import java.util.Scanner;

public class T06_BonusScore {
    //Gosho----------------------->
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.nextLine());
        Double sum = 0.0 + n;

        if (n <= 100) {
            sum += 5;
        }
        if (n > 100 && n <= 1000) {
            sum *= 1.2;
        }
        if (n > 1000) {
            sum *= 1.1;
        }
        if (n % 2 == 0) {
            sum += 1;
        }
        String str = String.valueOf(n);

        if (str.substring(str.length() - 1).equals("5") || str.substring(str.length() - 1).equals("5")) {
            sum += 2;
        }
        System.out.println(sum - n);
        System.out.println(sum);
    }
}
