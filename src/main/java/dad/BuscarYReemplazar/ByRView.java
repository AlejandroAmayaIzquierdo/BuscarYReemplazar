package dad.BuscarYReemplazar;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;

public class ByRView extends GridPane {
	
	private TextField buscarTextField,remplazarTextField;
	
	private CheckBox mayusMinusRadioButton = new CheckBox("Mayúsculas y minúsculas");
	private CheckBox buscarRadioButton = new CheckBox("Buscar hacia atrás");
	private CheckBox expresionRadioButton = new CheckBox("Expresión regular");
	private CheckBox resaltarRadioButton = new CheckBox("Resaltar resultado");
	
	private Button[] acctionsButton = new Button[5];
	private String[] TextButtons = new String[] {"Buscar","ReemPlazar"
												,"ReemPlazar Todo"
												,"Cerrar","Ayuda"};
	
	public ByRView() {
		super();
		
		FlowPane flowPane = new FlowPane(mayusMinusRadioButton,buscarRadioButton,
				expresionRadioButton,resaltarRadioButton);
		
		flowPane.setRowValignment(VPos.CENTER);
		flowPane.setHgap(5);
		flowPane.setVgap(5);
		
		buscarTextField = new TextField();
		buscarTextField.setPromptText("Palabras a Buscar");
		
		
		remplazarTextField = new TextField();
		remplazarTextField.setPromptText("Cambio de las Palabras");
		
		VBox buttonVBox = new VBox();
		buttonVBox.setAlignment(Pos.TOP_CENTER);
		buttonVBox.setSpacing(5);
//		buttonVBox.setStyle("-fx-background-color: #ADD8E6;");
		
		for(int i = 0 ; i < acctionsButton.length; i++) {
			acctionsButton[i] = new Button(TextButtons[i]);
			acctionsButton[i].setPrefWidth(120);
			acctionsButton[i].setPrefHeight(25);
			buttonVBox.getChildren().add(acctionsButton[i]);
		}
		
		this.setAlignment(Pos.TOP_CENTER);
		this.setPadding(new Insets(5));
		this.setVgap(5);
		this.setHgap(5);
//		root.setGridLinesVisible(true);
		
		this.addRow(0, new Label("Buscar: "),buscarTextField,buttonVBox);
		this.addRow(1, new Label("Remplazar con: "),remplazarTextField);
		this.addRow(2, flowPane);

		
		ColumnConstraints[] cols = {
				new ColumnConstraints(),
				new ColumnConstraints(),
				new ColumnConstraints()
			};
		
		this.getColumnConstraints().setAll(cols);
		
		cols[0].setHgrow(Priority.NEVER);
		cols[0].setMinWidth(Control.USE_PREF_SIZE);
		
		cols[1].setHgrow(Priority.ALWAYS);
		cols[1].setMinWidth(Control.USE_COMPUTED_SIZE);
		
		cols[2].setMinWidth(Control.USE_PREF_SIZE);
		
		GridPane.setRowSpan(buttonVBox, 3);
		GridPane.setColumnIndex(flowPane, 1);
	}

}
