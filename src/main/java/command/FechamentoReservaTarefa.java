package command;

public class FechamentoReservaTarefa implements Tarefa {

    private Reserva reserva;

    public FechamentoReservaTarefa(Reserva reserva) {
        this.reserva = reserva;
    }

    public void executar() {
        this.reserva.fecharReserva();
    }

    public void cancelar() {
        this.reserva.abrirReserva();
    }
}
