package com.dao;

import com.entity.MeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MeishiView;

/**
 * 美食 Dao 接口
 *
 * @author 
 * @since 2021-05-07
 */
public interface MeishiDao extends BaseMapper<MeishiEntity> {

   List<MeishiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
