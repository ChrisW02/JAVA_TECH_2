package MyJavaTest;

import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;

/*
  获取字符串出现次数
 */


public class String2 {
    public int getCount(String mainStr, String subStr) {
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;
        if (mainLength >= subLength) {
            while ((index = mainStr.indexOf(subStr, index)) != -1) {
                count++;
                index += subLength;
            }
            return count;
        }else return 0;
    }

    @Test
    public void testGetCount(){
        String mainStr = "abkkcadkabkebfkaabkskabc";
        String subStr = "ab";
        int count = getCount(mainStr,subStr);
        System.out.println(count);
    }

}