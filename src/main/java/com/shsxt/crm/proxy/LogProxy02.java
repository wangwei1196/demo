/*
package com.shsxt.crm.proxy;

import com.alibaba.fastjson.JSON;
import com.shsxt.crm.annotations.Log;
import com.shsxt.crm.dao.LogDao;
import com.shsxt.crm.po.LogWithBLOBs;
import com.shsxt.crm.service.UserService;
import com.shsxt.crm.utils.LoginUserUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

*/
/**
 * 日志收集
 *//*

@Component
@Aspect
public class LogProxy02 {



   */
/* @Resource
    private HttpServletRequest request;

    @Resource
    private UserService userService;

    @Resource
    private RabbitTemplate template;
*//*



    @Pointcut("@annotation(com.shsxt.crm.annotations.Log)")
    public  void cut(){}




    @Around(value = "cut()")
    public Object around(ProceedingJoinPoint pjp) throws  Throwable{
        Object result=null;
        MethodSignature methodSignature= (MethodSignature) pjp.getSignature();
        Method method= methodSignature.getMethod();
        Log log= method.getAnnotation(Log.class);
        LogWithBLOBs logWithBLOBs=new LogWithBLOBs();
        logWithBLOBs.setDescription(log.description());
        logWithBLOBs.setMethod(method.getName());
        logWithBLOBs.setType("0");
        logWithBLOBs.setRequestIp(request.getRemoteAddr());
        String json= JSON.toJSONString(request.getParameterMap());
        logWithBLOBs.setParams(json);
        logWithBLOBs.setCreateDate(new Date());
        Long start= System.currentTimeMillis();
        result= pjp.proceed();
        Long end=System.currentTimeMillis();
        logWithBLOBs.setExecuteTime(Integer.parseInt((end-start)+""));
        Integer userId= LoginUserUtil.releaseUserIdFromCookie(request);
        logWithBLOBs.setCreateMan(userService.queryById(userId).getTrueName());
        logWithBLOBs.setResult(JSON.toJSONString(result));
        template.convertAndSend(JSON.toJSONString(logWithBLOBs));
        return result;
    }

}
*/
