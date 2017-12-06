package ssa.amoebiq.android.com.kindergarten.rest;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by skadavath on 12/6/17.
 */

public class ApiClient {

    public static final String BASE_URL = "http://10.0.0.2:3000";
    public static final String TAG = ApiClient.class.getName();
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {

        if(retrofit==null) {
            retrofit = new Retrofit.Builder()
                                   .baseUrl(BASE_URL)
                                   .addConverterFactory(GsonConverterFactory.create())
                                   .build();

        }
        return retrofit;
    }

    public static Retrofit getClientWithHeader(Context context) {

        return null;
    }
}
