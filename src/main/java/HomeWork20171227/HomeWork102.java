/**
 * Project Name:dt59homework
 * File Name:HomeWork202.java
 * Package Name:HomeWork20171227
 * Date:2017年12月27日下午2:13:43
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package HomeWork20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:13:43 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class HomeWork102 {
    String str = "郭进";

    int age = 26;

    int height = 174;

    int weight = 115;

    public HomeWork102() {
        System.out.println(" " + str + age + height + weight);
        this.str = "嘿嘿";
        this.age = 27;

        this.height = 175;

        this.weight = 120;
        // 属性已经输出后再赋值，属性不做任何变化；
    }

    public static void main(String[] args) {
        new HomeWork102();

    }

}
