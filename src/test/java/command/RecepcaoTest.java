package command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecepcaoTest {

    Recepcao recepcao;
    Reserva reserva;

    @BeforeEach
    void setUp() {
        recepcao = new Recepcao();
        reserva = new Reserva (001, "01/01/2023", null,99.9);
    }

    @Test
    void deveAbrirReserva() {
        Tarefa aberturaReserva = new AberturaReservaTarefa(reserva);
        recepcao.executarTarefa(aberturaReserva);

        assertEquals("Reserva aberta", reserva.getStatusReserva());
    }

    @Test
    void deveFecharReserva() {
        Tarefa fechamentoReserva = new FechamentoReservaTarefa(reserva);
        recepcao.executarTarefa(fechamentoReserva);

        assertEquals("Reserva fechada", reserva.getStatusReserva());
    }

    @Test
    void deveCancelarFechamentoReserva() {
        Tarefa aberturaReserva = new AberturaReservaTarefa(reserva);
        Tarefa fechamentoReserva = new FechamentoReservaTarefa(reserva);

        recepcao.executarTarefa(aberturaReserva);
        recepcao.executarTarefa(fechamentoReserva);

        recepcao.cancelarUltimaTarefa();

        assertEquals("Reserva aberta", reserva.getStatusReserva());
    }

}