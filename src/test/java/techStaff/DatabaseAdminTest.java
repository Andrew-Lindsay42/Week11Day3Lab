package techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DatabaseAdminTest {

    DatabaseAdmin dbAdmin;

    @Before
    public void before() {
        dbAdmin = new DatabaseAdmin("Jane", "QPE12", 500.00);

    }

    @Test
    public void hasName() {
        assertEquals("Jane", dbAdmin.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("QPE12", dbAdmin.getNI());
    }

    @Test
    public void hasSalary() {
        assertEquals(500.0, dbAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        assertTrue(dbAdmin.raiseSalary(150.0));
        assertEquals(650.0, dbAdmin.getSalary(), 0.0);
    }

    @Test
    public void preventNegativeRaiseSalary() {
        assertFalse(dbAdmin.raiseSalary(-500));
    }

    @Test
    public void canPayBonus() {
        assertEquals(5, dbAdmin.payBonus(), 0.0);

    }
}