class Solution {
    public boolean isPalindrome(int x) {
        if (x > 0) { // Check if x is positive
            int aux = x; // Create a copy of x
            int reverseX = 0; // Initialize a variable to store the reverse of x
            while (aux != 0) { // Iterate until aux becomes 0
                reverseX = reverseX * 10 + aux % 10; // Build the reverse number by multiplying reverseX by 10 and adding the last digit of aux
                aux = aux / 10; // Remove the last digit from aux
            }
            return (x == reverseX); // Check if x is equal to its reverse and return the result
        } else if (x == 0) { // Check if x is zero
            return true; // Zero is a palindrome
        } else { // x is negative
            return false; // Negative numbers cannot be palindromes
        }
    }
}
