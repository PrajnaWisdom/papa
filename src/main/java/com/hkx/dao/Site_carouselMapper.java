package com.hkx.dao;

import com.hkx.entity.Site_carousel;

public interface Site_carouselMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Site_carousel record);

    int insertSelective(Site_carousel record);

    Site_carousel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Site_carousel record);

    int updateByPrimaryKey(Site_carousel record);
}