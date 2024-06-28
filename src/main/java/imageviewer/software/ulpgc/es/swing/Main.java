package imageviewer.software.ulpgc.es.swing;

import imageviewer.software.ulpgc.es.command.NextImageCommand;
import imageviewer.software.ulpgc.es.command.PreviousImageCommand;
import imageviewer.software.ulpgc.es.image.FileImageLoader;
import imageviewer.software.ulpgc.es.image.Image;

import java.io.File;
import java.net.MalformedURLException;

public class Main {
    public static String root;

    public static void main(String[] args) throws MalformedURLException {
        PathFrame pathFrame = new PathFrame();
        pathFrame.setVisible(true);
        while (root == null) {
            root = pathFrame.getPath();
        }
        pathFrame.setVisible(false);
        Image image = new FileImageLoader(new File(root)).load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().show(image);
        mainFrame.add("Prev", new PreviousImageCommand(mainFrame.getImageDisplay()));
        mainFrame.add("Next", new NextImageCommand(mainFrame.getImageDisplay()));
        mainFrame.setVisible(true);
    }
}
