package dao;

import java.util.List;

import javax.persistence.EntityManager;

import model.Plan;

public class PlanDAO implements DaoInterface<Plan,Long>{
	
	EntityManager em;

	public void setEm(EntityManager em){
		this.em=em;
	}
	
    public EntityManager getEm(){
    	return this.em;
    }    
	
	@Override
	public Plan persist(Plan entity) {
		getEm().persist(entity);
		return entity;
	}

	@Override
	public Plan update(Plan entity) {
		getEm().merge(entity);
		return entity;
	}

	@Override
	public Plan findById(Long id) {
		return getEm().find(Plan.class,id);
	}

	@Override
	public void delete(Plan entity) {
		getEm().remove(entity);
	}

	@Override
	public List<Plan> findAll() {
		List<Plan> dl=getEm().createQuery("SELECT d FROM Plan d").getResultList();
		return dl;
	}

}
