package com.deltasource.eu.articlesrest.article;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@NoArgsConstructor
//@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = Article.class)
public class Article {

    @Id
    private Long id;
    @NotNull
    private String description;

    @Override
    public String toString() {
        return "Article [Description=" + description + ", Id=" + id + "]";
    }
}
