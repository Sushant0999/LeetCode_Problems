//Link : https://leetcode.com/problems/palindrome-number/
public class Palindrome_Number {
    //Driver Code
    public boolean isPalindrome(int x) {
        int palindrome = 0;
        palindrome = x;
        int rev = 0, rem = 0;
        while (x > 0) {
            rem = x % 10;
            rev = rev  * 10 + rem;
            x = x / 10;
        }
        if(palindrome == rev){
            return true;
        }
        return false;
    }
}
