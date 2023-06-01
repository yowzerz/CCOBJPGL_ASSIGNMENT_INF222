package controller;

import model.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.TShirt;
import alert.AlertMaker;

public class HomeController implements Initializable {

    @FXML
    Label name1, name2, name3, price1, price2, price3;

    @FXML
    ImageView img1, img2, img3;

    @FXML   
    Button button1, button2, button3, cartbutton;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    @FXML
    CheckoutController checkoutController = null;

    static TShirt tShirt = new TShirt();
    static Hoodie hoodie = new Hoodie();
    static Pants pants = new Pants();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== T-shirt ==================//
        tShirt.setProductName("T-shirt");
        name1.setText(hoodie.getProductName());

        hoodie.setProductPrice(455.00);
        price1.setText(Double.toString(hoodie.getProductPrice()));

        hoodie.setProductImage("images/lamp1.jpg");
        Image tImage = new Image(tShirt.getProductImage());
        img1.setImage(tImage);

        // ============== Hoodie ==================//

        hoodie.setProductName("Hoodie");
        name2.setText(hoodie.getProductName());

        hoodie.setProductPrice(1200.00);
        price2.setText(Double.toString(hoodie.getProductPrice()));

        hoodie.setProductImage("images/lamp2.jpg");
        Image hoImage = new Image(hoodie.getProductImage());
        img2.setImage(hoImage);

        // ============== Pants ==================//
        pants.setProductName("Wall Lamp");
        name3.setText(pants.getProductName());

        pants.setProductPrice(150.00);
        price3.setText(Double.toString(pants.getProductPrice()));

        pants.setProductImage("images/lamp3.jpg");
        Image pImage = new Image(pants.getProductImage());
        img3.setImage(pImage);

        try {
            loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            root = loader.load();
        } catch (Exception e) {
            // TODO: handle exception
        }

        // Clears all items in Checkout.fxml
        checkoutController = loader.getController();
        checkoutController.myvbox.getChildren().removeAll(checkoutController.myvbox.getChildren());
    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(button1)) {
            tShirt.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane1);
        }

        else if (sourceButton == button2) {
            hoodie.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane2);
        }

        else if (sourceButton == button3) {
            pants.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane3);
        }
    }

    // Goes to Checkout.fxml
    public void gotocart(ActionEvent event) throws IOException {

        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}