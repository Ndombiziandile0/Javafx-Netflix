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
public class MoviesController implements Initializable {

    @FXML
    private ImageView vid1;
    @FXML
    private ImageView vid7;
    @FXML
    private ImageView vid8;
    @FXML
    private ImageView vid2;
    @FXML
    private ImageView vid3;
    @FXML
    private ImageView vid5;
    @FXML
    private ImageView vid6;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handlevid1(MouseEvent event) {
    WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=9NJj12tJzqc"
    );//moonlight
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }

    @FXML
    private void handlevid2(MouseEvent event) {
    WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=-P1wIX-aGCU&t=3s"
    );//Avatar
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }

    @FXML
    private void handlevid3(MouseEvent event) {
        WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=sGbxmsDFVnE"
    );//star wars
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }

    @FXML
    private void handlevid4(MouseEvent event) {
        WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=xjDjIWPwcPU"
    );//moonlight
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }

    @FXML
    private void handlevid5(MouseEvent event) {
        WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=WDkg3h8PCVU&t=7s"
    );//AQUA MAN
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }

    @FXML
    private void handlevid6(MouseEvent event) {
        WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=FDJDujWJhzw"
    );//moonlight
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }

    @FXML
    private void handlevid7(MouseEvent event) {
        WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=a6O30nJ02PU"
    );//Issland
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }

    @FXML
    private void handlevid8(MouseEvent event) {
        WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=coOKvrsmQiI"
    );//moonlight
    webview.setPrefSize(640, 390);
   Stage stage = new Stage();
   stage.setScene(new Scene(webview));
   stage.show();
    }
    
    
}
