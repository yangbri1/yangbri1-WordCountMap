
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class WordCountMapTest {
    WordCountMap wcm = new WordCountMap();

    /**
     * In the String "apple pear melon", all words occur exactly once.
     */
    @Test
    public void wordCountTest1(){
        String input = "apple pear melon";

        if(wcm.returnWordMap(input) == null){
            Assert.fail();
        }else{

            Map<String, Integer> actual = wcm.returnWordMap(input);
            int a1 = actual.get("apple");
            int e1 = 1;
            int a2 = actual.get("pear");
            int e2 = 1;
            int a3 = actual.get("melon");
            int e3 = 1;
            Assert.assertEquals(e1, a1);
            Assert.assertEquals(e2, a2);
            Assert.assertEquals(e3, a3);
        }
    }

    /**
     * In the String "giraffe zebra giraffe", giraffe occurs twice and zebra occurs once.
     */
    @Test
    public void wordCountTest2(){
        String input = "giraffe zebra giraffe";

        if(wcm.returnWordMap(input) == null){
            Assert.fail();
        }else{
            Map<String, Integer> actual = wcm.returnWordMap(input);
            int giraffeCount = actual.get("giraffe");
            int expectedGiraffeCount = 2;
            int zebraCount = actual.get("zebra");
            int expectedZebraCount = 1;
            Assert.assertEquals(expectedGiraffeCount, giraffeCount);
            Assert.assertEquals(expectedZebraCount, zebraCount);
        }
    }
    /**
     * In the String "apple pear melon apple pear apple", "apple" occurs 3 times, "pear" 2 times, "melon" 1 time.
     */
    @Test
    public void wordCountTest3(){
        String input = "apple pear melon apple pear apple";
        if(wcm.returnWordMap(input) == null){
            Assert.fail();
        }else{
            Map<String, Integer> actual = wcm.returnWordMap(input);
            int a1 = actual.get("apple");
            int e1 = 3;
            int a2 = actual.get("pear");
            int e2 = 2;
            int a3 = actual.get("melon");
            int e3 = 1;
            Assert.assertEquals(e1, a1);
            Assert.assertEquals(e2, a2);
            Assert.assertEquals(e3, a3);
        }
    }

}
