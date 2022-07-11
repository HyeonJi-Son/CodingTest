import java.util.List;

public class Test3_20220709 {
    public static void main(String[] args) {
        /*
        문제 설명
        행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
        2개의 행렬 arr1과 arr2를 입력받아,행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

        제한 조건
        행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.

        arr1	        arr2	        return
      1.[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
      2.[[1],[2]]	    [[3],[4]]	    [[4],[6]]

         */

        /* 지독한 1차시도와...틀린 답...ㅋㅋ....
        //이중배열 foreach로 떼어서 각각 더하기를 해줘야 하는 상황
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        // 이제 같은 행, 같은 열의 숫자들이 서로 더한 결과가 나오도록 해보자.
            //두 배열을 두번 foreach해서 떼어내는 법은 해냈다 이 다음에 서로 더하는 건 어떻게 하는거지?

        //두 배열의 길이를 합친 값을 구해서 그만큼 for문 또 돌리면 되지.
        final int leng = arr1.length + arr2.length;

        System.out.println("두 배열의 길이를 합친 값은=" + leng);

        for (int a = 0; a < leng; a++) {
            int ans1 = 0;
            int ans2 = 0;
            for (int[] arri : arr1) {
                for (int j : arri) {
                    System.out.print(j);
                    j = ans1;
                }
            }
            for (int[] arrk : arr2) {
                for (int l : arrk) {
                    System.out.print(l);
                    l = ans2;
                }
            }
            System.out.println("답"+ ans1+ ans2);
    //숫자들 각각 여러번 더하기...아 이거 했었는데...
        }
    }
         */
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] result = new int[2][2];
        //결과 값을 넣어줄 array를 선언한다. 2개 크기(앞)의 배열을 2개 가질 수 있는(뒤) 2차원 배열 할당.

        for(int i = 0; i < result.length; i++){
            //result배열의 길이보다 작을 때 까지 i가 +1씩 커지며 반복되는 for문
            for(int j = 0; j < result.length; j++){
                //result배열의 길이보다 작을 때 까지 j가 +1씩 커지며 반복되는 for문
                result[i][j] = arr1[i][j] + arr2[i][j];
                //result[i]번 째 인덱스 = arr1의 i번째 인덱스와 같은 값
                //result[j]번 째 인덱스 = arr2의 j번째 인덱스와 같은 값
                System.out.println(result[i][j]);
                //이를 출력
            }
        }

        //이것을 배열의 길이만큼 반복하여 4개의 결과를 모두 확인할 수 있게 된다.

        //왜 foreach까지 써가며 멀리멀리 돌아가려고 했을까...


    }
}

