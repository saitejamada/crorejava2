package com.railway.dao;

import javax.transaction.Transactional;


import org.springframework.orm.hibernate5.HibernateTemplate;

import com.railway.pojo.User;

public class RailwayDAo {
	
	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	@Transactional
	public void inserUser(User u)
	{
		template.save(u);
	}
}
