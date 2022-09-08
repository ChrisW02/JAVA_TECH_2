package MyJavaTest.file;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


// 图片加密
public class PicTest {
    @Test
    public void test1() {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/MyJavaTest/file/爱情与友情.jpg");
            fos = new FileOutputStream("src/MyJavaTest/file/爱情与友情secret.jpg");
            byte[] buffer = new byte[20];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                for (int i = 0; i < len; ++i) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
