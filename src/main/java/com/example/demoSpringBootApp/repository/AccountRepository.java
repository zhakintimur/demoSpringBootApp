package com.example.demoSpringBootApp.repository;

import com.example.demoSpringBootApp.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

}
