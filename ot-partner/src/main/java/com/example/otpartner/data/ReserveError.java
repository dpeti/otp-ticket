package com.example.otpartner.data;

public enum ReserveError {

    EVENT_NOT_FOUND(90001, "Nem létezik ilyen esemény!"),
    SEAT_NOT_FOUND(90002, "Nem létezik ilyen szék!"),
    CANNOT_BE_RESERVED(90010, "Már lefoglalt székre nem lehet jegyet eladni!");

    private final int code;
    private final String msg;

    ReserveError(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
