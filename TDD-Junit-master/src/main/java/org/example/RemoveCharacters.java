package org.example;

import java.util.Scanner;

public class RemoveCharacters {
    public String removeA(String input){
        String result = input;

        if(input.length()<=2 && input.contains("A") ){
            result = result.replace("A","");
        }
        else{
            String firstTwoCharacters = input.substring(0,2);
            String restCharacters = input.substring(2,input.length());
            result = firstTwoCharacters.replace("A","") + restCharacters;
        }

        return result;

    }
}
