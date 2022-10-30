package persistencia;

import java.io.Serializable;

public interface BaseDAO<T extends Serializable, E> {
	public E save(T instance) throws Exception;
	public T findById(E id) throws Exception;
    public void saveOrUpdate(T instance) throws Exception;
    public void delete(T persistentInstance) throws Exception;
}