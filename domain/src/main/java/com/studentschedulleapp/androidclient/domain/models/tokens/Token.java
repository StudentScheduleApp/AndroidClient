package com.studentschedulleapp.androidclient.domain.models.tokens;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Token {
    private long userId;
    private TokenType type;
    private String token;
    private long validity;
}
