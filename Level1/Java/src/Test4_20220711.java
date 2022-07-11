public class Test4_20220711 {
    public static void main(String[] args) {
        /*
        문제 설명
        프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
        전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

        제한 조건
        phone_number는 길이 4 이상, 20이하인 문자열입니다.

        입출력 예
        phone_number	return
        "01033334444"	"*******4444"
        "027778888"	"*****8888"
         */

        //풀어보지 못한 타입의 문제라 우선 풀기보다는 풀이 위주로 접근해보아야 할 것 같다.

        class Solution { //solution 클래스를 만든다.
            public String solution(String phone_number) { //solution메서드는 phone_number를 인자로 받는다.
                String answer = ""; //아직 값이 지정되어있지 않은 answer라는 문자열 변수 선언
                for(int i = 0; i < phone_number.length(); i++) {
                    //루프할 때마다 값이 +1되는 초기값이 0인 i라는 숫자는 phone_number 값 길이보다 숫자가 작은동안 루프를 반복한다.
                    if(i < phone_number.length()-4){ //만약 i가 phonenumber길이-4 의 값보다 작다면
                        answer += "*"; //answer라는 변수에 *를 더해라
                    }
                    else { //하지만 그렇지 않다면
                        answer += phone_number.charAt(i); //그러니까 phonenumber의 i번째에 있는 문자 1개를
                                                    // answer에 더한다.
                        //charAt()은 String타입의 문자열에서 해당 위치에 있는 문자만을 char타입으로 변환해 사용할 수 있게 해주는 녀석
                    }
                }
                return answer; // 결과적으로 return된 answer는 뒷자리 4개를 빼고 *로 나오게 된다.
            }
        }

    }
}
