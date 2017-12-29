/**
 * Project Name:dt59homework
 * File Name:LuxuryCar.java
 * Package Name:HW20171228.luxury
 * Date:2017年12月29日下午3:35:24
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package HW20171228.luxury;

import HW20171228.Car;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午3:35:24 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class LuxuryCar extends Car {
    @Override
    public void summary() {
        super.carColor(super.color);
        super.carWheel(super.wheel);
        System.out.println("我是豪华汽车我车有" + super.wheel + "个轮胎," + "颜色是：" + super.color);
    }

}
