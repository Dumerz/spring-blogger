package io.dumerz.blogger.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.Instant;

@Entity
@Table
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotBlank
    private String username;

    @Column
    @NotBlank
    private String password;

    @Column(unique = true)
    @NotBlank
    @Email
    private String email;

    @Column
    private Instant createdOn;

    @Column
    private Instant updateOn;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Instant getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }
    public Instant getUpdateOn() {
        return this.updateOn;
    }

    public void setUpdateOn(Instant updateOn) {
        this.updateOn = updateOn;
    }
}