package com.rhsupera.resistors;

public class VerifyString {

    public boolean validateString(String in){
        String subInitial = in.substring(0, (in.length() - 5) );
        return verifyCaracters(subInitial) && validateEndOfString(in.substring(in.length() - 5));
    }
    
    private boolean validateEndOfString(String subString){
        return subString.equals(" ohms");
    }

    private boolean verifyCaracters(String subString){
        for(int i = 0; i < subString.length(); i++){
            Character c = subString.charAt(i);
            if(!Character.isDigit(c) && c != 'k' && c != 'M' && c != '.'){
                return false;
            }
        }
        return true;
    }
}
