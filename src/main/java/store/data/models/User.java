package store.data.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User {
    private String email;
    private String password;
    private String phoneNumber;
    private int id;

}
