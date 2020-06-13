package com.example.amangautam.peerconnect.Fragments;

import com.example.amangautam.peerconnect.Notifications.MyResponse;
import com.example.amangautam.peerconnect.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Aman Gautam on 08-06-2020.
 */

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAJKAAoOk:APA91bE11eMGqu23epnW4XGIano0Fo_E5fuioKmctrqaaIk6Kw-8u4Ug_V-15QTPN-SlL0G489D2IU8LCvyELqvHYk7o8F3uY7DeZ6pnDgtxJnjpP9EdfpgX9xJDfpVmdi0M2Hku4Odh"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
