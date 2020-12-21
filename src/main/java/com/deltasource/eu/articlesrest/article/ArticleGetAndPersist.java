package com.deltasource.eu.articlesrest.article;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArticleGetAndPersist {

    @Autowired
    ArticleRepository articleRepository;

    @RabbitListener(queues = "${article.rabbitmq.queue}")
    public void receivedArticle(Article article) {
        articleRepository.save(article);
    }
}
