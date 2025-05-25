import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contractID = sc.nextLine();
        String propertyID = sc.nextLine();
        String tenantID = sc.nextLine();
        int rentAmount =sc.nextInt();
        Contract permanent = new Permanent(contractID, propertyID, tenantID, rentAmount);
        Contract longterm = new Longterm(contractID, propertyID, tenantID, rentAmount);
        Contract shortterm = new Permanent(contractID, propertyID, tenantID, rentAmount);
        System.out.println(permanent);
        System.out.println(longterm);
        System.out.println(shortterm);
    }
}
