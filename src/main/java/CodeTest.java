import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;

public class CodeTest {
    public static void main(String[] args) {
        System.out.println("Please replace this with calls to all completed tests.");
    }

    public static String[] reverseArray(String[] input) {
        // add code here
        for (int i=0; i< input.length/2;i++){
            String auxValue = input[i];
            input[i] = input[input.length-1-i];
            input[input.length-1-i] = auxValue;
        }
        return input;
    }

    public static String[] uppercaseArray(String[] input) {
        // add code here
        List<String> auxList = Arrays.asList(input);
        auxList.replaceAll(String::toUpperCase);
        String[] arrayInput = auxList.stream().toArray(String[]::new);
        return arrayInput;
        //return input;
    }

    public static int findWordCount(String text, String wordToFind) {
        // add code here
        String[] allWords = text.split(" ");
        int count = 0;
        for (int i=0;i< allWords.length;i++){
            String auxWord = allWords[i];
            if(wordToFind.equals(auxWord)){
                count++;
            }
        }
        return count;
        //return 0;
    }

    public static Function<Integer,Integer> composeU(Function<Integer,Integer> f1, Function<Integer,Integer> f2){
        // add code here
        return f1.andThen(f2);
        //return null;
    }

    public static void writeContentsToConsole() throws IOException {
        // add code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Adri\\Desktop\\JTask\\java-code-test\\src\\main\\java\\test_file.txt"));
        String auxLine = null;
        String auxString ="";

        while((auxLine = bufferedReader.readLine())!=null){
            auxString+=auxLine;
        }
        System.out.print(auxString);
    }

    public static void handleInvalidArgument() {
        // add code here
        try{
            Integer.parseInt("10abc");
        }catch(NumberFormatException e){
            e.getMessage();
            System.out.println("Error during integer conversion");
        }

    }

    public static void puzzle(){
        // add code here
        int[] numbers = new int[10];
        for (int i=0;i< numbers.length;i++){
            numbers[i] = ThreadLocalRandom.current().nextInt(1,6);
        }

        int lastNumber = numbers[0];
        System.out.print(lastNumber);
        if(numbers.length>1){
            for(int i=1;i< numbers.length;i++){
                int numberAux = numbers[i];
                if(lastNumber==numberAux){
                    System.out.print("Snap");
                    break;
                }else{
                    System.out.print(numberAux);
                    lastNumber = numberAux;
                }
            }

        }

    }
}