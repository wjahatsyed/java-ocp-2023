public class Palindrome {
    public static void main(String[] args){
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(121));
        System.out.println(p.isPalindrome(332));
    }
    public boolean isPalindrome(int x) {
        //121
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);

    }
}

class Solution {

}
