package Algs_2022.DP;

public class LCS {
    public static int findMaxLCS(int[] nums1, int[] nums2) {
        int len = 0;
        int m = nums1.length;
        int n = nums2.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(nums1[i-1] == nums2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                    len = Math.max(len,dp[i][j]);
                }
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);}
        }
        return len;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,5,7,2,4,6,8};
        int[] nums2 = {4,6,1,5,4,8};
        System.out.println(findMaxLCS(nums1,nums2));
    }
}