package com.studentschedulleapp.androidclient.domain.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private boolean banned;
    private String avaUrl;
    private List<Role> roles;

}
