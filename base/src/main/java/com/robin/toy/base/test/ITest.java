package com.robin.toy.base.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository("iitest")
public interface ITest {
	@Select("select 1")
	public Integer select1();
	@Select("select * from orders")
	@ResultType(ArrayList.class)
	public List<Map<String,Object>>getOrders();

}
