/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Panyi
 */
public class SeriesController implements Initializable {

    @FXML
    private ImageView ser1;
    @FXML
    private ImageView sir2;
    @FXML
    private ImageView sir3;
    @FXML
    private ImageView sir4;
    @FXML
    private ImageView sir5;
    @FXML
    private ImageView sir6;
    @FXML
    private ImageView sir7;
    @FXML
    private ImageView sir8;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handlesir1(MouseEvent event) {
         WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=D4wJK4C_nZY"
    );
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }

    @FXML
    private void handlesir2(MouseEvent event) {
     WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=sfAc2U20uyg"
    );
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }

    @FXML
    private void handlesir3(MouseEvent event) {
               WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=sfAc2U20uyg"
    );
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }

    @FXML
    private void handlesir4(MouseEvent event) {
        WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=xAN1ThhTWsE"
    );//you
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }

    @FXML
    private void handlesir5(MouseEvent event) {
        WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=jCS-Y6Sp7CI"
    );//you
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }

    @FXML
    private void handlesir6(MouseEvent event) {
          WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=vWJyK3nLQP4"
    );//you
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }

    @FXML
    private void handlesir7(MouseEvent event) {
             WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=a6O30nJ02PU&t=4s"
    );//you
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }

    @FXML
    private void handlesir18(MouseEvent event) {
                 WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=NxAdUd8W6zQ"
    );//you
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }
    
}
