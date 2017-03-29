package com.jzt.api.common.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用常量类
 */
public class GeneralConstant {

    public final static Map<Integer, Integer> P2PTAG = new HashMap<Integer, Integer>() {
        {
            put(1, 14); // 国资系
            put(2, 15); // 上市公司系
            put(3, 20); // 创业平台
        }
    };

    public static void main(String[] args) {

    }
}
