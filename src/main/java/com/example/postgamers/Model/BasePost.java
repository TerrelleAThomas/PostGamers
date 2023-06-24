package com.example.postgamers.Model;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.annotation.DocumentId;
import com.google.firebase.database.annotations.Nullable;
import com.google.protobuf.util.Timestamps;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.ParseException;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasePost {
    @DocumentId
    protected @Nullable String postId;
    protected String title;
    protected String content;
    protected String summary;
    protected String slug;
    protected String metaTitle;
    protected boolean published;
    protected boolean allowComments;
    protected @Nullable Timestamp createdAt;
    protected @Nullable Timestamp publishedAt;
    protected ArrayList<String> tags;

    public void setCreatedAt(String createdAt) throws ParseException {
        this.createdAt = Timestamp.fromProto(Timestamps.parse(createdAt));
    }
    public void setPublishedAt(String publishedAt) throws ParseException {
        this.publishedAt = Timestamp.fromProto(Timestamps.parse(publishedAt));
    }

    public boolean getPublished() {
        return published;
    }

    public boolean getAllowComments() {
        return allowComments;
    }
}
