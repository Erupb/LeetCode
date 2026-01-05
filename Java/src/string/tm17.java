package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class tm17 {
    public static void main(String[] args) {
        String digits = "234";
        int len = digits.length();
        List<String> result = new ArrayList<>();
        switch (len) {
            case 0:
                break;
            case 1:
                result = fillArray(digits);
                break;
            case 2:
                List<String> list1 = fillArray(String.valueOf(digits.charAt(0)));
                List<String> list2 = fillArray(String.valueOf(digits.charAt(1)));
                result = concatLists(list1, list2);
                break;
            case 3:
                List<String> lista = fillArray(String.valueOf(digits.charAt(0)));
                List<String> listb = fillArray(String.valueOf(digits.charAt(1)));
                List<String> listc = fillArray(String.valueOf(digits.charAt(2)));
                result = concatLists(lista, listb);
                result = concatLists(result, listc);
                break;
            case 4:
                List<String> list4 = fillArray(String.valueOf(digits.charAt(0)));
                List<String> list5 = fillArray(String.valueOf(digits.charAt(1)));
                List<String> list6 = fillArray(String.valueOf(digits.charAt(2)));
                List<String> list7 = fillArray(String.valueOf(digits.charAt(2)));
                result = concatLists(list4, list5);
                result = concatLists(result, list6);
                result = concatLists(result, list7);
                break;
        }
        System.out.println(result);
    }

    public static List<String> concatLists(List<String> list1, List<String> list2){
        List<String> result = new ArrayList<>();
        for(int i=0; i<list1.size(); i++){
            for(int j=0; j<list2.size(); j++){
                Collections.addAll(result, list1.get(i) + list2.get(j));
            }
        }
        return result;
    }

    public static List<String> fillArray(String digits){
        List<String> array = new ArrayList<>();
        switch (digits){
            case "2":
                Collections.addAll(array, "a", "b", "c");
                break;
            case "3":
                Collections.addAll(array, "d", "e", "f");
                break;
            case "4":
                Collections.addAll(array, "g", "h", "i");
                break;
            case "5":
                Collections.addAll(array, "j", "k", "l");
                break;
            case "6":
                Collections.addAll(array, "m", "n", "o");
                break;
            case "7":
                Collections.addAll(array, "p", "q", "r", "s");
                break;
            case "8":
                Collections.addAll(array, "t", "u", "v");
                break;
            case "9":
                Collections.addAll(array, "w", "x", "y", "z");
                break;
        }
        return array;
    }
}
