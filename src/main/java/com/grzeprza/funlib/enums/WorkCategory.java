package com.grzeprza.funlib.enums;

public enum WorkCategory {
    SCIENCEFICTION("SCIENCE FICTION"), SATIRE, DRAMA, ACTIONANDADVENTURE("ACTION AND ADVENTURE"), ROMANCE, MYSTERY,
    SELFDEV("SELF DEVELOPMENT"), HORROR, HEALTH, GUIDE, HISTORY, MATH, ANTHOLOGY, POETRY, ENCYCLOPEDIAS, DICTIONARIES,
    COMICS, COOKBOOKS, DIARIES, JOURNALS, SERIES, AUTOBIOGRAPHIES, FANTASY, NONE
    ;

    private String displayName;

    public String getDisplayName() {
        return displayName;
    }

    WorkCategory(String name) {
        this.displayName = name; 
    }

    WorkCategory(){
        this.displayName = this.name();
    }

}
