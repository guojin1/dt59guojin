/**
 * Project Name:dt59homework
 * File Name:ReturnMax.java
 * Package Name:HomeWork20171225
 * Date:2017年12月25日下午4:51:44
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package HomeWork20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午4:51:44 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class ReturnMax {

    public static void main(String[] args) {
        ReturnMax max = new ReturnMax();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第1个数");
        int a = scanner.nextInt();
        System.out.println("请输入第2个数");
        int b = scanner.nextInt();
        int c = max.max(a, b);
        System.out.println("最大值为" + c);
        scanner.close();
    }

    int max(int a, int b) {
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else {
            return a;
        }
    }
}
