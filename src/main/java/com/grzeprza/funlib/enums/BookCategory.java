package com.grzeprza.funlib.enums;

public enum BookCategory {
    SCIENCEFICTION("SCIENCE FICTION"), SATIRE, DRAMA, ACTIONANDADVENTURE("ACTION AND ADVENTURE"), ROMANCE, MYSTERY, SELFDEV("SELF DEVELOPMENT"),
    HORROR, HEALTH, GUIDE, HISTORY, MATH, ANTHOLOGY, POETRY, ENCYCLOPEDIAS, DICTIONARIES, COMICS, COOKBOOKS, DIARIES, JOURNALS, SERIES, AUTOBIOGRAPHIES, FANTASY;

    BookCategory(String name) {
        this.displayName = name;
    }

    BookCategory(){
        this.displayName = this.name();
    }

    private String displayName;

    public String getDisplayName() {
        return displayName;
    }
}
