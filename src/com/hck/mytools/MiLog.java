package com.hck.mytools;

import android.util.Log;

public class MiLog {
	
	class CONSTANTS {
		static final boolean DEBUG_MODE_VERBOSE = true;
		static final boolean DEBUG_MODE_DEBUG 	= true;
		static final boolean DEBUG_MODE_ERROR 	= true;
		static final boolean DEBUG_MODE_INFO 	= true;
		static final boolean DEBUG_MODE_WARN 	= true;
	}
		
	public static void v(String tag, String msg){
		if(CONSTANTS.DEBUG_MODE_VERBOSE){
			if(tag!=null&&msg!=null){
				Log.v(tag, msg);
			}
		}
		
	}
	
	public static void d(String tag, String msg){
		if(CONSTANTS.DEBUG_MODE_DEBUG){
			if(tag!=null&&msg!=null){
				Log.d(tag, msg);
			}
		}
	}
	
	public static void e(String tag, String msg){
		if(CONSTANTS.DEBUG_MODE_ERROR){
			if(tag!=null&&msg!=null){
				Log.e(tag, msg);
			}
		}
	}
	
	public static void i(String tag, String msg){
		if(CONSTANTS.DEBUG_MODE_INFO){
			if(tag!=null&&msg!=null){
				Log.i(tag, msg);
			}
		}
	}
	
	public static void w(String tag, String msg){
		if(CONSTANTS.DEBUG_MODE_WARN){
			if(tag!=null&&msg!=null){
				Log.w(tag, msg);
			}
		}
	}
}
