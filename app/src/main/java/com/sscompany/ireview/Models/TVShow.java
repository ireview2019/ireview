package com.sscompany.ireview.Models;

/**
 * This class provides structure for uploading tvshows into firebase database.
 */

public class TVShow implements InterfaceItem
{
    private String name;
    private String owner;
    private String genre;
    private String cover_photo;
    private String category;

    public TVShow(String name, String owner, String genre, String cover_photo) {
        this.name = name;
        this.owner = owner;
        this.genre = genre;
        this.cover_photo = cover_photo;
        setCategory("TV Shows");
    }

    public TVShow() {
        setCategory("TV Shows");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCover_photo() {
        return cover_photo;
    }

    public void setCover_photo(String cover_photo) {
        this.cover_photo = cover_photo;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "TVShow{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", genre='" + genre + '\'' +
                ", cover_photo='" + cover_photo + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}