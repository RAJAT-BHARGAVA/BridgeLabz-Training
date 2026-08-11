package com.example.contacts_app.service;

import com.example.contacts_app.dto.RequestDTO;
import com.example.contacts_app.dto.ResponseDTO;
import com.example.contacts_app.entity.Contacts;
import com.example.contacts_app.repository.ContactsRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactsServiceImpl implements ContactsService {

    private final ContactsRepository contactsRepository;

    public ContactsServiceImpl(ContactsRepository contactsRepository) {
        this.contactsRepository = contactsRepository;
    }

    @Override
    public ResponseDTO saveContacts(RequestDTO requestDTO) {
        Contacts contact = new Contacts();
        contact.setName(requestDTO.getName());
        contact.setEmail(requestDTO.getEmail());
        contact.setPhone(requestDTO.getPhone());

        Contacts savedContact = contactsRepository.save(contact);

        return ResponseDTO.builder()
                .name(savedContact.getName())
                .email(savedContact.getEmail())
                .phone(savedContact.getPhone())
                .build();
    }
}