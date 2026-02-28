package com.github.sanchezih.enums._02_enums_con_atributos_y_metodos.src;

public enum Continente {

    /*
     * Cada enum es un objeto de tipo Continente. Se llamara al constructor
     * conparametros long y double.
     */
    AMERICA(910000000L, 42330000), // public static final Continente AMERICA = new Continente(910000000, 42330000);
    EUROPA(731000000L, 10180000), // public static final Continente EUROPA = new Continente(731000000, 10180000);
    AFRICA(922011000L, 30370000), //
    ASIA(3879000000L, 43810000), //
    OCEANIA(27000000L, 8720710), //
    ANTARTIDA(1000L, 13720000);

    // Atributos
    private final long cantHabitantes;
    private final double superficie;

    /*----------------------------------------------------------------------------*/

    /**
     * Constructor private para evitar que se haga new
     *
     * @param cantHabitantes
     * @param superficie
     */
    private Continente(long cantHabitantes, double superficie) {
        this.cantHabitantes = cantHabitantes;
        this.superficie = superficie;
    }

    /*----------------------------------------------------------------------------*/

    /**
     *
     * @return
     */
    public double densidadPoblacion() {
        return this.cantHabitantes / this.superficie;
    }

    @Override
    public String toString() {
        return "Continente{" + "cantHabitantes=" + cantHabitantes + ", superficie" +
				"=" + superficie + '}';
    }
}