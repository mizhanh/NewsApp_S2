package com.example.android.newsapp_s2;

public class Article {
    private String mArticleTitle;

    private String mArticleAuthor;

    private String mArticlePublishDate;

    private String mArticleSection;

    private String mArticleUrl;

    public Article(String title, String section, String author, String publishDate, String url) {
        mArticleTitle = title;
        mArticleSection = section;
        mArticleAuthor = author;
        mArticlePublishDate = publishDate;
        mArticleUrl = url;
    }

    public String getArticleTitle() {
        return mArticleTitle;
    }

    public String getArticleSection() {
        return mArticleSection;
    }

    public String getArticleAuthor() {
        return mArticleAuthor;
    }

    public String getArticlePublishDate() {
        return mArticlePublishDate;
    }

    public String getArticleUrl() {
        return mArticleUrl;
    }
}
