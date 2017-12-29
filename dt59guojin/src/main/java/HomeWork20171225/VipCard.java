/**
 * Project Name:dt59homework
 * File Name:VipCard.java
 * Package Name:HomeWork20171225
 * Date:2017年12月25日下午5:29:27
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package HomeWork20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午5:29:27 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class VipCard {
    int card[] = new int[] { 1, 2, 3, 4, 5 };

    public static void main(String[] args) {
        VipCard vip = new VipCard();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择卡片编号：");
        int a = scanner.nextInt();

        // int b = vip.lv(a);
        System.out.println("您选择的是" + a + "号卡片");
        String str = vip.moeny1();
        System.out.print(str);
        double money = scanner.nextDouble();
        double c = vip.money(a, money);
        System.out.println("您实际消费金额" + c);
    }

    // int lv(int a) {
    //
    // // card[a];
    // }

    String moeny1() {
        return "请输入消费金额:";
    }

    double money(int a, double b) {
        return (7 + a * 0.5) / 10 * b;

    }
}
