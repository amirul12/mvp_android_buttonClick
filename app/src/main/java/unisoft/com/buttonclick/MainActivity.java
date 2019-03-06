package unisoft.com.buttonclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainView{

    Button btnLogin;
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button)findViewById(R.id.btnLogin);
        presenter = new MainActivityPresenter(this, this);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.clickButton("button clicked");
            }
        });

    }

    @Override
    public void ShowMessageForClickButton(String msg) {
        Toast.makeText(this, " "+msg, Toast.LENGTH_SHORT).show();
    }
}
