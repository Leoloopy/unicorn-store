package store.data.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.TreeSet;


@Data
public class Buyer extends User{
    private String firstName;
    private String lastName;
    private Set<String> deliveryAddresses = new TreeSet<>();



}
