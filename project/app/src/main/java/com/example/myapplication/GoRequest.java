package com.example.myapplication;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class GoRequest extends StringRequest {
    //서버 설정 (php파일 연동)
    final static private String URL = "http:///220.122.46.167:8000/go.php";
    private Map<String, String> map;

    public GoRequest(String userID ,Response.Listener<String> listener){

        super(Method.POST, URL, listener, null);

        map=new HashMap<>();

    }
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
