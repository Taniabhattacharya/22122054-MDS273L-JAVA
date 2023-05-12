import java.util.Scanner;

public class Lab5 {
    private static String encryptMessage(String messageToEncrypt, char[] plain , char[] cypher) {
        messageToEncrypt = messageToEncrypt.toUpperCase();
        char [] messageChars = messageToEncrypt.toCharArray();
        for (int i = 0; i < messageChars.length; i++) {
            if (messageChars[i] != ' '){
            for (int j = 0; j < plain.length; j++) {
                if (messageChars[i] == plain[j]) {
                    messageChars[i] = cypher[j];
                    break;  
                }
            }
            }
        }
        String encrypted_message = String.valueOf(messageChars);

        return encrypted_message;
    }


    private static String decryptMessage(String messageToEncrypt, char[] plain , char[] cypher) {
        messageToEncrypt = messageToEncrypt.toUpperCase();
        char [] messageChars = messageToEncrypt.toCharArray();
        for (int i = 0; i < messageChars.length; i++) {
            
            for (int j = 0; j < plain.length; j++) {
                if (messageChars[i] == plain[j]) {
                    messageChars[i] = cypher[j];
                    break;  
                }
            }
        }
        String decrypted_message = String.valueOf(messageChars);

        return decrypted_message;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter your choice:");
            System.out.println("1. Encrypt message");
            System.out.println("2. Decrypt message");
            System.out.println("3. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            
            //scanner.nextLine(); 
            char[] plain = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
            char[] cypher = {'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W'};


            switch (choice) {
                case 1:
                    System.out.println("Enter message to encrypt:");
                    String messageToEncrypt = scanner.nextLine();
                    String encryptedMessage = encryptMessage(messageToEncrypt, plain , cypher);
                    System.out.println("Encrypted message: " + encryptedMessage);
                    break;
                case 2:
                    System.out.println("Enter message to decrypt:");
                    String messageToDecrypt = scanner.nextLine();
                    String decryptedMessage = decryptMessage(messageToDecrypt, plain , cypher);
                    System.out.println("Decrypted message: " + decryptedMessage);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
                    break;
            }
        } while (choice != 3); 
    
    }
}