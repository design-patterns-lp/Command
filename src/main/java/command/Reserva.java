package command;

public class Reserva {

    private int Id;
    private String dataCheckIn;
    private String dataCheckOut;
    private double preco;

    private String statusReserva;

    public Reserva(int id, String dataCheckIn, String dataCheckOut, double preco) {
        Id = id;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.preco = preco;
    }

    public String getStatusReserva(){
        return statusReserva;
    }

    public void abrirReserva(){
        this.statusReserva = "Reserva aberta";
    }

    public void fecharReserva(){
        this.statusReserva = "Reserva fechada";
    }
}
