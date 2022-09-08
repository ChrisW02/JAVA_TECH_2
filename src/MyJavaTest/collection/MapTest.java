package MyJavaTest.collection;

import org.testng.annotations.Test;

import java.util.*;

public class MapTest {

    @Test
    public void test5() {
        Map map = new HashMap();
        map.put("AA", 123);
        map.put(45, 1234);
        map.put("BB", 56);

        //遍历所有的key集：keySet()

        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //遍历所有的value集：values()

        System.out.println();
        Collection values = map.values();
        for (Object obj : values) {
            System.out.println(obj);
        }

        //遍历所有的key-value
        //方式一：entrySet()

        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object obj = iterator1.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "---->" + entry.getValue());
        }
        System.out.println();

        //方式二

        Set keyset = map.keySet();
        Iterator iterator2 = keyset.iterator();
        while(iterator2.hasNext()){
            Object key = iterator2.next();
            Object value = map.get(key);
            System.out.println(key+"====="+value);
        }

    }
}
