package com.studentschedulleapp.androidclient.domain.models.tokens;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTokens {
    private Token accessToken;
    private Token refreshToken;
}
