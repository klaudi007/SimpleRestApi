package dao;

import java.io.Serializable;
import java.util.List;

public interface DaoInterface<T,Id extends Serializable> {
	public T persist(T entity);
	public T update(T entity);
	public T findById(Id id);
	public void delete(T entity);
	public List<T> findAll();
}
