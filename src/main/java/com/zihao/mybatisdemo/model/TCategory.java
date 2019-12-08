package com.zihao.mybatisdemo.model;

import lombok.ToString;

import java.util.List;
import java.util.Objects;

@ToString
public class TCategory {
    private int categoryId;
    private String categoryName;

    //多对多
    private List<TNews> tNews;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<TNews> gettNews() {
        return tNews;
    }

    public void settNews(List<TNews> tNews) {
        this.tNews = tNews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCategory tCategory = (TCategory) o;
        return categoryId == tCategory.categoryId &&
                Objects.equals(categoryName, tCategory.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, categoryName);
    }


}
