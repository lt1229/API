package com.lin.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lin.linapicommon.model.entity.InterfaceInfo;


/**
* @author lt2997
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-07-05 14:56:32
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {



    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
