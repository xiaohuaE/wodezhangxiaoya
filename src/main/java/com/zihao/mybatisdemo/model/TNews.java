package com.zihao.mybatisdemo.model;

import lombok.ToString;

import java.util.List;
import java.util.Objects;


@ToString
public class TNews {
    private int newsId;
    private String title;

    //多对多
    private List<TCategory> tactegory;


    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<TCategory> getTactegory() {
        return tactegory;
    }

    public void setTactegory(List<TCategory> tactegory) {
        this.tactegory = tactegory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TNews tNews = (TNews) o;
        return newsId == tNews.newsId &&
                Objects.equals(title, tNews.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsId, title);
    }


}
