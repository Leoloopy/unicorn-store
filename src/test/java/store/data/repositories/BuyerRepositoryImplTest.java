package store.data.repositories;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import store.data.models.Buyer;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BuyerRepositoryImplTest {
    private static final BuyerRepository buyerRepository = new BuyerRepositoryImpl();
    private Buyer buyer;
    private Buyer secondBuyer;

    @BeforeEach
    void setUp() {
        buyer = new Buyer();
        buyer.setFirstName("Godman");
        buyer.setLastName("Buhari");
        buyer.setEmail("emilokan02@gmail.com");
        buyer.setPassword("ILoveNaija2022");

        secondBuyer = new Buyer();
        secondBuyer.setFirstName("Godman");
        secondBuyer.setLastName("Buhari");
        secondBuyer.setEmail("emilokan@gmail.com");
        secondBuyer.setPassword("1111");
    }

    @AfterEach
    void tearDown(){
        buyerRepository.deleteAll();
    }

    @Test
    void saveTest() {
        // before save
        assertEquals(0, buyer.getId());
        assertEquals(0, buyerRepository.findAll().size());
        // save Buyer
        Buyer savedBuyer = buyerRepository.save(buyer);
        //buyer has an Id
        assertEquals(1,savedBuyer.getId());
        //there is one user in the db
        List<Buyer> buyersList = buyerRepository.findAll();
        assertEquals(1, buyersList.size());

        //save second buyer
        Buyer savedSecondBuyer = buyerRepository.save(secondBuyer);
        //second buyer's id is 2
        assertEquals(2, savedSecondBuyer.getId());
        //there are two buyers in the db
        buyersList = buyerRepository.findAll();
        assertEquals(2, buyersList.size());
    }

    @Test
    void findByIdTest() {
        Buyer firstSavedBuyer = buyerRepository.save(buyer);
        Buyer secondSavedRepository = buyerRepository.save(secondBuyer);

        Buyer foundBuyer = buyerRepository.findById(secondSavedRepository.getId());
        assertEquals("Godman",foundBuyer.getFirstName() );

    }

    @Test
    void findAllTest() {
        buyerRepository.save(buyer);
        var listOfAllBuyersInDb = buyerRepository.findAll();
        assertEquals(1, listOfAllBuyersInDb.size());
    }

    @Test
    void delete() {
    }

    @Test
    void deleteAllTest(){
        buyerRepository.save(buyer);
        assertEquals(1, buyerRepository.findAll().size());
        buyerRepository.deleteAll();
        assertEquals(0, buyerRepository.findAll().size());
    }
}