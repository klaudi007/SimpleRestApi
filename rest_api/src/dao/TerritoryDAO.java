package dao;

import java.util.List;

import javax.persistence.EntityManager;

import model.Territory;

public class TerritoryDAO implements DaoInterface<Territory,Long>{
	EntityManager em;

	public void setEm(EntityManager em){
		this.em=em;
	}
	
    public EntityManager getEm(){
    	return this.em;
    }    
	
	@Override
	public Territory persist(Territory entity) {
		getEm().persist(entity);
		return entity;
	}

	@Override
	public Territory update(Territory entity) {
		getEm().merge(entity);
		return entity;
	}

	@Override
	public Territory findById(Long id) {
		return getEm().find(Territory.class,id);
	}

	@Override
	public void delete(Territory entity) {
		getEm().remove(entity);
	}

	@Override
	public List<Territory> findAll() {
		List<Territory> dl=getEm().createQuery("SELECT d FROM Territory d").getResultList();
		return dl;
	}

}
