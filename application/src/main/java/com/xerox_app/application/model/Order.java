package com.xerox_app.application.model;
import java.time.LocalDateTime;
import java.util.UUID;
public class Order {

    private String orderId;
    private String userName;
    private String userEmail;
    private String userMobileNumber;
    private String shopId;
    private String shopName;
    private String shopLocation;
    private String shopContactInfo;
    private String fileName;
    private byte[] fileContent;
    private String customizationDetails;
    private LocalDateTime orderConfirmedDate;
    private LocalDateTime orderSubmittedDate;
    private String orderStatus;
    private String paymentMethod;
    private String paymentReceipt;
    private LocalDateTime expectedDeliveryTime;

    // Constructor
    public Order() {
        this.orderId = UUID.randomUUID().toString();
        this.orderSubmittedDate = LocalDateTime.now();
        this.orderStatus = "Pending";
    }

    // Getters and Setters


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserMobileNumber() {
        return userMobileNumber;
    }

    public void setUserMobileNumber(String userMobileNumber) {
        this.userMobileNumber = userMobileNumber;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopLocation() {
        return shopLocation;
    }

    public void setShopLocation(String shopLocation) {
        this.shopLocation = shopLocation;
    }

    public String getShopContactInfo() {
        return shopContactInfo;
    }

    public void setShopContactInfo(String shopContactInfo) {
        this.shopContactInfo = shopContactInfo;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getFileContent() {
        return fileContent;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

    public String getCustomizationDetails() {
        return customizationDetails;
    }

    public void setCustomizationDetails(String customizationDetails) {
        this.customizationDetails = customizationDetails;
    }

    public LocalDateTime getOrderConfirmedDate() {
        return orderConfirmedDate;
    }

    public void setOrderConfirmedDate(LocalDateTime orderConfirmedDate) {
        this.orderConfirmedDate = orderConfirmedDate;
    }

    public LocalDateTime getOrderSubmittedDate() {
        return orderSubmittedDate;
    }

    public void setOrderSubmittedDate(LocalDateTime orderSubmittedDate) {
        this.orderSubmittedDate = orderSubmittedDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentReceipt() {
        return paymentReceipt;
    }

    public void setPaymentReceipt(String paymentReceipt) {
        this.paymentReceipt = paymentReceipt;
    }

    public LocalDateTime getExpectedDeliveryTime() {
        return expectedDeliveryTime;
    }

    public void setExpectedDeliveryTime(LocalDateTime expectedDeliveryTime) {
        this.expectedDeliveryTime = expectedDeliveryTime;
    }
}

