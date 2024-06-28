package imageviewer.software.ulpgc.es.image;

public interface Image {

    String name();
    Image next();
    Image prev();

}
