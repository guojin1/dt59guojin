/**
 * Project Name:dt59homework
 * File Name:HomeWork204.java
 * Package Name:HomeWork20171227
 * Date:2017年12月27日下午2:27:08
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package HomeWork20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:27:08 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class HomeWork104 {
    String name = "郭进";

    int age = 26;

    int height = 174;

    int weight = 115;

    public HomeWork104(String name) {
        this.name = name;
    }

    public HomeWork104(String name, int age) {
        this(name);
        this.age = age;
    }

    public HomeWork104(String name, int age, int height) {
        this(name, age);
        this.height = height;
    }

    public static void main(String[] args) {

        new HomeWork104("郭进");
        new HomeWork104("郭进", 26);
        new HomeWork104("郭进", 26, 174);

    }

}
