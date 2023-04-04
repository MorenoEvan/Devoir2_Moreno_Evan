package Entities.Exo1;

public class Instrument {
    private int idInstrument;
    private String nomInstrument;

    public Instrument(int idInstrument, String nomInstrument) {
        this.idInstrument = idInstrument;
        this.nomInstrument = nomInstrument;
    }

    public int getIdInstrument() {
        return idInstrument;
    }

    public String getNomInstrument() {
        return nomInstrument;
    }
}