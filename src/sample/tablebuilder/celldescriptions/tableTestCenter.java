package sample.tablebuilder.celldescriptions;

import javafx.geometry.Pos;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;
import sample.tablebuilder.ITableColumnCell;

public class tableTestCenter implements ITableColumnCell<Object,Object> {
   @Override
   public Callback<TableColumn<Object, Object>, TableCell<Object, Object>> getCell () {
       return param -> new TableCell <Object, Object> (){
           @Override
           protected void updateItem ( Object item , boolean empty ) {
               if(item!=null){

                   setAlignment( Pos.CENTER);
                   setText ( String.valueOf ( item ) );
               }
           }
       };
   }
}

