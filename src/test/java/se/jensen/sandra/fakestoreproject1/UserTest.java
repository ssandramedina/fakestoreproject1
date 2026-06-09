package se.jensen.sandra.fakestoreproject1;

import org.junit.jupiter.api.Test;
import se.jensen.sandra.fakestoreproject1.model.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    void userCanStoreUsername() {

        User user = new User();

        user.setUsername("sandra");

        assertEquals("sandra", user.getUsername());
    }

}