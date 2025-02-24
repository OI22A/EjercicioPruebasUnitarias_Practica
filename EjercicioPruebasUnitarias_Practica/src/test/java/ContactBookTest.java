import model.ContactBook;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ContactBookTest {

    private ContactBook contactBook;

    @BeforeEach
    public void setUp() {
        contactBook = new ContactBook();
        contactBook.add("Anderson", "andersonDJ@icesi.co", "123");
    }

    @Test
    public void testAñadirContacto() {
        assertNotNull(contactBook.search("andersonDJ@icesi.co"), "El contacto debería existir en el libro de contactos");
    }

    @Test
    public void testEliminarContacto() {
        contactBook.remove("andersonDJ@icesi.co");

        assertNull(contactBook.search("andersonDJ@icesi.co"), "El contacto debería haber sido eliminado");
    }
}
