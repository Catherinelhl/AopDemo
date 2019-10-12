package com.cathy.aspectjdemo.aspectj;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 一个简体被点击的切点
 */
@Aspect
public class AspectJClick {
    private static String TAG = AspectJClick.class.getSimpleName();
    private String flag="===AspectJ：===";

//
//    @Before("execution (* com.cathy.aspectjdemo.activity.MainActivity.test*(..))")
//    public void beforeAspect(JoinPoint joinPoint){
//        System.out.println(TAG+flag+joinPoint.getSignature().getName()+"-before");
//    }
//    @Before("execution (* com.cathy.aspectjdemo.activity.MainActivity.setOnClickListener(..))")
//    public void beforeOnClickAspect(JoinPoint joinPoint){
//        System.out.println(TAG+flag+joinPoint.getSignature().getName()+"-onclick");
//    }
//
//    @AfterReturning(value ="execution (* com.cathy.aspectjdemo.activity.MainActivity.testAspectJGetResult(..))",returning = "result")
//    public void afterReturnAspectJ(String result){
//        System.out.println(TAG+flag+result);
//
//    }


    /***
     * 自定义切点监听点击事件
     */
    @Pointcut("execution(@com.cathy.aspectjdemo.aspectj.OnClickAspectJ * *(..))")
    private void onClickAspect(){
        System.out.println(TAG+"拦截到监听事件了，可以做想做的事情了....");
    }

    @Before("onClickAspect()")
    private void beforeOnclickAspectJ(JoinPoint joinPoint){
        System.out.println(TAG+flag+joinPoint.getSignature().getName()+"-before");
    }



}
