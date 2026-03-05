import javafx.animation.Interpolator;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
//animazioni/transizioni
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class MainController extends Application {
    private int count = 1;
    @Override
    public void start(Stage stage) {

        //VBox space5 = new VBox(5); //spazio tra elementi
        BorderPane root = new BorderPane(); // gestisce Posizione

        //cose utili
        String secondColor = "#363636";
        String sfondoColore = "#BFA9AB";
//top

        //Titel
       /* Label titledPane = new Label("ΔChanger");
        //  root.setTop(titledPane);
        titledPane.setStyle("-fx-text-fill: "+secondColor+"; -fx-font-size: 30px;   -fx-font-weight: bold;");*/

        //Button Option
        Image iconOpzione = new Image(MainController.class.getResourceAsStream("/settings-sliders.png"));
        ImageView viewOpzione = new ImageView(iconOpzione);

        viewOpzione.setFitHeight(50);
        viewOpzione.setFitWidth(50);
        viewOpzione.setPreserveRatio(true);

        Button opzioneButton = new Button();
        opzioneButton.setGraphic(viewOpzione);

        opzioneButton.setStyle("-fx-background-color: transparent;");

       // Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1),  new KeyValue(color));
        /*HBox opzioneHBox = new HBox(opzioneButton);
        opzioneHBox.setAlignment(Pos.TOP_RIGHT);

        HBox tit = new HBox(titledPane);
        tit.setAlignment(Pos.TOP_RIGHT);*/

        BorderPane top = new BorderPane();
        //top.setLeft(titledPane); // per TITOLO
        top.setRight(opzioneButton);

        root.setTop(top);

        Line line = new Line();
        line.setStartX(5);
        line.setStartY(25);

        line.setEndX(5);
        line.setEndY(188);



//center

        //goals Button

        Button btnGoal1 = new Button("Completa obiettivo");

        VBox goalsButton = new VBox(10);
        goalsButton.setAlignment(Pos.CENTER);
        root.setCenter(goalsButton);

        //add button



        String nameGoal1;
        String borderDefault = "-fx-border-style: solid; -fx-border-width: 1px; -fx-border-color:black;";
        Button addButton = new Button("Aggiungi Abbitudine");
        addButton.setStyle("-fx-background-color: #ced4da; -fx-text-fill: black; -fx-border-style: solid; -fx-border-width: 2px; -fx-border-color:black;");
        goalsButton.getChildren().add(addButton);
        TextField input = new TextField();
        input.setPromptText("Inserisci l'abitudine");

     //   input.setOnAction(e -> addButton.fire());


        addButton.setOnAction(e -> {

            String name = input.getText();
            Button newGoals = new Button("Abbitudine ["+count+"]"+name);
            newGoals.setStyle("-fx-background-color: #38d9a9; -fx-text-fill: black;");

            goalsButton.getChildren().add(newGoals);
            root.setCenter(goalsButton);
            count++;
        });



        // Source - https://stackoverflow.com/a
// Posted by Sangwon An, modified by community. See post 'Timeline' for change history
// Retrieved 2026-01-13, License - CC BY-SA 4.0

      //  BorderPane pane = new BorderPane();
      //  pane.setBackground(new Background(new BackgroundFill(Color.GRAY, null, null)));



//buttom



        //imagini bottoni
        Image iconGoals = new Image(MainController.class.getResourceAsStream("/diagram-cells.png"));
        Image iconStats = new Image(MainController.class.getResourceAsStream("/chart-histogram.png"));
        Image iconSet = new Image(MainController.class.getResourceAsStream("/settings.png"));
        Image iconAdd = new Image(MainController.class.getResourceAsStream("/add.png"));


        ImageView viewGoals = new ImageView(iconGoals);
        ImageView viewStats = new ImageView(iconStats);
        ImageView viewSet = new ImageView(iconSet);
        ImageView viewAdd = new ImageView(iconAdd);


        viewGoals.setPreserveRatio(true);
        viewStats.setPreserveRatio(true);
        viewSet.setPreserveRatio(true);
        viewAdd.setPreserveRatio(true);



        viewStats.setFitHeight(32);
        viewStats.setFitWidth(32);

        viewSet.setFitHeight(32);
        viewSet.setFitWidth(32);
        
        viewGoals.setFitHeight(32);
        viewGoals.setFitWidth(32);

        viewAdd.setFitHeight(52);
        viewAdd.setFitWidth(52);


        Button btnGoals = new Button();
        Button btnStats = new Button();
        Button btnSetting = new Button();
        Button btnAdd = new Button();

        btnGoals.setGraphic(viewGoals);
        btnStats.setGraphic(viewStats);
        btnSetting.setGraphic(viewSet);
        btnAdd.setGraphic(viewAdd);

        btnGoals.setStyle("-fx-background-color: transparent; -fx-padding: 16px;");
        btnStats.setStyle("-fx-background-color: transparent; -fx-padding: 16px;");
        btnSetting.setStyle("-fx-background-color: transparent; -fx-padding: 16px;");
        btnAdd.setStyle("-fx-background-color: transparent; -fx-padding: 16px;");

        HBox buttom = new HBox(20, btnGoals, btnStats, btnSetting, btnAdd);
        buttom.setAlignment(Pos.CENTER);

        

        root.setBottom(buttom);


        //windows
        Scene scene = new Scene(root, 400, 600);
        scene.getStylesheets().add("style.css");

        //sfondo
        Image sfondo = new Image(MainController.class.getResourceAsStream("/Gemini_Generated_Image_7064bm7064bm7064.png"));
        ImageView viewSfondo = new ImageView(sfondo);
        viewSfondo.setPreserveRatio(true);

        viewSfondo.setFitHeight(600);
        viewSfondo.setFitHeight(400);
        viewSfondo.setStyle("-fx-z-index: -1;");
        root.setCenter(viewSfondo);
        //fine sfondo

       // root.setStyle("-fx-background-color: "+sfondoColore+";");
        stage.setTitle("ΔChanger");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {

        launch();
    }
}
