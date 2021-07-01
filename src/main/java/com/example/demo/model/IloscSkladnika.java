package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class IloscSkladnika {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @ToString.Exclude
    @JsonBackReference
    private Skladnik skladniks;

    @ManyToOne
    @ToString.Exclude
    @JsonBackReference
    private Przepis przepis;

    private Integer ilosc;

    private String iloscWKg;

    private String iloscWGramach;

    private String iloscSztuk;

    private String IloscLitrow;

    private String iloscMl;

}
