package com.lin.project.provider;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: LTong
 * @Date: 2024/07/08/21:51
 * @Description:
 */
@DubboService
public class DemoServiceImpl implements DemoService{

    @Override
    public String sayHello(String name) {
        System.out.println("Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name;
    }

    @Override
    public String sayHello2(String name) {
        return "yupi";
    }

}
