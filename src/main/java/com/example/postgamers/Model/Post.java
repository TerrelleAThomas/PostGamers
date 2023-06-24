package com.example.postgamers.Model;

import com.google.cloud.Timestamp;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;
import java.util.ArrayList;

@Data
@NoArgsConstructor
public class Post extends BasePost {

    private User gamerId;
    private ArrayList<Genre> genreId;

    public Post(@Nullable String postId, String title, String content, String summary, String slug, String metaTitle, boolean published, boolean allowComments, @Nullable Timestamp createdAt, @Nullable  Timestamp publishedAt, ArrayList<String> tags, User gamerId, ArrayList<Genre> genreId) {
        super(postId, title, content, summary, slug, metaTitle, published, allowComments, createdAt, publishedAt, tags);
        this.gamerId = gamerId;
        this.genreId = genreId;
    }
}
