class Decryption {
    public String decrypt(String str) {
        String decryptedMessage = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.codePointAt(i) > 35000) {
                char chr = (char) (str.codePointAt(i) - 111121);
                decryptedMessage += chr;
            } else {
                char chr = (char) (str.codePointAt(i) + 111121);
                decryptedMessage += chr;
            }
        }

        return decryptedMessage;
    }
}
