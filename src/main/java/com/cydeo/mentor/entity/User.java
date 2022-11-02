package com.cydeo.mentor.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="users")
public class User extends BaseEntity{

    private String firstname;
    private String lastname;
    private String password;
    private String email;

    @ManyToOne
    @JoinColumn(name="role_id")
    private Role role;



}
