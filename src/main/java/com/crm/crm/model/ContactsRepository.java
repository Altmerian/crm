package com.crm.crm.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface ContactsRepository extends CrudRepository<Contact, Long> {}
