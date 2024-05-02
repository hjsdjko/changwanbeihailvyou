package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TechanEntity;
import java.util.Map;

/**
 * 特产 服务类
 * @author 
 * @since 2021-05-07
 */
public interface TechanService extends IService<TechanEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}