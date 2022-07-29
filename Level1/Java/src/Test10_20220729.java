public class Test10_20220729 {
    /*
    문제 설명
        정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
        단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
        예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

        제한 조건
        arr은 길이 1 이상인 배열입니다.
        인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
        입출력 예
        arr	return
        [4,3,2,1]	[4,3,2]
        [10]	[-1]
     */
    class Solution {
        public int[] solution(int[] arr) {
            int[] answer = {};

            //우선 배열에서 가장 작은수를 찾도록 해야한다.
                //foreach로 인덱스당 값을 하나하나 떼어주고...list화 한다.
                //어떤 인덱스에 들어간 숫자가 가장 작은지 찾아낸다.
                //해당 인덱스를 list.remove(x)를 통해서 없애준다.


            //다시 배열화 하며 answer에 넣어준다.
                //이때 list.length 의 길이가 0인 경우만 answer 배열에 -1이 들어가도록 하는 조건문을 만든다.

            return answer;
        }
    }
}
