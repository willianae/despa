package br.com.despa.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.despa.classes.FacesUtils;
import br.com.despa.classes.Veiculo;
import br.com.despa.dao.VeiculoDao;
import br.com.despa.enums.EnumUF;

@ManagedBean
@ViewScoped
public class BeanVeiculo {
	private Veiculo veiculo;	
	
	//private List<Veiculo> listaVeiculos;
	private DataModel<Veiculo> listaVeiculos;
	
	public BeanVeiculo(){
		novoVeiculo();
		getListaVeiculos();
	}
	
	public void novoVeiculo(){
		this.veiculo = new Veiculo();
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public DataModel<Veiculo> getListaVeiculos() {		        
		return this.listaVeiculos;
	}
	public void setListaVeiculos(DataModel<Veiculo> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;
	}
	
	public void consultaVeiculos(){
		VeiculoDao veiculoDao = new VeiculoDao();
		List<Veiculo> lista = veiculoDao.list(veiculo.getPlaca(), veiculo.getSenha());
		this.listaVeiculos = new ListDataModel<Veiculo>(lista);
		if (listaVeiculos.getRowCount() == 0){
			FacesUtils.addMessage("Não foram encontrados serviços para essa placa!", "");
		}
	}
	
	/*
	public void carregaLista(){
		VeiculoDao veiculoDao = new VeiculoDao();
		listaVeiculos = veiculoDao.list();	
	}
	*/			
	
	public EnumUF[] getUfs(){
		return EnumUF.values();
	}
	
	
	
	
	

}
