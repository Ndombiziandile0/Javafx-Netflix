/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
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
public class HomeController implements Initializable {

    @FXML
    private ImageView img1;
    @FXML
    private ImageView img2;
    @FXML
    private ImageView img3;
    @FXML
    private ImageView img4;
    @FXML
    private ImageView img5;
    @FXML
    private ImageView img6;
    @FXML
    private ImageView img7;
    @FXML
    private ImageView img8;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleimg1(MouseEvent event) {
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
    private void handleimg2(MouseEvent event) {
   WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=-P1wIX-aGCU"
    );//Avatar
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }
    
    @FXML
    private void handleimg3(MouseEvent event) {
    WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=HxtLlByaYTc"
    );//RiVERDALE
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
   }
    
    @FXML
    private void handleimg4(MouseEvent event) {
     WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=dxWvtMOGAhw"
    );
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }//blackpanther
    @FXML
    private void handleimg5(MouseEvent event) {
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
    private void handleimg6(MouseEvent event) {
    WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=WDkg3h8PCVU"
    );//aqua man
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }
    @FXML
    private void handleimg7(MouseEvent event) {
    WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=Yj0l7iGKh8g"
    );//flash
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }

    @FXML
    private void handleimg8(MouseEvent event) {
     WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=xa_emc7TaBI"
    );//sex/life
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }
    
}
