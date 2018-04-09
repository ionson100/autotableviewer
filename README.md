# autotableviewer
>Обезличенный построитель таблиц для  JavaFx TableView.
>Для этого маркируем  публичные поля нашего типа анотациями.




```java
public class MyView {
    private static final Logger log = Logger.getLogger ( MyView.class );
    @DisplayColumn ( name_column = "_pk", width = 70, ClassTableCell = tableTestCenter.class )
    public int _pk ;

    @DisplayColumn(name_column = "date")
    public java.util.Date date;// data

    @DisplayColumn(name_column = "name",ClassTableCell = tableTestName.class,width = 500)
    public String name;

    @DisplayColumn(name_column = "price",ClassTableCell = tableTestDouble.class)
    public double price=1000;//

    @DisplayColumn(name_column = "price1",ClassTableCell = tableTestDouble.class)
    public double price1=-10000;

}
//где name_columh - название колонки.
//width - ширина колонки по умолчанию -200;не обязательно.
//ClassTableCell - тип колбека для создания ячейки (должен наследовать ITableColumnCell). не обязательно.
```


```java
public class tableTestDouble implements ITableColumnCell<Object, Double> {
    @Override
    public Callback <TableColumn <Object, Double>, TableCell <Object, Double>> getCell () {
        return param -> new TableCell <Object, Double> () {
            @Override
            protected void updateItem ( Double item , boolean empty ) {


                if ( item != null ) {
                    if ( item < 0 ) {
                        setStyle ( "-fx-text-fill: red" );
                    } else {
                        setStyle ( "-fx-text-fill: black" );
                    }
                    setText ( String.valueOf ( item ) );
                    setPadding ( new Insets ( 0 , 20 , 0 , 0 ) );
                    setAlignment ( Pos.CENTER_RIGHT );
                }
            }
        };
    }
}
```
после этого в  контроллере создаем коллекцию из наших объектов и  с сcылкой на таблицу помещаем все в построитель
```java
 List<MyView> myViews=new ArrayList <> (  );
        for (int i = 0; i < 20; i++) {
            MyView view=new MyView ();
            view._pk=1;
            view.date= new Date ();
            view.name= UUID.randomUUID ().toString ();
            myViews.add ( view );
        }
        new BuilderTable ().build ( myViews,my_table );
```
Что происходит : Создается на лету новый тип, кешируется на диск( при программировании полей не забывать удалять кеш классов)
Рефлексией исследуется объект, создается кеш его фиелдов, и строятся колонки таблици.
Пользовательские действия ( регулирование ширины колонок, их видимость) тоже кешируется.
