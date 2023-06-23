//---------SHAILAGYA SINGH 2019205--------------------------
//---------VARUN MALIK 2019216------------------------------
//---------COLOR SWTICH GAME DEADLINE 2------------------------
package sample;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.shape.*;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.Group;
import java.io.FileInputStream;
import javafx.util.Duration;


public class Main extends Application {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5,button6,button7,button8,button9,button10,button11;
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setResizable(false);
        primaryStage.setTitle("COLOR SWITCH GAME");
        StackPane layout=new StackPane();
        BackgroundFill background_fill = new BackgroundFill(Color.BLACK,
                CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(background_fill);
        layout.setBackground(background);

        FileInputStream inputstream = new FileInputStream("C:\\Users\\SHAILAGYA\\maingif.gif");
        Image image = new Image(inputstream);
        ImageView imageView = new ImageView(image);
        imageView.setX(0);
        imageView.setY(0);

        FileInputStream input3 = new FileInputStream("C:\\Users\\SHAILAGYA\\Downloads\\color.png");
        Image head = new Image(input3);
        ImageView heading = new ImageView(head);
        heading.setX(30);
        heading.setY(20);
        heading.setFitHeight(300);
        heading.setFitWidth(370);


        button1=new Button();
        button1.setText("START GAME");
        button1.setLayoutX(700);
        button1.setLayoutY(70);
        button1.setPrefSize(200,50);
        button1.setStyle("-fx-background-color: #EE7BE3; -fx-font-size: 2em;-fx-background-radius: 5em;");

        button2=new Button();
        button2.setText("LOAD GAME");
        button2.setLayoutX(700);
        button2.setLayoutY(140);
        button2.setPrefSize(200,50);
        button2.setStyle("-fx-background-color: #77EBED; -fx-font-size: 2em;-fx-background-radius: 5em;");

        button3=new Button();
        button3.setText("High Score");
        button3.setLayoutX(700);
        button3.setLayoutY(210);
        button3.setPrefSize(200,50);
        button3.setStyle("-fx-background-color: #F6EE0D; -fx-font-size: 2em;-fx-background-radius: 5em;");

        FileInputStream input2 = new FileInputStream("C:\\Users\\SHAILAGYA\\Downloads\\cross.png");
        Image exi = new Image(input2);
        ImageView exit = new ImageView(exi);
        exit.setFitHeight(50);
        exit.setFitWidth(50);
        button5=new Button();
        button5.setLayoutX(850);
        button5.setLayoutY(460);
        button5.setPrefSize(200,50);
        button5.setStyle("-fx-background-color: #BB00EA; -fx-font-size: 2em;-fx-background-radius: 5em;-fx-min-width: 80px; -fx-min-height: 80px; -fx-max-width: 80px; -fx-max-height: 80px;");
        button5.setGraphic(exit);
        button5.setOnAction(e -> Platform.exit());

        FileInputStream input = new FileInputStream("C:\\Users\\SHAILAGYA\\ques.png");
        Image help = new Image(input);
        ImageView Help = new ImageView(help);
        Help.setFitHeight(50);
        Help.setFitWidth(50);
        button4=new Button();
        button4.setLayoutX(40);
        button4.setLayoutY(460);
        button4.setPrefSize(200,50);
        button4.setStyle("-fx-background-color: #BB00EA; -fx-font-size: 2em; -fx-background-radius: 5em; -fx-min-width: 80px; -fx-min-height: 80px; -fx-max-width: 80px; -fx-max-height: 80px;");
        button4.setGraphic(Help);
        Group root1=new Group();
        root1.getChildren().addAll(imageView,button1,button2,button3,button4,button5,heading);
        Scene scene2=new Scene(root1);

        //-------------------------------------------------------scene 2-------------------------------------------------------------------------------------
        FileInputStream stream = new FileInputStream("C:\\Users\\SHAILAGYA\\maingif.gif");
        Image image2 = new Image(stream);
        ImageView imageView2 = new ImageView(image2);
        imageView2.setX(0);
        imageView2.setY(0);

        FileInputStream stream2 = new FileInputStream("C:\\Users\\SHAILAGYA\\ins.png");
        Image image3 = new Image(stream2);
        ImageView imageView3 = new ImageView(image3);
        imageView3.setX(70);
        imageView3.setY(30);
        imageView3.setFitHeight(500);
        imageView3.setFitWidth(850);

        FileInputStream stream6 = new FileInputStream("C:\\Users\\SHAILAGYA\\press.gif");
        Image image6 = new Image(stream6);
        ImageView imageView6 = new ImageView(image6);
        imageView6.setX(500);
        imageView6.setY(250);
        imageView6.setFitHeight(80);
        imageView6.setFitWidth(100);

        FileInputStream stream7 = new FileInputStream("C:\\Users\\SHAILAGYA\\space.png");
        Image image7 = new Image(stream7);
        ImageView imageView7 = new ImageView(image7);
        imageView7.setX(200);
        imageView7.setY(270);
        imageView7.setFitHeight(60);
        imageView7.setFitWidth(200);

        FileInputStream stream8 = new FileInputStream("C:\\Users\\SHAILAGYA\\star.gif");
        Image image8 = new Image(stream8);
        ImageView imageView8 = new ImageView(image8);
        imageView8.setX(180);
        imageView8.setY(400);
        imageView8.setFitHeight(80);
        imageView8.setFitWidth(100);

        FileInputStream stream9 = new FileInputStream("C:\\Users\\SHAILAGYA\\pause.gif");
        Image image9 = new Image(stream9);
        ImageView imageView9 = new ImageView(image9);
        imageView9.setX(800);
        imageView9.setY(350);
        imageView9.setFitHeight(80);
        imageView9.setFitWidth(100);

        FileInputStream input4 = new FileInputStream("C:\\Users\\SHAILAGYA\\Downloads\\arrow.png");
        Image help4 = new Image(input4);
        ImageView Help4 = new ImageView(help4);
        Help4.setFitHeight(50);
        Help4.setFitWidth(50);
        button6=new Button();
        button6.setLayoutX(40);
        button6.setLayoutY(460);
        button6.setPrefSize(200,50);
        button6.setStyle("-fx-background-color: #BB00EA; -fx-font-size: 2em; -fx-background-radius: 5em; -fx-min-width: 80px; -fx-min-height: 80px; -fx-max-width: 80px; -fx-max-height: 80px;");
        button6.setGraphic(Help4);

        //-----------------------------------------------------------scene3---------------------------------------------------------------------------------
        FileInputStream stream1 = new FileInputStream("C:\\Users\\SHAILAGYA\\maingif.gif");
        Image image4 = new Image(stream1);
        ImageView imageView4 = new ImageView(image4);
        imageView4.setX(0);
        imageView4.setY(0);

        FileInputStream input5 = new FileInputStream("C:\\Users\\SHAILAGYA\\Downloads\\arrow.png");
        Image help5 = new Image(input5);
        ImageView Help5 = new ImageView(help5);
        Help5.setFitHeight(50);
        Help5.setFitWidth(50);
        button8=new Button();
        button8.setLayoutX(40);
        button8.setLayoutY(460);
        button8.setPrefSize(200,50);
        button8.setStyle("-fx-background-color: #BB00EA; -fx-font-size: 2em; -fx-background-radius: 5em; -fx-min-width: 80px; -fx-min-height: 80px; -fx-max-width: 80px; -fx-max-height: 80px;");
        button8.setGraphic(Help5);

        FileInputStream stream12 = new FileInputStream("C:\\Users\\SHAILAGYA\\trophy.gif");
        Image image12 = new Image(stream12);
        ImageView imageView12 = new ImageView(image12);
        imageView12.setX(340);
        imageView12.setY(100);
        imageView12.setFitHeight(230);
        imageView12.setFitWidth(270);

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setX(360.0f);
        rectangle1.setY(340.0f);
        rectangle1.setWidth(300.0f);
        rectangle1.setHeight(100.0f);
        rectangle1.setStroke(Color.WHITE);

        FileInputStream stream13 = new FileInputStream("C:\\Users\\SHAILAGYA\\high.png");
        Image image13 = new Image(stream13);
        ImageView imageView13 = new ImageView(image13);
        imageView13.setX(200);
        imageView13.setY(340);
        imageView13.setFitHeight(100);
        imageView13.setFitWidth(150);

        TextField textField2 = new TextField ();
        textField2.setText("NAME");
        textField2.setLayoutX(380);
        textField2.setLayoutY(355);

        TextField textField3 = new TextField ();
        textField3.setText("SCORE");
        textField3.setLayoutX(380);
        textField3.setLayoutY(400);

        //-------------------------------------------------------------scene4--------------------------------------------------------------------------
        FileInputStream stream5 = new FileInputStream("C:\\Users\\SHAILAGYA\\maingif.gif");
        Image image5 = new Image(stream5);
        ImageView imageView5 = new ImageView(image5);
        imageView5.setX(0);
        imageView5.setY(0);

        FileInputStream input7 = new FileInputStream("C:\\Users\\SHAILAGYA\\Downloads\\move.png");
        Image help7 = new Image(input7);
        ImageView Help7 = new ImageView(help7);
        Help7.setFitHeight(50);
        Help7.setFitWidth(50);
        button9=new Button();
        button9.setLayoutX(850);
        button9.setLayoutY(460);
        button9.setPrefSize(200,50);
        button9.setStyle("-fx-background-color: #BB00EA; -fx-font-size: 2em; -fx-background-radius: 5em; -fx-min-width: 80px; -fx-min-height: 80px; -fx-max-width: 80px; -fx-max-height: 80px;");
        button9.setGraphic(Help7);

        FileInputStream stream10 = new FileInputStream("C:\\Users\\SHAILAGYA\\enter.gif");
        Image image10 = new Image(stream10);
        ImageView imageView10 = new ImageView(image10);
        imageView10.setX(340);
        imageView10.setY(175);
        imageView10.setFitHeight(150);
        imageView10.setFitWidth(300);

        FileInputStream stream11 = new FileInputStream("C:\\Users\\SHAILAGYA\\name.png");
        Image image11 = new Image(stream11);
        ImageView imageView11 = new ImageView(image11);
        imageView11.setX(340);
        imageView11.setY(105);
        imageView11.setFitHeight(50);
        imageView11.setFitWidth(300);

        TextField textField = new TextField ();
        textField.setText("ENTER YOUR NAME:");
        textField.setLayoutX(420);
        textField.setLayoutY(240);

        FileInputStream input6 = new FileInputStream("C:\\Users\\SHAILAGYA\\Downloads\\arrow.png");
        Image help6 = new Image(input6);
        ImageView Help6 = new ImageView(help6);
        Help6.setFitHeight(50);
        Help6.setFitWidth(50);
        button7=new Button();
        button7.setLayoutX(40);
        button7.setLayoutY(460);
        button7.setPrefSize(200,50);
        button7.setStyle("-fx-background-color: #BB00EA; -fx-font-size: 2em; -fx-background-radius: 5em; -fx-min-width: 80px; -fx-min-height: 80px; -fx-max-width: 80px; -fx-max-height: 80px;");
        button7.setGraphic(Help6);

        //--------------------------------------------------------------scene 5---------------------------------------------------------------------------------
        FileInputStream stream14 = new FileInputStream("C:\\Users\\SHAILAGYA\\black.png");
        Image image14 = new Image(stream14);
        ImageView imageView14 = new ImageView(image14);
        imageView14.setX(0);
        imageView14.setY(0);
        imageView14.setFitHeight(562);
        imageView14.setFitWidth(1000);

        FileInputStream input8 = new FileInputStream("C:\\Users\\SHAILAGYA\\Downloads\\resume.png");
        Image help8 = new Image(input8);
        ImageView Help8 = new ImageView(help8);
        Help8.setFitHeight(50);
        Help8.setFitWidth(50);
        button10=new Button();
        button10.setLayoutX(40);
        button10.setLayoutY(460);
        button10.setPrefSize(200,50);
        button10.setStyle("-fx-background-color: #BB00EA; -fx-font-size: 2em; -fx-background-radius: 5em; -fx-min-width: 80px; -fx-min-height: 80px; -fx-max-width: 80px; -fx-max-height: 80px;");
        button10.setGraphic(Help8);

        FileInputStream stream18 = new FileInputStream("C:\\Users\\SHAILAGYA\\Downloads\\star.png");
        Image image18 = new Image(stream18);
        ImageView imageView18 = new ImageView(image18);
        imageView18.setX(80);
        imageView18.setY(200);
        imageView18.setFitHeight(110);
        imageView18.setFitWidth(110);
        RotateTransition rotateTransition9 = new RotateTransition();
        rotateTransition9.setDuration(Duration.millis(3500));
        rotateTransition9.setNode(imageView18);
        rotateTransition9.setByAngle(360);
        rotateTransition9.setCycleCount(50);
        rotateTransition9.setAutoReverse(false);
        rotateTransition9.play();

        Arc arc=new Arc();
        arc.setType(ArcType.ROUND);
        arc.setCenterX(150.0f);
        arc.setCenterY(250.0f);
        arc.setRadiusX(150.0f);
        arc.setRadiusY(150.0f);
        arc.setStartAngle(0.0f);arc.setLength(100.0f);
        Circle circ=new Circle(150.0f,250.0f,135.0f);
        Shape clip= Shape.subtract(arc,circ);
        clip.setFill(Color.BLUE);

        Arc arc2=new Arc();
        arc2.setType(ArcType.ROUND);
        arc2.setCenterX(150.0f);
        arc2.setCenterY(250.0f);
        arc2.setRadiusX(150.0f);
        arc2.setRadiusY(150.0f);
        arc2.setStartAngle(90.0f);arc2.setLength(100.0f);
        Circle circ2=new Circle(150.0f,250.0f,135.0f);
        Shape clip2= Shape.subtract(arc2,circ2);
        clip2.setFill(Color.YELLOW);

        Arc arc3=new Arc();
        arc3.setType(ArcType.ROUND);
        arc3.setCenterX(150.0f);
        arc3.setCenterY(250.0f);
        arc3.setRadiusX(150.0f);
        arc3.setRadiusY(150.0f);
        arc3.setStartAngle(180.0f);arc3.setLength(100.0f);
        Shape clip3= Shape.subtract(arc3,circ2);
        clip3.setFill(Color.RED);

        Arc arc4=new Arc();
        arc4.setType(ArcType.ROUND);
        arc4.setCenterX(150.0f);
        arc4.setCenterY(250.0f);
        arc4.setRadiusX(150.0f);
        arc4.setRadiusY(150.0f);
        arc4.setStartAngle(270.0f);arc4.setLength(100.0f);
        Shape clip4= Shape.subtract(arc4,circ2);
        clip4.setFill(Color.PURPLE);

        Group root5=new Group();
        root5.getChildren().addAll(clip,clip2,clip3,clip4);
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.millis(3000));
        rotateTransition.setNode(root5);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(50);
        rotateTransition.setAutoReverse(false);
        rotateTransition.play();

