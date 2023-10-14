package com.example.applistas1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.util.LinkedList;

public class FincaController {
  @FXML private TextField addressTextField;
  @FXML private TextField codTextField;
  @FXML private TextField nameTextField;
  @FXML private TextField phoneTextField;
  @FXML private TextField propietaryTextField;
  LinkedList<Cls_fincas> fincas = new LinkedList<>();
  private int posicion;
  private boolean sw;

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
    guardar(nameTextField.getText(), codTextField.getText(),
            addressTextField.getText(), phoneTextField.getText(),
            propietaryTextField.getText());
  }
  @FXML void searchOnButtonPressed(ActionEvent event) {
    buscar(codTextField.getText());
  }

  private void buscar(String codigo) {
    posicion = 0; sw = false;
    for (int i = 0; i < fincas.size(); i++) {
      if(codigo.equals(fincas.get(i).getCodigo())) {
        posicion = i;
        sw = true;
        break;
      }
    }
    if(!sw) {
      showMessage(Alert.AlertType.ERROR, "No se encontraron registros");
    } else {
      nameTextField.setText(fincas.get(posicion).getNombre());
      codTextField.setText(fincas.get(posicion).getCodigo());
      phoneTextField.setText(fincas.get(posicion).getConctacto());
      addressTextField.setText(fincas.get(posicion).getDireccion());
      propietaryTextField.setText(fincas.get(posicion).getPropietario());
    }
  }

  private void guardar(String cod, String name, String address,
                      String phone, String propietary) {
    if(cod.isEmpty() || name.isEmpty() || address.isEmpty() ||
       phone.isEmpty() || propietary.isEmpty()) {
      showMessage(Alert.AlertType.ERROR, "Debes ingresar todos los campos");
      return ;
    } else {
      fincas.add(new Cls_fincas(cod, name, address, phone, propietary));
      showMessage(Alert.AlertType.INFORMATION, "Finca registrada con exito");
    }
  }
  private void showMessage(Alert.AlertType type, String messageToDisplay) {
    Alert alert = new Alert(type);
    alert.setContentText(messageToDisplay);
    alert.show();
  }
  }


