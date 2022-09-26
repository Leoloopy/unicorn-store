package store.data.repositories;

import store.data.models.Buyer;

import java.util.ArrayList;
import java.util.List;

public class
BuyerRepositoryImpl implements BuyerRepository{
    private final List<Buyer> buyers = new ArrayList<>();
    @Override
    public Buyer save(Buyer buyer) {
        return null;
    }

    @Override
    public Buyer findById(int id) {
        return null;
    }

    @Override
    public List<Buyer> findAll() {
        return null;
    }

    @Override
    public void delete(Buyer buyer) {

    }
}
