package com.ecommerce.commande.domain.core;


import com.ecommerce.commande.domain.commande.create.CommandeCreateProcessInput;

public abstract class AbstractProcessImpl<T extends AbstractProcessInput> implements  AbstractProcess<T> {

    @Override
    public Result exec(T input) {
        Result result = new Result();
        validate(input, result);
        if (!result.hasError()) {
            run( input,result);
        }
        return result;
    }

    public abstract void validate(T input, Result result);

    public abstract void run(T input, Result result);
}
