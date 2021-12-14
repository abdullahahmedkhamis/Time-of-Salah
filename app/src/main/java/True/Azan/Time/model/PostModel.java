package True.Azan.Time.model;

public class PostModel {

    private int    code;
    private String status;
    private int    results;
    private int    datetime;
    private int    times;
    private int    latitude;
    private int    longitude;
    private String Mecca;
    private String country;
    private String SaudiArabia;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    public int getDatetime() {
        return datetime;
    }

    public void setDatetime(int datetime) {
        this.datetime = datetime;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public String getMecca() {
        return Mecca;
    }

    public void setMecca(String mecca) {
        Mecca = mecca;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSaudiArabia() {
        return SaudiArabia;
    }

    public void setSaudiArabia(String saudiArabia) {
        SaudiArabia = saudiArabia;
    }
}
