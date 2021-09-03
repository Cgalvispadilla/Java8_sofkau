package com.lambda.app;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class FechasYHoras {


    public static void main(String[] args) {
        FechasYHoras fechasYHoras = new FechasYHoras();
        try {
            fechasYHoras.verificarFechas();
            fechasYHoras.medirTiempo();
            fechasYHoras.periodo();
            fechasYHoras.convertir();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //verifica si una fecha está antes o despúes de la otra
    public void verificarFechas() {
        //para mes, año y día
        LocalDate fecha1 = LocalDate.of(1991, 01, 21);
        LocalDate fecha2 = LocalDate.now();
        System.out.println(fecha1.isAfter(fecha2));
        System.out.println(fecha1.isBefore(fecha2));

        //para hora, minuto y seguntos
        LocalTime tiempo1 = LocalTime.of(22, 30, 50);
        LocalTime tiempo2 = LocalTime.now();
        System.out.println(tiempo1.isAfter(tiempo2));
        System.out.println(tiempo1.isBefore(tiempo2));

        //combinar fecha y hora
        LocalDateTime fechaTiempo1 = LocalDateTime.of(1991, 1, 21, 22, 30, 50);
        LocalDateTime fechaTiempo2 = LocalDateTime.now();
        System.out.println(fechaTiempo1.isAfter(fechaTiempo2));
        System.out.println(fechaTiempo1.isBefore(fechaTiempo2));
    }

    //con esta funcionalidad puedes hacer un cronometro ;)
    public void medirTiempo() {
        Instant ini = Instant.now();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant fin = Instant.now();
        System.out.println(Duration.between(ini, fin));
    }

    //Seleccionar un periodo entre fechar
    public void periodo() {
        LocalDate nacimiento = LocalDate.of(1991, 1, 21);
        LocalDate actual = LocalDate.now();
        Period periodo = Period.between(nacimiento, actual);
        System.out.println("Han transcurrido " + periodo.getYears() + " años y " + periodo.getMonths() + " meses y "
                + periodo.getDays() + " dias, desde " + nacimiento + " hasta " + actual);
    }

    //convetir fechas de string a localDate
    public void convertir() {
        String fecha = "21/01/1991";
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaLocal = LocalDate.parse(fecha, formateador);
        System.out.println(fechaLocal);

        formateador = DateTimeFormatter.ofPattern("ddMMyyyy");
        System.out.println(formateador.format(fechaLocal));
    }
}
