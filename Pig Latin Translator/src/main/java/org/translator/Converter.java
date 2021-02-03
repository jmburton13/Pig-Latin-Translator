package org.translator;

public class Converter {

    //CONSTRUCTOR
    public Converter() {
    }

    //METHODS
    public String convert(String stringToConvert, boolean isToPigLatin) {

        String returnString = "";

        if (isToPigLatin) {
            String[] stringToConvertArray = stringToConvert.split(" ");
            for (String word : stringToConvertArray) {
                if (word.length() < 3) {
                    returnString += word + " ";
                } else {
                    String modifiedWord = word.substring(1) + word.substring(0, 1) + "ay";
                    returnString += modifiedWord + " ";
                }
            }
        } else {
                String[] stringToConvertArray = stringToConvert.split(" ");
                for (String word : stringToConvertArray) {
                    if (word.length() < 3) {
                        returnString += word + " ";

                    } else {
                        String modifiedWord = word.substring(word.length() - 3, word.length() - 2) + word.substring(0, word.length() - 3);
                        returnString += modifiedWord + " ";
                    }
                }


            }
            return returnString;
        }
    }


