package com.deltasource.eu.articlesrest.article.graphql;

import com.deltasource.eu.articlesrest.article.ArticleRepository;
import graphql.schema.DataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GraphQLDataFetchers {

    @Autowired
    ArticleRepository articleRepository;

    public DataFetcher getArticleByIdDataFetcher() {
        return dataFetchingEnvironment -> {
            Long id = dataFetchingEnvironment.getArgument("id");
            return articleRepository.findById(id).get();
        };
    }
}
