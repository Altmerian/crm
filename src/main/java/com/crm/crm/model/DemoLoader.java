package com.crm.crm.model;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DemoLoader implements CommandLineRunner {

  private final ContactsRepository contactsRepository;

  @Override
  public void run(String... args) throws Exception {
    contactsRepository.saveAll(
        List.of(
            Contact.builder().firstName("Pavel").lastName("Shakhlovich").email("pavel@myEmail.com").build(),
            Contact.builder().firstName("Emmanuel").lastName("Henri").email("emmanuel@myEmail.com").build(),
            Contact.builder().firstName("Pedro").lastName("Rodrigues").email("pedro@myEmail.com").build(),
            Contact.builder().firstName("Kim").lastName("Lee").email("kim@myEmail.com").build()));
  }
}
