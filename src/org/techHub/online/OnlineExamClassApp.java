package org.techHub.online;
import java.util.*;

import org.techHub.helper.onlineExamHelper;
import org.techHub.question.Question;

public class OnlineExamClassApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		onlineExamHelper helper=new onlineExamHelper();
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.enter question info\n2.display info\n3.remove question\n4.search question\n5.find percentage");
		System.out.println("enter choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			sc.nextLine();
			System.out.println("enter question id");
			int qid=sc.nextInt();
			sc.nextLine();
			System.out.println("enter question");
			String question=sc.nextLine();
			System.out.println("enter option1");
			String option1=sc.nextLine();
			System.out.println("enter option2");
			String option2=sc.nextLine();
			System.out.println("enter option3");
			String option3=sc.nextLine();
			System.out.println("enter option4");
			String option4=sc.nextLine();
			System.out.println("enter answer");
			String answer=sc.nextLine();
			Question q=new Question();
			q.setId(qid);
			q.setName(question);
			q.setOption1(option1);
			q.setOption2(option2);
			q.setOption3(option3);
			q.setOption4(option4);
			q.setAnswer(answer);
			helper.addNewQuestion(q);
		break;
		
		case 2:
			helper.viewAllQuestions();
			break;
		case 3:
			System.out.println("enter the question id which want to remove");
			int questionId=sc.nextInt();
			helper.removeQuestion(questionId);
			break;
		case 4:
			System.out.println("enter question searching purpose");
			sc.nextLine();
			question=sc.nextLine();
			 boolean b=helper.searchQuestion(question);
			 if(b)
			 {
				 System.out.println("question found");
			 }
			 else {
				 System.out.println("question not found");
			 }
			 break;
		case 5:
			sc.nextLine();
			System.out.println("enter the answer");
			String ans=sc.nextLine();
			System.out.println("enter question number");
			qid=sc.nextInt();
			helper.attemptQuestion(qid, ans);
			helper.showResult();
			break;
			
		default:
			System.out.println("wrong choice");
		}
		}while(true);
		
	}

}
