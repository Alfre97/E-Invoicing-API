package services;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class ServiceCrud<E> {

	private static EntityManagerFactory entityManagerFactory = null;
	private static EntityManager em = null;
	Method method;

	public void insert(E obj) throws Exception, IllegalArgumentException, InvocationTargetException {
		startEntityManagerFactory();
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		//stopEntityManagerFactory();

	}

	public E read(E obj) throws Exception, IllegalArgumentException, InvocationTargetException {
		startEntityManagerFactory();
		Class cls = obj.getClass();
		method = cls.getMethod("getId");
		Object idObj = method.invoke(obj);
		Integer idObtenido = (Integer) idObj;
		E objRead = (E) em.find(obj.getClass(), idObtenido);
		stopEntityManagerFactory();
		if (objRead != null) {
			return objRead;
		} else {
			return null;
		}

	}

	public boolean modify(E obj) throws Exception, IllegalArgumentException, InvocationTargetException {
		if (read(obj) != null) {
			E objRead = read(obj);
			startEntityManagerFactory();
			em.getTransaction().begin();
			em.merge(obj);
			em.getTransaction().commit();
			stopEntityManagerFactory();
			return true;
		} else
			return false;

	}

	public boolean delete(E obj) throws Exception, IllegalArgumentException, InvocationTargetException {
		if (read(obj) != null) {
			E objRead = read(obj);
			startEntityManagerFactory();
			em.getTransaction().begin();
			em.remove(em.contains(objRead) ? objRead : em.merge(objRead));
			em.getTransaction().commit();
			stopEntityManagerFactory();
			return true;
		} else
			return false;

	}

	public List<E> list(E obj) throws Exception, IllegalArgumentException, InvocationTargetException {
		startEntityManagerFactory();
		if (obj != null) {
			String jpql = "SELECT t FROM " + obj.getClass().getSimpleName() + " t";
			List<E> lista = (List<E>) em.createQuery(jpql, obj.getClass()).getResultList();
			//stopEntityManagerFactory();
			if (lista != null) {
				return lista;
			} else
				return null;
		} else
			//stopEntityManagerFactory();
		return null;

	}

	public static void startEntityManagerFactory() {

		if (entityManagerFactory == null) {

			try {

				entityManagerFactory = Persistence.createEntityManagerFactory("E-Invoicing-API");

				em = entityManagerFactory.createEntityManager();

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

	}

	public static void stopEntityManagerFactory() {

		if (entityManagerFactory != null) {

			if (entityManagerFactory.isOpen()) {

				try {

					entityManagerFactory.close();

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

			em.close();

			entityManagerFactory = null;

		}
	}
}
