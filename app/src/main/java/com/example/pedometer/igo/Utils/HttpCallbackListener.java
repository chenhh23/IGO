package com.example.pedometer.igo.Utils;

import com.android.volley.VolleyError;

/**
 * Created by vvv98 on 2016/6/2.
 */
public interface HttpCallbackListener {
    void onFinish(String str);
    void onError(VolleyError volleyError);
}
