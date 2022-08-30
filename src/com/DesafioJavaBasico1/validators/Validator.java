package com.DesafioJavaBasico1.validators;

import java.util.ArrayList;
import java.util.List;

public abstract class Validator {

    private final List<String> errors = new ArrayList<>();

    public abstract boolean ehValid();

    public List<String> getErrors(){
        return errors;
    }
    public void addErrors(String error){
        this.errors.add(error);
    }

}
