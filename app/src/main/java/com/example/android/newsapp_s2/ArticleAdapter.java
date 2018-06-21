package com.example.android.newsapp_s2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArticleAdapter extends ArrayAdapter<Article> {

    public ArticleAdapter(Context context, ArrayList<Article> articles) {
        super(context, 0, articles);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.article_list_item, parent, false);
        }
        // Find the article at a given position in the list of articles
        com.example.android.newsapp_s2.Article currentArticle = getItem(position);

        TextView titleView = listItemView.findViewById(R.id.title);
        titleView.setText(currentArticle.getArticleTitle());

        TextView sectionView = listItemView.findViewById(R.id.section);
        sectionView.setText(currentArticle.getArticleSection());

        TextView authorView = listItemView.findViewById(R.id.author);
        authorView.setText(currentArticle.getArticleAuthor());

        TextView publishDateView = listItemView.findViewById(R.id.publish);
        String formattedPublishDate = formatDate(currentArticle.getArticlePublishDate());
        publishDateView.setText(formattedPublishDate);

        return listItemView;
    }

    //  Function to return formatted publish date
    private String formatDate(String date) {
        String unformattedDate = date;
        String formattedDate = unformattedDate.substring(0,10);
        String formattedTime = unformattedDate.substring(11,19);
        return formattedDate + "  " + formattedTime;
    }

}
