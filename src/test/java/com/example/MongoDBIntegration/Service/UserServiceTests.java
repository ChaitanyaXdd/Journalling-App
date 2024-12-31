package com.example.MongoDBIntegration.Service;

import com.example.MongoDBIntegration.Entity.User;
import com.example.MongoDBIntegration.Repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTests {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;


    @Disabled
    @ParameterizedTest
    @ArgumentsSource(UserArgumentsProvider.class)
    public void testSaveNewUser(User user){
//        assertEquals(4,2+2);
//        assertNotNull(userRepository.findByUserName("ram"));
//        User user = userRepository.findByUserName("ram");
//        assertFalse(user.getJournalEntries().isEmpty());
        assertTrue(userService.saveNewUser(user));
    }

    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,10,12",
            "3,3,9"
    })
    public void test(int a,int b ,int expected){
        assertEquals(expected,a+b);
    }
}
