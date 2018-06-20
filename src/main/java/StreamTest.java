import vo.Dish;

import java.util.ArrayList;
import java.util.List;

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
    }
}
