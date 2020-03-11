package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {


    private Passenger p1;

    @BeforeEach
    void init()
    {
        p1 = new Passenger("Mr", "Gearoid", 1234567891, "085 123 1234", 24);
    }

    @Test
    void testConstructorTitleFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Sir", "Gear", 1234567891, "123 567891", 20));
        assertEquals("Invalid Title", e.getMessage());
    }

    @Test
    void testConstructorNameFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr", "G", 1234567891, "123 567891", 20));
        assertEquals("Invalid Name", e.getMessage());
    }

    @Test
    void testConstructorIDFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr", "Gear", 1234, "123 567891", 20));
        assertEquals("Invalid ID", e.getMessage());
    }

    @Test
    void testConstructorPhoneFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr", "Gear", 1234567891, "123 56", 20));
        assertEquals("Invalid Phone", e.getMessage());
    }

    @Test
    void testConstructorAgeFail() {
        //Test age < 16
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr", "Gear", 1234567891, "123 567891", 15));
        assertEquals("Invalid Age", e.getMessage());
    }


    @Test
    void testGetNameSuccess()
    {
        assertEquals("Gearoid", p1.getName());
    }

    @Test
    void testGetIDSuccess()
    {
        assertEquals(1234567891, p1.getID());
    }

    @Test
    void testGetPhoneSuccess()
    {
        assertEquals("085 123 1234", p1.getPhone());
    }

    @Test
    void testGetAgeSuccess()
    {
        assertEquals(24, p1.getAge());
    }

    @Test
    void testSetTitleSuccess()
    {
    }
}