import java.util.Date;
import java.util.HashMap;

public class CoOwnership extends Bill{

    private HashMap<String, Double> miscValues;

    public CoOwnership(){
        this.miscValues = new HashMap<>();
    }

    public CoOwnership(String description, Double value){
        this.miscValues = new HashMap<>();
        this.miscValues.put(description, value);
    }

    public CoOwnership(int buildingId, String apartmentId, String description, Double value) {
        super(buildingId, apartmentId);
        this.miscValues = new HashMap<>();
        this.miscValues.put(description, value);
    }

    public CoOwnership(Date releaseDate, Date addedDate, Date expiresDate, int buildingId, String apartmentId, HashMap<String, Double> miscValues) {
        super(releaseDate, addedDate, expiresDate, buildingId, apartmentId);
        this.miscValues = miscValues;
    }

    public HashMap<String, Double> getMiscValues() {
        return miscValues;
    }

    public void setMiscValues(String description, Double value) {
        this.miscValues.put(description, value);
    }

    @Override
    public String toString() {
        String misc="";

        for(HashMap.Entry<String, Double> value: miscValues.entrySet()){
            misc.concat(String.format("%s: %f\n", value.getKey(),value.getValue()));
        }

        return misc;
    }
}
