package application;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class ControlRocket {
	
	@FXML
	private AnchorPane anchPane;
	
	@FXML
	private ImageView imagenLogo;
	
	@FXML
	private AnchorPane imagen1, imagen2, imagen3, imagen4;
	
	
	
	/* VIEW PRINCIPAL */
	public void initialize() {
		
		efectoImagen();
		
		animation();
		
	}
	
	/** 
	 * EFECTO IMAGEN INICIO DE LA APLICACIÓN 
	 */
	public void efectoImagen() {

        FadeTransition fadeTransition=new FadeTransition(Duration.seconds(10),imagenLogo);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
        fadeTransition.play();
		
	}
	
	/**
	 * ABRIR LA VISTA URANO
	 */
	@FXML
	private void openStage() {
		try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Urano.fxml"));
            anchPane = (AnchorPane) loader.load();
            Scene scene = new Scene(anchPane);
            Stage sendStage = new Stage();
            sendStage.setScene(scene);    
            sendStage.initStyle(StageStyle.UNDECORATED);
            sendStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * EFECTO TRANSICIÓN DE IMAGENES URANO
	 */
	
	/* VIEW SECUNDARIA TRANSICION DE IMAGENES */
    public  void  animation(){


        FadeTransition fadeTransition=new FadeTransition(Duration.seconds(10),imagen4);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);
        fadeTransition.play();

        fadeTransition.setOnFinished(event -> {
            FadeTransition fadeTransition1=new FadeTransition(Duration.seconds(5),imagen3);
            fadeTransition1.setFromValue(1);
            fadeTransition1.setToValue(0);
            fadeTransition1.play();

            fadeTransition1.setOnFinished(event1 -> {

                FadeTransition fadeTransition2=new FadeTransition(Duration.seconds(10),imagen2);
                fadeTransition2.setFromValue(1);
                fadeTransition2.setToValue(0);
                fadeTransition2.play();

                fadeTransition2.setOnFinished(event2 -> {

                    FadeTransition fadeTransition00=new FadeTransition(Duration.seconds(5),imagen2);
                    fadeTransition00.setFromValue(0);
                    fadeTransition00.setToValue(1);
                    fadeTransition00.play();


                    fadeTransition00.setOnFinished(event3 -> {
                        FadeTransition fadeTransition11=new FadeTransition(Duration.seconds(10),imagen3);
                        fadeTransition11.setFromValue(0);
                        fadeTransition11.setToValue(1);
                        fadeTransition11.play();

                        fadeTransition11.setOnFinished(event4 -> {
                            FadeTransition fadeTransition22=new FadeTransition(Duration.seconds(5),imagen4);
                            fadeTransition22.setFromValue(0);
                            fadeTransition22.setToValue(1);
                            fadeTransition22.play();

                            fadeTransition22.setOnFinished(event5 -> {
                                animation();
                            });
                        });


                    });
                });

            });




        });



    }
    /**
     * TERMINAR CON EL PROGRAMA
     */
    @FXML
	private void cerrarMarsUrano() {
       System.exit(0);
       
	}
    
	

}
