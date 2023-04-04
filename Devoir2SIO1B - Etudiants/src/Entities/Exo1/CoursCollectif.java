package Entities.Exo1;

public class CoursCollectif extends Cours implements ICalcul
{
    private String nomCoursC;
    private int ageCoursC;
    private int placeCoursC;

    public CoursCollectif(int idCours, double prixCours, String unnomCoursC, int unageCoursC, int uneplaceCoursC) {
        super(idCours, prixCours);
        nomCoursC = unnomCoursC;
        ageCoursC = unageCoursC;
        placeCoursC = uneplaceCoursC;
    }

    public String getNomCoursC() {
        return nomCoursC;
    }

    public int getAgeCoursC() {
        return ageCoursC;
    }

    public int getPlaceCoursC() {
        return placeCoursC;
    }



}
