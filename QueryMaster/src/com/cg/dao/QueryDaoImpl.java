package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.dto.QueryMaster;

@Repository("dao")
public class QueryDaoImpl implements QueryDao
{
	@PersistenceContext
	EntityManager manager;

	@Override
	public boolean save(QueryMaster queryId) {
		if(queryId!=null)
		{
			manager.persist(queryId);
			manager.flush();
			return true;
		}
		return false;
	}

	@Override
	public QueryMaster findOne(QueryMaster queryId) {
		QueryMaster query=manager.find(QueryMaster.class, queryId);
		return query;
	}

	@Override
	public List<QueryMaster> getQuery() {
		Query queryOne= manager.createQuery("FROM query_master");
		List<QueryMaster> myList=queryOne.getResultList();
		return myList;
	}
	
}
