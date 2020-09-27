package 函数式编程.stream类;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        //stream 过滤
        List<String> list = Arrays.asList("张三", "李四", "王五", "xuwujing");
        System.out.println("过滤之前:" + list);
        List<String> result = new ArrayList<>();
        for (String str : list) {
            if (!"李四".equals(str)) {
                result.add(str);
            }
        }
        System.out.println("过滤之后:" + result);

        List<String> result2=list.stream().filter(str->!"李四".equals(str)).collect(Collectors.toList());
        System.out.println(result2);

        //构建流
        Stream stream = Stream.of("a", "b", "c");
        String[] strArray = new String[] { "a", "b", "c" };
        stream = Stream.of(strArray);
        stream = Arrays.stream(strArray);
        List<String> list1 = Arrays.asList(strArray);
        stream = list1.stream();
        System.out.println();


        //流之间的相互转换  stream 流只能使用一次，所以报错
       /* try {
            Stream<String> stream2 = Stream.of("a", "b", "c");
            // 转换成 Array
            String[] strArray1 = stream2.toArray(String[]::new);

            // 转换成 Collection
            List<String> list2 = stream2.collect(Collectors.toList());
            List<String> list3 = stream2.collect(Collectors.toCollection(ArrayList::new));
            Set set1 = stream2.collect(Collectors.toSet());
            Stack stack1 = stream2.collect(Collectors.toCollection(Stack::new));

            // 转换成 String
            String str = stream2.collect(Collectors.joining()).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        //转换成大写
        List<String> list3 = Arrays.asList("zhangSan", "liSi", "wangWu");
        System.out.println("转换之前的数据:" + list3);
        List<String> list4 = list3.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("转换之后的数据:" + list4);
        // 转换之后的数据:[ZHANGSAN, LISI,WANGWU]

        //转换数据类型
        List<String> list31 = Arrays.asList("1", "2", "3");
        System.out.println("转换之前的数据:" + list31);
        List<Integer> list41 = list31.stream().map(Integer::valueOf).collect(Collectors.toList());
        System.out.println("转换之后的数据:" + list41);
        // [1, 2, 3]


        String worlds = "The way of the future";
        List<String> list7 = new ArrayList<>();
        list7.add(worlds);
        List<String> list8 = list7.stream().flatMap(str -> Stream.of(str.split(" ")))
                .filter(world -> world.length() > 0).collect(Collectors.toList());
        list8.forEach(System.out::println);

        //限流
        Random rd = new Random();
        System.out.println("取到的前三条数据:");
        rd.ints().limit(3).forEach(System.out::println);

        //结合skip使用得到需要的数据
        List<String> list9 = new ArrayList<String>();
        for (int i = 1; i < 4; i++) {
            String s="第"+i+"个";
            list9.add(s);
        }
        System.out.println("截取之前的数据:"+list9);
        // 取前3条数据，但是扔掉了前面的2条，可以理解为拿到的数据为 2<=i<3 (i 是数值下标)
        List<String> list10 = list9.stream().limit(3).skip(2).collect(Collectors.toList());
        System.out.println("截取之后的数据:" + list10);


        Random rd2 = new Random();
        System.out.println("取到的前三条数据然后进行排序:");
        rd2.ints().limit(3).sorted().forEach(System.out::println);

        System.out.println("peek使用:");
        Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3).peek(e -> System.out.println("转换之前: " + e))
                .map(String::toUpperCase).peek(e -> System.out.println("转换之后: " + e)).collect(Collectors.toList());

        List<String> strings = Arrays.asList("a", "", "c", "", "e","", " ");
        // 获取空字符串的数量
        long count =  strings.parallelStream().filter(string -> string.trim().isEmpty()).count();
        System.out.println("空字符串的个数:"+count);

        List<Integer> numbers = Arrays.asList(1, 5, 7, 3, 9);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());
    }
}
