package com.example.api.model2;



public class Datum{

    private static final String FIELD_COVER_URL = "coverUrl";
    private static final String FIELD_PHOTO_NUMS = "photoNums";
    private static final String FIELD_ID = "id";
    private static final String FIELD_TITLE = "title";
    private static final String FIELD_COLLECTION = "collection";
    private static final String FIELD_CREATED_TYPE = "createdType";


    private String mCoverUrl;
    private int mPhotoNum;
    private int mId;
    private String mTitle;
    private boolean mCollection;
    private int mCreatedType;


    public Datum(){

    }

    public void setCoverUrl(String coverUrl) {
        mCoverUrl = coverUrl;
    }

    public String getCoverUrl() {
        return mCoverUrl;
    }

    public void setPhotoNum(int photoNum) {
        mPhotoNum = photoNum;
    }

    public int getPhotoNum() {
        return mPhotoNum;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getId() {
        return mId;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setCollection(boolean collection) {
        mCollection = collection;
    }

    public boolean isCollection() {
        return mCollection;
    }

    public void setCreatedType(int createdType) {
        mCreatedType = createdType;
    }

    public int getCreatedType() {
        return mCreatedType;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Datum){
        		return ((Datum) obj).getId().equals(mId);
        }
        return false;
    }

    @Override
    public int hashCode(){
        return mId.hashCode();
    }


}