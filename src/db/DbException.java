package db;
/*
 * CLASSE DbException
 * Subclasse de RuntimeException
 * Exce��o personalizada para lidar com as opera��es feitas no banco de dados
 * 
 * OBS: Para fins de visualiza��o, o tratamento foi feito exibindo mensagens no console, e n�o lan�ando a exce��o;
 * 
 * */

public class DbException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DbException(String message) {
		super(message);
	}
	
}
