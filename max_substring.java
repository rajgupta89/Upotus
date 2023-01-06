import java.util.*;
public class max_substring {
    private static boolean isPalindrome(String s, int l, int r) {
        if (l < 0)
          return false;
        while (l < r)
          if (s.charAt(l++) != s.charAt(r--))
            return false;
        return true;
      }
    public static int getMaxSubstrings(String s, int k) {
        final int n = s.length();
        int[] dp = new int[n + 1];
        for (int i = k; i <= n; ++i) {
          dp[i] = dp[i - 1];
          if (isPalindrome(s, i - k, i - 1))
            dp[i] = Math.max(dp[i], 1 + dp[i - k]);
          if (isPalindrome(s, i - k - 1, i - 1))
            dp[i] = Math.max(dp[i], 1 + dp[i - k - 1]);
        }
    
        return dp[n];
      }
      
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int k=in.nextInt();
        System.out.println(getMaxSubstrings(s, k));
    }
}
