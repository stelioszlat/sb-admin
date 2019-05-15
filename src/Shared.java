import java.util.Date;

public class Shared extends Bill {

    private double electricalPowerValue;
    private double waterValue;
    private double cleankepperValue;
    private double cleankepperGiftValue;
    private double miscValue;

    public Shared(double electricalPowerValue,double waterValue, double cleankepperValue,double cleankepperGiftValue, double miscValue){
        this.electricalPowerValue = electricalPowerValue;
        this.waterValue = waterValue;
        this.cleankepperValue = cleankepperValue;
        this.cleankepperGiftValue= cleankepperGiftValue;
        this.miscValue = miscValue;
    }

    public Shared(int buildingId, String apartmentId, double electricalPowerValue, double waterValue, double cleankepperValue, double cleankepperGiftValue, double miscValue) {
        super(buildingId, apartmentId);
        this.electricalPowerValue = electricalPowerValue;
        this.waterValue = waterValue;
        this.cleankepperValue = cleankepperValue;
        this.cleankepperGiftValue = cleankepperGiftValue;
        this.miscValue = miscValue;
    }

    public Shared(Date releaseDate, Date addedDate, Date expiresDate, int buildingId, String apartmentId, double electricalPowerValue, double waterValue, double cleankepperValue, double cleankepperGiftValue, double miscValue) {
        super(releaseDate, addedDate, expiresDate, buildingId, apartmentId);
        this.electricalPowerValue = electricalPowerValue;
        this.waterValue = waterValue;
        this.cleankepperValue = cleankepperValue;
        this.cleankepperGiftValue = cleankepperGiftValue;
        this.miscValue = miscValue;
    }

    public double getElectricalPowerValue() {
        return electricalPowerValue;
    }

    public double getWaterValue() {
        return waterValue;
    }

    public double getCleankepperValue() {
        return cleankepperValue;
    }

    public double getCleankepperGiftValue() {
        return cleankepperGiftValue;
    }

    public double getMiscValue() {
        return miscValue;
    }

    @Override
    public String toString() {
        return "Shared{" +
                "electricalPowerValue=" + electricalPowerValue +
                ", waterValue=" + waterValue +
                ", cleankepperValue=" + cleankepperValue +
                ", cleankepperGiftValue=" + cleankepperGiftValue +
                ", miscValue=" + miscValue +
                '}';
    }
}
