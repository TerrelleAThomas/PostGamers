package com.example.postgamers.Services;

import com.example.postgamers.Model.Genre;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;
import org.jvnet.hk2.annotations.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;


@Service
public class GenreService {
    private Firestore db = FirestoreClient.getFirestore();

    public ArrayList<Genre> getGenres() throws ExecutionException, InterruptedException {

        Query query = db.collection("Genre").orderBy("title", Query.Direction.ASCENDING);

        ApiFuture<QuerySnapshot> future = query.get();
        List<QueryDocumentSnapshot> documents = future.get().getDocuments();

        ArrayList<Genre> categories = documents.size() > 0 ? new ArrayList<>() : null;

        for(QueryDocumentSnapshot doc : documents){
            categories.add(doc.toObject(Genre.class));
        }
        return categories;
    }
}
