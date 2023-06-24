package com.example.postgamers.Model;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.database.annotations.Nullable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor

public class RestPost extends BasePost {

    private DocumentReference gamerId;
    private ArrayList<DocumentReference> genreId;

    public RestPost(@Nullable String postId, String title, String content, String summary, String slug, String metaTitle, boolean published, boolean allowComments, @Nullable Timestamp createdAt, @Nullable Timestamp publishedAt, ArrayList<String> tags, DocumentReference gamerId, ArrayList<DocumentReference> genreId) {
        super(postId,title,content,summary,slug,metaTitle,published,allowComments,createdAt,publishedAt,tags);
        this.gamerId = gamerId;
        this.genreId = genreId;
    }

    public void setgamerId(String gamer) {
        Firestore db = FirestoreClient.getFirestore();
        this.gamerId = db.collection("User").document(gamer);

    }

    public void setgenreId(ArrayList<String> genreId) {
        Firestore db = FirestoreClient.getFirestore();
        this.genreId = new ArrayList<>();
        for(String cow: genreId){
            this.genreId.add(db.collection("Genre").document(cow));
        }

    }
}
