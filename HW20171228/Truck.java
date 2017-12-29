/**
 * Project Name:dt59homework
 * File Name:Truck.java
 * Package Name:HW20171228
 * Date:2017年12月29日下午3:29:01
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package HW20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午3:29:01 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class Truck extends Car {
    int sites;

    public void carSite(int sites) {
        this.sites = sites;
        System.out.println("我车有" + super.wheel + "个轮胎," + "颜色是：" + super.color + ",可以载" + sites + "人");
    }
}
