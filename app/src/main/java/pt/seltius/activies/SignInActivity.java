package pt.seltius.activies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pt.seltius.R;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_activity);

        Button registerButton = findViewById(R.id.registerBtn);
        Button loginButton = findViewById(R.id.signInBtn);

        //RegisterActivity
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity(SignUpActivity.class);
            }
        });


        //LoginActivity
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity(MainActivity.class);
            }
        });
    }


    public void openActivity(Class activity){
        Intent intent = new Intent(this, activity);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

}
