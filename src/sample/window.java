package sample;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class window {


    public Scene setup(Stage primaryStage) {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        //primaryStage.setScene(new Scene(root, 500, 300));
        //primaryStage.show();

        //Creating my 4 choices
        Rectangle rect1 = new Rectangle(120, 120);
        rect1.setFill(Color.STEELBLUE);
        Rectangle rect2 = new Rectangle(120, 120);
        rect2.setFill(Color.DARKKHAKI);
        Rectangle rect3 = new Rectangle(120, 120);
        rect3.setFill(Color.MAROON);
        Rectangle rect4 = new Rectangle(120, 120);
        rect4.setFill(Color.ORANGE);
        Rectangle rect5 = new Rectangle(120, 120);
        rect5.setFill(Color.DIMGREY);

        Paint color1 = rect1.getFill();
        Paint color2 = rect2.getFill();
        Paint color3 = rect3.getFill();
        Paint color4 = rect4.getFill();
        Paint color5 = rect5.getFill();

        EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                if (event.getEventType() == MouseEvent.MOUSE_ENTERED) {
                    if (event.getTarget() == rect1) {
                        rect2.setFill(color1);
                        rect3.setFill(color1);
                        rect4.setFill(color1);
                        rect5.setFill(color1);
                    }
                     else if (event.getTarget() == rect2) {
                        rect1.setFill(color2);
                        rect3.setFill(color2);
                        rect4.setFill(color2);
                        rect5.setFill(color2);
                    }
                     else if (event.getTarget() == rect3) {
                        rect1.setFill(color3);
                        rect2.setFill(color3);
                        rect4.setFill(color3);
                        rect5.setFill(color3);
                    }
                     else if (event.getTarget() == rect4) {
                        rect1.setFill(color4);
                        rect3.setFill(color4);
                        rect2.setFill(color4);
                        rect5.setFill(color4);
                    }
                     else if (event.getTarget() == rect5) {
                        rect1.setFill(color5);
                        rect3.setFill(color5);
                        rect2.setFill(color5);
                        rect4.setFill(color5);
                    }
                    }
                else if (event.getEventType() == MouseEvent.MOUSE_EXITED) {

                    rect1.setFill(color1);
                    rect2.setFill(color2);
                    rect3.setFill(color3);
                    rect4.setFill(color4);
                    rect5.setFill(color5);
                }

            }
        };
        rect1.addEventFilter(MouseEvent.MOUSE_ENTERED, handler);
        rect1.addEventFilter(MouseEvent.MOUSE_EXITED, handler);

        rect2.addEventFilter(MouseEvent.MOUSE_ENTERED, handler);
        rect2.addEventFilter(MouseEvent.MOUSE_EXITED, handler);

        rect3.addEventFilter(MouseEvent.MOUSE_ENTERED, handler);
        rect3.addEventFilter(MouseEvent.MOUSE_EXITED, handler);

        rect4.addEventFilter(MouseEvent.MOUSE_ENTERED, handler);
        rect4.addEventFilter(MouseEvent.MOUSE_EXITED, handler);

        rect5.addEventFilter(MouseEvent.MOUSE_ENTERED, handler);
        rect5.addEventFilter(MouseEvent.MOUSE_EXITED, handler);


        GridPane layout1 = new GridPane();
        layout1.setAlignment(Pos.CENTER);
        layout1.setHgap(100);
        layout1.setVgap(100);


        //layout1.setGridLinesVisible(true);
        layout1.add(rect1, 0, 0);
        layout1.add(rect2, 2, 0);
        layout1.add(rect3, 0, 2);
        layout1.add(rect4, 2, 2);
        layout1.add(rect5,1,1);
        Scene scene1 = new Scene(layout1, 800, 800);
        primaryStage.setTitle("Four Choices");
        primaryStage.setScene(scene1);
        primaryStage.show();


        return scene1;
    }
}


