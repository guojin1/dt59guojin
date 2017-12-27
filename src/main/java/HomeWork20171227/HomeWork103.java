/**
 * Project Name:dt59homework
 * File Name:HomeWork203.java
 * Package Name:HomeWork20171227
 * Date:2017年12月27日下午2:20:46
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package HomeWork20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:20:46 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class HomeWork103 {
    String name;

    int age;

    int height;

    int weight;

    public HomeWork103(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

    }

    public void name1() {
        System.out.println("姓名:" + this.name + "\n年龄：" + this.age + "\n身高：" + this.height + "\n体重：" + this.weight);
    }

    public static void main(String[] args) {
        HomeWork103 name = new HomeWork103("郭进", 26, 174, 115);
        name.name1();
    }

}
