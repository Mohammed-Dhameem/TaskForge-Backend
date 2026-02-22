package com.taskforge.backend.entity;

import com.taskforge.backend.entity.Enum.AuthProviderEnum;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class User {

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