        Arc arc5=new Arc();
        arc5.setType(ArcType.ROUND);
        arc5.setCenterX(500.0f);
        arc5.setCenterY(250.0f);
        arc5.setRadiusX(150.0f);
        arc5.setRadiusY(150.0f);
        arc5.setStartAngle(00.0f);arc5.setLength(100.0f);
        Circle circ3=new Circle(500.0f,250.0f,135.0f);
        Shape clip5=Shape.subtract(arc5,circ3);
        clip5.setFill(Color.PURPLE);

        Arc arc6=new Arc();
        arc6.setType(ArcType.ROUND);
        arc6.setCenterX(500.0f);
        arc6.setCenterY(250.0f);
        arc6.setRadiusX(150.0f);
        arc6.setRadiusY(150.0f);
        arc6.setStartAngle(90.0f);arc6.setLength(100.0f);
        Shape clip6=Shape.subtract(arc6,circ3);
        clip6.setFill(Color.YELLOW);

        Arc arc7=new Arc();
        arc7.setType(ArcType.ROUND);
        arc7.setCenterX(500.0f);
        arc7.setCenterY(250.0f);
        arc7.setRadiusX(150.0f);
        arc7.setRadiusY(150.0f);
        arc7.setStartAngle(270.0f);arc7.setLength(100.0f);
        Shape clip7=Shape.subtract(arc7,circ3);
        clip7.setFill(Color.BLUE);

