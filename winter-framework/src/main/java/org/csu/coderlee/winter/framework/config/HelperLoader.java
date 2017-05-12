package org.csu.coderlee.winter.framework.config;

import org.csu.coderlee.winter.framework.util.ClassUtil;

/**
 * Created by lixiang on 2017 05 10 下午12:37.
 */
public final class HelperLoader {


    public static void init(){
        Class<?>[] classList = {
                BeanHelper.class,
                ClassHelper.class,
                ControllerHelper.class,
                IocHelper.class
        };

        for (Class<?> cls : classList){
            ClassUtil.loadClass(cls.getName());
        }
    }
}
