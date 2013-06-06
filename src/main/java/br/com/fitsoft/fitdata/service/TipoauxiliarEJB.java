package br.com.fitsoft.fitdata.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import br.com.fitsoft.fitdata.model.Tipoauxiliar;


@Stateless
public class TipoauxiliarEJB extends AbstractPersistence<Tipoauxiliar>{

	@PersistenceContext(unitName="fitdataUnit")
    private EntityManager em;
	
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	public TipoauxiliarEJB() {
		super(Tipoauxiliar.class);
	}
	
}
