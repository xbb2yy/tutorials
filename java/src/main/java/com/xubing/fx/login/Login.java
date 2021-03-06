package com.xubing.fx.login;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX Welcome");


        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 300, 275);
        System.out.println(Login.class.getResource("/login.css"));
        scene.getStylesheets().add(Login.class.getResource("/login.css").toExternalForm());
        // grid.setGridLinesVisible(true);
        primaryStage.setScene(scene);

        Text scenetitle = new Text("Welcome");
        scenetitle.setId("welcome-text");
        grid.add(scenetitle, 0, 0, 2, 1);

        //创建Label对象，放到第0列，第1行
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        //创建文本输入框，放到第1列，第1行
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button btn = new Button("Sign in");
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        hBox.getChildren().add(btn);
        grid.add(hBox, 1, 4);

        final Text actiontarget = new Text();//增加用于显示信息的文本
        grid.add(actiontarget, 1, 6);

        //注册事件handler
        btn.setOnAction(e -> {
            actiontarget.setId("actiontarget");
            actiontarget.setText("Sign in button pressed");
        });
        primaryStage.show();


    }
}
