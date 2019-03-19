package com.RestPhoneApp.RestPhoneApp.controller;

import com.RestPhoneApp.RestPhoneApp.domain.Contact;
import com.RestPhoneApp.RestPhoneApp.repo.ContactRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contact")
public class ContactController {
    private final ContactRepository contactRepository;


    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @GetMapping("/getMessages")
    public List<Contact> list() {
        return contactRepository.findAll();
    }

    @GetMapping("{id}")
    public Contact getOne(@PathVariable("id") Contact contact) {
        return  contactRepository.getOne(contact.getId());
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public Contact create(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }

    @PutMapping("{id}")
    public Contact update(
            @PathVariable("id") Contact contactFromDb,
            @RequestBody Contact contact
    ) {
        BeanUtils.copyProperties(contact, contactFromDb, "id");

        return contactRepository.save(contactFromDb);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Contact contact) {
        contactRepository.delete(contact);
    }
}