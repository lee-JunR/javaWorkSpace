package ch_08;

import ch_08.Detector.AdvancedFireDetector;
import ch_08.Detector.Detectable;
import ch_08.Detector.FireDetector;
import ch_08.Reporter.NormalReporter;
import ch_08.Reporter.Reportable;
import ch_08.Reporter.VedioRepoter;
import ch_08.Camera.FactoryCam;

public class _02_Interface {

  public static void main(String[] args) {
    // 인터페이스
    // 추상 클래스가 미완성된 클래스라면 interface 는 그냥 뼈대만 만드는것. 노션의 템플릿이라 생각해도 될듯.

    // 단일상속 : extends 키워드
    // 다중 상속이 필요한 경우 사용하는 것이 interface

    NormalReporter normalReporter = new NormalReporter();
    normalReporter.report();

    Reportable videoReporter = new VedioRepoter();
    videoReporter.report();

    System.out.println("================");

    Detectable fireDetector = new FireDetector();
    fireDetector.detect();

    Detectable advencedFireDetector = new AdvancedFireDetector();
    advencedFireDetector.detect();

    System.out.println("================");

    FactoryCam factoryCam = new FactoryCam();
    factoryCam.setDetector(advencedFireDetector);
    factoryCam.setReporter(videoReporter);

    factoryCam.detect();
    factoryCam.report();
  }

}
