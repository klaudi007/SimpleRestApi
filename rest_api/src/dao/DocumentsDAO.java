package dao;


import java.util.List;

import javax.persistence.EntityManager;

import model.Documents;

public class DocumentsDAO implements DaoInterface<Documents, Long> {

	EntityManager em;

	public void setEm(EntityManager em){
		this.em=em;
	}
	
    public EntityManager getEm(){
    	return this.em;
    }    
    
	@Override
	public Documents persist(Documents entity) {
		getEm().persist(entity);
		return entity;
	}

	@Override
	public Documents update(Documents entity) {
		getEm().merge(entity);
		return entity;
	}

	@Override
	public Documents findById(Long id) {
		return getEm().find(Documents.class,id);
	}

	@Override
	public void delete(Documents entity) {
		getEm().remove(entity);
	}

	@Override
	public List<Documents> findAll() {
		List<Documents> dl=getEm().createQuery("SELECT d FROM Documents d").getResultList();
		return dl;
	}

	

}
