package io.learning.courseAPI.Topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicServices {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("1","JAVA", "Core of All"),
			new Topic("2","SQL", "Basis for all Data Science, Data Analysis"),
			new Topic("3","Angular", "Only looks good for end user"),
			new Topic("4","Machine Learning", "Chaning the current Jobs")
			));
	
	//Get All Topics List
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	//Get Specific Topic
	public Topic getTopic(String id)
	{
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	//Add New Topic
	public void addTopic(Topic topic)
	{
		topics.add(topic);
	}
	
	//Update topic details
	public void updateTopic(String id, Topic topic)
	{
		for(int i=0; i<topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}
	
	//Delete Specific Topic
	public void deleteTopic(String id)
	{
		topics.removeIf(t -> t.getId().equals(id));
	}
	
	

}
