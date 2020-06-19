package com.example.api.model2;

import java.util.List;


public class Pojo3{

    private static final String FIELD_DATA = "data";
    private static final String FIELD_RES_HEADER = "resHeader";


    private List<Datum> mData;
    private ResHeader mResHeader;


    public Pojo3(){

    }

    public void setData(List<Datum> data) {
        mData = data;
    }

    public List<Datum> getData() {
        return mData;
    }

    public void setResHeader(ResHeader resHeader) {
        mResHeader = resHeader;
    }

    public ResHeader getResHeader() {
        return mResHeader;
    }


}