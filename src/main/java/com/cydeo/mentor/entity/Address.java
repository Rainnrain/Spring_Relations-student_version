package com.cydeo.mentor.entity;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@Entity
@NoArgsConstructor
public class Address extends BaseEntity {


    private String description;
    private String zipCode;

    @ManyToOne
    @JoinColumn(name="state_id")
    private State state;

}
