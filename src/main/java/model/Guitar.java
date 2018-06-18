package model;

public class Guitar {

    int serialNumber;
    String instrumentType;
    //int count;
    GuitarSpec guitarSpec;
/*
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
*/
    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }

    public void setGuitarSpec(GuitarSpec guitarSpec) {
        this.guitarSpec = guitarSpec;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }
}
