package org.vinnivso.dao;

import org.vinnivso.domain.Client;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

//O BOM de utilizar o SET é que evita duplicidade de dados, logo dois objetos iguais não poderão ser inclusos.
public class ClientSetDAO implements  IClientDAO {
    private Set<Client> set;

    public ClientSetDAO() {
        this.set = new HashSet<>();
    }

    @Override
    public boolean register(Client client) {
        return this.set.add(client);
    }

    @Override
    public void delete(Long ssn) {
        Client registeredClient = null;
        for (Client client : this.set) {
            if (client.getSsn().equals(ssn)) {
                registeredClient = client;
                break;
            }
        }
        if (registeredClient != null) {
            this.set.remove(registeredClient);
        }
    }

    @Override
    public void update(Client client) {
        if (this.set.contains(client)) {
            for (Client registeredClient : this.set) {
                if (registeredClient.equals(client)) {
                    registeredClient.setName(client.getName());
                    registeredClient.setTelephone(client.getTelephone());
                    registeredClient.setAddress(client.getAddress());
                    registeredClient.setAddressNumber(client.getAddressNumber());
                    registeredClient.setCity(client.getCity());
                    registeredClient.setState(client.getState());
                    break;
                }
            }
        }
    }

    @Override
    public Client search(Long ssn) {
        for (Client registeredClient : this.set) {
            if (registeredClient.getSsn().equals(ssn)) {
                return registeredClient;
            }
        }
        return null;
    }

    @Override
    public Collection<Client> searchAll() {
        return this.set;
    }
}
