class Decryption {
    public String decrypt(String str, int pass) {
        String decryptedMessage = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.codePointAt(i) > 35000) {
                char chr = (char) (str.codePointAt(i) - pass);
                decryptedMessage += chr;
            } else {
                char chr = (char) (str.codePointAt(i) + pass);
                decryptedMessage += chr;
            }
        }

        return decryptedMessage;
    }
}
