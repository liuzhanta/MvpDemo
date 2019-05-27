package com.tata.mvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.tata.mvpdemo.component.demo.Boss;
import com.tata.mvpdemo.component.demo.Employer;
import com.tata.mvpdemo.component.demo.ManagerA;
import com.tata.mvpdemo.component.demo.ManagerB;
import com.tata.mvpdemo.live.LiveRoomContext;
import com.tata.mvpdemo.login.LoginActivity;

import java.util.Date;
import java.util.HashSet;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        long second = 5 * 1000;
        Date date = new Date();
        date.setTime(second);

        System.out.println("format = " + DateUtil.format(second));


        // test or null
        Object obj[] = {null, null, null};


        boolean andNull = ObjectUtils.isAndNull(obj);
        System.out.println("and null = " + andNull);


        // test and null
        boolean orNull = ObjectUtils.isOrNull(obj);
        System.out.println("or null = " + orNull);


        // test component

        // tata手下有2个经理
        Boss boss = new Boss("tata");

        // 张三手下有三个经理
        ManagerA zhangsan = new ManagerA("managerA");
        zhangsan.addEmployer(new ManagerA("lisi"));
        zhangsan.addEmployer(new ManagerA("wangwu"));
        zhangsan.addEmployer(new ManagerA("zhaoliu"));

        //
        ManagerB liuwu = new ManagerB("managerB");
        liuwu.addEmployer(new ManagerB("jijis"));
        liuwu.addEmployer(new ManagerB("sdfs"));
        liuwu.addEmployer(new ManagerB("sdfsdx"));


        boss.addEmployer(zhangsan).addEmployer(liuwu);
        HashSet<Employer> employers = boss.getEmployers();
        foreatch(boss, employers);


        // retrofit test

        testRetrofit();
    }

    private void testRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .build();
        GitHubService gitHubService = retrofit.create(GitHubService.class);
        Call<List<Repo>> user = gitHubService.listRepos("user");

    }

    private boolean isPublish = true;

    private void createLiveRoomShow() {
        LiveRoomContext liveRoomContext = new LiveRoomContext();
        liveRoomContext.setPublish(isPublish);
        liveRoomContext.liveActivity = null;
        liveRoomContext.presenter = null;
        liveRoomContext.viewHolder = null;
        liveRoomContext.callback = null;
        liveRoomContext.showLiveRoom();

    }

    private void foreatch(Employer employerTop, HashSet<Employer> employers) {
        StringBuilder sb = new StringBuilder();
        for (Employer employer : employers) {
            if (!employer.getEmployers().isEmpty()) {
                foreatch(employerTop, employer.getEmployers());
            }
            sb.append(employer.getName() + ",");
        }
        Log.d(TAG, "onCreate: employer: " + employerTop.getName() + " 手下有：" + sb.toString() + " 个人");
    }

    private static final String TAG = "MainActivity";

    public void login(View view) {
        LoginActivity.start(this);
    }
}
