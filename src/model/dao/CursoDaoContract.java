package model.dao;
/*
 * INTERFACE CursoDaoContract
 * Interface que estabelece os m�todos que devem ser implementados pelo CursoDao
 *  
 * */

import java.util.List;

import model.entities.Curso;

public interface CursoDaoContract {
	boolean inserir(Curso curso);
	
	boolean atualizar(Curso curso);
	
	Curso procurar(double codigo);
	
	boolean remover(double codigo);
	
	public List<Curso> exibirCurso();
}
