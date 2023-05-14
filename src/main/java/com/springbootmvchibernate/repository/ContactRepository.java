package com.springbootmvchibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootmvchibernate.pojo.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
