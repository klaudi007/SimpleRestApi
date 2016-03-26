package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.codehaus.jackson.map.ObjectMapper;

import dao.PlanDAO;
import dao.TerritoryDAO;
import domain.Domain;
import model.Plan;
import model.Territory;

public class Service {
	
//	*******************************************************************
//	*************************     TERRITORY   *************************
//	*******************************************************************

	public static Territory saveTerritory(Object requestEntity){
			
		Territory territory=new Territory();
		TerritoryDAO territoryDao=new TerritoryDAO();
		
		
    	String PERSISTENCE_UNIT_NAME = "testUnit";
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        
        territoryDao.setEm(em);
        
        ObjectMapper objectMapper=new ObjectMapper();
		
		try {
			territory=objectMapper.convertValue(requestEntity, Territory.class);
		} catch (Exception e) {
			System.out.println("Object convertion Exception"+e);
		}

		
		tx.begin();
		
		territoryDao.persist(Domain.territoryAcitivy(territory));
		
		tx.commit();
		
        em.close();
        factory.close();
		
		return territory;
	}

	public static List<Territory> getAllTerritory(){
		
		TerritoryDAO territoryDao=new TerritoryDAO();
        territoryDao.setEm(getEm());
       return territoryDao.findAll();
        
	}
	

//	*******************************************************************
//	*************************     PLAN        *************************
//	*******************************************************************
	
	
	public static Plan savePlan(Object requestEntity){
		
		Plan plan=new Plan();
		PlanDAO planDao=new PlanDAO();
		
		
    	String PERSISTENCE_UNIT_NAME = "testUnit";
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        
        planDao.setEm(em);
        
        ObjectMapper objectMapper=new ObjectMapper();
		
		try {
			plan=objectMapper.convertValue(requestEntity, Plan.class);
		} catch (Exception e) {
			System.out.println("Object convertion Exception"+e);
		}

		
		tx.begin();
		
		planDao.persist(Domain.planAcitivy(plan));
	
		tx.commit();
		
        em.close();
        factory.close();
		
		return plan;
	}
	
	
	public static List<Plan> getAllPlan(){
		
		PlanDAO planDao=new PlanDAO();
		planDao.setEm(getEm());
		return planDao.findAll();
        
	}
	
	
	public static Plan findPlan(Long id){
		PlanDAO planDao=new PlanDAO();
		planDao.setEm(getEm());
		return planDao.findById(id);
	}
	
	
	
	
	public static EntityManager getEm(){
		String PERSISTENCE_UNIT_NAME = "testUnit";
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        return factory.createEntityManager();
	}
}
