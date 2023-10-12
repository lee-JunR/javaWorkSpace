package ch_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        // 클래스에서 만들어진 메소드 사용!
        b1.autoReport(); // 지원 안됨
        BlackBox.canAutoReport = true;
        b1.autoReport(); // 지원됨.

        // 클래스에서 만들어진 전달값과 반환값이 있는 메소드 사용!
        b1.insertMemoryCard(256);
        // 클래스에서 만들어진 전달값과 반환값이 있는 메소드 사용!
        // 일반 영상 : 1 이벤트 영상 : 2
        int fileCount = b1.getVideoFileCount(1);
        System.out.println("일반 영상 파일 수 : " + fileCount);
        fileCount = b1.getVideoFileCount(2);
        System.out.println("이벤트 영상 파일 수 : " + fileCount);
    }
}
