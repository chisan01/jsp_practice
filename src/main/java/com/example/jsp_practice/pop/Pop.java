package com.example.jsp_practice.pop;

public class Pop {
    private String location;
    private int totalPop;
    private int malePop;
    private int femalePop;

    @Override
    public String toString() {
        return "Pop{" +
                "location='" + location + '\'' +
                ", totalPop=" + totalPop +
                ", malePop=" + malePop +
                ", femalePop=" + femalePop +
                '}';
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalPop() {
        return totalPop;
    }

    public void setTotalPop(int totalPop) {
        this.totalPop = totalPop;
    }

    public int getMalePop() {
        return malePop;
    }

    public void setMalePop(int malePop) {
        this.malePop = malePop;
    }

    public int getFemalePop() {
        return femalePop;
    }

    public void setFemalePop(int femalePop) {
        this.femalePop = femalePop;
    }
}
