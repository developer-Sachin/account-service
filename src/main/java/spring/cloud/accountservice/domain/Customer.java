package spring.cloud.accountservice.domain;

import javax.persistence.*;
import java.util.Date;

//@Entity
//@Table(name="CUSTOMER")
public class Customer {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name="CUSTOMER_ID")
    private int customerId;

    //@Column(name="CUSTOMER_NAME")
    private String customerName;

    //@Column(name="EMAIL_ID")
    private String emailId;

    //@Column(name="MOBILE")
    private String mobileNumber;

    //@Column(name="ADDRESS_ID")
    //@OneToMany
    private Address address;

    //@Temporal(value = TemporalType.DATE)
    //@Column(name="REGISTRATION_DATE")
    private Date registrationDate;

    //@Enumerated
    //@Column(name = "MEMBERSHIP")
    private Membership membership;

    //@OneToMany
    //@Column(name="PAYMENT_DETAILS_ID")
    private CustomerPaymentDetails paymentDetails;

    //@Column(name="MODFIIED_BY")
    private String modifiedBy;

    //@Column(name="VERIFIED_BY")
    private String verifiedBy;

    //@Column(name="VERIFICATION_DATE")
    private Date verificationDate;

    //@Column(name="Is_USER_ACTIVE")
    private boolean userActive;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public CustomerPaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(CustomerPaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getVerifiedBy() {
        return verifiedBy;
    }

    public void setVerifiedBy(String verifiedBy) {
        this.verifiedBy = verifiedBy;
    }

    public Date getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(Date verificationDate) {
        this.verificationDate = verificationDate;
    }

    public boolean isUserActive() {
        return userActive;
    }

    public void setUserActive(boolean userActive) {
        this.userActive = userActive;
    }
}
