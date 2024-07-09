package com.lin.project.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lin.linapicommon.model.entity.UserInterfaceInfo;

/**
* @author lt2997
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-07-08 13:10:30
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId,long userId);

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);
}
