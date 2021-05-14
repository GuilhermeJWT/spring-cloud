package br.com.systemsgs.dto;

import java.util.List;

public class ModelCompraDTO {

	private List<ModelItemCompraDTO> itens;

	private ModelEnderecoDTO endereco;

	public List<ModelItemCompraDTO> getItens() {
		return itens;
	}

	public void setItens(List<ModelItemCompraDTO> itens) {
		this.itens = itens;
	}

	public ModelEnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(ModelEnderecoDTO endereco) {
		this.endereco = endereco;
	}

}
