package com.xubingbing;

import org.brunocvcunha.instagram4j.Instagram4j;
import org.brunocvcunha.instagram4j.requests.InstagramGetMediaInfoRequest;
import org.brunocvcunha.instagram4j.requests.InstagramGetUserReelMediaFeedRequest;
import org.brunocvcunha.instagram4j.requests.InstagramUploadAlbumRequest;
import org.brunocvcunha.instagram4j.requests.InstagramUploadPhotoRequest;

import java.io.File;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws Exception {
        Instagram4j instagram = Instagram4j.builder().username("dogogdaily").password("A94vTmnYGfFEN8y").build();

        instagram.setup();
        instagram.login();

    }


}
