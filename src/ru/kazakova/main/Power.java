package ru.kazakova.main;

public interface Power {
    public static double calculate (String sx, String sy) {
        int x = Integer.parseInt(sx);
        int y = Integer.parseInt(sy);
        return Math.pow(x, y);
    }
}
