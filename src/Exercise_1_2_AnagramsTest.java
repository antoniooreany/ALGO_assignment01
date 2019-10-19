import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise_1_2_AnagramsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void areAnagrams() {
        assertTrue(Exercise_1_2_Anagrams.areAnagrams("silent", "listen"));
        assertTrue(Exercise_1_2_Anagrams.areAnagrams("railsafety","fairytales"));
        assertTrue(Exercise_1_2_Anagrams.areAnagrams("LAMPE", "PALME"));
        assertTrue(Exercise_1_2_Anagrams.areAnagrams("WIEN", "WEIN"));
        assertTrue(Exercise_1_2_Anagrams.areAnagrams("SCHUTZUMSCHLAG", "UMZUGSSCHLACHT"));
    }

    @Test
    public void count() {
        assertEquals(3, Exercise_1_2_Anagrams.count("afddsmsfamdfsm", 'm'));
        assertEquals(8, Exercise_1_2_Anagrams.count("xafdxdsxmxsfaxxmdxfsmx", 'x'));
        assertEquals(10, Exercise_1_2_Anagrams.count("5afdd5sms5f555am5dfs5m55", '5'));
        assertEquals(11, Exercise_1_2_Anagrams.count("afMddMsmsfMamMdfMsmMMMMMM", 'M'));
    }
}