package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Uzytkownik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imie;
    private String nazwisko;
    private Account login;
    private Account haslo;
    private String email;
    private AccountRole role;

    @OneToMany(mappedBy = "polePrzepisy", fetch = FetchType.EAGER)
    private List<Przepis> listaPrzepisow;

}
