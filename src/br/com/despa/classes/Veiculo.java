package br.com.despa.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servicos_veiculo_web")
public class Veiculo {

	@Id
	@GeneratedValue
	@Column(name = "codigo")
	private Long codigo;	

	@Column(name = "uf", length = 2)
	private String uf;
	
	@Column(name = "placa", length = 15)
	private String placa;
	
	@Column(name = "servico", length = 50)
	private String servico;
	
	@Column(name = "situacao", length = 50)
	private String situacao;	
	
	@Column(name = "senha", length = 20)
	private String senha;
	
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
	

	
	
}
