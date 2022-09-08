package MyJavaTest;

import org.testng.annotations.Test;


/*
    反转一个字符串
*/

public class String1 {

    public String reverse(String str, int startIndex, int endIndex) {
        if (str != null) {
            char[] arr = str.toCharArray();
            for (int x = startIndex, y = endIndex; x < y; x++, y--) {
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }

    public String reverse2(String str, int startIndex, int endIndex) {
        if (str != null) {
            String reverseStr = str.substring(0, startIndex);
            for (int i = endIndex; i >= startIndex; i--) {
                reverseStr += str.charAt(i);
            }
            reverseStr += (str.substring(endIndex + 1));
            return reverseStr;
        }

        return null;
    }

    public String reverse3(String str,int startIndex,int endIndex){
        if (str!=null) {
            StringBuilder builder = new StringBuilder(str.length());
            builder.append(str.substring(0,startIndex));
            for (int i =endIndex;i>=startIndex;i--){
                builder.append(str.charAt(i));
            }
            builder.append(str.substring(endIndex+1));
            return builder.toString();
        }
        return null;
    }

    @Test
    public void testReverse(){
        String str = "abcdefg";
        String reverse = reverse3(str,2,5);
        System.out.println(reverse);
    }

}
