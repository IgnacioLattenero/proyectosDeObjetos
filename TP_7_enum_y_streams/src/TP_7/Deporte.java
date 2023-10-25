package TP_7;

import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public enum Deporte implements Constable {
    RUNNING(1),
    FUTBOL(2),
    BASKET(2),
    TENNIS(3),
    JABALINA(4);

    private final int complejidad;

    private Deporte(int complejidad) {
        this.complejidad = complejidad;
    }

    public int getComplejidad() {
        return this.complejidad;
    }

}

