package com.example.news_app.Model;

import java.util.List;

public class NewsApiResponse {
    String status;
    int totalResult;
    List<NewsApiResponse> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(int totalResult) {
        this.totalResult = totalResult;
    }

    public List<NewsApiResponse> getArticles() {
        return articles;
    }

    public void setArticles(List<NewsApiResponse> articles) {
        this.articles = articles;
    }
}
