package techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Jane", "QPE12", 500.00);

    }

    @Test
    public void hasName(){
        assertEquals("Jane", developer.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("QPE12", developer.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(500.0, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(150.0);
        assertEquals(650.0, developer.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(5, developer.payBonus(), 0.0);
    }
}