        Arc arc8=new Arc();
        arc8.setType(ArcType.ROUND);
        arc8.setCenterX(500.0f);
        arc8.setCenterY(250.0f);
        arc8.setRadiusX(150.0f);
        arc8.setRadiusY(150.0f);
        arc8.setStartAngle(180.0f);arc8.setLength(100.0f);
        Shape clip8=Shape.subtract(arc8,circ3);
        clip8.setFill(Color.RED);

        Arc arc9=new Arc();
        arc9.setType(ArcType.ROUND);
        arc9.setCenterX(500.0f);
        arc9.setCenterY(250.0f);
        arc9.setRadiusX(130.0f);
        arc9.setRadiusY(130.0f);
        arc9.setStartAngle(00.0f);arc9.setLength(100.0f);
        Circle circ4=new Circle(500.0f,250.0f,115.0f);
        Shape clip9=Shape.subtract(arc9,circ4);
        clip9.setFill(Color.PURPLE);

        Arc arc10=new Arc();
        arc10.setType(ArcType.ROUND);
        arc10.setCenterX(500.0f);
        arc10.setCenterY(250.0f);
        arc10.setRadiusX(130.0f);
        arc10.setRadiusY(130.0f);
        arc10.setStartAngle(90.0f);arc10.setLength(100.0f);
        Shape clip10=Shape.subtract(arc10,circ4);
        clip10.setFill(Color.BLUE);

