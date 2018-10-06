package com.grzeprza.funlib.enums;

public enum WorkLengthUnit {
    MIN("min"),
    HOUR("h"),
    PAGES("pages"),
    BLANK(""),
    ;

    String shortName;

    WorkLengthUnit(String value){
        this.shortName = value;
    }

    public String getShortName() { return this.shortName; }

    public static WorkLengthUnit of(String value){
        for(WorkLengthUnit val: WorkLengthUnit.values()){
            if(val.shortName.equals(value)){
                return val;
            }
        }
        return WorkLengthUnit.BLANK;
    }

}
