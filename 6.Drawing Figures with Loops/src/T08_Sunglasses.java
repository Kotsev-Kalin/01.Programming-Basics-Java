import java.util.Scanner;

public class T08_Sunglasses {
    //Gosho---------------------------->
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatStr("*", 2 * n) + repeatStr(" ", n) + repeatStr("*", 2 * n));

        Integer rowOfNosodurjackata = n;
        if (n % 2 == 1)
        {
            rowOfNosodurjackata = n / 2;
        }
        else
        {
            rowOfNosodurjackata = n / 2 - 1;
        }

        for (int i = 1; i <= n - 2; i++) {

            System.out.printf("*%s*",repeatStr("/",2*n-2));
            if (rowOfNosodurjackata!=(i))
            {
                System.out.printf("%s",repeatStr(" ",n));
            }
            else
            {
                System.out.printf("%s",repeatStr("|",n));
            }
            System.out.printf("*%s*\n",repeatStr("/",2*n-2));

        }
        System.out.println(repeatStr("*", 2 * n) + repeatStr(" ", n) + repeatStr("*", 2 * n));
    }

    static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();

    }
}
