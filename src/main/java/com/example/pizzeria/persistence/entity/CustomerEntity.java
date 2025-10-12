package com.example.pizzeria.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "customer")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerEntity extends AuditableEntity {

    @Id
    @Column(name = "id_customer", nullable = false, length = 15, unique = true)
    private String idCustomer;

    @Column(nullable = false, length = 60)
    private String name;

    @Column(length = 100)
    private String address;

    @Column(nullable = false, length = 50, unique = true)
    private String email;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;
}
