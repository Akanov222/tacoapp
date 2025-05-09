package com.example.springinaction.tacoapp;

import org.hibernate.validator.constraints.CreditCardNumber;
import jakarta.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "taco_orders")
public class TacoOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Delivery name is required")
    private String deliveryName;
    @NotBlank(message = "Delivery street is required")
    private String deliveryStreet;
    @NotBlank(message = "Delivery city is required")
    private String deliveryCity;
    @NotBlank(message = "State is required")
    private String deliveryState;
    @NotBlank(message = "Zip is required")
    private String deliveryZip;
    @CreditCardNumber(message = "Invalid credit card number")
    private String ccNumber;
    @Pattern(regexp = "^(0[1-9]|1[0-2])(/)([2-9]|[0-9])$",
            message = "Must be formatted MM/YY")
    private String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "Invalid CVV")
    private String ccCVV;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }

    public @NotBlank(message = "Delivery name is required") String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(@NotBlank(message = "Delivery name is required") String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public @NotBlank(message = "Delivery street is required") String getDeliveryStreet() {
        return deliveryStreet;
    }

    public void setDeliveryStreet(@NotBlank(message = "Delivery street is required") String deliveryStreet) {
        this.deliveryStreet = deliveryStreet;
    }

    public @NotBlank(message = "Delivery city is required") String getDeliveryCity() {
        return deliveryCity;
    }

    public void setDeliveryCity(@NotBlank(message = "Delivery city is required") String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    public @NotBlank(message = "State is required") String getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(@NotBlank(message = "State is required") String deliveryState) {
        this.deliveryState = deliveryState;
    }

    public @NotBlank(message = "Zip is required") String getDeliveryZip() {
        return deliveryZip;
    }

    public void setDeliveryZip(@NotBlank(message = "Zip is required") String deliveryZip) {
        this.deliveryZip = deliveryZip;
    }

    public @CreditCardNumber(message = "Invalid credit card number") String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(@CreditCardNumber(message = "Invalid credit card number") String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public @Pattern(regexp = "^(0[1-9]|1[0-2])(/)([2-9]|[0-9])$",
            message = "Must be formatted MM/YY") String getCcExpiration() {
        return ccExpiration;
    }

    public void setCcExpiration(@Pattern(regexp = "^(0[1-9]|1[0-2])(/)([2-9]|[0-9])$",
            message = "Must be formatted MM/YY") String ccExpiration) {
        this.ccExpiration = ccExpiration;
    }

    public @Digits(integer = 3, fraction = 0, message = "Invalid CVV") String getCcCVV() {
        return ccCVV;
    }

    public void setCcCVV(@Digits(integer = 3, fraction = 0, message = "Invalid CVV") String ccCVV) {
        this.ccCVV = ccCVV;
    }

    public List<Taco> getTacos() {
        return tacos;
    }

    public void setTacos(List<Taco> tacos) {
        this.tacos = tacos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TacoOrder tacoOrder = (TacoOrder) o;
        return Objects.equals(id, tacoOrder.id) && Objects.equals(deliveryName, tacoOrder.deliveryName) && Objects.equals(deliveryStreet, tacoOrder.deliveryStreet) && Objects.equals(deliveryCity, tacoOrder.deliveryCity) && Objects.equals(deliveryState, tacoOrder.deliveryState) && Objects.equals(deliveryZip, tacoOrder.deliveryZip) && Objects.equals(ccNumber, tacoOrder.ccNumber) && Objects.equals(ccExpiration, tacoOrder.ccExpiration) && Objects.equals(ccCVV, tacoOrder.ccCVV) && Objects.equals(tacos, tacoOrder.tacos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deliveryName, deliveryStreet, deliveryCity, deliveryState, deliveryZip, ccNumber, ccExpiration, ccCVV, tacos);
    }

    @Override
    public String toString() {
        return "TacoOrder{" +
                "id=" + id +
                ", deliveryName='" + deliveryName + '\'' +
                ", deliveryStreet='" + deliveryStreet + '\'' +
                ", deliveryCity='" + deliveryCity + '\'' +
                ", deliveryState='" + deliveryState + '\'' +
                ", deliveryZip='" + deliveryZip + '\'' +
                ", ccNumber='" + ccNumber + '\'' +
                ", ccExpiration='" + ccExpiration + '\'' +
                ", ccCVV='" + ccCVV + '\'' +
                ", tacos=" + tacos +
                '}';
    }
}
