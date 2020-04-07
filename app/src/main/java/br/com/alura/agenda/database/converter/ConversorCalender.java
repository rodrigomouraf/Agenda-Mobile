package br.com.alura.agenda.database.converter;

import androidx.room.TypeConverter;

import java.util.Calendar;

public class ConversorCalender {

    @TypeConverter
    public Long paraLong(Calendar valor){
        if(valor != null)
            return valor.getTimeInMillis();

        return null;
    }

    @TypeConverter
    public Calendar paraCalender(Long valor){
        Calendar momentoAtual = Calendar.getInstance();
        if(valor != null){
            momentoAtual.getTimeInMillis();
        }
        return momentoAtual;
    }


}
