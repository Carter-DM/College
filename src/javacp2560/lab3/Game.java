package javacp2560.lab3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Game class
 *
 * @author Carter Daly-MacPhail 20149926
 */
public class Game {
    private List<MatchingButton> buttons;
    private List<ImageIcon> images;
    private List<String> imageDescription;

    public Game(MatchingButton button1, MatchingButton button2, MatchingButton button3, MatchingButton button4) {
        buttons = new ArrayList<>();
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        addImagesToArray();
        updateImages();
    }

    private void addImagesToArray(){
        images = new ArrayList<>();
        images.add(new ImageIcon("src\\javacp2560\\lab3\\java_logo1.png"));
        images.add(new ImageIcon("src\\javacp2560\\lab3\\java_logo1.png"));
        images.add(new ImageIcon("src\\javacp2560\\lab3\\java_logo2.png"));
        images.add(new ImageIcon("src\\javacp2560\\lab3\\java_logo2.png"));
        imageDescription = new ArrayList<>();
        imageDescription.add("java_logo1");
        imageDescription.add("java_logo1");
        imageDescription.add("java_logo2");
        imageDescription.add("java_logo2");
    }

    public void loop(){
        if (allButtonsAreHidden()){
            resetButtons();
            loop();
        }
        if (twoButtonsSelected()){
            if (imagesAreTheSame()){
                JOptionPane.showMessageDialog(null, "Correct!");
                loop();
            }
            else{
                JOptionPane.showMessageDialog(null, "Oops, that was incorrect!");
                loop();
            }
        }
    }

    // Check if all buttons have been matched
    private boolean allButtonsAreHidden(){
        for (MatchingButton button: buttons){
            if (button.isVisible() == true){
                return false;
            }
        }
        return true;
    }

    // Reset buttons by deselecting them, making them visible and randomizing the images
    private void resetButtons(){
        for (MatchingButton button: buttons){
            button.setSelected(false);
            button.setVisible(true);
        }
        addImagesToArray();
        updateImages();
    }

    // Check if two buttons have been selected
    private boolean twoButtonsSelected(){
        int selected = 0;
        for (MatchingButton button: buttons) {
            if (selected >= 2) {
                return true;
            }
            else if (button.isSelected()) {
                selected++;
            }
        }
        if (selected >= 2) {
            return true;
        }
        return false;
    }

    // This is gross and violating the single responsibility principle but shhhh
    // Checks if images are the same and hides/deselects them
    private boolean imagesAreTheSame(){
        List<MatchingButton> selectedButtons = new ArrayList<>();
        for (MatchingButton button: buttons) {
            if (button.isSelected()) {
                selectedButtons.add(button);
            }
        }
        if (selectedButtons.get(0).getImageDescription().equals(selectedButtons.get(1).getImageDescription())){
            selectedButtons.get(0).setVisible(false);
            selectedButtons.get(0).setSelected(false);
            selectedButtons.get(1).setVisible(false);
            selectedButtons.get(1).setSelected(false);
            return true;
        }
        else {
            selectedButtons.get(0).setSelected(false);
            selectedButtons.get(1).setSelected(false);
            return false;
        }
    }

    // Randomly assigns new images
    private void updateImages(){
        Random random = new Random();
        int rand;
        for (int i = 3; i >= 0; i--){
            rand = random.nextInt(i + 1);
            buttons.get(i).updateImageIcon(images.get(rand));
            buttons.get(i).setImageDescription(imageDescription.get(rand));
            images.remove(rand);
            imageDescription.remove(rand);
        }
    }
}
