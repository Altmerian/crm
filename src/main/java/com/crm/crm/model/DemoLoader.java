package com.crm.crm.model;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DemoLoader implements CommandLineRunner {

  private final ContactsRepository contactsRepository;

  @Override
  public void run(String... args) throws Exception {
    contactsRepository.save(
        Contact.builder().firstName("Pavel").lastName("Shakhlovich").email("pavel@myEmail.com").build());
  }
}
