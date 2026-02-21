package com.TaskForge.TaskForge_Backend.Entity;

import com.TaskForge.TaskForge_Backend.Entity.Enum.AuthProviderEnum;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    private String name;

    private String password;

    @Enumerated(EnumType.STRING)
    private AuthProviderEnum provider;

    private String providerId;

}