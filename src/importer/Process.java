/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importer;

import importer.Patterns;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author root
 */
public class Process {

    public static void lWords() throws IOException {

        File file = new File("/root/Desktop/5555.txt");
        List<String> line = FileUtils.readLines(file);
        Pattern pattern = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+");
        int count = 0;
        String mebleg;
        String krSayi;
        String krTesh;

        for (String word : line) {
            Matcher matcher = pattern.matcher(word);
            word = word.toUpperCase();
            if (word.contains("QIZI") || word.contains("OĞLU")) {
                int iOm = word.indexOf("27/06/2014");
                int eof = iOm + 10;
                String tarix = word.substring(iOm, eof);
                word = word.replace("TƏRTIB OLUNMA TARIXI: 27/06/2014", "");
                System.out.println(word);
                System.out.println(tarix);
            } else if (word.startsWith("ÜNVANI:")) {
                word = word.substring(9);
                System.out.println(word);
            } else if (word.startsWith("DOĞUM YERI:")) {
                word = word.substring(13);
                System.out.println(word);
            } else if (word.contains("DOĞUM TARIXI:")) {
                word = word.substring(15);
                System.out.println(word);
            } else if (word.contains("KREDIT + KREDIT") && count == 0) {
                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
                count++;

            } else if (word.contains("KREDITLƏR ÜZRƏ")) {
                System.out.println("hello");

                while (matcher.find()) {
                    System.out.println(matcher.group());
                }

            } else if (word.contains("KREDIT XƏTLƏRI")) {
               // mebleg = word.substring(41, 45);
               // krSayi = word.substring(48, 49);
              //  krTesh = word.substring(54, 55);
              //  System.out.println(mebleg);
              //  System.out.println(krSayi);
               // System.out.println(krTesh);

            } else if (word.contains("CƏMI AYLIQ ÖDƏNIŞ")) {
                mebleg = word.substring(35, 39);
                krSayi = word.substring(42, 43);
                krTesh = word.substring(48, 49);
                System.out.println(mebleg);
                System.out.println(krSayi);
                System.out.println(krTesh);

            } else if (word.contains("KREDIT + KREDIT") && count == 1) {

                while (matcher.find()) {

                    System.out.println(matcher.group());
                }

            }

            /*  if (count == template.temp.length) {
             break;
             } else {
                
             }*/
            //  } else {
            // System.out.println("OOPS");
        }
    }
}
