package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * unit tests for class Translator
 */
public class TranslatorTest {

    @Test
    public void getNumberInWords() {

        Translator service = new Translator();

        // assert statements
        assertEquals("zero", service.getNumberInWords(0));
        assertEquals("one", service.getNumberInWords(1));
        assertEquals("two", service.getNumberInWords(2));
        assertEquals("three", service.getNumberInWords(3));
        assertEquals("four", service.getNumberInWords(4));
        assertEquals("five", service.getNumberInWords(5));
        assertEquals("six", service.getNumberInWords(6));
        assertEquals("seven", service.getNumberInWords(7));
        assertEquals("eight", service.getNumberInWords(8));
        assertEquals("nine", service.getNumberInWords(9));
        assertEquals("ten", service.getNumberInWords(10));
        assertEquals("eleven", service.getNumberInWords(11));
        assertEquals("twelve", service.getNumberInWords(12));
        assertEquals("thirteen", service.getNumberInWords(13));
        assertEquals("fourteen", service.getNumberInWords(14));
        assertEquals("fifteen", service.getNumberInWords(15));
        assertEquals("sixteen", service.getNumberInWords(16));
        assertEquals("seventeen", service.getNumberInWords(17));
        assertEquals("eighteen", service.getNumberInWords(18));
        assertEquals("nineteen", service.getNumberInWords(19));
        assertEquals("twenty", service.getNumberInWords(20));
        assertEquals("twenty one", service.getNumberInWords(21));
        assertEquals("twenty two", service.getNumberInWords(22));

        assertEquals("thirty", service.getNumberInWords(30));
        assertEquals("thirty one", service.getNumberInWords(31));
        assertEquals("thirty two", service.getNumberInWords(32));

        assertEquals("forty", service.getNumberInWords(40));
        assertEquals("forty one", service.getNumberInWords(41));
        assertEquals("forty two", service.getNumberInWords(42));

        assertEquals("fifty", service.getNumberInWords(50));
        assertEquals("fifty one", service.getNumberInWords(51));
        assertEquals("fifty two", service.getNumberInWords(52));

        assertEquals("sixty", service.getNumberInWords(60));
        assertEquals("sixty one", service.getNumberInWords(61));
        assertEquals("sixty two", service.getNumberInWords(62));

        assertEquals("seventy", service.getNumberInWords(70));
        assertEquals("seventy one", service.getNumberInWords(71));
        assertEquals("seventy two", service.getNumberInWords(72));

        assertEquals("eighty", service.getNumberInWords(80));
        assertEquals("eighty one", service.getNumberInWords(81));
        assertEquals("eighty two", service.getNumberInWords(82));

        assertEquals("ninety", service.getNumberInWords(90));
        assertEquals("ninety one", service.getNumberInWords(91));
        assertEquals("ninety two", service.getNumberInWords(92));

        assertEquals("one hundred", service.getNumberInWords(100));
        assertEquals("one hundred and one", service.getNumberInWords(101));
        assertEquals("one hundred and two", service.getNumberInWords(102));

        assertEquals("one hundred and ten", service.getNumberInWords(110));
        assertEquals("one hundred and eleven", service.getNumberInWords(111));

        assertEquals("one hundred and twenty", service.getNumberInWords(120));
        assertEquals("one hundred and twenty one", service.getNumberInWords(121));

        assertEquals("one hundred and thirty", service.getNumberInWords(130));
        assertEquals("one hundred and thirty one", service.getNumberInWords(131));

        assertEquals("one hundred and forty", service.getNumberInWords(140));
        assertEquals("one hundred and forty one", service.getNumberInWords(141));

        assertEquals("one hundred and fifty", service.getNumberInWords(150));
        assertEquals("one hundred and fifty one", service.getNumberInWords(151));

        assertEquals("one hundred and ninety nine", service.getNumberInWords(199));
        assertEquals("two hundred", service.getNumberInWords(200));
        assertEquals("two hundred and one", service.getNumberInWords(201));

        assertEquals("two hundred and nine", service.getNumberInWords(209));
        assertEquals("two hundred and ten", service.getNumberInWords(210));
        assertEquals("two hundred and nineteen", service.getNumberInWords(219));
        assertEquals("two hundred and twenty", service.getNumberInWords(220));
        assertEquals("two hundred and twenty one", service.getNumberInWords(221));
        assertEquals("two hundred and fifty six", service.getNumberInWords(256));

        assertEquals("three hundred", service.getNumberInWords(300));
        assertEquals("four hundred", service.getNumberInWords(400));
        assertEquals("five hundred", service.getNumberInWords(500));
        assertEquals("six hundred", service.getNumberInWords(600));
        assertEquals("seven hundred", service.getNumberInWords(700));
        assertEquals("eight hundred", service.getNumberInWords(800));
        assertEquals("nine hundred", service.getNumberInWords(900));
        assertEquals("nine hundred and ninety nine", service.getNumberInWords(999));

        assertEquals("one thousand", service.getNumberInWords(1000));
        assertEquals("one thousand and one", service.getNumberInWords(1001));
        assertEquals("one thousand and ten", service.getNumberInWords(1010));
        assertEquals("one thousand and twenty", service.getNumberInWords(1020));
        assertEquals("one thousand and twenty one", service.getNumberInWords(1021));
        assertEquals("one thousand and twenty four", service.getNumberInWords(1024));

        assertEquals("one thousand one hundred", service.getNumberInWords(1100));
        assertEquals("one thousand one hundred and ten", service.getNumberInWords(1110));
        assertEquals("one thousand one hundred and eleven", service.getNumberInWords(1111));
        assertEquals("one thousand one hundred and thirty", service.getNumberInWords(1130));

        assertEquals("one thousand nine hundred and ninety nine", service.getNumberInWords(1999));

        assertEquals("nine thousand", service.getNumberInWords(9000));
        assertEquals("ten thousand", service.getNumberInWords(10000));
        assertEquals("fifty thousand", service.getNumberInWords(50000));

        assertEquals("one hundred thousand", service.getNumberInWords(100000));
        assertEquals("two hundred thousand", service.getNumberInWords(200000));
        assertEquals("two hundred and twenty thousand one hundred and seventy five", service.getNumberInWords(220175));
        assertEquals("two hundred and sixteen thousand one hundred and seventy nine", service.getNumberInWords(216179));
        assertEquals("nine hundred thousand and one", service.getNumberInWords(900001));
        assertEquals("nine hundred and thirty thousand", service.getNumberInWords(930000));

        assertEquals("one million", service.getNumberInWords(1000000));
        assertEquals("one million two hundred and twenty thousand and fifty", service.getNumberInWords(1220050));
    }
}