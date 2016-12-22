package br.com.despa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.despa.classes.Veiculo;
import br.com.despa.connections.Conexao;

public class VeiculoDao {		
	
	@SuppressWarnings("unchecked")
	public List<Veiculo> list(String placa, String senha){
		List<Veiculo> lista = null;
		try{						
			EntityManager em = Conexao.getConexao().createEntityManager();
			Query q = em.createQuery("select a from Veiculo a where placa = '" + placa + "'" + 
									" and senha = '" + senha + "'", Veiculo.class);
			lista = q.getResultList();
		} catch (Exception e) {
			System.out.println("Erro ao listar os serviços desse veículo: " + e.getMessage());
		}
		return lista;
	}

}
