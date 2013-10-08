package com.hck.mytools;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;

public class MyPreferences {
	private static SharedPreferences preference = null;
	private static Editor editor;

	public MyPreferences(Context context) {
		preference = context.getSharedPreferences("mypreference",
				Activity.MODE_PRIVATE);
	}

	public static void saveBoolean(String key, boolean boolen) {
		if (key == null || "".equals(key)) {
			Log.e("hck", "MyPreferences saveBoolen null");
			return;
		}
		editor = preference.edit();
		editor.putBoolean(key, boolen);
		editor.commit();
	}

	public static void saveString(String key, String data) {
		if (key == null || "".equals(key) || data == null || "".equals(data)) {
			Log.e("hck", "MyPreferences saveString null");
			return;
		}
		editor = preference.edit();
		editor.putString(key, data);
		editor.commit();
	}

	public static void saveInt(String key, int data) {
		if (key == null || "".equals(key)) {
			Log.e("hck", "MyPreferences saveInt null");
			return;
		}
		editor = preference.edit();
		editor.putInt(key, data);
		editor.commit();
		
	}
	
	public static void saveFloat(String key, Float data) {
		if (key == null || "".equals(key)) {
			Log.e("hck", "MyPreferences saveInt null");
			return;
		}
		editor = preference.edit();
		editor.putFloat(key, data);
		editor.commit();
		
	}
	public static void saveLong(String key, Long data) {
		if (key == null || "".equals(key)) {
			Log.e("hck", "MyPreferences saveInt null");
			return;
		}
		editor = preference.edit();
		editor.putLong(key, data);
		editor.commit();
		
	}
	
	
	
	public static boolean getBoolean(String key,boolean defValue)
	{
		return preference.getBoolean(key, defValue);
	}
	public static String getString(String key,String defValue)
	{
		return preference.getString(key, defValue);
	}
	public static int getInt(String key,int defValue)
	{
		return preference.getInt(key, defValue);
	}
	public static Float getFloat(String key,Float defValue)
	{
		return preference.getFloat(key, defValue);
	}
	public static Long getLong(String key,Long defValue)
	{
		return preference.getLong(key, defValue);
	}
	
}
