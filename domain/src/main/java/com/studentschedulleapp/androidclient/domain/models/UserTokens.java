package com.studentschedulleapp.androidclient.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTokens {
    private Long userId;
    private String accessToken;
    private String refreshToken;
}
