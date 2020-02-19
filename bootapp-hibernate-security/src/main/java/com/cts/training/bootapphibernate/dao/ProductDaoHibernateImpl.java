package com.cts.training.bootapphibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.training.bootapphibernate.entity.Product;

@Repository
@Transactional
public class ProductDaoHibernateImpl implements IProductDao {

	// dependency
	//private SessionFactory sessionFactory;
	private EntityManager em;
	
	
	@Autowired
	public ProductDaoHibernateImpl(EntityManager em) {
		// TODO Auto-generated constructor stub
		this.em = em;
	}
	
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		// get the Hibernate Session object (Persistant Context)
		//Session session = this.sessionFactory.getCurrentSession();
		//hibernate is wrapped inside EM
		//Session session = this.em.unwrap(Session.class);
		
		// Student : entity class name
		// query generated by Hibernate is returned as Object
		Query query =  this.em.createQuery("from Product");
		List<Product> products = query.getResultList();
		return products;
	}

	@Override
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		// get the Hibernate Session object (Persistant Context)
		// every time new session object is required
		// as persistant context works within a method
		//Session session = this.em.unwrap(Session.class);
		Product product = this.em.find(Product.class, id);
		
		return product;
	}

	@Override
	public boolean add(Product product) {
		// TODO Auto-generated method stub
		//Session session = this.em.unwrap(Session.class);
		
		//session.save(product);
		
		this.em.merge(product);
		
		return true;
	}

	@Override
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		//Session session = this.em.unwrap(Session.class);
		
		this.em.merge(product);
		return true;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
	//	Session session = this.em.unwrap(Session.class);
		
		this.em.remove(this.findById(id));
		return true;
	}

}