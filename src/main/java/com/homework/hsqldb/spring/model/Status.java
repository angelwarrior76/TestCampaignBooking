package com.homework.hsqldb.spring.model;

public enum Status {

    PLANNED(0, "PLANNED"),
    ACTIVE(1, "ACTIVE"),
    PAUSED(2, "PAUSED"),
    FINISHED(3, "FINISHED");

    Status(int code, String descr) {
        this.code = code;
        this.descr = descr;
    }

    private int code;
    private String descr;

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return descr;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer(0);
        sb.append("\"status\" : {\"code\" : ");
        sb.append(code);
        sb.append(", \"descr\" : \"");
        sb.append(descr);
        sb.append("\"}");
        return sb.toString();
    }

    public static Status valueOf(int i) {
        Status res;
        switch (i) {
            case 0: res = PLANNED; break;
            case 1: res = ACTIVE; break;
            case 2: res = PAUSED; break;
            case 3: res = FINISHED; break;
            default: res = PLANNED; break;
        }
        return res;
    }

}
