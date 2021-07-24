package lections.lesson11.json.id;

import com.google.gson.annotations.SerializedName;

public class Id {

    private String firstName;
    private Passport passport;

    @SerializedName("address")
    private Address liveAddress;

    //TODO: Уточнить структуру
    private Object registration;

    public Id(String firstName, Passport passport, Address liveAddress, Object registration) {
        this.firstName = firstName;
        this.passport = passport;
        this.liveAddress = liveAddress;
        this.registration = registration;
    }

    public String getFirstName() {
        return firstName;
    }

    public Passport getPassport() {
        return passport;
    }

    public Address getLiveAddress() {
        return liveAddress;
    }

    public Object getRegistration() {
        return registration;
    }
}
