import java.util.Scanner;

public class Lab5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        String mgs;

        do {
            System.out.println("\nPlease enter your choice:");
            System.out.println("1. Encrypt a message");
            System.out.println("2. Decrypt a message");
            System.out.println("3. Exit");

            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                System.out.println("Enter the message that you want to encrypt:");
                    mgs = sc.nextLine();
                    System.out.println("Encrypted message: " + ept(mgs));
                    break;
                case 2:
                    System.out.println("Enter the message that you want to decrypt:");
                    mgs = sc.nextLine();
                    System.out.println("Decrypted message: " + dcpt(mgs));
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (true);
    }

    public static String ept(String mgs) {
        String enptmgs = "";
        mgs = mgs.toUpperCase();
for (int i = 0; i < mgs.length(); i++) {
            char c = mgs.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                c = (char) ('X' + (c - 'A'));
                if (c > 'Z') {
                    c = (char) (c - 26);
                }
            }
            enptmgs += c;
        }
        return enptmgs;
    }

    public static String dcpt(String mgs) {
        String dcptmgs = "";
        mgs = mgs.toUpperCase();

        for (int i = 0; i < mgs.length(); i++) {
            char c = mgs.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + (c - 'X'));
                if (c < 'A') {
                    c = (char) (c + 26);
                }
            }
            dcptmgs += c;
        }
        return dcptmgs;
    }
}