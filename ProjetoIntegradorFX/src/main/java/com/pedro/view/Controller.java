package com.pedro.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label lblErro;

    @FXML
    public TextField txtUsuario;

    @FXML
    public PasswordField pswSenha;

    @FXML
    public void bttEntrar() {
        lblErro.setText("Preencha todos os campos!");
    }
}