import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        File file = new File("src//textdoc2.txt");
        Encryptor fReader = new Encryptor();
        System.out.println("Please enter the key you would like to use to encrypt the file.");
        String key = input.nextLine();
        System.out.println("Please enter a 'd' if you want to decrypt.");
        String decryptString = input.nextLine();
        boolean isEncrypting = true;
        if (decryptString.equals("d")) {
            isEncrypting = false;
        }
        fReader.encryptToTerminal(file, key, isEncrypting);
    }
}
