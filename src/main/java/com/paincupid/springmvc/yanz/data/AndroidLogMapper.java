package com.paincupid.springmvc.yanz.data;

import com.paincupid.springmvc.yanz.model.AndroidLog;

public interface AndroidLogMapper {

	int deleteByPrimaryKey(Integer iautoid);

	int insert(AndroidLog record);

	int insertSelective(AndroidLog record);

	AndroidLog selectByPrimaryKey(Integer iautoid);

	int updateByPrimaryKeySelective(AndroidLog record);

	int updateByPrimaryKey(AndroidLog record);
}