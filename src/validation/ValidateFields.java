package validation;

/*
 * CLASSE ValidateFields
 * Classe que possui m�todos est�ticos para validar entradas de usu�rio
 * OBS: classe feita para ser utilizada em testes que solicitam os dados do usu�rio
 * 
 * */

public final class ValidateFields {
	
	// FORMATAR CPF
	public static String formatCpf(String cpf) {
		cpf = cpf.toUpperCase().replaceAll("[A-Z]*", "");
		cpf = cpf.replaceAll("\\.", "");
		cpf = cpf.replaceAll("-", "");
		
		return cpf;
	}
	
	// CHECAR VALIDADE DO CPF
	public static boolean cpfIsValid(String cpf) {
		if(cpf.length() == 11) {
			return true;
		}
		return false;
	}

	
	/*
	 * M�todo para formata��o dos nomes
	 * Primeira letra de cada nome mai�scula
	 * */
	public static String formatName(String name) {
		name = name.trim();
		String[] fullName = name.split(" +");
		String formatedName = "";
		for(int i = 0; i<fullName.length; i++) {
			if(fullName[i].length()<1) {
				fullName[i] = fullName[i].toUpperCase();
			}else {
				fullName[i] = fullName[i].substring(0,1).toUpperCase().concat(fullName[i].substring(1));
				formatedName+=fullName[i]+" ";
			}
		}

		return formatedName.trim();
	}

}
