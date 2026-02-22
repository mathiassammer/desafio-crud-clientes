package com.mathiassammer.dscrudclientes.services;

import com.mathiassammer.dscrudclientes.dto.ClientDTO;
import com.mathiassammer.dscrudclientes.entities.Client;
import com.mathiassammer.dscrudclientes.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable){
        Page<Client> result = clientRepository.findAll(pageable);
        return result.map(ClientDTO::new);
    }
}
