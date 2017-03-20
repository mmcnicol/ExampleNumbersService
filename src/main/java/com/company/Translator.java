package com.company;

import static java.lang.Math.abs;

/**
 * Translate Numbers to Words Service
 */
public class Translator {
    public String getNumberInWords(int value) {
        String response = "";
        //String millions = translateMillions(abs(value / 1000000), "million");
        String millions = translateThousands(abs(value / 1000000), "million");
        String thousands = translateThousands(abs(value / 1000), "thousand");
        String hundreds = translateHundreds(abs(value / 100), "hundred");
        String tens = translateLastTwoDigits(value);

        if (!millions.equals("")) {
            response += millions;
        }
        if (!thousands.equals("")) {
            if (!response.equals("")) {
                response += " " + thousands;
            } else {
                response += thousands;
            }
        }
        if (!hundreds.equals("")) {
            if (!response.equals("")) {
                response += " " + hundreds;
            } else {
                response += hundreds;
            }
        }
        if (!tens.equals("")) {
            if (!response.equals("")) {
                response += " and " + tens;
            } else {
                response += tens;
            }
        }

        return response;
    }

   /* private String translateMillions(int number, String unit) {
        String response = "";
        int value = number;
        if (value > 0 && value < 100) {
            response = translateLastTwoDigits(value) + " " + unit;
        } else if (value > 0 && value < 1000) {
            response = translateHundreds(number / 100, "hundred");
            String tens = translateLastTwoDigits(value);
            if (!tens.equals("")) {
                response += " and " + tens;
            }
            response += " " + unit;
        }
        return response.replace("  ", " ");
    }*/

    private String translateThousands(int number, String unit) {
        String response = "";
        int value = number % 1000;
        if (value > 0 && value < 100) {
            response = translateLastTwoDigits(value) + " " + unit;
        } else if (value > 0 && value < 1000) {
            response = translateHundreds(number / 100, "hundred");
            String tens = translateLastTwoDigits(value);
            if (!tens.equals("")) {
                response += " and " + tens;
            }
            response += " " + unit;
        }
        return response.replace("  ", " ");
    }

    private String translateHundreds(int number, String unit) {
        String response = "";
        int value = number % 10;
        if (value > 0 && value < 10) {
            response = translateLastTwoDigits(value) + " " + unit;
        }
        return response;
    }

    private String translateLastTwoDigits(int value) {
        String response = "";

        if (value < 20) {
            response = translate1stDigit(value);
        } else {
            int last2Digits = value % 100;
            if (last2Digits != 0) {
                int singles = last2Digits % 10;
                int tens = abs(last2Digits / 10);
                if (last2Digits < 20) {
                    response = translate1stDigit(last2Digits);
                } else if (tens == 0) {
                    response = translate1stDigit(singles);
                } else if (singles == 0) {
                    response = translate2ndDigit(tens);
                } else {
                    response = translate2ndDigit(tens) + " " + translate1stDigit(singles);
                }
            }
        }
        return response;
    }

    private String translate2ndDigit(int value) {
        String word = "";
        switch (value) {
            case 1:
                word = "ten";
                break;
            case 2:
                word = "twenty";
                break;
            case 3:
                word = "thirty";
                break;
            case 4:
                word = "forty";
                break;
            case 5:
                word = "fifty";
                break;
            case 6:
                word = "sixty";
                break;
            case 7:
                word = "seventy";
                break;
            case 8:
                word = "eighty";
                break;
            case 9:
                word = "ninety";
                break;
        }
        return word;
    }

    private String translate1stDigit(int value) {
        String word = "";
        switch (value) {
            case 0:
                word = "zero";
                break;
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            case 8:
                word = "eight";
                break;
            case 9:
                word = "nine";
                break;
            case 10:
                word = "ten";
                break;
            case 11:
                word = "eleven";
                break;
            case 12:
                word = "twelve";
                break;
            case 13:
                word = "thirteen";
                break;
            case 14:
                word = "fourteen";
                break;
            case 15:
                word = "fifteen";
                break;
            case 16:
                word = "sixteen";
                break;
            case 17:
                word = "seventeen";
                break;
            case 18:
                word = "eighteen";
                break;
            case 19:
                word = "nineteen";
                break;
        }
        return word;
    }
}
