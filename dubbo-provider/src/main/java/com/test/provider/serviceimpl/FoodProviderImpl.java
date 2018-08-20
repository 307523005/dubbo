package com.test.provider.serviceimpl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.text.api.entity.Food;
import com.text.api.entity.Process;
import com.text.api.service.FoodProcess;
import com.text.api.service.FoodService;
import org.springframework.stereotype.Component;

@Component
@Service(version = "${demo.service.version}",interfaceClass = FoodProcess.class)
public class FoodProviderImpl implements FoodProcess {
//application = "${dubbo.application.id}",protocol = "${dubbo.protocol.id}",registry = "${dubbo.registry.id}"

    @Reference(version = "${demo.service.version}")
    FoodService foodService;

    @Override
    public Process foodProcess() {
        System.out.println("加工食物咯!");
        Food food = foodService.getFood();
        Process process = new Process();
        process.setProcessName(food.getName());
        process.setProcessAddress("安徽黄山");
        return process;
    }
}
