package Stringminp;

public class Regex {



    /*
    RegEx - Regular Expression
    PMA - Pattern Matching Algorithm
    [] - expression
    {} - length
    ^ - not
    [0-9]{5} - 5 digits
    [a-z]{4} - any word of length 4 and should be lowercase
    [A-Za-z]{3,7} -any word of min length 3 and max length 7
    [A-Z]{1,} - min uppercase letter
     */

    public static void main(String[] args) {
        String s = "!@a2dM 4 s A AHHHadsa 9 9 3 92* ** d";
        System.out.println(s.replaceAll("[^a-zA-Z]", ""));
        System.out.println(s.replaceAll("[^a-zA-Z]", "").length());
        System.out.println(s.replaceAll("[^0-9]", ""));
        System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
        System.out.println(s.replaceAll("[ a-zA-Z0-9]","" +
                ""));
    }
}
