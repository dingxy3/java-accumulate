package stream;
import bean.Dish;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * @param
 * @Author: dingxy3
 * @Description:
 * @Date: Created in  2018/6/20
 **/
public class StreamTest {

    /**
     * 返回低热量的菜肴名称的， 并按照卡路里排序
     * @param dishes
     */
    public static List<String> stream0(List<Dish> dishes){
        return dishes.stream().filter(d -> d.getCalories()<400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());

    }

    /**
     *筛选出素食
     * @param dishes
     */
    public static void stream1(List<Dish> dishes){

         dishes.stream().filter(Dish::isVegetarian).collect(toList()).forEach(System.out::print);

    }

    /**
     * 筛选出热量超过300的前3道菜
     * @param dishes
     */
    public static void stream2(List<Dish> dishes){

        dishes.stream().filter(dish -> dish.getCalories()>300).limit(3).collect(toList());
        //跳过前3道菜
        dishes.stream().filter(d ->d.getCalories()>300).skip(3).collect(toList());
        //统计出所有菜名，然后统计出菜名长度
        dishes.stream().map(dish -> dish.getName()).map(String::length).collect(toList());



    }
    public static void main(String[] args) {
        List<Dish> dishes =  Dish.menu;
        System.out.println(stream0(dishes));
        stream1(dishes);
        Stream<String> words = Stream.of("a", "b", "a", "c");
        Map<String, Integer> wordsCount = words.collect(Collectors.toMap(s -> s, s -> 1,
                (i, j) -> i+j));
        System.out.println(wordsCount);
        List<String> list = Arrays.asList("hello welcome", "world hello", "hello world",
                "hello world welcome");


        System.out.println(list.stream().flatMap(s ->Arrays.stream(s.split(""))).collect(Collectors.toMap(s -> s, s -> 1,
                (i, j) -> i+j)));
        try {
            Thread.sleep(3600*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
