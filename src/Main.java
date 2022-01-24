import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner byteInput = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        String message;
        String wantToContinue = "";
        boolean endProgram = false;

        while (!endProgram) {
            System.out.print(
                    "\nWhich function do you need?\n" +
                            " 1 - Encrypt my message\n" +
                            " 2 - Decrypt my message\n" +
                            " 3 - Quit\n" +
                            "Your Selection: ");
            byte selection = byteInput.nextByte();

            switch (selection) {
                case 1:
                    System.out.println("\nWrite your message: ");
                    message = input.nextLine();

                    Encryption encryption = new Encryption();
                    message = encryption.encrypt(message);
                    System.out.println("\nEncrypted Message: \n" + message);

                    System.out.print("\nDo you want to continue? (y/n): ");
                    wantToContinue = input.nextLine();
                    break;
                case 2:
                    System.out.println("\nWrite your encrypted message: ");
                    message = input.nextLine();

                    Decryption decryption = new Decryption();
                    message = decryption.decrypt(message);
                    System.out.println("\nDecrypted Message: \n" + message);

                    System.out.print("\nDo you want to continue? (y/n): ");
                    wantToContinue = input.nextLine();
                    break;
                case 3:
                    System.out.println("\nBye.");
                    endProgram = true;
                    break;
                default:
                    wantToContinue = "";
                    break;
            }

            while (!wantToContinue.equals("y") && !wantToContinue.equals("n") && selection != 3) {
                System.out.print("Bad decision. Try again. Do you want to continue? (y/n): ");
                wantToContinue = input.nextLine();
            }

            if (wantToContinue.equals("n")) {
                System.out.println("\nBye.");
                endProgram = true;
            }
        }
    }
}
