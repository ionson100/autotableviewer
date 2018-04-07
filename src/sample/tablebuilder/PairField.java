package sample.tablebuilder;

import java.lang.reflect.Field;

public class PairField{

    public PairField(String name,Field value){
        this.name=name;
        this.value=value;
    }

    public String name;

    public Field value;

    @Override
    public String toString()  {
        return this.name;
    }
}
