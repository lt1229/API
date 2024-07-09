package com.lin.project.service.impl.inner;

import com.lin.linapicommon.model.entity.UserInterfaceInfo;
import com.lin.linapicommon.service.InnerUserInterfaceInfoService;
import com.lin.project.service.UserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: LTong
 * @Date: 2024/07/09/12:04
 * @Description:
 */
@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Override
    public boolean invokeCount(long interfaceInfoId,long userId){
        return userInterfaceInfoService.invokeCount(interfaceInfoId,userId);
    }

}

