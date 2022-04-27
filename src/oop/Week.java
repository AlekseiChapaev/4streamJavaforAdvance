package oop;

public enum Week {
    SUNDAY("Воскресенье"),
    MONDAY(" ");
    private String name;

    public String getName() {
        return name;
    }

    Week(String name) {
        this.name = name;
    }
}


