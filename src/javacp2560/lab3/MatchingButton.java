package javacp2560.lab3;

import javax.swing.*;

/**
 * MatchingButton class extends JToggleButton
 *
 * @author Carter Daly-MacPhail 20149926
 */
public class MatchingButton extends JToggleButton {
    private String imageDescription;

    /**
     * MatchingButton constructor
     */
    public MatchingButton(){ }

    /**
     * isSelected
     * @return
     */
    @Override
    public boolean isSelected() {
        return super.isSelected();
    }

    /**
     * updateImageIcon
     * @param imageIcon
     */
    public void updateImageIcon(ImageIcon imageIcon){
        this.setIcon(imageIcon);
    }

    /**
     * setImageDescription
     * @param imageDescription
     */
    public void setImageDescription(String imageDescription){
        this.imageDescription = imageDescription;
    }

    /**
     * getImageDescription
     * @return
     */
    public String getImageDescription(){
        return this.imageDescription;
    }
}
