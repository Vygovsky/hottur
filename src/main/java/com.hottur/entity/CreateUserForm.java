package com.hottur.entity;

import com.hottur.enumRole.Role;

import javax.validation.constraints.NotNull;

public class CreateUserForm {
    @NotNull
    private String userName = "";
    @NotNull
    private String email = "";
    @NotNull
    private String password = "";
    @NotNull
    private boolean isActrive = false;
    @NotNull
    private Role role = Role.USER;
}
