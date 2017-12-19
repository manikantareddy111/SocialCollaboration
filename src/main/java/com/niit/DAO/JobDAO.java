package com.niit.DAO;

import java.util.List;

import com.niit.model.Job;

public interface JobDAO {
public boolean addJob(Job job);
	
	public boolean updateJob(Job job);
	public boolean deleteJob(Job job);
	
	public Job getJob(int jobId);
	
	public List<Job> getAlljobs();
	
	public boolean approveJob(Job job);
	
	public boolean rejectJob(Job job);
	
}
