package grp.covid.covidlocation.model;

public class Coordinate {

    private String region;
    private double latitude;
    private double longitude;
    private String name;


    public Coordinate(String region, double latitude, double longitude, String name) {
        this.region = region;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinate() {
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "region='" + region + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", name='" + name + '\'' +
                '}';
    }
}
