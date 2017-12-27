/**
 * Project Name:dt59homework
 * File Name:TypeDefaultValue.java
 * Package Name:HomeWork20171227
 * Date:2017年12月27日下午1:59:15
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package HomeWork20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午1:59:15 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class TypeDefaultValue {
    int i;// int的默认值为：0

    short s;// short的默认值为：0

    long l;// long的默认值为：0

    byte b;// byte的默认值为：0

    float f;// float的默认值为：0.0

    double d;// double的默认值为0.0

    boolean c;// boolean的默认值为：flase

    char a;// char的默认值为： 空格

    String str;// String的默认值为：null

    int[] ary;// 数组的默认值为：null

    public void Test() {
        System.out
                .print("int的默认值为：" + i + "short的默认值为：" + s + "long的默认值为：" + l + "byte的默认值为：" + b + "float的默认值为：" + f
                        + "double的默认值为：" + d + "boolean的默认值为：" + c + "char的默认值为：" + a + "String的默认值为：" + str
                        + "数组的默认值为：" + ary);
    }
}
