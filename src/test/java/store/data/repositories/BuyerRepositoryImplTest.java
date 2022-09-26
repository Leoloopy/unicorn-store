package store.data.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import store.data.models.Buyer;

import static org.junit.jupiter.api.Assertions.*;

class BuyerRepositoryImplTest {
    private static final BuyerRepository buyerRepository = new BuyerRepositoryImpl();
    private Buyer buyer;

    @BeforeEach
    void setUp() {
        buyer = new Buyer();
        buyer.setFirstName("Godman");
        buyer.setLastName("Buhari");
        buyer.setEmail("emilokan02@gmail.com");
        buyer.setPassword("ILoveNaija2022");
    }

    @Test
    void saveTest() {
        // before save
        int numberOfBuyerInDatabase = buyerRepository.findAll().size();
        assertEquals(0, numberOfBuyerInDatabase);
        // save Buyer
        Buyer savedBuyer = buyerRepository.save(buyer);
        //buyer has an Id
        assertEquals(1,savedBuyer.getId());
    }

    @Test
    void findById() {
//        int numberOfBuyer  = buyerRepository.getCount();
    }

    @Test
    void findAllTest() {
//        buyerRepository.save(buyer);
//        var listOfAllBuyersInDb = buyerRepository.findAll();
//        assertEquals(1, listOfAllBuyersInDb);
    }

    @Test
    void delete() {
    }
}