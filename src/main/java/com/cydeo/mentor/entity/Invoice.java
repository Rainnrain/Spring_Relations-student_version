package com.cydeo.mentor.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@Getter
@Setter
@Entity
@NoArgsConstructor
public class Invoice extends BaseEntity{

    private String invoiceNumber;
    private String invoiceType;


   // @JoinColumn(name="invoice_date")
    private LocalDate invoiceDate;

    @JoinColumn(name="client_id")
    @ManyToOne
    private Client client;


}
