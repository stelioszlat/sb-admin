import java.util.Date;

public class Bill {

    private char type;
    private Date releaseDate;
    private Date addedDate;             // date added in the system
    private Date expiresDate;
    private int buildingId;
    private String apartmentId;

    public Bill(){}

    public Bill(int buildingId, String apartmentId){
        this.buildingId = buildingId;
        this.apartmentId = apartmentId;
    }

    public Bill(Date releaseDate, Date addedDate, Date expiresDate,
                int buildingId, String apartmentId){
        this(buildingId, apartmentId);
        this.releaseDate = releaseDate;
        this.addedDate = addedDate;
        this.expiresDate = expiresDate;
    }

    public char getType() {
        return type;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public Date getExpiresDate() {
        return expiresDate;
    }

    public int getBuildingId() {
        return buildingId;
    }

    public String getApartmentId() {
        return apartmentId;
    }
}
