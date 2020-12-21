package com.deltasource.eu.articlesrest.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
//
//@RestController
//public class ArticleController {
//
//    @Autowired
//    ArticleRepository articleRepository;
//
//    @GetMapping("/article/{id}")
//    public ResponseEntity<?> get(@PathVariable Long id) {
//        Optional<Article> articleData = articleRepository.findById(id);
//        if (articleData.isPresent()) {
//            return ResponseEntity.status(HttpStatus.OK).body(articleData.get());
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Article doesn't exist!");
//        }
//    }
//}
