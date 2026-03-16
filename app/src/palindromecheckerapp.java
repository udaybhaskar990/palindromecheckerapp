 class PalindromeCheckerApp {

    public static boolean reverseCheck(String word) {
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        return word.equals(reversed);
    }

    public static boolean twoPointerCheck(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        long startTime = System.nanoTime();
        boolean result1 = reverseCheck(word);
        long endTime = System.nanoTime();
        long reverseTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean result2 = twoPointerCheck(word);
        endTime = System.nanoTime();
        long twoPointerTime = endTime - startTime;

        System.out.println("Reverse Method Result: " + result1);
        System.out.println("Execution Time: " + reverseTime + " ns");

        System.out.println("Two Pointer Method Result: " + result2);
        System.out.println("Execution Time: " + twoPointerTime + " ns");
    }
}
