package br.com.alura.agenda;

import android.app.Application;

import androidx.room.Room;

import br.com.alura.agenda.database.agendaDatabase;
import br.com.alura.agenda.database.dao.RoomAlunoDao;
import br.com.alura.agenda.model.Aluno;

public class agendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        agendaDatabase dataBase = Room
                .databaseBuilder(this, agendaDatabase.class, "agenda.db")
                .allowMainThreadQueries()
                .build();
        RoomAlunoDao dao = dataBase.getRoomAlunoDao();
        dao.salva(new Aluno("Fran", "1122223333", "fran@alura.com"));
        dao.salva(new Aluno("Alex", "1122223333", "alex@alura.com"));
    }
}
