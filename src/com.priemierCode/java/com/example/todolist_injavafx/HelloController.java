package com.example.todolist_injavafx;

import com.example.todolist_injavafx.DataModal.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class HelloController {
    private List<TodoItem> items;

    @FXML
    public ListView<TodoItem> todolist;


    @FXML
    public TextArea textArea;

    public void initialize(){
        TodoItem todoItem =new TodoItem("My Birthday", "Buy me an iphone", LocalDate.of(2022, Month.FEBRUARY, 22));
        TodoItem todoItem1 =new TodoItem("Doctor appointment", "Bring Mask", LocalDate.of(2022, Month.MARCH, 22));
        TodoItem todoItem2 =new TodoItem("Fix water pump", "fizxing water pum", LocalDate.of(2022, Month.FEBRUARY, 22));
        TodoItem todoItem3 =new TodoItem("Lown mower", "Lawning mower", LocalDate.of(2022, Month.FEBRUARY, 22));


        items = new ArrayList<>();
        items.add(todoItem);
        items.add(todoItem1);
        items.add(todoItem2);
        items.add(todoItem3);

        todolist.getItems().setAll(items);
        todolist.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

    }

    @FXML
    public void handleClickListView(){
       TodoItem item  = todolist.getSelectionModel().getSelectedItem();
       textArea.setText(item.getDetails());
    }
}