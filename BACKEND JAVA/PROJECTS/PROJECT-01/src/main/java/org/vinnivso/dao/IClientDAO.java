package org.vinnivso.dao;

import org.vinnivso.domain.Client;

import java.util.Collection;

public interface IClientDAO {
    public boolean register(Client client);

    public void delete(Long ssn);

    public void update(Client client);

    public Client search(Long ssn);

    public Collection<Client> searchAll();
}