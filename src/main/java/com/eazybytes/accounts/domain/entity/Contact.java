package com.eazybytes.accounts.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.hibernate.annotations.NaturalId;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String type;

    @Column(unique = true)
    @NaturalId(mutable = true)
    private String email;

    @Pattern(regexp = "^\\(\\d{2}\\) \\d{5}-\\d{4}$", message = "Telefone must be in the format (XX) XXXXX-XXXX")
    private String phone;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
