package proxy;

public class Main {

    /**
     * 프록시 패턴을 사용하는 예시.
     * 이미지를 리스트를 통해서 보여줘야 하는 상황일 때,
     * 전체 이미지를 로딩하면 이미지를 불러오는 시간 때문에 대기시간이 길어진다.
     * 매번 새롭게 이미지를 로딩하지 않고 이미지를 캐시하는 방법이다.
     */
    public static void main(String[] args) {
        ImageListView imageListView_01 = new ProxyImage("image_01");
        ImageListView imageListView_02 = new ProxyImage("image_02");
        imageListView_01.draw();
        imageListView_01.draw();
        imageListView_01.draw();
        System.out.println("--------------------------");
        imageListView_02.draw();
        imageListView_02.draw();
        imageListView_02.draw();
    }

}
