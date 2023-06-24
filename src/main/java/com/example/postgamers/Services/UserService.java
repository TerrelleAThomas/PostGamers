package com.example.postgamers.Services;

import com.example.postgamers.Model.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.Timestamp;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ExecutionException;

@Service
public class UserService {

    private Firestore db = FirestoreClient.getFirestore();

    //used to log information in the console while testing
    private final Log logger = LogFactory.getLog(this.getClass());


    public ArrayList<User> getUsers() throws ExecutionException, InterruptedException {


        Query query = db.collection("User");
        ApiFuture<QuerySnapshot> future = query.get();
        List<QueryDocumentSnapshot> documents = future.get().getDocuments();

        ArrayList<User> users = documents.size() > 0 ? new ArrayList<>() : null;
        for(QueryDocumentSnapshot doc : documents)
        {
            users.add(doc.toObject(User.class));
        }

        return users;
    }

    public User getUser(String userId) throws ExecutionException, InterruptedException {
        User user = null;

        DocumentReference doc = db.collection("User").document(userId);
        ApiFuture<DocumentSnapshot> future = doc.get();
        user = future.get().toObject(User.class);

        return user;
    }
    public String createUser(User user) throws ExecutionException, InterruptedException {
        String userId = null;
        user.setRegisteredAt(Timestamp.now());

        ApiFuture<DocumentReference> future = db.collection("User").add(user);
        DocumentReference userRef = future.get();
        userId = userRef.getId();

        return userId;
    }

    public void updateUser(String id, Map<String, String> updateValues){

        String [] allowed = {"firstName", "lastName", "intro", "middleName", "mobile", "profile"};
        List<String> list = Arrays.asList(allowed);
        Map<String, Object> formattedValues = new HashMap<>();

        for(Map.Entry<String, String> entry : updateValues.entrySet()) {
            String key = entry.getKey();
            if(list.contains(key))
                formattedValues.put(key, entry.getValue());
        }

        DocumentReference userDoc = db.collection("User").document(id);
        userDoc.update(formattedValues);
    }

    public User getUser(DocumentReference userRef) throws ExecutionException, InterruptedException {
        ApiFuture<DocumentSnapshot> userQuery = userRef.get();
        DocumentSnapshot userDoc = userQuery.get();
        return userDoc.toObject(User.class);
    }

}
