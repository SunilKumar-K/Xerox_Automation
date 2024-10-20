package com.xerox_app.application.model;

public class PrintingOptions {
    private boolean color;
    private int numberOfCopies;
    private String paperSize; // e.g., "A4" , "A3" , "Letter"
    private boolean doubleSided;
    private String orientation; // "Portrait" or "Landscape"
    private int startPage;
    private int endPage;
    private String paperType; // e.g., "Standard", "Glossy", "Cardstock"
    private String bindingOption; // e.g., "None", "Staple", "Spiral"
    private int pagesPerSheet;

    public PrintingOptions() {
        // Set default values
        this.color = false;
        this.numberOfCopies = 1;
        this.paperSize = "A4";
        this.doubleSided = false;
        this.orientation = "Portrait";
        this.startPage = 1;
        this.endPage = Integer.MAX_VALUE; // Represent "all pages"
        this.paperType = "Standard";
        this.bindingOption = "None";
        this.pagesPerSheet = 1;
    }

    // Getters and setters

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public String getPaperSize() {
        return paperSize;
    }

    public void setPaperSize(String paperSize) {
        this.paperSize = paperSize;
    }

    public boolean isDoubleSided() {
        return doubleSided;
    }

    public void setDoubleSided(boolean doubleSided) {
        this.doubleSided = doubleSided;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public int getStartPage() {
        return startPage;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

    public int getEndPage() {
        return endPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public String getBindingOption() {
        return bindingOption;
    }

    public void setBindingOption(String bindingOption) {
        this.bindingOption = bindingOption;
    }

    public int getPagesPerSheet() {
        return pagesPerSheet;
    }

    public void setPagesPerSheet(int pagesPerSheet) {
        this.pagesPerSheet = pagesPerSheet;
    }

    public int getNumberOfPages() {
        return endPage - startPage + 1;
    }
}