package ch_06;

public class _03_Return {
    // return 값에 따라 세번째 자료형을 맞춰야한다. 본 메소드에서는 String
    /** 호텔 전화번호를 리턴하는 메소드*/
    public static String getPhoneNumber(){
        String phoneNumber = "02-1234-1234";
        return phoneNumber;
    }

    /** 호텔 주소를 리턴하는 메소드 */
    public static String getAddress(){
        return "서울시 어디구 모르겠동";
    }
    /** 호텔 액티비티를 리턴하는 메소드*/
    public static String getActivities(){
        return "볼링장, 탁구장, 노래방";
    }
    public static void main(String[] args) {
        // 반환값, Return
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호 : " + contactNumber);

        String address = getAddress();
        System.out.println("호텔 주소 : " + address);

        System.out.println("호텔 주소 : " + getActivities());
    }
}
