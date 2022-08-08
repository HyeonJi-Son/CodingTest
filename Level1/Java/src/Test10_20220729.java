import java.util.ArrayList;
import java.util.List;

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
        [4,3,2,1]	[4,3,ㄴ혼2]
        [10]	[-1]
     */
    class Solution {
        public int[] solution(int[] arr) {
            if(arr.length <= 1) return new int[] {-1};
                //만약 arr의 길이가 1보다 작거나 같으면 -1을 리턴한다.

            // 배열을 리스트로 변환하면서 가장 작은 수 찾기
            int min = Integer.MAX_VALUE; //integer.MAX_VALUE <-정수의 최대값(214783647)을 표현한다.
                List<Integer> list = new ArrayList<Integer>(); //정수를 값으로 갖는 List 배열 list를 생성한다.
                for(int i=0; i<arr.length; i++) { //arr길이만큼 반복되는 반복문. i는 반복문 돌 때마다 +1씩 커짐
                    list.add(arr[i]); //list.add(arr[i]) <-list 에 arr[i]번째 인덱스의 값을 더한다.
                    if(min > arr[i]) min = arr[i]; //만약 min이 arr[i] 보다 큰 경우 min값은 arr[i]가 된다.
                                                    //현재 min값은 정수의 최대값이니까 무조건 min = arr[i]이 되지 않나?
            }
                //반복문에서 나왔을 때 min의 값은 그냥 min = arr[arr.length] 인 상태 아닌가??
                //어떻게 아래에서 min을 삭제하는게 가장 작은 수를 삭제하는 게 되는거지?

            // 가장 작은 수 제거 후 리스트를 새로운 배열로 변환
            list.remove(list.indexOf(min));
                    //list의 값 중에서 min을 찾아서 지워라.
                    //ArrayList에서 특정값을 삭제하는 세가지 방법
                        /*
                        ArrayList.remove()
                        ArrayList.removeAll()
                        Iterator.remove()

                        indexOf() 함수는 문자열에서 특정 문자열의 위치를 찾아 index값을 반환해준다.
                         */
            int[] newArr = new int[list.size()]; //list길이만큼의 길이를 가진 새로운 배열 newArr
            for(int i=0; i<newArr.length; i++) newArr[i] = list.get(i);
            //newArr의 길이만큼 반복되는 반복문. newArr[i]번째 인덱스에 들어가는 값은\
            // list의 (i)번째 인덱스에서 가져온 값과 같다.

            return newArr; //newArr을 answer로 반환한다.

            /* 혼자 풀기가 어려워서 결국... ↑ 다른 사람 풀이 해석하는 방향으로
               이 분의 풀이는 총 3가지가 있었는데 잘 살펴본 결과 내가 생각한 건 2번 풀이와 가장
               비슷한 것 같다. 그래서 2번 풀이 위주로 먼저 보기
            //우선 배열에서 가장 작은수를 찾도록 해야한다.
                //foreach로 인덱스당 값을 하나하나 떼어주고...list화 한다.
                //어떤 인덱스에 들어간 숫자가 가장 작은지 찾아낸다.
                //해당 인덱스를 list.remove(x)를 통해서 없애준다.

            for(int i: arr){

            }

            //다시 배열화 하며 answer에 넣어준다.
                //이때 list.length 의 길이가 0인 경우만 answer 배열에 -1이 들어가도록 하는 조건문을 만든다.

            return answer;

             */
        }
    }

    //참고: https://gogoma.tistory.com/33
}
