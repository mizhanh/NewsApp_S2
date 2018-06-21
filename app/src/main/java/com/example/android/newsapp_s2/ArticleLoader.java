package com.example.android.newsapp_s2;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class ArticleLoader extends AsyncTaskLoader<List<Article>> {

    private static final String LOG_TAG = ArticleLoader.class.getName();

    private String mUrl;

    public ArticleLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<com.example.android.newsapp_s2.Article> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        List<com.example.android.newsapp_s2.Article> articles = QueryUtils.fetchArticleData(mUrl);
        return articles;
    }
}
