package com.yamlee.component.load;

import android.app.Activity;
import android.os.Bundle;

import com.yamlee.R;

import dalvik.system.DexFile;

public class LoadApk extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_load_apk);
		super.onCreate(savedInstanceState);
	}

	public void load() {
		try {
			DexFile dFile = DexFile.loadDex("/mnt/sdcard/TestApk.apk", "/mnt/sdcard/tempTestApk.apk", 0);
			Object object = dFile.loadClass("com.example.testapk,TestMethod", null).newInstance();
			//				Method method = object.getClass().getDeclaredMethod("", parameterTypes)
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
