package sample.tablebuilder.celldescriptions;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;
import sample.tablebuilder.ITableColumnCell;

public class tableTestDouble implements ITableColumnCell<Object, Double> {
    @Override
    public Callback <TableColumn <Object, Double>, TableCell <Object, Double>> getCell () {
        return param -> new TableCell <Object, Double> () {
            @Override
            protected void updateItem ( Double item , boolean empty ) {


                if ( item != null ) {
                    if ( item < 0 ) {
                        setStyle ( getStyle () + "-fx-text-fill: red" );
                    } else {
                        setStyle ( getStyle () + "-fx-text-fill: black" );
                    }
                    setText ( String.valueOf ( item ) );
                    setPadding ( new Insets ( 0 , 20 , 0 , 0 ) );
                    setAlignment ( Pos.CENTER_RIGHT );
                }
            }
        };
    }
}
