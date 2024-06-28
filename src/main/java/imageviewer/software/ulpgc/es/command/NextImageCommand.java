package imageviewer.software.ulpgc.es.command;

import imageviewer.software.ulpgc.es.image.Image;
import imageviewer.software.ulpgc.es.image.ImageDisplay;

public class NextImageCommand implements Command {

    private final ImageDisplay imageDisplay;

    public NextImageCommand(ImageDisplay imageDisplay){
        this.imageDisplay = imageDisplay;
    }

    @Override
    public void execute(){
        imageDisplay.show(imageDisplay.image().next());
    }
}
