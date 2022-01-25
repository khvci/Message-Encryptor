class Encryption {
    public String encrypt(String str, int pass) {
        String encryptedMessage = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.codePointAt(i) >= 97) {
                char chr = (char) (str.codePointAt(i) + pass);
                encryptedMessage += chr;
            } else {
                char chr = (char) (str.codePointAt(i) - pass);
                encryptedMessage += chr;
            }
        }

        return encryptedMessage;
    }
}
