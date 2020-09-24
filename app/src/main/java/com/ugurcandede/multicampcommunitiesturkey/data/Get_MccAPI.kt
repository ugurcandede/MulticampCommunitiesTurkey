package com.ugurcandede.multicampcommunitiesturkey.data

import com.ugurcandede.multicampcommunitiesturkey.data.model.MccResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface GetMccAPI {

    @GET("{communities}")
    suspend fun getMulticampCommunities(
        @Path("communities") communities: String
    ): List<MccResponse>
}

