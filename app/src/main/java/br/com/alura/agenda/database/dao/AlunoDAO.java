package br.com.alura.agenda.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import br.com.alura.agenda.model.Aluno;

@SuppressWarnings("ALL")
@Dao
public interface AlunoDAO {
    @Insert
    void salva(Aluno aluno);

    @Query("SELECT * FROM aluno ORDER BY aluno.nome")
    List<Aluno> todos();

    @Delete
    void remove(Aluno aluno);

    @Update
    void edita(Aluno aluno);
}
