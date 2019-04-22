package com.museum.museumServer.main.models;

import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@org.springframework.data.mongodb.core.mapping.Document(collection = "document")
public class Document implements Serializable {
    @Id
    @NotNull
    private String id;

    private String name;
    private String imagedoc;
    private List<Article> articles;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagedoc() {
        return imagedoc;
    }

    public void setImagedoc(String imagedoc) {
        this.imagedoc = imagedoc;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
