package ru.bolnik;


import ru.bolnik.сustom_exceptions.MyArrayDataException;
import ru.bolnik.сustom_exceptions.MyArraySizeException;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "12"}
        };

        try {
            int sum = runTaskFive(arr);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }


    private static int runTaskOne(String string, String word) {
        Map<String, Integer> map = new HashMap<>();
        String[] split = string.split(" ");
        for (String s : split) {
            map.put(s , map.getOrDefault(s , 0) + 1);
        }
        return map.getOrDefault(word, 0);
    }

    private static void runTaskTwo(ArrayList<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        int i = 0;
        while(i < list.size()){
            System.out.println(list.get(i));
            i++;
        }
    }

    private static <T> ArrayList<T> runTaskThree( T[] arr) {
        return (ArrayList<T>) Arrays.asList(arr);
    }

    private static void runTaskFour(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        Integer sum = list.stream()
                .filter(i -> i % 2 == 0)
                .peek(System.out::println)
                .map(i -> i * 2)
                .peek(System.out::println)
                .reduce(0, Integer::sum);
        System.out.println(sum);

    }

    private static int runTaskFive(String[][] arr){
        if(arr.length != 4) {
            throw new MyArraySizeException("Неверное количество строк");
        }
        for (String[] strings : arr) {
            if (strings.length != 4) {
                throw new MyArraySizeException("Неверное количество столбцов");
            }
        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }

}