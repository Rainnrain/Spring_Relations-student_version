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
public class Client extends BaseEntity {

    private String clientName;
    private String phone;
    private String email;

    @JoinColumn(name = "address_id")
    @ManyToOne
    private Address address;


}
