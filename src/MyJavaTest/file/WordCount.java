package MyJavaTest.file;

import org.testng.annotations.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCount {
    @Test
    public void test1() {
        FileReader fr = null;
        BufferedWriter bw = null;
        try {
            Map<Character, Integer> map = new HashMap<>();
            fr = new FileReader("dbcp.txt");
            int c = 0;
            while ((c = fr.read()) != -1) {
                char ch = (char) c;
                map.merge(ch, 1, Integer::sum);
            }
            bw = new BufferedWriter(new FileWriter("wordcount.txt"));

            Set<Map.Entry<Character,Integer>> entrySet =map.entrySet();

            for (Map.Entry<Character,Integer> entry:entrySet){
                switch (entry.getKey()) {
                    case ' ' -> bw.write("Space=" + entry.getValue());
                    case '\t' -> bw.write("Tab=" + entry.getValue());
                    case '\r' -> bw.write("Enter=" + entry.getValue());
                    case '\n' -> bw.write("NewLine=" + entry.getValue());
                    default -> bw.write(entry.getKey() + "=" + entry.getValue());
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fr!=null){try{fr.close();}catch(IOException e){e.printStackTrace();}}
            if(bw!=null){try{bw.close();}catch(IOException e){e.printStackTrace();}}
        }
    }
}
