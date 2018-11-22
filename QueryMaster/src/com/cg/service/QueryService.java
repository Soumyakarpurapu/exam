package com.cg.service;

import java.util.List;

import com.cg.dto.QueryMaster;

public interface QueryService 
{
	public boolean save(QueryMaster queryId);
	public QueryMaster findOne(QueryMaster queryId); 
	public List<QueryMaster> getQuery();
}
