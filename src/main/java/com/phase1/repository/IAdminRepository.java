package com.phase1.repository;

import org.springframework.data.repository.CrudRepository;

import com.phase1.models.Admin;
//import com.phase1.models.User;

public interface IAdminRepository extends CrudRepository<Admin, Long> {

}
