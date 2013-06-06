package br.com.fitsoft.fitdata.controller;


import static javax.faces.context.FacesContext.getCurrentInstance;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.fitsoft.fitdata.model.Tipoauxiliar;
import br.com.fitsoft.fitdata.service.TipoauxiliarEJB;

@Named
@RequestScoped
public class TipoMB implements Serializable {
	
	
	
	
	@Inject
	private TipoauxiliarEJB service;
	
	
	@Inject
	private Tipoauxiliar item;
	
	
	private Long idSelecionado;
	
	private List<Tipoauxiliar> items;
	
	
	
	public TipoMB() {
	}
	
    
	
	
	public void setIdSelecionado(Long idSelecionado) {
		this.idSelecionado = idSelecionado;
	}
	
	public Long getIdSelecionado() {
		return idSelecionado;
	}
	
	public Tipoauxiliar getItem() {
		return item;
	}
	
	
	public void editar() {
		if (item == null) {
			return;
		}
		item = service.find(item);
	}
	
	public List<Tipoauxiliar> getItems() {
		System.out.println("service: "+service);
		if (items == null) {
			items = service.findAll();
		}
		return items;
	}

	
	public String salvar() {
		try {
			System.out.println("service: "+service);
			service.save(item);
		} catch(Exception ex) {
			addMessage(getMessageFromI18N("msg.erro.salvar.mercadoria"), ex.getMessage());
			return "";
		}
		return "listaMercadorias";
	}
	
	public String remover() {
		try {
			service.remove(item);
		} catch(Exception ex) {
			addMessage(getMessageFromI18N("msg.erro.remover.mercadoria"), ex.getMessage());
			return "";
		}
		return "listaMercadorias";
	}
	
	
	private String getMessageFromI18N(String key) {
		ResourceBundle bundle = ResourceBundle.getBundle("messages_labels", getCurrentInstance().getViewRoot().getLocale());
		return bundle.getString(key);
	}
	
	
	private void addMessage(String summary, String detail) {
		getCurrentInstance().addMessage(null, new FacesMessage(summary, summary.concat("<br/>").concat(detail)));
	}

	
	
}
