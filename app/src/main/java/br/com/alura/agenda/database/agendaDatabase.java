package br.com.alura.agenda.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import br.com.alura.agenda.model.Aluno;
import br.com.alura.agenda.database.dao.RoomAlunoDao;

@Database(entities = {Aluno.class}, version = 1, exportSchema = false)
public abstract class agendaDatabase extends RoomDatabase {
    public abstract RoomAlunoDao getRoomAlunoDao();
}
