package proxy;

public class ProxyImage implements ImageListView {

    private RealImage realImage;
    private String imageName;

    public ProxyImage(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void draw() {
        if(realImage == null) {
            realImage = new RealImage(imageName);
            realImage.draw();
        } else {
            realImage.cachedImage();
        }
    }

}
