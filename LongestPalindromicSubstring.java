class Solution {
    public String longestPalindrome(String s) {
        int l = 0;
        int r = 0;
        int resLen = 0;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            l = i;
            r = i;
            //odd length palindrome
            while (l >= 0 && r <= s.length()-1 && s.charAt(l) == s.charAt(r)) {
                if ((r-l+1) > resLen) {
                    resLen = r-l+1;
                    result = s.substring(l,r+1);
                }
                l--;
                r++;
            }
            //even length palindrome
            l=i;
            r=i+1;
            while (l >= 0 && r <= s.length()-1 && s.charAt(l) == s.charAt(r)) {
                if ((r-l+1) > resLen) {
                    resLen = r-l+1;
                    result = s.substring(l,r+1);
                }
                l--;
                r++;
            }
        }
        
        return result;
    }
}
