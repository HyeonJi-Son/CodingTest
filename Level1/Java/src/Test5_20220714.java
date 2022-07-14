public class Test5_20220714 {
    /*
    문제 설명
        양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
        예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
        자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

        제한 조건
        x는 1 이상, 10000 이하인 정수입니다.
        입출력 예
        arr	return
        10	true
        12	true
        11	false
        13	false

        입출력 예 설명
        입출력 예 #1
        10의 모든 자릿수의 합은 1입니다. 10은 1로 나누어 떨어지므로 10은 하샤드 수입니다.

        입출력 예 #2
        12의 모든 자릿수의 합은 3입니다. 12는 3으로 나누어 떨어지므로 12는 하샤드 수입니다.

        입출력 예 #3
        11의 모든 자릿수의 합은 2입니다. 11은 2로 나누어 떨어지지 않으므로 11는 하샤드 수가 아닙니다.

        입출력 예 #4
        13의 모든 자릿수의 합은 4입니다. 13은 4로 나누어 떨어지지 않으므로 13은 하샤드 수가 아닙니다.
     */

    public static void main(String[] args) {
        class Solution {
            public boolean solution(int x){ //어떤 정수 x를 인자로 받는다.
                boolean answer;

                //우선 x의 값을 자리수에 따라 분리를 해줘야한다.
                String num = x+"";
                String []nums = num.split("");
                //String 형태로 변환하여 분리

                int harshadCheck = 0;
                for(int i = 0; i < nums.length; i++){ //nums 즉 숫자의 자릿수 길이만큼 반복문 반복
                    harshadCheck += Integer.parseInt(nums[i]);
                    //분리해준 값을 더하기 해줘야 한다.
                                //Integer.parseInt <- String타입의 숫자를 int타입으로 변화
                                //즉, nums의 [i]번째 인덱스 숫자를 정수로 변환하여 harshadCheck변수에 더하기
                }

                if(harshadCheck % x == 0){ answer = true; }
                else{ answer = false; }
                //더한 값으로 x를 나누었을 때 값이 0이 되는지 확인해야 한다.
                //여기까지 조건을 만족했을 때 하샤드 수의 조건을 만족하므로 true를 반환하도록 한다.
                //else false를 반환하도록 한다.

                return answer;

            }
        }
    }
}
