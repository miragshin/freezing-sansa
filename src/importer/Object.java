/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importer;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.commons.io.FileUtils;
import importer.Patterns;
/**
 *
 * @author root
 */
public class Object {

    public static void lWords() throws IOException {

        Patterns template = new Patterns();
        File file = new File("/root/Desktop/11.txt");
        List<String> line = FileUtils.readLines(file);
        
        int count = 0;
        for (String word : line) {
            if (word.matches(template.temp[count].toString())){
                System.out.println(word);
                count++;
               if (count == template.temp.length) {
                    break;
                } else {
                    continue;
                }
            } else {
               // System.out.println("OOPS");
            } 
        }
    }
}
