package 函数式编程.stream类;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        /*List list=new ArrayList();
        list.add("asdg");
        list.add("456");
        list.add(123);
        list.add(466);
        System.out.println(list.stream().sorted(Comparator.comparing(l->l.toString(),Comparator.nullsLast(String::compareTo))).count());
        Stream<String> s = Stream.of("test", "t1", "t2", "teeeee", "aaaa");
        s.map(n -> n.concat(".txt")).forEach(System.out::println);

        Stream<String> s1 = Stream.of("test", "t1", "t2", "teeeee", "aaaa");
       //查找所有包含t的元素并进行打印
        s1.filter(n -> n.contains("t")).forEach(System.out::println);*/

        /*Stream<String> s2 = Stream.of("test", "t1", "t2", "teeeee", "aaaa");
        s2.flatMap(n -> Stream.of(n.split(""))).forEach(System.out::println);*/

        /*  java 9
        Stream<String> s3 = Stream.of("test", "t1", "t2", "teeeee", "aaaa", "taaa");
        //以下结果将打印： "test", "t1", "t2", "teeeee"，最后的那个taaa不会进行打印
        s3.takeWhile(n -> n.contains("t")).forEach(System.out::println);*/
       /* String s=null;
        Optional<String> o = Optional.ofNullable(s);
        try {
            System.out.println(o.orElseThrow(()->new Exception("报错啦")));
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        Stream<String> s2 = Stream.of("aa", "ab", "c", "ad");
        Predicate<String> predicate2 = t -> t.contains("a");
        s2.parallel().reduce(Collections.synchronizedList(new ArrayList<>(16)), (r, t) -> {
            if (predicate2.test(t)) {
                r.add(t);
            }
            return r;
        }, (r1, r2) -> {
            System.out.println(r1.size());
            return r1;
        }).forEach(System.out::println);


        String s = null;
        Optional<String> o = Optional.ofNullable(s);
        try {
            System.out.println(o.orElseThrow(() -> new Exception("报错啦")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}