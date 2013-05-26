package com.github.action;

import java.util.ArrayList;
import java.util.List;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.integration.spring.SpringBean;

import com.github.controler.StackExchangeControler;
import com.google.code.stackexchange.schema.Question;

@UrlBinding("/Home.htm")
public class HomeActionBean extends BaseActionBean {
	
	@SpringBean
	private StackExchangeControler stackExchangeControler;
	
	private String question;
	private int nombreResultat;
	private List<String> questionsTitles = new ArrayList<String>();

    @DefaultHandler
    public Resolution view() {
        return new ForwardResolution("/WEB-INF/jsp/home.jsp");
    }
    
    public Resolution doGetMsg()
    {
    	List<Question> questions = stackExchangeControler.searchQuestion(question);
    	nombreResultat = questions.size();
    	for(Question question: questions)
    	{
    		questionsTitles.add(question.getTitle());
    	}
    	return new ForwardResolution("/WEB-INF/jsp/home.jsp");
    }

    public List<String> getQuestionsTitles() {
		return questionsTitles;
	}

	public void setQuestionsTitles(List<String> questionsTitles) {
		this.questionsTitles = questionsTitles;
	}

	public String getJavaVersion() {
        return System.getProperty("java.version");
    }

    public String getOsName() {
        return System.getProperty("os.name");
    }

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getNombreResultat() {
		return nombreResultat;
	}

	public void setNombreResultat(int nombreResultat) {
		this.nombreResultat = nombreResultat;
	}
	
}
