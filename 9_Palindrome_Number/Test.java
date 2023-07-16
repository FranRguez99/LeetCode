class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] testCases = {121, -121, 10, 12321, 0};

        for (int testCase : testCases) {
            boolean isPalindrome = solution.isPalindrome(testCase);
            System.out.println(testCase + " is a palindrome: " + isPalindrome);
        }
    }
}
