package ValidateEmail;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("nhap Email: ");
            String Email = sc.nextLine();
            Pattern p = Pattern.compile("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$");
            Matcher m = p.matcher(Email);
            if (m.matches()) {
                System.out.println(Email);
                break;
            } else {
                System.out.println("Khong hop le");
            }
        }
    }
}