package management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("John", "ABCD10", 100.00, "sales");
    }

    @Test
    public void hasName() {
        assertEquals("John", manager.getName());
    }

    @Test
    public void hasSalary() {
        assertEquals(100.00, manager.getSalary(), 0.0);
    }

    @Test
    public void hasNI() {
        assertEquals("ABCD10", manager.getNI());
    }

    @Test
    public void hasDeptName(){
        assertEquals("sales", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        assertTrue(manager.raiseSalary(50.00));
        assertEquals(150.00, manager.getSalary(), 0.0);
    }

    @Test
    public void preventNegativeRaiseSalary() {
        assertFalse(manager.raiseSalary(-20));
    }

    @Test
    public void canPayBonus() {
        assertEquals(1, manager.payBonus(), 0.0);
    }
}
