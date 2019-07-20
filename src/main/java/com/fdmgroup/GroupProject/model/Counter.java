package com.fdmgroup.GroupProject.model;

import java.util.Timer;
import java.util.TimerTask;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Counter {
	
	 int interval;
	 Timer timer;


	 
	public boolean ab;

	public int timeleft;

	
	public void startCounter(int time) {
		String timeToString = Integer.toString(time);
	    String secs = timeToString;
	    
	    int delay = 1000;
	    int period = 1000;
	    timer = new Timer();
	    interval = Integer.parseInt(secs);
	    
	    
	  
	    timer.scheduleAtFixedRate(new TimerTask() {

	        public void run() {
	        	timeleft=setInterval();
	        }
	    }, delay, period);
	}
	

	public int getInterval() {
		return interval;
	}

	public void setInterval(int interval) {
		this.interval = interval;
	}

	public boolean isAb() {
		return ab;
	}

	public void setAb(boolean ab) {
		this.ab = ab;
	}

	public void setTimeleft(int timeleft) {
		this.timeleft = timeleft;
	}
	
	
	public Timer getTimer() {
		return timer;
	}
	
	public void setTimer(Timer timer) {
		this.timer = timer;
	}


	private final int setInterval() {
	    if (interval == 1)
	        timer.cancel();
	    return --interval;
	}

	public int getTimeleft() {
		return timeleft;
	}
	
	public void checkTimer(int time){
		if(!ab){
			startCounter(time);
			ab=true;
			}
			else{
				getTimer().cancel();
				timeleft=time;
				startCounter(time);
			}
	}
		
}
