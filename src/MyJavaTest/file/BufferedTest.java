package MyJavaTest.file;

import org.testng.annotations.Test;

import java.io.*;

// * 处理流之一：缓冲流的使用
//         *
//         * 1.缓冲流：
//         * BufferedInputStream
//         * BufferedOutputStream
//         * BufferedReader
//         * BufferedWriter
//         *
//         * 2.作用：提供流的读取、写入的速度
//         *   提高读写速度的原因：内部提供了一个缓冲区
//         *
//         * 3. 处理流，就是“套接”在已有的流的基础上。
//         *

public class BufferedTest {
    @Test
    public void BufferedStreamTest() throws FileNotFoundException{
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try{
            File srcFile = new File("爱情与友情.jpg");
            File destFile = new File("爱情与友情3.jpg");

            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[10];
            int len;
            while((len = bis.read(buffer))!=-1){bos.write(buffer,0,len);}
        }catch (IOException e){e.printStackTrace();}finally {
            if(bos!=null){try{bos.close();}catch(IOException e){e.printStackTrace();}}
            if(bis!=null){try{bis.close();}catch(IOException e){e.printStackTrace();}}
        }       //说明：关闭外层流的同时，内层流也会自动的进行关闭。关于内层流的关闭，我们可以省略.
    }

    public void copyFileWithBuffered(String srcPath,String destPath){
        BufferedInputStream bis = null;
        BufferedOutputStream bos =null;

        try{
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[1024];
            int len;
            while((len = bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }
        }catch (IOException e){e.printStackTrace();}
        finally {
            if(bos!=null){try{bos.close();}catch(IOException e){e.printStackTrace();}}
            if(bis!=null){try{bis.close();}catch(IOException e){e.printStackTrace();}}

        }
    }

    @Test
    public void testCopyFileWithBuffered(){
        long start = System.currentTimeMillis();

        String srcPath = null;
        String destPath = null;

    }
}
