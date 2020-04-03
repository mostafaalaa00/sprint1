package com.phase1.repository;

import org.springframework.data.repository.CrudRepository;

import com.phase1.models.StoreOwners;
//import com.phase1.models.User;

public interface IStoreOwnerRepository extends CrudRepository<StoreOwners, Long> {

}
