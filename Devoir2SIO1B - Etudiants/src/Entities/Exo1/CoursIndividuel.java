package Entities.Exo1;

public class CoursIndividuel extends Cours
{
    private String instrument;

    public CoursIndividuel(int idCours, double prixCours, String unInstrument) {
        super(idCours, prixCours);
        instrument = unInstrument;
    }

    public String getInstrument() {
        return instrument;
    }
}
