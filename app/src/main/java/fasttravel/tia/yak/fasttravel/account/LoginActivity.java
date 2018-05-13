package fasttravel.tia.yak.fasttravel.account;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fasttravel.tia.yak.fasttravel.MenuUtama;
import fasttravel.tia.yak.fasttravel.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button bt = (Button) findViewById(R.id.login_bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, MenuUtama.class));
                finish();
            }
        });
    }
}
