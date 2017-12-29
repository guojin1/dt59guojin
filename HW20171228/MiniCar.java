/**
 * Project Name:dt59homework
 * File Name:MiniCar.java
 * Package Name:HW20171228
 * Date:2017年12月29日下午3:24:28
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package HW20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午3:24:28 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class MiniCar extends Car {
    int site;

    public void carSite(int site) {
        this.site = site;
        System.out.println("我车有" + super.wheel + "个轮胎," + "颜色是：" + super.color + ",可以载" + site + "人");
    }
}
