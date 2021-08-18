package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String avatarSong;
    private String urlSong;
    @OneToMany
    private List<Category> categories;

    public Song() {
    }

    public Song(Long id, String name, String avatarSong, String urlSong, List<Category> categories) {
        this.id = id;
        this.name = name;
        this.avatarSong = avatarSong;
        this.urlSong = urlSong;
        this.categories = categories;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarSong() {
        return avatarSong;
    }

    public void setAvatarSong(String avatarSong) {
        this.avatarSong = avatarSong;
    }

    public String getUrlSong() {
        return urlSong;
    }

    public void setUrlSong(String urlSong) {
        this.urlSong = urlSong;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
