/*package com.shsxt.crm.service;

import com.alibaba.fastjson.JSON;
import com.shsxt.base.BaseService;
import com.shsxt.crm.dao.LogDao;
import com.shsxt.crm.po.LogWithBLOBs;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class LogService extends BaseService<LogWithBLOBs> {

    @Resource
    private LogDao logDao;



    public  void log(String logStr){
        LogWithBLOBs logWithBLOBs= JSON.parseObject(logStr,LogWithBLOBs.class);
        logDao.save(logWithBLOBs);
    }

}*/
