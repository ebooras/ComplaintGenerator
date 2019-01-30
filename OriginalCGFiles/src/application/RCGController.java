package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RCGController {

    @FXML
    private TextField nameField;

    @FXML
    private Button genButton;

    @FXML
    private TextArea complaintArea;

    @FXML
    void genOnClick(ActionEvent event) {
    	String name = "";
    	
    	// we can place the phrase list into GrammarRule and have GrammarRule only one argument
    	//PhraseList userPhrases = new PhraseList();
    	int num = (int)(Math.random() * 4 + 1);
    	
    	if (nameField.getText().trim().equals("")) // trim makes sure they do not just but in white space
    	{
    		name = "anonymous";
    	}
    	else
    	{
    		name = nameField.getText();
    	}
    	
    	GrammarRule userRule = new GrammarRule(num);
    	
    	complaintArea.setText(userRule.getSentence() + name);

    }

}
