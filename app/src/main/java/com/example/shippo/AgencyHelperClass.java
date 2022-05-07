package com.example.shippo;

public class AgencyHelperClass {
    String aname;
    String oname;
    String comloc;

    public AgencyHelperClass(String aname, String oname, String comloc) {
        this.aname = aname;
        this.oname = oname;
        this.comloc = comloc;
    }

    public AgencyHelperClass() {

    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public String getComloc() {
        return comloc;
    }

    public void setComloc(String comloc) {
        this.comloc = comloc;
    }
}