        Arc arc11=new Arc();
        arc11.setType(ArcType.ROUND);
        arc11.setCenterX(500.0f);
        arc11.setCenterY(250.0f);
        arc11.setRadiusX(130.0f);
        arc11.setRadiusY(130.0f);
        arc11.setStartAngle(270.0f);arc11.setLength(100.0f);
        Shape clip11=Shape.subtract(arc11,circ4);
        clip11.setFill(Color.YELLOW);

        Arc arc12=new Arc();
        arc12.setType(ArcType.ROUND);
        arc12.setCenterX(500.0f);
        arc12.setCenterY(250.0f);
        arc12.setRadiusX(130.0f);
        arc12.setRadiusY(130.0f);
        arc12.setStartAngle(180.0f);arc12.setLength(100.0f);
        Shape clip12=Shape.subtract(arc12,circ4);
        clip12.setFill(Color.RED);

        Group root8=new Group();
        root8.getChildren().addAll(clip9,clip10,clip11,clip12);
        RotateTransition rotateTransition3 = new RotateTransition();
        rotateTransition3.setDuration(Duration.millis(3500));
        rotateTransition3.setNode(root8);
        rotateTransition3.setByAngle(360);
        rotateTransition3.setCycleCount(50);
        rotateTransition3.setAutoReverse(false);
        rotateTransition3.play();

