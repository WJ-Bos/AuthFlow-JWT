package com.wjbos.authflow.features.authentication.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AuthenticationUser {

    private Long id;
    private String email;
    private String password;

    public AuthenticationUser(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

}
