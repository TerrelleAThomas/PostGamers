package com.example.postgamers.Model;

import com.google.cloud.Timestamp;
import com.google.firebase.database.annotations.Nullable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class PostComment extends BasePostComment {
    private Post postId;
    private  User gamerId;

    public PostComment(@Nullable String commentId, String content, String title, boolean published, Timestamp createdAt, Timestamp publishedAt, User gamerId, @Nullable Post postId) {
        super(commentId,content,title,published,createdAt,publishedAt);
        this.postId = postId;
        this.gamerId = gamerId;
    }
}