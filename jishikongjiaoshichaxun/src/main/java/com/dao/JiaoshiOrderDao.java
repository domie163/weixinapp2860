package com.dao;

import com.entity.JiaoshiOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshiOrderView;

/**
 * 座位使用 Dao 接口
 *
 * @author 
 */
public interface JiaoshiOrderDao extends BaseMapper<JiaoshiOrderEntity> {

   List<JiaoshiOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
