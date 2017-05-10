package org.csu.coderlee.web.framework.domain;

import org.csu.coderlee.web.framework.util.CastUtil;

import java.util.Map;

/**
 * Created by lixiang on 2017 05 10 下午12:40.
 */
public class Param {

    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public long getLong(String name){
        return CastUtil.castLong(paramMap.get(name));
    }

    public Map<String, Object> getMap(){
        return paramMap;
    }
}
