package lections.lesson4;

public class Passport {

    private String series;
    private String number;
    private int code;

    public Passport(String series, String number, int code) {
        this.series = series;
        this.number = number;
        this.code = code;
    }

    public Passport() {
    }

    // Builder (строитель):
    public Passport setSeries(String series) {
        this.series = series;
        return this;
    }

    public Passport setNumber(String number) {
        this.number = number;
        return this;
    }

    public Passport setCode(int code) {
        this.code = code;
        return this;
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }

    public int getCode() {
        return code;
    }

}
