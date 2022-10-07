public class Test17_20221005 {
    /*
    문제 설명
0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ numbers의 길이 ≤ 9
0 ≤ numbers의 모든 원소 ≤ 9
numbers의 모든 원소는 서로 다릅니다.
입출력 예
numbers	result
[1,2,3,4,6,7,8,0]	14
[5,8,4,0,6,7,9]	6
입출력 예 설명
입출력 예 #1

5, 9가 numbers에 없으므로, 5 + 9 = 14를 return 해야 합니다.
입출력 예 #2

1, 2, 3이 numbers에 없으므로, 1 + 2 + 3 = 6을 return 해야 합니다.
     */

    public double solution(int[] numbers) {
        /*
        0~9까지의 숫자를 모두 합친 다음 배열에 들어있는 숫자를 빼기하는 방식으로 풀이하자.
        0~9를 합친 숫자는 45
         */

        int answer=0;
        int num = 45;

        for(int i = 0; i <= numbers.length; i++){
            //0인 i가 루프마다 +1씩 커진다. numbers 배열과 같거나 작은 길이가 될 때 까지
            num -= numbers[i]; //num(초기45)의 값에서 numbers의[i]번째 배열에 들어있는 숫자를 빼기한다.
        }

        answer = num;


        return answer;
    }


}
