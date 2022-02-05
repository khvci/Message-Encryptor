class Decryption {
    public String decrypt(String str, int pass) {
        String decryptedMessage = "";

        for (int i = 0; i < str.length(); i++) {
            char chr = (char) (str.codePointAt(i) - pass);
            decryptedMessage += chr;
        }

        return decryptedMessage;
    }
}
