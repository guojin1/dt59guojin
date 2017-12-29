/**
 * Project Name:dt59homework
 * File Name:Car.java
 * Package Name:HW20171228
 * Date:2017年12月29日下午2:49:39
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package HW20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午2:49:39 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public abstract class Car {
    public void summary() {
        System.out.println("车有的颜色和轮胎数和载客数");
    }

    public String color;

    public int wheel;

    public void carColor(String color) {
        this.color = color;
        System.out.println("车的颜色是：" + color);
    }

    public void carWheel(int wheel) {
        this.wheel = wheel;
        System.out.println("我的车有" + wheel + "个轮胎");
    }
}
