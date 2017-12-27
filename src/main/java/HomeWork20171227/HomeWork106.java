/**
 * Project Name:dt59homework
 * File Name:HomeWork106.java
 * Package Name:HomeWork20171227
 * Date:2017年12月27日下午2:43:28
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package HomeWork20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:43:28 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class HomeWork106 {
    String name;

    static int i;

    static public void homeWork() {
        System.out.println(i);
        // System.out.println(name); 带static关键字的方法里只能用带static关键字的属性；
    }

    public void homeWork1() {
        System.out.println(i);
        System.out.println(name);
        // 一般的方法里可以用普通属性和带static关键字的属性；
    }

    public static void main(String[] args) {

        HomeWork106 home = new HomeWork106();
        home.name = "郭进";
        home.i = 26;
        home.homeWork();
        home.homeWork1();

    }
}