        Group root7=new Group();
        root7.getChildren().addAll(clip5,clip6,clip7,clip8);
        RotateTransition rotateTransition2 = new RotateTransition();
        rotateTransition2.setDuration(Duration.millis(3000));
        rotateTransition2.setNode(root7);
        rotateTransition2.setByAngle(360);
        rotateTransition2.setCycleCount(50);
        rotateTransition2.setAutoReverse(false);
        rotateTransition2.play();

        Rectangle rectangle10 = new Rectangle();
        rectangle10.setX(750.0f);
        rectangle10.setY(150.0f);
        rectangle10.setWidth(200.0f);
        rectangle10.setHeight(20.0f);
        rectangle10.getTransforms().add(new Rotate(90,750,150));
        rectangle10.setFill(Color.PURPLE);

        Rectangle rectangle11 = new Rectangle();
        rectangle11.setX(750.0f);
        rectangle11.setY(150.0f);
        rectangle11.setWidth(200.0f);
        rectangle11.setHeight(20.0f);
        rectangle11.getTransforms().add(new Rotate(0,750,150));
        rectangle11.setFill(Color.RED);

        Rectangle rectangle12 = new Rectangle();
        rectangle12.setX(950.0f);
        rectangle12.setY(150.0f);
        rectangle12.setWidth(200.0f);
        rectangle12.setHeight(20.0f);
        rectangle12.getTransforms().add(new Rotate(90,950,150));
        rectangle12.setFill(Color.YELLOW);

        Rectangle rectangle13 = new Rectangle();
        rectangle13.setX(950.0f);
        rectangle13.setY(350.0f);
        rectangle13.setWidth(200.0f);
        rectangle13.setHeight(20.0f);
        rectangle13.getTransforms().add(new Rotate(180,950,350));
        rectangle13.setFill(Color.BLUE);

