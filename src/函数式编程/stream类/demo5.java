package 函数式编程.stream类;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class demo5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apps", "Alibaba", "william", "Son");
        List<String> result = names.stream()
                .filter(((Predicate<String>)name -> name.startsWith("A"))
                        .and(name -> name.length()<5))
                .collect(Collectors.toList());
        result.forEach(System.out::println);


    }
}
