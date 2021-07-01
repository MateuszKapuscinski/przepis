package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.procedure.spi.ParameterRegistrationImplementor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Skladnik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nazwa;

    @OneToMany(mappedBy = "poleSkladnika", fetch = FetchType.EAGER)
    private Set<IloscSkladnika> iloscSkladnika;

    @Enumerated(value = EnumType.STRING)
    private RodzajeSkladnikow rodzajeSkladnikow;
}
