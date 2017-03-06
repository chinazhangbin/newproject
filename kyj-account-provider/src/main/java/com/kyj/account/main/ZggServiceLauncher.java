package com.kyj.account.main;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: ZggServiceLauncher <br/>
 * Function: zgg service层 启动入口 <br/>
 * 
 * 
 * @version
 * @since JDK 1.7
 */
public class ZggServiceLauncher {

    private static Logger logger = Logger.getLogger(ZggServiceLauncher.class);
    private static boolean stopped = false;
    private static final Object LOCK = new Object();
	private static ClassPathXmlApplicationContext context;

    /**
     * 
     * 
     *  
     *  
     * main:( ezuc service层 启动入口 ). <br/>
     * 
     * 
     * @param args
     *            传入参数
     * @since JDK 1.7
     */
    public static void main(String[] args) {
    	initSpring();
        while (!stopped) {
            synchronized (LOCK) {
                try {
                    LOCK.wait(3600000);
                } catch (InterruptedException e) {
                	e.printStackTrace();
                }
            }
        }
    }

    /**
     * stopMain:(stopMain停止服务). <br/>
     * 
     * 
     * @since JDK 1.7
     */
    public static void stopMain() {
        stopped = true;
        LOCK.notify();
    }
    
    public static void initSpring(){
//    	 context = new ClassPathXmlApplicationContext(
//                 new String[] {
//                         "spring/spring-context.xml"
//                 });
//         context.start();
        String[] configLocation = {
                "spring/spring-context.xml"};
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

        logger.info("服务启动完成");
        String[] names = context.getBeanDefinitionNames();

        for (String string : names)
            logger.debug("服务名称:" + string + ",");
         System.out.println("Start Success!");
    }
}