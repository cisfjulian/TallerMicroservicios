package controllers;

import services.TweetServices;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/tweets")
public class TweetController {
    @Inject
    TweetServices tweetServices;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return tweetServices.greeting();
    }
}
