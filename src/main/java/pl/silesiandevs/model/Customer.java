package pl.silesiandevs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;


    private String phoneNumber;
    private String streetName;
    private String houseNumber;
    private String flatNumber;
    private String cityName;
    private String comment;
    private String payment;

    private LocalDateTime lastOrderDateTime = LocalDateTime.now();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public LocalDateTime getLastOrderDateTime() {
        return lastOrderDateTime;
    }

    public void setLastOrderDateTime(LocalDateTime lastOrderDateTime) {
        this.lastOrderDateTime = lastOrderDateTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("id=").append(id);
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", streetName='").append(streetName).append('\'');
        sb.append(", houseNumber='").append(houseNumber).append('\'');
        sb.append(", flatNumber='").append(flatNumber).append('\'');
        sb.append(", cityName='").append(cityName).append('\'');
        sb.append(", lastOrderDateTime=").append(lastOrderDateTime);
        sb.append('}');
        return sb.toString();
    }
}
