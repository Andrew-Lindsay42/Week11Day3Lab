package management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("John", "ABCD10", 100.00, "sales", 5000.0);
    }

    @Test
    public void hasName() {
        assertEquals("John", director.getName());
    }

    @Test
    public void hasSalary() {
        assertEquals(100.00, director.getSalary(), 0.0);
    }

    @Test
    public void hasNI() {
        assertEquals("ABCD10", director.getNI());
    }

    @Test
    public void hasDeptName(){
        assertEquals("sales", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        assertTrue(director.raiseSalary(50.00));
        assertEquals(150.00, director.getSalary(), 0.0);
    }

    @Test
    public void preventNegativeRaiseSalary() {
        assertFalse(director.raiseSalary(-1));
    }

    @Test
    public void canPayBonus() {
        assertEquals(2, director.payBonus(), 0.0);
    }

    @Test
    public void hasBudget() {
        assertEquals(5000.0, director.getBudget(), 0.0);
    }
}
