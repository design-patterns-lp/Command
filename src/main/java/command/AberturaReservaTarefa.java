package command;

public class AberturaReservaTarefa implements Tarefa {

    private Reserva reserva;

    public AberturaReservaTarefa(Reserva reserva) {
        this.reserva = reserva;
    }

    public void executar() {
        this.reserva.abrirReserva();
    }

    public void cancelar() {
        this.reserva.fecharReserva();
    }
}
