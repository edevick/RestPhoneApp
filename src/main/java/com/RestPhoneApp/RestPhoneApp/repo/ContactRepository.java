package com.RestPhoneApp.RestPhoneApp.repo;

import com.RestPhoneApp.RestPhoneApp.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
