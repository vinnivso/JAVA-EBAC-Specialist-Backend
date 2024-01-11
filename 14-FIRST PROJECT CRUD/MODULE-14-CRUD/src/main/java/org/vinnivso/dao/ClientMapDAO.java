package org.vinnivso.dao;

import org.vinnivso.domain.Client;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class ClientMapDAO implements IClientDAO {
    private Map<Long, Client> map;

    //CONSTRUCTOR INSTANCIANDO TREEMAP.
    public ClientMapDAO() {
        map = new TreeMap<>();
    }
    @Override
    public boolean register(Client client) {
        if (map.containsKey(client.getSsn())) {
            return false;
        }
        map.put(client.getSsn(), client);
        return true;
    }

    @Override
    public void delete(Long ssn) {
        Client registeredClient = map.get(ssn);
        map.remove(registeredClient.getSsn(), registeredClient);
    }

    @Override
    public void update(Client client) {
        Client registeredClient = map.get(client.getSsn());
        registeredClient.setName(client.getName());
        registeredClient.setTelephone(client.getTelephone());
        registeredClient.setAddress(client.getAddress());
        registeredClient.setAddressNumber(client.getAddressNumber());
        registeredClient.setCity(client.getCity());
        registeredClient.setState(client.getState());
    }

    @Override
    public Client search(Long ssn) {
        return this.map.get(ssn);
    }

    @Override
    public Collection<Client> searchAll() {
        return this.map.values();
    }
}
