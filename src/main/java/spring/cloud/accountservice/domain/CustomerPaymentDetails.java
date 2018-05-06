package spring.cloud.accountservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Date;

//@Entity
public class CustomerPaymentDetails {

    //@Id
    //@GeneratedValue
    private int paymentDetailsId;
    private String bankName;
    private int cardNumber;
    private Date cardValidity;
    private int cvvCode;
    //@ManyToMany
    private Customer customer;

    public int getPaymentDetailsId() {
        return paymentDetailsId;
    }

    public void setPaymentDetailsId(int paymentDetailsId) {
        this.paymentDetailsId = paymentDetailsId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getCardValidity() {
        return cardValidity;
    }

    public void setCardValidity(Date cardValidity) {
        this.cardValidity = cardValidity;
    }

    public int getCvvCode() {
        return cvvCode;
    }

    public void setCvvCode(int cvvCode) {
        this.cvvCode = cvvCode;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
