package br.com.fitsoft.fitdata.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public abstract class AbstractPersistence<T> {

	
	private Class<T> entityClass;

	public AbstractPersistence(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	public T save(T e) {
			getEntityManager().persist(e);
			return e;
	}
	
	public T update(T e) {
		getEntityManager().merge(e);
		return e;
}

	public void remove(T entity) {
		getEntityManager().remove(getEntityManager().merge(entity));
	}

	public T find(T id) {
		return getEntityManager().find(entityClass, id);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<T> findAll() {
		CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
		cq.select(cq.from(entityClass));
		return getEntityManager().createQuery(cq).getResultList();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<T> findRange(int[] range) {
		CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
		cq.select(cq.from(entityClass));
		Query q = getEntityManager().createQuery(cq);
		q.setMaxResults(range[1] - range[0]);
		q.setFirstResult(range[0]);
		return q.getResultList();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" }) 
	public int count() {
		CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
		Root<T> rt = cq.from(entityClass);
		cq.select(getEntityManager().getCriteriaBuilder().count(rt));
		Query q = getEntityManager().createQuery(cq);
		return ((Long) q.getSingleResult()).intValue();
	}
	
	
	protected abstract EntityManager getEntityManager();
}
