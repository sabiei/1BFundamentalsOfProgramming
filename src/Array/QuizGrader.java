package Array;

public class QuizGrader { // pangalan ng class, dapat kapareho ng file name
    public static void main(String[] args) { // dito nagsisimula yung program

        // answerKey = tamang sagot, studentAnswers = sagot ng student
        // dapat pareho sila ng haba, 10 questions
        char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'};
        char[] studentAnswers = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'};

        int correctCount = 0; // dito natin bibilangin kung ilan ang tama

        // loop sa lahat ng sagot ng student
        for (int i = 0; i < studentAnswers.length; i++) {
            if (studentAnswers[i] == answerKey[i]) { // kung pareho sila, tama
                correctCount++; // dagdagan yung bilang ng tama
            } else {
                // kung mali, ipakita kung ano sinagot at ano dapat
                System.out.println("Question " + (i + 1) + " Incorrect. You answered '" + studentAnswers[i] + "', correct answer is '" + answerKey[i] + "'");
            }
        }

        // labas na ng loop, isang beses lang ipapakita
        // (double) para may decimal yung percentage
        double scorePercentage = (double) correctCount / studentAnswers.length * 100;

        System.out.println("Correct Answers: " + correctCount + "/" + answerKey.length);
        System.out.println("Score: " + scorePercentage + "%");

        if (scorePercentage >= 70.0) { // 70 pataas, pasado
            System.out.println("Result: Passed");
        } else { // below 70, bagsak
            System.out.println("Result: Failed");
        }
    }
}
