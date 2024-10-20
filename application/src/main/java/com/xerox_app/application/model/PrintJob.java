package com.xerox_app.application.model;


import java.time.LocalDateTime;
import java.util.UUID;

public class PrintJob {
    private String printJobId;
    private String orderId;
    private String fileName;
    private byte[] fileContent;
    private PrintingOptions printingOptions;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private double totalCost;

    // Constructor
    public PrintJob() {
        this.printJobId = UUID.randomUUID().toString();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    // Getters and setters
    public String getPrintJobId() {
        return printJobId;
    }

    public void setPrintJobId(String printJobId) {
        this.printJobId = printJobId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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

    public PrintingOptions getPrintingOptions() {
        return printingOptions;
    }

    public void setPrintingOptions(PrintingOptions printingOptions) {
        this.printingOptions = printingOptions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        this.updatedAt = LocalDateTime.now();
    }
}

