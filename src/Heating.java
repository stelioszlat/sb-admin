import java.util.Date;

public class Heating extends Bill{
    private double heatingValue;
    private double preservationValue;

    public Heating(double heatingValue, double preservationValue){
        this.heatingValue = heatingValue;
        this.preservationValue = preservationValue;
    }

    public Heating(int buildingId, String apartmentId, double heatingValue, double preservationValue) {
        super(buildingId, apartmentId);
        this.heatingValue = heatingValue;
        this.preservationValue = preservationValue;
    }

    public Heating(Date releaseDate, Date addedDate, Date expiresDate,
                   int buildingId, String apartmentId,
                   double heatingValue, double preservationValue){
        super(releaseDate, addedDate, expiresDate, buildingId, apartmentId);
        this.heatingValue = heatingValue;
        this.preservationValue = preservationValue;
    }

    public double getHeatingValue() {
        return heatingValue;
    }

    public double getPreservationValue() {
        return preservationValue;
    }

    @Override
    public String toString() {
        return String.format("Heating value: %f\nEquipment preservation value: %f\n",
                this.heatingValue, this.preservationValue);
    }
}
