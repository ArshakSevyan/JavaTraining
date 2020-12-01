package String.number001;

import org.junit.Test;

import static String.number001.Constans.OUT_OF_BOUDS;

/**
 * Created By Arshak on Dec, 2020
 */
public class TestStringAPI {

    // Smb jan, BeforeClass-ov chi stacvum, exceptiona gcum

    @Test
    public void testGetCharAtIndexNull(){
        StringAPI api = new StringAPI();
        String result = api.getCharAtIndex(null,7);
        assert result.equals(OUT_OF_BOUDS);
    }
    @Test
    public void testGetCharAtIndexEmpty(){
        StringAPI api = new StringAPI();
        String result = api.getCharAtIndex("",7);
        assert result.equals(OUT_OF_BOUDS);
    }
    @Test
    public void testGetCharAtIndexKIsMinus(){
        StringAPI api = new StringAPI();
        String result = api.getCharAtIndex("",-8);
        assert result.equals(OUT_OF_BOUDS);
    }

    @Test
    public void testGetCharAtIndexValid(){
        StringAPI api = new StringAPI();
        String result = api.getCharAtIndex("testingTestNG",5);
        assert result.equals("n");
    }

    @Test
    public void wordsCount(){
        StringAPI api = new StringAPI();
        String result = api.wordsCount("testing TestNG Number2");
        assert result.equals("3");
    }

    @Test
    public void palindrome(){
        StringAPI api = new StringAPI();
        String result = api.palindrome("TeNeT");
        assert result.equals("Word is Palindrome");
    }

    @Test
    public void brackets(){
        StringAPI api = new StringAPI();
        String result = api.brackets("((((()))))");
        assert result.equals("Brackets are match");
    }

    @Test
    public void contains(){
        StringAPI api = new StringAPI();
        String result = api.contains("Testing","ing");
        assert result.equals("Contains");
    }

    @Test
    public void startsWith(){
        StringAPI api = new StringAPI();
        String result = api.startsWith("Many many years ago","many people are ......");
        assert result.equals("Origin String starts with the contents of another");
    }

    @Test
    public void endsWith(){
        StringAPI api = new StringAPI();
        String result = api.endsWith("We will win the Champions League","League of Shadows");
        assert result.equals("Origin String ends with the contents of another");
    }

    @Test
    public void removingDuplicates(){
        StringAPI api = new StringAPI();
        String result = api.removingDuplicates("Allessandro");
        assert result.equals("Alesandro");
    }









}