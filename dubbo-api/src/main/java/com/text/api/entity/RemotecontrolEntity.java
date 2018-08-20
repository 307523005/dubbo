package com.text.api.entity;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class RemotecontrolEntity implements Serializable {
    private static final long serialVersionUID = 8655851615465363474L;
    private  int id ;
    private  String serialnumber;
    private int appport;
    private int isoccupation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getAppport() {
        return appport;
    }

    public void setAppport(int appport) {
        this.appport = appport;
    }

    public int getIsoccupation() {
        return isoccupation;
    }

    public void setIsoccupation(int isoccupation) {
        this.isoccupation = isoccupation;
    }

    public RemotecontrolEntity(String serialnumber, int appport, int isoccupation) {
        this.serialnumber = serialnumber;
        this.appport = appport;
        this.isoccupation = isoccupation;
    }

    public RemotecontrolEntity() {
    }
}
