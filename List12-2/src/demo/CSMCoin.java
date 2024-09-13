package demo;

import java.time.LocalDate;
import java.util.Date;

public class CSMCoin {
    private String code;
    private String userSender;
    private String userReceiver;
    private double value;
    private int quantity;
    private Date date;

    public CSMCoin(String code, String userSender, String userReceiver, double value, int quantity, Date date) {
        this.code = code;
        this.userSender = userSender;
        this.userReceiver = userReceiver;
        this.value = value;
        this.quantity = quantity;
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUserSender() {
        return userSender;
    }

    public void setUserSender(String userSender) {
        this.userSender = userSender;
    }

    public String getUserReceiver() {
        return userReceiver;
    }

    public void setUserReceiver(String userReceiver) {
        this.userReceiver = userReceiver;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
