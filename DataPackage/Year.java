package com.effotracka.effotracka.DataPackage;

public class Year {
    static final String TABLE = "Year";

    static final String KEY_ID = "Year_ID";
    static final String KEY_VALUE = "Year_value";

    private Integer ID;
    private String value;

    Year(){}
    private Year(String value){this.value = value;}

    private Year(int ID, String value){
        this.ID = ID;
        this.value = value;
    }

    public Integer getKeyId(){
        return ID;
    }

    void setKeyId(Integer ID) {
        this.ID = ID;
    }

    public String getValue() {
        return value;
    }

    void setValue(String value) {
        this.value = value;
    }
}
