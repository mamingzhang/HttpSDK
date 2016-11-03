package com.horsege.httpsdk.http;

import com.horsege.httpsdk.entity.HttpResult;
import com.horsege.httpsdk.entity.Subject;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by mamingzhang on 16/11/3.
 */
public interface ApiService {
    @GET("top250")
    Observable<HttpResult<List<Subject>>> getTopMovie(@Query("start") int start, @Query("count") int count);

}
