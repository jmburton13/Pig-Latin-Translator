package org.translator;

import java.util.Locale;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Translator
{
    public static void main( String[] args )
    {
        //CONSTRUCTORS
        WelcomeBanner welcome = new WelcomeBanner();
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        //WELCOME AND USER SELECT TRANSLATION DIRECTION
        System.out.println( welcome.banner );
        System.out.println("  [1] Language --> PigLatin\n  [2] PigLatin --> Language\nPlease select your translator direction: ");
        String keyboardInput = scanner.nextLine().toLowerCase();

        boolean isToPigLatin = false;
        if (keyboardInput.toLowerCase().equals("1")) { isToPigLatin = true;}

        //USER INPUT OF STRING FOR TRANSLATION
        System.out.println("Thanks! Please type what you would like to have translated (exclude punctuation): ");
        String stringToConvert = scanner.nextLine();

        //CONVERT AND PRINT TRANSLATION
        String printableTranslation = converter.convert(stringToConvert, isToPigLatin);
        System.out.println(printableTranslation);
        }
    }

