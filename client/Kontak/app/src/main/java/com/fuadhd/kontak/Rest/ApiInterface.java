package com.fuadhd.kontak.Rest;

import com.fuadhd.kontak.Model.GetKontak;
import com.fuadhd.kontak.Model.PostPutDelKontak;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;

public interface ApiInterface {
    @GET("kontak_android")
    Call<GetKontak> getKontak();
    @FormUrlEncoded
    @POST("kontak")
    Call<PostPutDelKontak> postKontak(@Field("nama") String nama, @Field("nomor") String nomor);
    @FormUrlEncoded
    @PUT("kontak")
    Call<PostPutDelKontak> putKontak(@Field("id") String id,
                                     @Field("nama") String nama,
                                     @Field("nomor") String nomor);
    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "kontak", hasBody = true)
    Call<PostPutDelKontak> deleteKontak(@Field("id") String id);
}
