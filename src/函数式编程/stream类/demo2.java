package 函数式编程.stream类;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class demo2 {
    public static void filter(List names, Predicate<String> condition) {
        names.stream().filter((name) -> (condition.test((String) name))).forEach((name) -> {
            System.out.println(name + " ");
        });
    }
    public static void main(String[] args) {
        List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
       System.out.println("Languages which starts with J :");
        filter(languages, (str) -> str.startsWith("J"));

        System.out.println("Languages which ends with a ");
        filter(languages, (str) -> str.endsWith("a"));

        System.out.println("Print all languages :");
        filter(languages, (str) -> true);

        System.out.println("Print no language : ");
        filter(languages, (str) -> false);

        System.out.println("Print language whose length greater than 4:");
        filter(languages, (str) -> str.length() > 4);
    }
}