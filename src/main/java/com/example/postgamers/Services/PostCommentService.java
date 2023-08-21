package com.example.postgamers.Services;

import com.example.postgamers.Model.Post;
import com.example.postgamers.Model.PostComment;
import com.example.postgamers.Model.RestPostComment;
import com.example.postgamers.Model.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class PostCommentService {


    private Firestore db = FirestoreClient.getFirestore();

    public ArrayList<PostComment> getComments(String postId) throws ExecutionException, InterruptedException {


        UserService userService = new UserService();
        PostService postService = new PostService();

        DocumentReference postDoc = db.collection("Post").document(postId);

        Query query = db.collection("PostComment")
                .whereEqualTo("postId", postDoc);

        ApiFuture<QuerySnapshot> future = query.get();
        List<QueryDocumentSnapshot> documents = future.get().getDocuments();

        ArrayList<PostComment> comments = documents.size() > 0 ? new ArrayList<>() : null;
        for(QueryDocumentSnapshot doc : documents)
        {
            User user = userService.getUser((DocumentReference) doc.get("authorId"));
            Post post = postService.getPost(postDoc);

            comments.add(new PostComment(doc.getId(),doc.getString("content"),
                    doc.getString("title"), doc.getBoolean("published"),
                    doc.getTimestamp("createdAt"), doc.getTimestamp("publishedAt"),
                    user, post));
        }

        return comments;
    }

    public String createComment(RestPostComment comment) throws ExecutionException, InterruptedException {
        String commentId = null;

        ApiFuture<DocumentReference> future = db.collection("PostComment").add(comment);
        DocumentReference postRef = future.get();
        commentId = postRef.getId();

        return commentId;
    }

    public void deleteComment(String commentId){
        DocumentReference commentDoc = db.collection("PostComment").document(commentId);
        commentDoc.delete();
    }
}