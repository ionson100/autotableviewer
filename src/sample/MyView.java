package sample;

import javafx.beans.property.SimpleIntegerProperty;
import org.apache.log4j.Logger;
import sample.tablebuilder.*;
import sample.tablebuilder.celldescriptions.*;



public class MyView {
    private static final Logger log = Logger.getLogger ( MyView.class );
    @DisplayColumn ( name_column = "_pk", width = 70, ClassTableCell = tableTestCenter.class )
    public int _pk ;

    @DisplayColumn(name_column = "date")
    public java.util.Date date;// data чека

    @DisplayColumn(name_column = "name",ClassTableCell = tableTestName.class,width = 500)
    public String name;// data чека

    @DisplayColumn(name_column = "price",ClassTableCell = tableTestDouble.class)
    public double price=1000;// data чека

    @DisplayColumn(name_column = "price1",ClassTableCell = tableTestDouble.class)
    public double price1=-10000;// data чека

}


