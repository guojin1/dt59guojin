/**
 * Project Name:dt59homework
 * File Name:HomeWork105.java
 * Package Name:HomeWork20171227
 * Date:2017年12月27日下午2:33:30
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package HomeWork20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:33:30 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class HomeWork105 {
    private String name = "郭进";

    private int age = 26;

    private int height = 174;

    private int weight = 115;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {

        HomeWork105 home = new HomeWork105();
        home.setAge(26);
        System.out.println(home.getAge());
    }

}
