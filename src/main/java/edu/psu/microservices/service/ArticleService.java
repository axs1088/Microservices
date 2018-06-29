package edu.psu.microservices.service;

import edu.psu.microservices.model.Article;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service ("articleService")
public class ArticleService {
    List<Article> articles= new ArrayList<Article>(Arrays.asList(
            new Article("1", "Article 01", "Description 01"),
            new Article("2", "Article 02", "Description 02"),
            new Article("3", "Article 03", "Description 03")
    ));

    public List<Article> getArticles() {
        return articles;
    }

    public Article getArticle(String id){
        return articles.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addArticle(Article article) {
        articles.add(article);
    }

    public void updateArticle(Article art, String id) {
        for (int i= 0; i< articles.size(); i++){
            Article article = articles.get(i);
            if(article.getId().equals(id)){
                articles.set(i, art);
            }
        }
    }

    public void deleteArticle(String id) {
        articles.removeIf(t->t.getId().equals(id));
    }

    public void doSomething(){

    }
}
