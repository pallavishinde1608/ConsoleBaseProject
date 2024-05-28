package org.techHub.helper;
import org.techHub.question.*;
import java.util.*;
public class onlineExamHelper 
{
	List list=new ArrayList();
	int count=0;
	 public void addNewQuestion(Question question)
	{
	list.add(question);
	}
	public void viewAllQuestions()
	{
		for(Object obj:list)
		{
			Question q=(Question)obj;
			System.out.println(q.getId()+"\t"+q.getName()+"\t"+q.getOption1()+"\t"+q.getOption2()+"\t"+q.getOption3()+"\t"+q.getOption4()+"\t"+q.getAnswer());
		}
	}
	public void removeQuestion(int questionId)
	{
		for(Object obj:list)
			
		{
			Question q=(Question)obj;
			int qid=q.getId();
			if(qid==questionId)
			{
				int index=list.indexOf(q);
				if(index!=-1)
				{
				list.remove(index);
				}
			}
		}
	}
	
	public boolean searchQuestion(String questionName)
	{
		Iterator i=list.iterator();
		boolean b=false;
		while(i.hasNext())
		{
			Object obj=i.next();
			Question q=(Question)obj;
			String question=q.getName();
			if(question.equals(questionName))
			{
				b=true;
				break;
			}
			
		}
		return b;
	}
	public void attemptQuestion(int questionId,String answer)
	{
		for(Object obj:list)
		{
		Question q=(Question)obj;
		int qid=q.getId();
		String ans=q.getAnswer();
		if(qid==questionId && ans.equals(answer))
		{
			++count;
			
		}
		}
	}
	public void showResult()
	{
		if(list.size()!=0)
		{
		float totalQuestion=list.size();
		float incorrectQuestion=totalQuestion-count;
		float per=count/totalQuestion;
		System.out.println("percentage achieve by student "+(per*100));
	}
		else {
			System.out.println("please add que in the test you get result ");
		}
	}
}
