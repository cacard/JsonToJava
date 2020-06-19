package com.example.api.model2;



public class ResHeader{

    private static final String FIELD_MESSAGE = "message";
    private static final String FIELD_CODE = "code";


    private String mMessage;
    private int mCode;


    public ResHeader(){

    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setCode(int code) {
        mCode = code;
    }

    public int getCode() {
        return mCode;
    }


}