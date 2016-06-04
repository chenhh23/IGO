package com.example.pedometer.igo;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by vvv98 on 2016/5/28.
 */
public class Settings extends PreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
