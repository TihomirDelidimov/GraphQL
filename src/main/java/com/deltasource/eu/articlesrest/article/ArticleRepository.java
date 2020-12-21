package com.deltasource.eu.articlesrest.article;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface ArticleRepository extends MongoRepository<Article,Long> {
}
