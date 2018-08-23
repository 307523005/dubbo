package com.test.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.text.api.entity.role.SysUser;
import com.text.api.service.role.UserService;
import com.text.api.utils.RequestUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;


@Controller
@RequestMapping(value = "/music")
public class MusicInfoController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(){
        SysUser user = RequestUtils.currentLoginUser();
        Set<String> authorization = userService.findPermissionsByUserId(user.getId());
        System.out.println("---"+authorization);
        return "该用户有如下权限" + authorization;
    }

}
