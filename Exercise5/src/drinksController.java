package src;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class drinksController{
     @FXML
    ImageView img1, img2, img3;

    @FXML
    Button btn1, btn2, btn3;

    Sprite spr = new Sprite();
    IcedCoffee icf = new IcedCoffee();
    RootBeer rtbr = new RootBeer();

    public void initialize(){

        spr.setCalories(Calories:"120Cal")
        spr.setServing(Serving:"12oz")
        icf.setCalories(Calories:"51Cal")
        icf.setServing(Serving:"16oz")
        rtbr.setCalories(Calories:"41Cal")
        rtbr.setServing(Serving:"16oz")
        
    }

    public void showInfo(ActionEvent event){
        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)){
            alert.SetContentText("Sprite, " + spr.getCalories() + " and " + spr.getServing());
        }
        if (sourceButton.equals(btn2)){
            alert.SetContentText("Iced Coffee, " + icf.getCalories() + " and " + icf.getServing());
        }
        if (sourceButton.equals(btn3)){
            alert.SetContentText("Root Beer, " + rtbr.getCalories() + " and " + rtbr.getServing());
        }


        alert.showAndWait();
    }
}
