import java.util.Scanner;

public class T12_Volleyball {
    //Gosho--------------------->
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine().toLowerCase();
        int holidays = Integer.parseInt(scanner.nextLine());
        int weekendsHome = Integer.parseInt(scanner.nextLine());

        int sofiaWeekends = 48 - weekendsHome;
        double playSofia = 3.0 * sofiaWeekends / 4 + 2.0 * holidays / 3;
        double playTotal = playSofia + weekendsHome;

        if (year.equals("leap")) {
            playTotal = Math.floor(playTotal * 15 / 100 + playTotal);
            System.out.println(playTotal);
        } else if (year.equals("normal")) {
            System.out.println(Math.floor(playTotal));
        }
    }
}
