package com.grzeprza.funlib.enums;

public enum WorkType {
    PDF,
    MOBI,
    EPUB,
    MP3,
    UNKNOWN;

    public static WorkType of(String value){
        String val = value.toUpperCase();
        for(WorkType workType: WorkType.values()){
            if(val.equals(workType.name())){ 
                return workType;
            }
        }
        return WorkType.UNKNOWN;
    }
}
