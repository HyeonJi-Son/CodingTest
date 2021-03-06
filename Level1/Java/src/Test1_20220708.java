public class Test1_20220708 {

    /*
    이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
    n=5, m=3
     */

    public static void main(String[] args) {
        int n = 5;
        int m = 3;

        //for 반복문에서 *을 print시킨다.
        //반복문 안에 반복문을 넣어 5번 반복시키는 for문이 3번 반복되도록 한다.

        for(int i = 0; i < m; i++){ //초기값이 0인 정수 i는 숫자가 m보다 작을 때까지 반복한다
                                    // (작을 때 까지 인 이유는 0부터 시작하니까 3번 반복하려면 0, 1, 2가 되도록)
                                    //i는 반복문이 한바퀴 돌면 +1씩 커진다.
            for(int j = 0; j < n; j++){ //초기값이 0인 정수 J는 숫자가 N보다 작을 때까지 반복한다
                                        // (작을 때 까지 인 이유는 0부터 시작하니까 5번 반복하려면 0, 1, 2가 되도록)
                                        //i는 반복문이 한바퀴 돌면 +1씩 커진다.
                System.out.print("*");
                //아까는 왜 *한개여도 다 줄바꿈으로 나왔을까?
                //답: System.out.println(); <-이 형태는 자동으로 줄바꿈이 되기 때문! 잊지마!
            }
            System.out.println();

        }
    }

}
