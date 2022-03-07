package inheritance.review;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void test_getUserName() {
        User sut = new  User("Josh");
        sut.getUserName();
        assertEquals("Josh", sut.getUserName(), "Yo something is wrong with your test_getUserName()");
    }

    @Test
    void setUserName() {
        User sut = new  User("Josh");
        sut.setUserName("JoshM");
        assertEquals("JoshM", sut.getUserName(), "Yo something is wrong with your test_setUserName()");
    }

    @Test
    void testToString() {
        User sut = new  User("Josh");
        System.out.println(sut);
        assertTrue(true, "Yo somethign it is wrong with your testToSting()");
    }
}