        Group root14=new Group();
        root14.getChildren().addAll(rectangle10,rectangle11,rectangle12,rectangle13);
        RotateTransition rotateTransition8 = new RotateTransition();
        rotateTransition8.setDuration(Duration.millis(3000));
        rotateTransition8.setNode(root14);
        rotateTransition8.setByAngle(360);
        rotateTransition8.setCycleCount(50);
        rotateTransition8.setAutoReverse(false);
        rotateTransition8.play();

//-----------------------------------------------scene6---------------------------------------------------------------------
        FileInputStream stream15 = new FileInputStream("C:\\Users\\SHAILAGYA\\black.png");
        Image image15 = new Image(stream15);
        ImageView imageView15 = new ImageView(image15);
        imageView15.setX(0);
        imageView15.setY(0);
        imageView15.setFitHeight(562);
        imageView15.setFitWidth(1000);

        Circle circ7=new Circle(250.0f,450.0f,20.0f);
        circ7.setFill(Color.PURPLE);
        PathTransition pathTransition = new PathTransition();
        Path path = new Path();
        MoveTo moveTo = new MoveTo(300, 500);
        path.getElements().add(moveTo);
        path.getElements().add (new CubicCurveTo (300f, 300f, 300f, 300f, 300f, 300f));
        pathTransition.setNode(circ7);
        pathTransition.setPath(path);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(50);
        pathTransition.setDuration(Duration.millis(2000));
        pathTransition.setAutoReverse(false);
        pathTransition.play();

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setX(200.0f);
        rectangle2.setY(150.0f);
        rectangle2.setWidth(100.0f);
        rectangle2.setHeight(20.0f);
        rectangle2.getTransforms().add(new Rotate(90,200,150));
        rectangle2.setFill(Color.RED);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.setX(200.0f);
        rectangle3.setY(150.0f);
        rectangle3.setWidth(100.0f);
        rectangle3.setHeight(20.0f);
        rectangle3.getTransforms().add(new Rotate(0,200,150));
        rectangle3.setFill(Color.YELLOW);

        Rectangle rectangle4 = new Rectangle();
        rectangle4.setX(200.0f);
        rectangle4.setY(150.0f);
        rectangle4.setWidth(100.0f);
        rectangle4.setHeight(20.0f);
        rectangle4.getTransforms().add(new Rotate(180,200,150));
        rectangle4.setFill(Color.BLUE);

        Rectangle rectangle5 = new Rectangle();
        rectangle5.setX(200.0f);
        rectangle5.setY(150.0f);
        rectangle5.setWidth(100.0f);
        rectangle5.setHeight(20.0f);
        rectangle5.getTransforms().add(new Rotate(270,200,150));
        rectangle5.setFill(Color.PURPLE);

        Group root10=new Group();
        root10.getChildren().addAll(rectangle2,rectangle3,rectangle4,rectangle5);
        RotateTransition rotateTransition4 = new RotateTransition();
        rotateTransition4.setDuration(Duration.millis(3000));
        rotateTransition4.setNode(root10);
        rotateTransition4.setByAngle(360);
        rotateTransition4.setCycleCount(50);
        rotateTransition4.setAutoReverse(false);
        rotateTransition4.play();

        Rectangle rectangle6 = new Rectangle();
        rectangle6.setX(400.0f);
        rectangle6.setY(150.0f);
        rectangle6.setWidth(100.0f);
        rectangle6.setHeight(20.0f);
        rectangle6.getTransforms().add(new Rotate(270,400,150));
        rectangle6.setFill(Color.RED);

        Rectangle rectangle7 = new Rectangle();
        rectangle7.setX(400.0f);
        rectangle7.setY(150.0f);
        rectangle7.setWidth(100.0f);
        rectangle7.setHeight(20.0f);
        rectangle7.getTransforms().add(new Rotate(180,400,150));
        rectangle7.setFill(Color.YELLOW);

        Rectangle rectangle8 = new Rectangle();
        rectangle8.setX(400.0f);
        rectangle8.setY(150.0f);
        rectangle8.setWidth(100.0f);
        rectangle8.setHeight(20.0f);
        rectangle8.getTransforms().add(new Rotate(0,400,150));
        rectangle8.setFill(Color.BLUE);

