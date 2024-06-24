package com.studentschedulleapp.androidclient.domain.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    private long id;
    private long groupId;
    private long userId;
    private List<MemberRole> roles;
}
