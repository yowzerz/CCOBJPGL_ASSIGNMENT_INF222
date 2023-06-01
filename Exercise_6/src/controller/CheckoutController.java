package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class CheckoutController implements Initializable {

    @FXML
    Pane pane1, pane2, pane3;

    @FXML
    VBox myvbox;

    @FXML
    Label name1, name2, name3, price1, price2, price3, total;

    @FXML
    ImageView img1, img2, img3;

    @FXML
    private ChoiceBox<String> choicebox1, choicebox2, choicebox3;

    private String[] quantity = { "1", "2", "3" };

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        name1.setText(HomeController.tShirt.getProductName());
        price1.setText(Double.toString(HomeController.tShirt.getProductPrice()));
        Image tImage = new Image(HomeController.tShirt.getProductImage());
        img1.setImage(tImage);

        name2.setText(HomeController.tShirt.getProductName());
        price2.setText(Double.toString(HomeController.hoodie.getProductPrice()));
        Image hImage = new Image(HomeController.hoodie.getProductImage());
        img2.setImage(hImage);

        name3.setText(HomeController.pants.getProductName());
        price3.setText(Double.toString(HomeController.pants.getProductPrice()));
        Image pImage = new Image(HomeController.pants.getProductImage());
        img3.setImage(pImage);

        // Set default quantities in choicebox to 1
        choicebox1.setValue("1");
        choicebox2.setValue("1");
        choicebox3.setValue("1");

        // Insert quantity array to choicebox
        choicebox1.getItems().addAll(quantity);
        choicebox2.getItems().addAll(quantity);
        choicebox3.getItems().addAll(quantity);

        // Add event handler on all choiceboxes
        choicebox1.setOnAction(this::computeTotal);
        choicebox2.setOnAction(this::computeTotal);
        choicebox3.setOnAction(this::computeTotal);

        // Set total initial amount
        double totalInitialAmount = 0.00;
        if (HomeController.hoodie.getProductStatus() || HomeController.tShirt.getProductStatus() || HomeController.pants.getProductStatus()) {
            totalInitialAmount = Double.parseDouble(choicebox1.getValue()) * HomeController.tShirt.getProductPrice() +
            +Double.parseDouble(choicebox2.getValue()) * HomeController.hoodie.getProductPrice()
            + Double.parseDouble(choicebox3.getValue()) * HomeController.pants.getProductPrice();
        }
     
        // Display total initial amount in total label
        total.setText(Double.toString(totalInitialAmount));
    }

    public void addItem(Pane pane) {
        myvbox.getChildren().add(pane);
    }

    public void computeTotal(ActionEvent event) {

        double totalAmount = 0;
        double item1Amount = 0;
        double item2Amount = 0;
        double item3Amount = 0;

        ChoiceBox source = (ChoiceBox) event.getSource();

        // If product is chosen, compute item amount
        if (HomeController.tShirt.getProductStatus()) {

            double qty = Double.parseDouble(choicebox1.getValue());
            item1Amount = HomeController.tShirt.getProductPrice() * qty;

            if (source == choicebox1) {
                item1Amount = HomeController.tShirt.getProductPrice() * qty;
            }
        }

        if (HomeController.hoodie.getProductStatus()) {

            double qty = Double.parseDouble(choicebox2.getValue());
            item2Amount = HomeController.hoodie.getProductPrice() * qty;

            if (source == choicebox2) {
                item2Amount = HomeController.hoodie.getProductPrice() * qty;
            }
        }

        if (HomeController.pants.getProductStatus()) {

            double qty = Double.parseDouble(choicebox3.getValue());
            item3Amount = HomeController.pants.getProductPrice() * qty;

            if (source == choicebox3) {
                item3Amount = HomeController.pants.getProductPrice() * qty;
            }
        }

        // Compute total amount for all items chosen
        totalAmount = item1Amount + item2Amount + item3Amount;
        
        // Display total amount in total label
        total.setText(Double.toString(totalAmount));
    }
}