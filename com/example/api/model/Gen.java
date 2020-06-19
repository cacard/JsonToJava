package com.example.api.model;

import java.util.List;


public class Gen{

    private static final String FIELD_DATA = "data";
    private static final String FIELD_RES_HEADER = "resHeader";


    private List<Datum> mData;
    private ResHeader mResHeader;


    public Gen(){

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