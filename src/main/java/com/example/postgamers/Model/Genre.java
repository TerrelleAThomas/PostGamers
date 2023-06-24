package com.example.postgamers.Model;

import com.google.cloud.firestore.annotation.DocumentId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Genre {
    @DocumentId
    private @Nullable String genreId;
    private String content;
    private String title;
    private String metaTitle;
    private String slug;
}