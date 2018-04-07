package sample.tablebuilder.celldescriptions;

import javafx.geometry.Pos;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;
import sample.tablebuilder.ITableColumnCell;

public class tableTestName implements ITableColumnCell<Object,String> {
    @Override
    public Callback<TableColumn<Object, String>, TableCell<Object, String>> getCell () {
        return param -> new TableCell <Object, String> (){
            @Override
            protected void updateItem ( String item , boolean empty ) {
                if(item!=null){
                    setStyle ( "-fx-font-style: italic; -fx-font-weight: bold;");
                    setAlignment( Pos.CENTER_LEFT);
                    setText ( String.valueOf ( item ) );
                }
            }
        };
    }
}

