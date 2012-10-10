package EzUrl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class EzURLTest {

    @Test
    public void testEzRequestURL() {
        String ezurl = null;
        try {
            ezurl = EzURL.requestHTML("http://www.google.com/");
        } catch (MalformedURLException ex) {
            Logger.getLogger(EzURLTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EzURLTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        assertEquals("eu nao sei o que eu espero aqui", ezurl);
    }
    public void testEzRequestHeader() {
        String ezurl = null;
        try {
            ezurl = EzURL.requestHTML("http://www.google.com/");
        } catch (MalformedURLException ex) {
            Logger.getLogger(EzURLTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EzURLTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        assertEquals("eu nao sei o que eu espero aqui", ezurl);
    }

}