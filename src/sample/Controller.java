package sample;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.layout.BorderPane;
        import javafx.scene.layout.GridPane;

public class Controller {

    @FXML
    private Button button0;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button reset;
    @FXML
    private GridPane gridPane;
    @FXML
    private BorderPane borderPane;
    @FXML
    private Label nameLabel;
    @FXML
    private Label winLabel;

    final int[] clicked = {0};
    int i=0;

    @FXML
    void buttonAction(ActionEvent event) {
        clicked[0]++;
        i++;
        Button b = (Button) event.getSource();
        b.setDisable(true);
        if (clicked[0] % 2 == 0) {
            nameLabel.setText("Kolej O");
            b.setText("X");
        } else {
            nameLabel.setText("Kolej X");
            b.setText("O");
        }
        if (button0.getText().equals("X") && button1.getText().equals("X") && button2.getText().equals("X") ||
                button3.getText().equals("X") && button4.getText().equals("X") && button5.getText().equals("X") ||
                button6.getText().equals("X") && button7.getText().equals("X") && button8.getText().equals("X") ||
                button0.getText().equals("X") && button3.getText().equals("X") && button6.getText().equals("X") ||
                button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X") ||
                button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X") ||
                button0.getText().equals("X") && button4.getText().equals("X") && button8.getText().equals("X") ||
                button6.getText().equals("X") && button4.getText().equals("X") && button2.getText().equals("X")) {

            winLabel.setText("Wygrywa X");
            nameLabel.setText("Zagraj ponownie");
            return;

        } else if (button0.getText().equals("O") && button1.getText().equals("O") && button2.getText().equals("O") ||
                button3.getText().equals("O") && button4.getText().equals("O") && button5.getText().equals("O") ||
                button6.getText().equals("O") && button7.getText().equals("O") && button8.getText().equals("O") ||
                button0.getText().equals("O") && button3.getText().equals("O") && button6.getText().equals("O") ||
                button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O") ||
                button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O") ||
                button0.getText().equals("O") && button4.getText().equals("O") && button8.getText().equals("O") ||
                button6.getText().equals("O") && button4.getText().equals("O") && button2.getText().equals("O")){

            winLabel.setText("Wygrywa O");
            nameLabel.setText("Zagraj ponownie");
            return;
        }
        if(i==8 && winLabel.getText().trim().isEmpty()){
            winLabel.setText("Remis");
            nameLabel.setText("Zagraj ponownie");
        }
    }

    public void resetAction(ActionEvent actionEvent) {

        gridPane.getChildren().forEach(button -> {
            Button b = (Button) button;
            b.setText("");
            b.setDisable(false);
            nameLabel.setText("Zaczyna O");
            winLabel.setText(null);
            clicked[0] = 0;
            i=0;
        });
        }
    }


