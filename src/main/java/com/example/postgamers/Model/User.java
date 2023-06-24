package com.example.postgamers.Model;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.annotation.DocumentId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @DocumentId

    private @Nullable String userId;
    private @Nullable String uid;
    private String gamername;
    private String email;
    private String firstName;
    private String lastName;
    private String intro;
    private String profile;
    private Timestamp registeredAt;
    private @Nullable Timestamp lastLogin;

}
