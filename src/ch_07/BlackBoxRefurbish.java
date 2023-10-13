package ch_07;

/** 블랙박스 리퍼 제품을 관리하는 클래스입니다. */
public class BlackBoxRefurbish {
    // intelliJ 꿀팁. getter setter 등을 쉽게 만드는 법 (mac) ctrl + N
    public String modelName; // 모델명 public
    String resolution; // 해상도 default
    private int price; // 가격 private : BlackBoxRefurbish 클래스에서만 가능 -> getPrice(), setPrice() 로 접근 가능
    protected String color;  // 색상 protected
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if(resolution == null || resolution.isEmpty()){
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 100_000){
            this.price = 100_000;
        } else{
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
