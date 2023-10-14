package com.example.applistas1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class FincaController {
  @FXML private TextField addressTextField;
  @FXML private TextField codTextField;
  @FXML private TextField nameTextField;
  @FXML private TextField phoneTextField;
  @FXML private TextField propietaryTextField;

  public void initialize() {
    codTextField.setPromptText("123");
    nameTextField.setPromptText("La triguizar");
    addressTextField.setPromptText("CL 98 Diagonal");
    phoneTextField.setPromptText("3233234443");
    propietaryTextField.setPromptText("Juanito");
  }

  private void clean() {
    codTextField.clear();
    nameTextField.clear();
    addressTextField.clear();
    propietaryTextField.clear();
    phoneTextField.clear();
  }

  @FXML void cancelOnButtonPressed(ActionEvent event) {
    clean();
  }
  @FXML void saveOnButtonPressed(ActionEvent event) {

  }
  @FXML void searchOnButtonPressed(ActionEvent event) {

  }
}