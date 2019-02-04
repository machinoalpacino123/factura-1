package com.bolsadeideas.springboot.app.models.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bolsadeideas.springboot.app.models.dao.IProveedorDao;
import com.bolsadeideas.springboot.app.models.entity.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService{

	@Autowired
	private IProveedorDao proveedorDao;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Proveedor> findAll() {
		// TODO Auto-generated method stub
		return (List<Proveedor>) proveedorDao.findAll();
	}

	@Override
	@Transactional
	public void save(Proveedor proveedor) {
		proveedorDao.save(proveedor);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Proveedor findOne(Long id) {
	
		return proveedorDao.findOne(id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		proveedorDao.delete(id);
		
	}

	@Override
	public Page<Proveedor> findAll(Pageable pageable) {
		
		return proveedorDao.findAll(pageable);
	}
	
}
