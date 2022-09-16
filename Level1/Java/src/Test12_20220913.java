public class Test12_20220913 {
    /*
    String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아,
    "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
    seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

    제한 사항
    seoul은 길이 1 이상, 1000 이하인 배열입니다.
    seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
    "Kim"은 반드시 seoul 안에 포함되어 있습니다.
    입출력 예
    seoul	return
    ["Jane", "Kim"]	"김서방은 1에 있다"
     */


    public static String main(String[] seoul) {
        String answer = "";

        for(int i=0; i<seoul.length; i++){ //seoul의 길이만큼 루프하는 for 반복문을 만든다.
            if(seoul[i].equals("Kim")) { //만약 seoul의 i번째 인덱스가 "Kim"과 같다면
                answer = "김서방은 " + i + "에 있다"; //answer의 값을 "김서방은 " + i + "에 있다" 로 선언하도록 한다.
            }
        }

        return answer; //answer의 값을 return한다.

        //System.out.println("김서방은 %d에 있다.", x);
    }
}
