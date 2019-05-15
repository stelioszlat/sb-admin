import java.util.Date;

public class Elevator extends Bill{

    private double preservationValue;
    private double preservationTechsValue;
    private double replacementsValue;

    public Elevator(double preservationValue, double preservationTechsValue, double replacementsValue){
        this.preservationValue = preservationValue;
        this.preservationTechsValue = preservationTechsValue;
        this.replacementsValue = replacementsValue;
    }

    public Elevator(int buildingId, String apartmentId, double preservationValue, double preservationTechsValue, double replacementsValue) {
        super(buildingId, apartmentId);
        this.preservationValue = preservationValue;
        this.preservationTechsValue = preservationTechsValue;
        this.replacementsValue = replacementsValue;
    }

    public Elevator(Date releaseDate, Date addedDate, Date expiresDate, int buildingId, String apartmentId, double preservationValue, double preservationTechsValue, double replacementsValue) {
        super(releaseDate, addedDate, expiresDate, buildingId, apartmentId);
        this.preservationValue = preservationValue;
        this.preservationTechsValue = preservationTechsValue;
        this.replacementsValue = replacementsValue;
    }

    public double getPreservationValue() {
        return preservationValue;
    }

    public double getPreservationTechsValue() {
        return preservationTechsValue;
    }

    public double getReplacementsValue() {
        return replacementsValue;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "preservationValue=" + preservationValue +
                ", preservationTechsValue=" + preservationTechsValue +
                ", replacementsValue=" + replacementsValue +
                '}';
    }
}
