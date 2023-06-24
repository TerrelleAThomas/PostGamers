package com.example.postgamers.Model;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.annotation.DocumentId;
import com.google.firebase.database.annotations.Nullable;
import com.google.protobuf.util.Timestamps;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.ParseException;

@Data
@NoArgsConstructor
@AllArgsConstructor

public abstract class BasePostComment {
    @DocumentId
    protected @Nullable String commentId;
    protected String content;
    protected String title;
    protected boolean published;
    protected @Nullable Timestamp createdAt;
    protected @Nullable Timestamp publishedAt;

    public void setCreatedAt(String createdAt) throws ParseException {
        this.createdAt = Timestamp.fromProto(Timestamps.parse(createdAt));
    }
    public void setPublishedAt(String publishedAt) throws ParseException {
        this.publishedAt = Timestamp.fromProto(Timestamps.parse(publishedAt));
    }

    public boolean getPublished() {
        return published;
    }
}

