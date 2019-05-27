package com.tata.mvpdemo;

import java.util.List;

public interface GitHubService {
    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);
}