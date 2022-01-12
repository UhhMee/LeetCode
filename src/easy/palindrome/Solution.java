package easy.palindrome;

public class Solution {
    public boolean isPalindrome(int x) {
        int num = (int)Math.log10(x)+1;
        int[] numArr = new int[num];
        int tempNum = x;
        if (x > 0) {
            numArr[x] = tempNum % 10;
            tempNum =  tempNum / 10;
        } else {
            return false;
        }
        return false;
    }
}
