package com.github.controler;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.google.code.stackexchange.client.provider.StackOverflowApiProvider;
import com.google.code.stackexchange.client.query.SearchApiQuery;
import com.google.code.stackexchange.client.query.StackExchangeApiQueryFactory;
import com.google.code.stackexchange.schema.Question;

@Repository
public class StackExchangeControler {
	private static final StackOverflowApiProvider stackOverflowApiProvider = new StackOverflowApiProvider();
	public List<Question> searchQuestion(final String name) {
		//TODO ajouter la clef API stackExchange
		StackExchangeApiQueryFactory queryFactory = StackExchangeApiQueryFactory.newInstance(null);
		SearchApiQuery searchApiQuery = queryFactory.newSearchApiQuery();
		
		searchApiQuery.setApiProvider(stackOverflowApiProvider);
		searchApiQuery.withInTitle(name);
		
		return searchApiQuery.list();
	}
}
