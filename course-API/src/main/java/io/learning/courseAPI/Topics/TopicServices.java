package io.learning.courseAPI.Topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicServices {
	
	private List<Topic> topic = new ArrayList<>(Arrays.asList(
			new Topic("1","JAVA", "Core of All"),
			new Topic("2","SQL", "Basis for all Data Science, Data Analysis"),
			new Topic("3","Angular", "Only looks good for end user"),
			new Topic("4","Machine Learning", "Chaning the current Jobs")
			));
	
	//Get All Topics List
	public List<Topic> getAllTopics()
	{
		return topic;
	}
	
	
	

}
