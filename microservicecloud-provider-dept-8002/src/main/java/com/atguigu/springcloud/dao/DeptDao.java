package com.atguigu.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.atguigu.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DeptDao
{
	public boolean addDept(@Param("t") Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
