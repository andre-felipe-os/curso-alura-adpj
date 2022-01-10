package alura.adpj.solid.rh.service.promocao;

import alura.adpj.solid.rh.ValidacaoException;
import alura.adpj.solid.rh.model.Cargo;
import alura.adpj.solid.rh.model.Interno;

public class PromocaoService {
	
	public void promover(Interno funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();
		if (cargoAtual == Cargo.GERENTE) {
			throw new ValidacaoException("Gerentes não podem ser promovidos.");
		}
		
		if (metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcionário não bateu a meta.");
		}
	}

}
