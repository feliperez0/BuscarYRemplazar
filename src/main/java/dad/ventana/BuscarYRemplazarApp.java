package dad.ventana;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYRemplazarApp extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
				
		Button buscarButton = new Button("Buscar");
		buscarButton.setMaxWidth(Double.MAX_VALUE);
		
		Button reemplazarButton = new Button("Reemplazar");
		reemplazarButton.setMaxWidth(Double.MAX_VALUE);

		Button reemplazarTodoButton = new Button("Reemplazar todo");
		reemplazarTodoButton.setMaxWidth(Double.MAX_VALUE);

		Button cerrarButton = new Button("Cerrar");
		cerrarButton.setMaxWidth(Double.MAX_VALUE);

		Button ayudaButton = new Button("Ayuda");
		ayudaButton.setMaxWidth(Double.MAX_VALUE);

		TextField buscarText = new TextField();
		TextField reemplazarText = new TextField();

		CheckBox mayusculasCheck = new CheckBox("Mayúsculas y minúsculas");
		CheckBox expresionCheck = new CheckBox("Expresión regular");
		CheckBox buscarCheck = new CheckBox("Buscar hacia atrás");
		CheckBox resaltarCheck = new CheckBox("Resaltar resultados");

		VBox botones = new VBox(5, buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton);
		botones.setPadding(new Insets(5, 5, 5, 8));
		botones.setFillWidth(true);
		
		GridPane checks = new GridPane();
		checks.setHgap(5);
		checks.setVgap(5);
		checks.addRow(0, mayusculasCheck, buscarCheck);
		checks.addRow(1, expresionCheck, resaltarCheck);
		checks.setAlignment(Pos.TOP_CENTER);
		
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.setPadding(new Insets(5));
		gridPane.addRow(0, new Label("Buscar: "), buscarText);
		gridPane.addRow(1, new Label("Reemplazar con: "), reemplazarText);
		gridPane.addRow(2, new Label(""), checks);		
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),
				new ColumnConstraints(),
		};
		
		gridPane.getColumnConstraints().setAll(cols);
		
		cols[1].setHgrow(Priority.ALWAYS);
		cols[1].setFillWidth(true);
		
		BorderPane root = new BorderPane();
		root.setCenter(gridPane);
		root.setRight(botones);
		
		Scene scene = new Scene(root, 550, 250);
		
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
