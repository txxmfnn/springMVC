package com.paincupid.springmvc.yanz.data;

import com.paincupid.springmvc.yanz.model.People;
import com.paincupid.springmvc.yanz.model.PeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeopleMapper {

	int deleteByExample(PeopleExample example);

	int deleteByPrimaryKey(String cpscode);

	int insert(People record);

	int insertSelective(People record);

	List<People> selectByExample(PeopleExample example);

	People selectByPrimaryKey(String cpscode);

	int updateByExampleSelective(@Param("record") People record, @Param("example") PeopleExample example);

	int updateByExample(@Param("record") People record, @Param("example") PeopleExample example);

	int updateByPrimaryKeySelective(People record);

	int updateByPrimaryKey(People record);
}