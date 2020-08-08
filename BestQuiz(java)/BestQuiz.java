import java.util.ArrayList;
import java.util.List;

//  bestQuiz(a)
//  Write the function bestQuiz(a), which takes a rectangular 
// 2d list of numbers that represents a gradebook, where each column represents a quiz, and each row represents a student, and each 
// value represents that student's score on that quiz (except -1 indicates the student did not take the quiz). For example:

//    a = [ [ 88,  80, 91 ],
//          [ 68, 100, -1 ]
//        ]

//  This list indicates that student0 scored 88 on quiz0, 80 on quiz1, and 91 on quiz2. Also, student1 scored 68 on quiz0, 100 on 
// quiz1, and did not take quiz2. The function returns the quiz with the highest average. In this case, quiz0 average is 78, quiz1 
// average is 90, and quiz2 average is 91 (since we ignore the -1). Thus, quiz2 is the best, and so the function returns 2 in this 
// case. You are not responsible for malformed input, except you should return -1 if there are no quizzes. Also, resolve ties in 
// favor of the lower quiz number. Here is a test function for you: 
// a = [ [ 88,  80, 91 ],
//       [ 68, 100, -1 ]]
// bestQuiz(a) == 2

// a = [ [ 88,  80, 80 ],
//       [ 68, 100, 100 ]]
// bestQuiz(a) == 1

// a = [ [88, -1, -1 ],
//       [68, -1, -1 ]]
// bestQuiz(a) == 0

// a = [ [-1, -1, -1 ],
//       [-1, -1, -1 ]]
// bestQuiz(a) == -1

/**
 * @author Prem
 */
public class BestQuiz {
    public int bestQuiz(int[][] a) {
        // Your code goes here
        List<Integer> list = new ArrayList<>();
        int col = a[0].length;
        for(int i = 0; i < col; i++) {
            int count = 0;
            int sum = 0;
            for(int j = 0; j < a.length; j++) {
                if(a[j][i] != -1) {
                    sum = sum + a[j][i];
                    count ++;
                }
            }
            if(sum == 0) {
                list.add(0);
            } else {
                list.add(sum/count);
            }
        }
        int max = list.get(0);
        for(Integer i : list) {
            if(i > max) {
                max = i;
            }
        }
        if(max!=0) {
            return list.indexOf(max);
        } else {
           return -1; 
        }
    }
    public static void main(String[] args) {
        //
    }
}
