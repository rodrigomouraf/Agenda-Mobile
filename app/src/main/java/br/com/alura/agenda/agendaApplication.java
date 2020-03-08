package br.com.alura.agenda;

import android.app.Application;

import br.com.alura.agenda.dao.AlunoDAO;
import br.com.alura.agenda.model.Aluno;

public class agendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Fran", "1122223333", "fran@alura.com"));
        dao.salva(new Aluno("Alex", "1122223333", "alex@alura.com"));
    }
}
