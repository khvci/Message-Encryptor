class Encryption {
    public String encrypt(String str) {
        String encryptedMessage = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.codePointAt(i) >= 97) {
                char chr = (char) (str.codePointAt(i) + 111121);
                encryptedMessage += chr;
            } else {
                char chr = (char) (str.codePointAt(i) - 111121);
                encryptedMessage += chr;
            }
        }

        return encryptedMessage;
    }
}
