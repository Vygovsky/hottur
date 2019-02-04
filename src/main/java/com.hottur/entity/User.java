package com.hottur.entity;

import com.hottur.enumRole.Role;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_sequence")
    // @SequenceGenerator(name = "tur_sequence", sequenceName = "TUR_SEQ")
    private Long id;

    @NotNull(message = "UserName is mandatory")
    private String userName;

    @NotNull(message = "Email is mandatory")
    private String email;

    @NotNull(message = "Password is mandatory")
    private String password;

    @NotNull(message = "Active is mandatory")
    private boolean isActive;

    @Column(name="role")
    @NotNull(message = "Role is mandatory")
    @MapKeyEnumerated(EnumType.STRING)

    private Role roles;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Role getRoles() {
        return roles;
    }

    public void setRoles(Role roles) {
        this.roles = roles;
    }
}
