public class Test13_20220919 {
    /*
    문제 설명
길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
입출력 예
n	return
3	"수박수"
4	"수박수박"
     */

    //반복문의 루프 회수가 0이거나 짝수일 때는 수, 홀수일 때는 박을 answer에 더하도록 처리하면 된다.

    public String solution(int n) {
        String answer = "";

        for (int i = 0; i < n; i++){
            if(i%2 == 0){
                answer += "수";
            }
           else{ //if(i%2 == 1) 조건문을 사용하는 것도 괜찮지만 홀, 짝 두가지 경우만 나올 상황이니 else로도 괜찮을 듯.
                answer += "박";
            }
        }

        return answer;
    }

    /*
    개선점: Warning:(22, 24) String concatenation '+=' in loop

    루프에서 '+'를 사용하여 문자열을 연결하는 것은 좋지 않은 코드라고 한다. + 가 아니라 String Builder를 사용하는 편이 좋은 선택지라는 듯.
     */


}
