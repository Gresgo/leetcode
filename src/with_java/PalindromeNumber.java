class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String s = String.valueOf(x);
        int len = s.length() - 1;
        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i)) return false;
        }
        return true;
    }
}