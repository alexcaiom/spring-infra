package br.com.massuda.alexander.spring.framework.infra.excecoes;
/**
 * @author Alex
 * Classe Mãe de Erros/Exceções
 */
public class Erro extends Error {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1727546945514929736L;
	public String erro;
	public String mensagem;
	
	public Erro() {
		// TODO Auto-generated constructor stub
	}
	public Erro(String descricaoErro) {
		super(descricaoErro);
		this.erro = descricaoErro;
		this.mensagem = descricaoErro;
	} 
	
	public Erro(Throwable e, String descricaoErro) {
		super(descricaoErro);
		super.initCause(e);
		this.erro = descricaoErro;
		if (e != null && !e.getMessage().isEmpty()) {
			this.mensagem = e.getMessage();
		}
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return "Erro [erro=" + erro + ", mensagem=" + mensagem + "]";
	}
	
}