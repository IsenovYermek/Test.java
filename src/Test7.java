
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.Arrays.compare;

public class Test7 {
    public static void main(String[] args) {
        List<Integer> list1 = asList(7, 17, 1, 9, 1, 17, 56, 56, 23);
        List<Integer> list2 = asList(56, 17, 17, 1, 23, 34, 23, 1, 8, 1);
        List<Integer> list3 = list1.stream().filter(list2::contains).collect(Collectors.toList());
        List<List<Integer>> common = Arrays.asList(list3);
        common.stream().filter(i-> Collections.frequency(common, i)>1).collect(Collectors.toSet()).forEach(System.out::println);


    }
}
