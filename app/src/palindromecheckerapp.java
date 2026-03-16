 class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "Madam In Eden Im Adam";

        String normalized = text.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        if (normalized.equals(reversed)) {
            System.out.println("\"" + text + "\" is a Palindrome (ignoring case and spaces)");
        } else {
            System.out.println("\"" + text + "\" is not a Palindrome");
        }

    }
}