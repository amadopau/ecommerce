package com.ecommerceDev.model;
import java.util.Date;

public class Order {
    private Integer id;
    private String number;
    private Date creationDate;
    private Date receivedDate;
    private double total;

    public Order () {}

    public Order(Integer id, String number, Date creationDate, Date receivedDate, double total) {
        this.id = id;
        this.number = number;
        this.creationDate = creationDate;
        this.receivedDate = receivedDate;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public double getTotal() {
        return total;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", creationDate=" + creationDate +
                ", receivedDate=" + receivedDate +
                ", total=" + total +
                '}';
    }
}
