package org.example;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity //questa annotazione indica che la classe si comporterà come una entità, quindi ogni oggetto istanziato
// con questa classe rappresenterà una riga della tabella del DB

@Table(name = "evento") //mappa la classe Evento sulla tabella "evento" di postgres
public class Evento {
    @Id
    private Long id;

    @Column(name = "titolo")
    private String titolo;

    @Column(name = "data_evento")
    private LocalDate data_evento;

    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "tipo_evento")
    private String tipo_evento;

    @Column(name = "numero_massimo_partecipanti")
    private int numero_massimo_partecipanti;


}
