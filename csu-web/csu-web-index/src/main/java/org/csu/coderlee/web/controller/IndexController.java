package org.csu.coderlee.web.controller;

import org.csu.coderlee.winter.framework.annotation.Action;
import org.csu.coderlee.winter.framework.annotation.Controller;
import org.csu.coderlee.winter.framework.domain.View;

/**
 * Created by lixiang on 2017 05 12 上午9:32.
 */

@Controller
public class IndexController {

    @Action("get: /testget")
    public Object testGet(){

        return new View("/index.jsp");
    }
}
