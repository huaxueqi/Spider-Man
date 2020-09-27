package 函数式编程.stream类;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class demo4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apps", "Alibaba", "william", "Son");
        List<Predicate<String>> allPredicates = new ArrayList<Predicate<String>>();
        allPredicates.add(str -> str.startsWith("A"));
        allPredicates.add(str -> str.contains("ba"));
        allPredicates.add(str -> str.length() > 4);

        List<String> result = names.stream()
                .filter(allPredicates.stream().reduce(x->true , Predicate::and))
                .collect(Collectors.toList());
          result.forEach(System.out::println);

    }
}
