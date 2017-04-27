package com.effotracka.effotracka.DataPackage;

public class Make {
    static final String TABLE = "Make";

    static final String KEY_ID = "Make_ID";
    static final String KEY_NAME = "Make_Name";

    private Integer ID;
    private String name;

    Make(){}
    Make(String name){this.name = name;}

    private Make(int ID, String name){
        this.ID = ID;
        this.name = name;
    }

    public Integer getKeyId(){
        return ID;
    }

    void setKeyId(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
