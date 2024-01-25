package com.expleo.repo;
import com.expleo.model.Emp;

public interface Dao {
	int save(Emp e);
	Emp getEmp(int id);
//	List<Emp> getAllEmp();
}