        Rectangle rectangle9 = new Rectangle();
        rectangle9.setX(400.0f);
        rectangle9.setY(150.0f);
        rectangle9.setWidth(100.0f);
        rectangle9.setHeight(20.0f);
        rectangle9.getTransforms().add(new Rotate(90,400,150));
        rectangle9.setFill(Color.PURPLE);

        Group root11=new Group();
        root11.getChildren().addAll(rectangle6,rectangle7,rectangle8,rectangle9);
        RotateTransition rotateTransition5 = new RotateTransition();
        rotateTransition5.setDuration(Duration.millis(3000));
        rotateTransition5.setNode(root11);
        rotateTransition5.setByAngle(360);
        rotateTransition5.setCycleCount(50);
        rotateTransition5.setAutoReverse(false);
        rotateTransition5.play();

        Arc ar1=new Arc();
        ar1.setType(ArcType.ROUND);
        ar1.setCenterX(680.0f);
        ar1.setCenterY(330.0f);
        ar1.setRadiusX(100.0f);
        ar1.setRadiusY(100.0f);
        ar1.setStartAngle(00.0f);ar1.setLength(100.0f);
        Circle circ5=new Circle(680.0f,330.0f,80.0f);
        Shape cli1=Shape.subtract(ar1,circ5);
        cli1.setFill(Color.PURPLE);

        Arc ar2=new Arc();
        ar2.setType(ArcType.ROUND);
        ar2.setCenterX(680.0f);
        ar2.setCenterY(330.0f);
        ar2.setRadiusX(100.0f);
        ar2.setRadiusY(100.0f);
        ar2.setStartAngle(90.0f);ar2.setLength(100.0f);
        Shape cli2=Shape.subtract(ar2,circ5);
        cli2.setFill(Color.YELLOW);

        Arc ar3=new Arc();
        ar3.setType(ArcType.ROUND);
        ar3.setCenterX(680.0f);
        ar3.setCenterY(330.0f);
        ar3.setRadiusX(100.0f);
        ar3.setRadiusY(100.0f);
        ar3.setStartAngle(180.0f);ar3.setLength(100.0f);
        Shape cli3=Shape.subtract(ar3,circ5);
        cli3.setFill(Color.BLUE);

        Arc ar4=new Arc();
        ar4.setType(ArcType.ROUND);
        ar4.setCenterX(680.0f);
        ar4.setCenterY(330.0f);
        ar4.setRadiusX(100.0f);
        ar4.setRadiusY(100.0f);
        ar4.setStartAngle(270.0f);ar4.setLength(100.0f);
        Shape cli4=Shape.subtract(ar4,circ5);
        cli4.setFill(Color.RED);

        Arc ar5=new Arc();
        ar5.setType(ArcType.ROUND);
        ar5.setCenterX(870.0f);
        ar5.setCenterY(330.0f);
        ar5.setRadiusX(100.0f);
        ar5.setRadiusY(100.0f);
        ar5.setStartAngle(00.0f);ar5.setLength(100.0f);
        Circle circ6=new Circle(870.0f,330.0f,80.0f);
        Shape cli5=Shape.subtract(ar5,circ6);
        cli5.setFill(Color.BLUE);

        Arc ar6=new Arc();
        ar6.setType(ArcType.ROUND);
        ar6.setCenterX(870.0f);
        ar6.setCenterY(330.0f);
        ar6.setRadiusX(100.0f);
        ar6.setRadiusY(100.0f);
        ar6.setStartAngle(90.0f);ar6.setLength(100.0f);
        Shape cli6=Shape.subtract(ar6,circ6);
        cli6.setFill(Color.PURPLE);

        Arc ar7=new Arc();
        ar7.setType(ArcType.ROUND);
        ar7.setCenterX(870.0f);
        ar7.setCenterY(330.0f);
        ar7.setRadiusX(100.0f);
        ar7.setRadiusY(100.0f);
        ar7.setStartAngle(180.0f);ar7.setLength(100.0f);
        Shape cli7=Shape.subtract(ar7,circ6);
        cli7.setFill(Color.RED);

        Arc ar8=new Arc();
        ar8.setType(ArcType.ROUND);
        ar8.setCenterX(870.0f);
        ar8.setCenterY(330.0f);
        ar8.setRadiusX(100.0f);
        ar8.setRadiusY(100.0f);
        ar8.setStartAngle(270.0f);ar8.setLength(100.0f);
        Shape cli8=Shape.subtract(ar8,circ6);
        cli8.setFill(Color.YELLOW);

