package 函数式编程.stream类;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Demo3 {
    public static void main(String[] args) {
        Predicate<String> predicate1 =  str -> str.startsWith("w");
        Predicate<String> predicate2 =  str -> str.length() > 4;
        List<String> names = Arrays.asList("Apps", "Alibaba", "william", "Son");

        List<String> result = names.stream()
                .filter(predicate1.and(predicate2))
                .collect(Collectors.toList());
        result.forEach(System.out::println);



    }
}
