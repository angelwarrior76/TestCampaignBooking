package com.homework.hsqldb.spring.model;

public enum Platform {

    ANDROID(1, "ANDROID"),
    IOS(2, "IOS"),
    WEB(0, "WEB");

    Platform(int code, String descr) {
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
        sb.append("\"platform\" : {\"code\" : ");
        sb.append(code);
        sb.append(", \"descr\" : \"");
        sb.append(descr);
        sb.append("\"}");
        return sb.toString();
    }

    public static Platform valueOf(int i) {
        Platform res;
        switch (i) {
            case 0:
                res = WEB;
                break;
            case 1:
                res = ANDROID;
                break;
            case 2:
                res = IOS;
                break;
            default:
                res = WEB;
                break;
        }
        return res;
    }

}
