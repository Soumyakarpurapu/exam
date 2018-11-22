package com.cg.dao;

import java.util.List;

import com.cg.dto.QueryMaster;

public interface QueryDao 
{
	public boolean save(QueryMaster queryId);
	public QueryMaster findOne(QueryMaster queryId); 
	public List<QueryMaster> getQuery();
}
