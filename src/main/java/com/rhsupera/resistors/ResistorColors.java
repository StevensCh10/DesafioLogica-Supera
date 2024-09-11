package com.rhsupera.resistors;

public class ResistorColors {

    private String getColor(int color) {
        return switch (color) {
            case 0 -> "preto";
            case 1 -> "marrom";
            case 2 -> "vermelho";
            case 3 -> "laranja";
            case 4 -> "amarelo";
            case 5 -> "verde";
            case 6 -> "azul";
            case 7 -> "violeta";
            case 8 -> "cinza";
            case 9 -> "branco";
            default -> "Valor não conhecido";
        };
    }
    
    public String getColors(String s){
        String subInitial = s.substring(0, (s.length() - 5) );
        subInitial = transformLetterToDig(subInitial);

        int condicao;
        if(subInitial.length() < 3){
            condicao = subInitial.length();
        }else{
            condicao = 3;
        }

        String result = "";
        for(int i = 0; i < condicao; i++){
            Character c = subInitial.charAt(i);

            switch (i) {
                case 0 -> result = result + getColor(Character.getNumericValue(c)) + " ";
                case 1 -> result = result + getColor(Character.getNumericValue(c)) + " ";
                default -> {
                    String subAux = subInitial.substring(2, subInitial.length());
                    int qtdZeros = subAux.length();
                    System.out.println(qtdZeros);
                    result = result + getColor(qtdZeros) + " ";
                    break;
                }
            }
        }

        if(subInitial.length() < 3){
            result = result + getColor(0) + " ";
        }
        return result + "dourado";
    }

    private String transformLetterToDig(String subString){
        for(int i = 0; i < subString.length(); i++){
            Character c = subString.charAt(i);
            if(c == 'k'){
                subString = adicionarZeros(subString, i, "000");
            }else if(c == 'M'){
                subString = adicionarZeros(subString, i, "000000");
            }
        }
        return subString;
    }

    private String adicionarZeros(String str, int posicao, String zeros) {
        String parte1 = str.substring(0, posicao);
        return parte1 + zeros;
    }

}
