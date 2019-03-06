package unisoft.com.buttonclick;

import android.content.Context;
import android.util.Log;

/**
 * Created by user on 06-Mar-19.
 */

public class MainActivityPresenter implements MainActivityMvpPresenter {

    private Context context;
    MainView mainView;

    public MainActivityPresenter(Context context, MainView mainView) {

        Log.d("presenter", "clicked");
        this.context = context;
        this.mainView = mainView;
    }


    @Override
    public void clickButton(String value) {

        mainView.ShowMessageForClickButton(value);
    }
}
