package skyro.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void printOddEven(List nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.size(); i++) list.add((Integer) nums.get(i));
        ArrayList<Integer> even = new ArrayList<Integer>();  //чётные
        ArrayList<Integer> odd = new ArrayList<Integer>();    //нечётные
        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 0) {   //если x - чётное
                even.add(x);   // добавляем x в коллекцию четных чисел
            } else
                odd.add(x);    // добавляем x в коллекцию нечетных чисел
        }
        System.out.println("Четные числа: " + even.toString());
        System.out.println("Нечетные числа: " + odd.toString());
    }

    public static void printCountDuplicate(List nums) {
        {
            Set<Integer> unicum = new HashSet<>();
            int count = nums.size();
            Integer t1 = null;
            Integer t2 = null;
            Integer count_dup = 0;
            for (int i = 0; i < count; i++) {
                t1 = (Integer) nums.get(i);
                for (int j = i + 1; j < count; j++) {
                    t2 = (Integer) nums.get(j);
                    if (t2.equals(t1)) {
                        count_dup = count_dup + 1;
                    } else {
                        unicum.add(t1);
                    }
                }
            }
            System.out.println("Количество дублей: " + count_dup);
            System.out.println("Уникальные числа: " + unicum.toString());
        }
    }

        public static void main (String[]args) throws IOException {
            List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
            //создание списка, где все элементы должны быть типа Integer
            printOddEven(nums);
            printCountDuplicate(nums);
        }
    }


