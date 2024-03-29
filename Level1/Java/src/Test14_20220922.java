public class Test14_20220922 {
/*
문제 설명
자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
답이 항상 존재함은 증명될 수 있습니다.

제한사항
3 ≤ n ≤ 1,000,000

입출력 예
n	result
10	3
12	11

입출력 예 설명
입출력 예 #1
10을 3으로 나눈 나머지가 1이고, 3보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 3을 return 해야 합니다.

입출력 예 #2
12를 11로 나눈 나머지가 1이고, 11보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 11을 return 해야 합니다.
 */

    public int solution(int n) {
        int answer = 0;

        //처음 생각한 시나리오.
        //while을 사용한 무한 반복문을 만든다.
            //if n%2 == 1인 경우 x = answer로 값을 확정해주고, 반복문을 빠져나가도록 한다.
            //else 그 외의 경우 반복이 계속되도록 한다.

        for(int i=0; i>=0; i++){ //기본값이 0인 i는 for문이 루프할 때마다 1씩 커진다.
            //반복문은 i가 0보다 크거나 같은 동안 반복된다.(= i의 숫자는 계속해서 커진다.)
            System.out.println("int i = %d"+i);

            if(n%2 == 1){ //만약 int n의 숫자를 2로 나눴을 때 1이 남는다면 (=홀수라면)
                i = answer; // i를 answer 값으로 변경한다.
                break; //반복문 탈출
            }
        }

        return answer;
    }
}
