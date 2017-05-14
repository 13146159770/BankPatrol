package com.bank.service.impl;

import java.util.List;

import com.bank.dao.impl.JobDaoImpl;
import com.bank.entity.Job;
import com.bank.entity.PageInfo;
import com.bank.service.JobService;

public class JobServiceImpl implements JobService {
	JobDaoImpl jdi = new JobDaoImpl();

	@Override
	public PageInfo<Job> getJobs(int page) {
		PageInfo<Job> data = new PageInfo<Job>();
		data.setCurPage(page);
		List<Job> list = jdi.queryJobs(data.getFrom(), data.getPageSize());
		int count = jdi.queryJobsCount();
		data.setPagedata(list);
		data.setTotalRecord(count);
		return data;
	}

}