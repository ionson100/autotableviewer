package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import sample.tablebuilder.BuilderTable;
import sun.security.jgss.GSSUtil;

import java.net.URL;
import java.time.LocalDate;
import java.util.*;

public class Controller implements Initializable {
    public TableView my_table;

    @Override
    public void initialize ( URL location , ResourceBundle resources ) {

        List<MyView> myViews=new ArrayList <> (  );
        for (int i = 0; i < 20; i++) {
            MyView view=new MyView ();
            view._pk=1;
            view.date= new Date ();
            view.name= UUID.randomUUID ().toString ();
            myViews.add ( view );
        }
        new BuilderTable ().build ( myViews,my_table );
    }
}
