/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importer;

import java.util.regex.Pattern;

/**
 *
 * @author root
 */
public class Patterns {
    
    Pattern temp[] = {
        Pattern.compile("(.*[A-Z] OĞLU.*)|(.*[A-Z] QIZI.*)"),
        Pattern.compile("(.*[AZE].*)"),
        Pattern.compile("(Ünvanı:.*[a-zA-Z].*)"),
        Pattern.compile("(Doğum yeri:.*[a-zA-Z])"),
        Pattern.compile("(Doğum tarixi: 	07/09/1985)"),
        Pattern.compile("(.*[a-zA-Z].*[0-9].*)"),
        Pattern.compile("(.*[a-zA-Z].*[0-9].*)"),
        Pattern.compile("(.*[a-zA-Z].*[0-9].*)"),
        Pattern.compile("(.*[a-zA-Z].*[0-9].*)"),
        Pattern.compile("(.*[a-zA-Z].*[0-9].*)"),
        Pattern.compile("(.*[4].*[0-9].*)"),
        Pattern.compile("(Aylıq ödəniş məbləği).*[0-9].*"),
        Pattern.compile("(.*[ödəniş tarixi] 	03/12/2009.*)"),
        Pattern.compile("(.*[tarixi] 	15/12/2009.*)"),
        Pattern.compile("(.*[kreditləri].*)"),
        Pattern.compile("(.*[bitmə tarixi].* 	15/12/2009)"),
        Pattern.compile("(.*[0-9].*)")
    };
}