        Group root12=new Group();
        root12.getChildren().addAll(cli1,cli2,cli3,cli4);
        RotateTransition rotateTransition6 = new RotateTransition();
        rotateTransition6.setDuration(Duration.millis(3000));
        rotateTransition6.setNode(root12);
        rotateTransition6.setByAngle(360);
        rotateTransition6.setCycleCount(50);
        rotateTransition6.setAutoReverse(false);
        rotateTransition6.play();
        Group root13=new Group();
        root13.getChildren().addAll(cli5,cli6,cli7,cli8);
        RotateTransition rotateTransition7 = new RotateTransition();
        rotateTransition7.setDuration(Duration.millis(3000));
        rotateTransition7.setNode(root13);
        rotateTransition7.setByAngle(360);
        rotateTransition7.setCycleCount(50);
        rotateTransition7.setAutoReverse(false);
        rotateTransition7.play();
//-------------------------------------------------Scene7-------------------------------------------------------------------
        FileInputStream stream16 = new FileInputStream("C:\\Users\\SHAILAGYA\\black.png");
        Image image16 = new Image(stream16);
        ImageView imageView16 = new ImageView(image16);
        imageView16.setX(0);
        imageView16.setY(0);
        imageView16.setFitHeight(562);
        imageView16.setFitWidth(1000);

        FileInputStream stream17 = new FileInputStream("C:\\Users\\SHAILAGYA\\pause.gif");
        Image image17 = new Image(stream17);
        ImageView imageView17 = new ImageView(image17);
        imageView17.setX(180);
        imageView17.setY(40);
        imageView17.setFitHeight(500);
        imageView17.setFitWidth(650);

        FileInputStream input9 = new FileInputStream("C:\\Users\\SHAILAGYA\\Downloads\\play.png");
        Image help9 = new Image(input9);
        ImageView Help9 = new ImageView(help9);
        Help9.setFitHeight(50);
        Help9.setFitWidth(50);
        button11=new Button();
        button11.setLayoutX(40);
        button11.setLayoutY(460);
        button11.setPrefSize(200,50);
        button11.setStyle("-fx-background-color: #BB00EA; -fx-font-size: 2em; -fx-background-radius: 5em; -fx-min-width: 80px; -fx-min-height: 80px; -fx-max-width: 80px; -fx-max-height: 80px;");
        button11.setGraphic(Help9);

        Group root2=new Group();
        root2.getChildren().addAll(imageView2,imageView3,button6,imageView6,imageView7,imageView8,imageView9);
        Group root3=new Group();
        root3.getChildren().addAll(imageView4,button7,imageView12,rectangle1,imageView13,textField2,textField3);
        Group root4=new Group();
        root4.getChildren().addAll(imageView5,imageView10,textField,button8,imageView11,button9);
        Group root6=new Group();
        root6.getChildren().addAll(imageView14,root5,root7,root8,root14,button10,imageView18);
        Group root9=new Group();
        root9.getChildren().addAll(imageView15,root10,root11,root12,root13,circ7);
        Group root15=new Group();
        root15.getChildren().addAll(imageView16,imageView17,button11);
        Scene scene3=new Scene(root2);
        Scene scene4=new Scene(root3);
        Scene scene5=new Scene(root4);
        Scene scene6=new Scene(root6);
        Scene scene7=new Scene(root9);
        Scene scene8=new Scene(root15);
        button4.setOnAction(e -> primaryStage.setScene(scene3));
        button6.setOnAction(e -> primaryStage.setScene(scene2));
        button3.setOnAction(e -> primaryStage.setScene(scene4));
        button7.setOnAction(e -> primaryStage.setScene(scene2));
        button8.setOnAction(e -> primaryStage.setScene(scene2));
        button1.setOnAction(e -> primaryStage.setScene(scene5));
        button9.setOnAction(e -> primaryStage.setScene(scene6));
        button2.setOnAction(e -> primaryStage.setScene(scene7));
        button10.setOnAction(e -> primaryStage.setScene(scene8));


        primaryStage.setScene(scene2);
        primaryStage.show();

    }




    public static void main(String[] args) {
        launch(args);
    }
}

