package com.mycompany.a1.Starter;
import com.codename1.ui.Form;

/**
 * Created by Varun on 2/16/16.
 */
public class Game extends Form {
    private GameWorld gw;

    public Game() {
        gw = new GameWorld();
        gw.initLayout();
        play();
    }
/*
    private void play() {
        // code here to accept and
        // execute user commands that
        // operate on the game world
//(refer to “Appendix - CN1
//Notes” for accepting
//keyboard commands via a text
//field located on the form)
    }
    */
    private void play()
    {
        //fuck this shitty thing i might have to change it to addComponent
        Label myLabel=new Label("Enter a Command:");
        this.add(myLabel);
        final TextField myTextField=new TextField();
        this.add(myTextField);
        this.show();
        myTextField.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent evt) {

                  String sCommand=myTextField.getText().toString();
                  myTextField.clear();
                  switch (sCommand.charAt(0)) {
                      case 'e':
                          gw.expand();
                          break;
                      //add code to handle rest of the commands
                  } //switch
              } //actionPerformed
          } //new ActionListener()
        ); //addActionListener
    } //play
}
