package com.example.linux.mapsaplicacion.api;

import com.example.linux.mapsaplicacion.models.Inmuebles;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by linux on 21/10/17.
 */

public interface DatosApi {
    @GET("rvmt-7x4r.json")
    Call<ArrayList<Inmuebles>> obtenerListaInmuebles();
}
