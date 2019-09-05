package proxy;

public class RealImage implements ImageListView {

    private String imageName;

    public RealImage(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void draw() {
        System.out.println("이미지 로딩: " + imageName);
    }

    public void cachedImage() {
        System.out.println("이미지 캐싱: " + imageName);
    }

}
