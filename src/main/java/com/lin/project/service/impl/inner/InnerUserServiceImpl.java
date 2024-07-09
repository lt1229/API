package com.lin.project.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lin.linapicommon.model.entity.User;
import com.lin.linapicommon.service.InnerUserService;
import com.lin.project.common.ErrorCode;
import com.lin.project.exception.BusinessException;
import com.lin.project.mapper.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: LTong
 * @Date: 2024/07/09/11:57
 * @Description:
 */
@DubboService
public class InnerUserServiceImpl implements InnerUserService {


    @Resource
    private UserMapper userMapper;
    @Override
    public User getInvokeUser(String accessKey){
        if(StringUtils.isAnyBlank(accessKey)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey",accessKey);
        User user = userMapper.selectOne(queryWrapper);
        return user;
    }
}
