package com.test.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.test.client.Intercept.OenIntercept;
import com.text.api.entity.Food;
import com.text.api.entity.Process;
import com.text.api.entity.RemotecontrolBeen;
import com.text.api.service.FoodProcess;
import com.text.api.service.FoodService;
import com.text.api.service.RemotecontrolService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class DeliciousFoodController {

    @Reference(version = "1.0.0")
    FoodProcess foodProcess;
    @Reference(version = "1.0.0")
    FoodService foodService;
    @Reference(version = "1.0.0")
    RemotecontrolService remotecontrolService;

    @RequestMapping("/getDeliciousFood")
    public Process getDeliciousFood(){
        return foodProcess.foodProcess();
    }
    @RequestMapping("/getFood")
    public Food getFood(){
        return foodService.getFood();
    }

    @RequestMapping("/test1")
    @OenIntercept
    @ResponseBody
    public List<RemotecontrolBeen> test1(){
        RemotecontrolBeen remotecontrolBeen = new RemotecontrolBeen();
        remotecontrolBeen.setIsoccupation(0);
        return remotecontrolService.getRemotecontrol(remotecontrolBeen);
    }
}
