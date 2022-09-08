package MyJavaTest;

/*
  获取两个字符串中最大相同子串（前提：只有一个最大相同子串）
 */

import org.testng.annotations.Test;

import java.util.Arrays;

public class String3 {
    public String getMaxSameString(String str1, String str2) {
        if (str1 != null && str2 != null) {
            String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
            String minStr = (str1.length() < str2.length()) ? str1 : str2;
            int length = minStr.length();

            for (int i = 0; i < length; i++) {
                for (int x = 0, y = length - i; y <= length; x++, y++) {
                    String subStr = minStr.substring(x, y);
                    if (maxStr.contains(subStr)) return subStr;
                }
            }
        }
        return null;
    }

    public String[] getMaxSameString1(String str1, String str2){
        if (str1!=null&&str2!=null){
            StringBuffer sb = new StringBuffer();
            String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
            String minStr = (str1.length() < str2.length()) ? str1 : str2;

            int len = minStr.length();
            for(int i=0;i<len;i++){
                for(int x = 0,y=len-i;y<=len;x++,y++){
                    String subString = minStr.substring(x,y);
                    if(maxStr.contains(subString)) sb.append(subString).append(',');
                }
                if(sb.length()!=0)break;
            }
            return sb.toString().replaceAll(",$","").split(",");
        }
        return null;
    }
    @Test
    public void testGetMaxSameString(){
        String str1 = "abcwerthello1yuiodefabcdef";
        String str2 = "cvhello1bnmabcdef";
        String[] maxSameStrings = getMaxSameString1(str1,str2);
        System.out.println(Arrays.toString(maxSameStrings));
    }
}
