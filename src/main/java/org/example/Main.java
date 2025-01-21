package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EventoDAO eventoDAO = new EventoDAO();

        Evento nuovoEvento = new Evento("Concerto",
                LocalDate.of(2025,2,28),
                "Speriamo sia un bel concerto!",
                Evento.TipoEvento.PUBBLICO,
                500);

        eventoDAO.save(nuovoEvento);

        eventoDAO.close();
    }
}
