import java.util.regex.Matcher;
import java.util.regex.Pattern;

// example of regular expressions
public class Main {
    public static void main(String[] args) {
        String text = "FIFA will never regret it";
        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
        for(String word : words){
            System.out.println(word);
        }


        System.out.println();
        String input = "+12343454556";
        boolean result = input.matches("(\\+*)\\d{11}");
        if(result){
            System.out.println("It is a phone number");
        }
        else{
            System.out.println("It is not a phone number!");
        }


        System.out.println("\nClass Pattern");
        String input2 = "Hello";
        boolean found = Pattern.matches("Hello", input2);
        if(found)
            System.out.println("Найдено");
        else
            System.out.println("Не найдено");


        System.out.println("\nClass Matcher");
        String input3 = "Hello";
        Pattern pattern = Pattern.compile("Hello");
        Matcher matcher = pattern.matcher(input3);
        boolean found3 = matcher.matches();
        if(found3) // true
            System.out.println("Найдено");
        else
            System.out.println("Не найдено");


        System.out.println("\n");
        String inputT = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern patternN = Pattern.compile("Java(\\w*)"); // шаблон
        Matcher matcherM = patternN.matcher(inputT);
        while(matcherM.find())
            System.out.println(matcherM.group());


        System.out.println("\nЗамена в строке");
        String input21 = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern pattern21 = Pattern.compile("Java(\\w*)");
        Matcher matcher21 = pattern21.matcher(input21);
        String newStr = matcher21.replaceAll("HTML");
        System.out.println(newStr); // Hello HTML! Hello HTML! HTML 8.

        /* Также надо отметить, что в классе String также имеется метод replaceAll() с подобным действием: */
        String input22 = "Hello Java! Hello JavaScript! JavaSE 8.";
        String myStr =input22.replaceAll("Java(\\w*)", "HTML");
        System.out.println(myStr); // Hello HTML! Hello HTML! HTML 8.


        System.out.println("\nРазделение строки на лексемы");
        String input24 = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern pattern24 = Pattern.compile("[ ,.!?]");
        String[] words24 = pattern24.split(input24);
        for(String word:words24)
            System.out.println(word);


        System.out.println("\nРазделение строки на лексемы 2");
        String input25 = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern pattern25 = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");
        String[] words25 = pattern25.split(input25);
        for(String word:words25)
            System.out.println(word);
    }
}