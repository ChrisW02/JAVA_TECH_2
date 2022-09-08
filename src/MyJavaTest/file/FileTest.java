package MyJavaTest.file;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    @Test
    public void test1() throws IOException {
        File file1 = new File("Hello.txt");
        File file2 = new File("/Users/liuyaqing/Desktop/JAVA_TECH/src/MyJavaTest/file/he.txt");

        file2.createNewFile();
        System.out.println(file1);
        System.out.println(file2);

        File file3 = new File("/Users/liuyaqing/Desktop/JAVA_TECH/src/MyJavaTest", "file");
        System.out.println(file3);

        File file4 = new File(file3, "she.txt");
        System.out.println(file4);
    }


    @Test
    public void test2() throws IOException {

        File file1 = new File("hello.txt");
        File file2 = new File("/users/liuyaqing/Desktop/JAVA_TECH/src/MyJavaTest/file/test2.txt");
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(new Date(file1.lastModified()));

        System.out.println();
        System.out.println(file2.getAbsoluteFile());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(new Date(file2.lastModified()));
    }

    @Test
    public void test3() {
        File file = new File("/users/liuyaqing/Desktop/JAVA_TECH/src/MyJavaTest/file");
        String[] list = file.list();
        for (String s : list) System.out.println(s);

        File[] files = file.listFiles();
        for (File f : files) System.out.println(f);
    }

    @Test
    public void test4(){
        File file1 = new File("/users/liuyaqing/Desktop/JAVA_TECH/src/MyJavaTest/file/hello.txt");
        File file2 = new File("/users/liuyaqing/Desktop/JAVA_TECH/src/MyJavaTest/file/hi.txt");
        boolean renameTo = file2.renameTo(file1);
        System.out.println(renameTo);
    }

    @Test
    public void test5(){
        File file1 = new File("/users/liuyaqing/Desktop/JAVA_TECH/src/MyJavaTest/file/hello.txt");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());

        System.out.println();
    }

    @Test
    public void test6()throws IOException{
        File file1= new File("src/MyJavaTest/file/hi.txt");
        if(!file1.exists()){
            file1.createNewFile();
            System.out.println("Created");
        }else{
            file1.delete();
            System.out.println("Deleted");
        }
    }

    @Test
    public void test7(){
        File file1= new File("src/MyJavaTest/newFileTest/2022");
        boolean mkdir = file1.mkdir();
        if(mkdir){
            System.out.println("Created");
        }
        File file2 = new File("src/MyJavaTest/newFileTest/2023/2024");
        boolean mkdir1 = file2.mkdirs();
        if(mkdir1){
            System.out.println("~Created");
        }

        File file3 = new File("src/MyJavaTest/newFileTest/2023");
        System.out.println(file3.delete());
    }
}
