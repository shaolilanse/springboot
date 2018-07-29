package com.lsl.example.springbootdemo;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @description: JDK8的stream用法
 * @author: liushaoli
 * @create: 2018-07-29 18:04
 */
public class JDK8SteamTest {
    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.asList(1,2,4,3,5).stream();
        String result = stream
                .filter(item -> item <= 5)
                .map(m -> "hello" + m)
                .flatMap(item -> Arrays.asList(item, item + "1").stream())
                .reduce("hello0", (a, b) -> {
                    System.out.println("a:" + a);
                    System.out.println("b:" + b);
                    a = a + "," + b;
                    System.out.println("a+:" + a);
                    return a;
                });
//                .collect(Collectors.toList());

        /*// 1、转换为Array
        Integer[] oldData1 = stream.toArray(Integer[]::new);
        // 2、转换为Collection
        List<Integer> oldData2 = stream.collect(Collectors.toList());
        Set<Integer> oldData3 = stream.collect(Collectors.toSet());
        // 3、转换为String
        stream.collect(Collectors.joining()).toString();*/

        System.out.print(result);
    }
}
