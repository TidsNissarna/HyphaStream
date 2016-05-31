package com.hyphastream.test;

/**
 * Created by TobNil on 2016-05-31.
 */
public class JonasClientImpl implements JonasClient {

    private Long jonasId;

    public Long createJonas() {
        jonasId = 1L;
        return jonasId;
    }

    public void getJonas(Long jonasId) {
    }
}