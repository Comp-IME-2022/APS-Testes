/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author davi
 */
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String cadeia;
        char chave;
        
        cadeia = menu(input, "Entre com a cadeia de letras:");
        chave = menu(input, "Entre com a letra chave:").charAt(0);
        var responseString = unidade3(cadeia, chave);
        System.out.println("Response: " + responseString);
        
        //cadeia = menu(input, "Entre com a cadeia de letras em caixa alta:");
        //var responseInteger = unidade4(cadeia);
        //System.out.println("Response: " + responseInteger);
    }
    
    public static String menu(Scanner input, String msg) {
        System.out.println(msg);
        String txt = input.nextLine();
        return txt;
    }
    
    public static String unidade3(String cadeia, char chave) {
	if ("".equals(cadeia)) return "cadeia vazia";

	cadeia = cadeia.toUpperCase();
        chave = String.valueOf(chave).toUpperCase().charAt(0);
        
	for (int i = 0; i < cadeia.length(); i++){
            char c = cadeia.charAt(i);
            
            if (((c < 'A') || (c > 'Z')) || ((chave < 'A') || (chave > 'Z'))) 
                return "entrada incorreta";
	}
        
        cadeia = cadeia.replace(chave, String.valueOf(chave).toLowerCase().charAt(0));
	return new StringBuilder(cadeia).reverse().toString();
    }
    
    public static Integer unidade4(String cadeia) {
	int count = 0;
	int i;
	
        if ("A".equals(cadeia.substring(0,1))){
            for (i=0; i < cadeia.length(); i++){
                char c = cadeia.charAt(i);
                if (c == 'B') count ++;
            }
	} else if ("B".equals(cadeia.substring(0,1))){
            for (i=0; i < cadeia.length(); i++){
                char c = cadeia.charAt(i);
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) count ++;
            }
	} else {
            return -1;
	}
        
        return count;
    }
    
    
}
