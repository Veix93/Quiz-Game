package com.sda.Quiz.Game.frontend;

public enum Difficulty {

    EASY("Easy"),
    MEDIUM("Medium"),
    HARD("Hard");

    private final String displayDifficulty;

    Difficulty(String displayDifficulty) {
        this.displayDifficulty = displayDifficulty;
    }

    public String getDisplayDifficulty() {
        return displayDifficulty;
    }
}
