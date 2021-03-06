package com.furnitureapp.entity.distribution;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity (name = "delivery")
@IdClass(EmployeeDelivery.class)
public class Delivery implements Serializable {

    @Id
    private Integer deliveryCode;
    private Integer saleCode;
    private Integer employeeCode;
    private String deliveryAddress;
    private LocalDateTime dateTimeReceived;
    private LocalDateTime dateTimeSet;
    private int trackingNum;
    private String deliveryStatus;

    protected Delivery(){}

    private Delivery(DeliveryBuilder deliveryBuilder){
        this.deliveryCode = deliveryBuilder.deliveryCode;
        this.employeeCode = deliveryBuilder.employeeCode;
        this.saleCode = deliveryBuilder.saleCode;
        this.deliveryAddress = deliveryBuilder.deliveryAddress;
        this.dateTimeReceived = deliveryBuilder.dateTimeReceived;
        this.dateTimeSet = deliveryBuilder.dateTimeSet;
        this.trackingNum = deliveryBuilder.trackingNum;
        this.deliveryStatus = deliveryBuilder.deliveryStatus;
    }

    public Integer getDeliveryCode() {

        return deliveryCode;
    }

    public Integer getSaleCode() {
        return saleCode;
    }

    public Integer getEmployeeCode() {
        return employeeCode;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public LocalDateTime getDateTimeReceived() {
        return dateTimeReceived;
    }

    public LocalDateTime getDateTimeSet() {
        return dateTimeSet;
    }

    public int getTrackingNum() {
        return trackingNum;
    }

    public String isDeliveryStatus() {
        return  deliveryStatus;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "deliveryCode=" + deliveryCode +
                ", saleCode=" + saleCode +
                ", employeeCode=" + employeeCode +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", dateTimeReceived=" + dateTimeReceived +
                ", dateTimeSet=" + dateTimeSet +
                ", trackingNum=" + trackingNum +
                ", deliveryStatus='" + deliveryStatus + '\'' +
                '}';
    }

    public static class DeliveryBuilder{
        private Integer deliveryCode;
        private Integer saleCode;
        private Integer employeeCode;
        private String deliveryAddress;
        private LocalDateTime dateTimeReceived;
        private LocalDateTime dateTimeSet;
        private int trackingNum;
        private String deliveryStatus;

        public DeliveryBuilder(){}

        public DeliveryBuilder setDeliveryCode(Integer deliveryCode) {
            this.deliveryCode = deliveryCode;
            return this;
        }

        public DeliveryBuilder setSaleCode(Integer saleCode) {
            this.saleCode = saleCode;
            return this;
        }

        public DeliveryBuilder setEmployeeCode(Integer employeeCode) {
            this.employeeCode = employeeCode;
            return this;
        }

        public DeliveryBuilder setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        public DeliveryBuilder setDateTimeReceived(LocalDateTime dateTimeReceived) {
            this.dateTimeReceived = dateTimeReceived;
            return this;
        }

        public DeliveryBuilder setDateTimeSet(LocalDateTime dateTimeSet) {
            this.dateTimeSet = dateTimeSet;
            return this;
        }

        public DeliveryBuilder setTrackingNum(int trackingNum) {
            this.trackingNum = trackingNum;
            return this;
        }

        public DeliveryBuilder setDeliveryStatus(String deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
            return this;
        }

        public DeliveryBuilder copy(Delivery delivery){
            this.deliveryCode = delivery.deliveryCode;
            this.saleCode = delivery.saleCode;
            this.employeeCode = delivery.employeeCode;
            this.dateTimeReceived = delivery.dateTimeReceived;
            this.dateTimeSet = delivery.dateTimeSet;
            this.trackingNum = delivery.trackingNum;
            this.deliveryAddress = delivery.deliveryAddress;
            this.deliveryStatus = delivery.deliveryStatus;
            return this;
        }

        public Delivery build(){
            return new Delivery(this);
        }

    }
}
