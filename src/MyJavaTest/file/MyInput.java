package MyJavaTest.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInput {

    public static String readString() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string = "";
        try {
            string = br .readLine();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return string;
    }

    public int readInt(){return Integer.parseInt(readString());}
    public double readDouble(){return Double.parseDouble(readString());}
}
