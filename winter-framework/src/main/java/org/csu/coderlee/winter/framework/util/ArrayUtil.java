package org.csu.coderlee.winter.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by lixiang on 2017 05 10 上午11:14.
 */
public final class ArrayUtil {

    /**
     * 判断数组是否非空
     */
    public static boolean isNotEmpty(Object[] array) {
        return !ArrayUtils.isEmpty(array);
    }

    /**
     * 判断数组是否为空
     */
    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }
}
