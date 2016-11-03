package com.horsege.httpsdk;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.horsege.httpsdk.entity.Subject;
import com.horsege.httpsdk.http.HttpManager;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Subscriber;

public class MainActivity extends FragmentActivity {

    @BindView(R.id.httpResult)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.clickMe)
    void onClick(Button clickMeBtn) {
        Subscriber<List<Subject>> subscriber = new Subscriber<List<Subject>>() {
            @Override
            public void onCompleted() {
                Log.e("mmz", "onCompleted");

            }

            @Override
            public void onError(Throwable e) {
                Log.e("mmz", e.toString());
            }

            @Override
            public void onNext(List<Subject> subjects) {
                if (subjects != null) {
                    textView.setText(subjects.toString());
                }
            }
        };

        HttpManager.getInstance().getTopMovie(subscriber, 0, 10);
    }
}
