package com.lawencon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.lawencon.barang.Barang;
import com.lawencon.db.AppDatabase;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText uNameEt, pass;
    TextView tvErrorLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDatabase();
        initComponent();
    }

    void initDatabase() {
        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "barang").allowMainThreadQueries().build();
        db.barangDao().insertAll();
    }

    void initComponent() {
        btnLogin = findViewById(R.id.btnLogin);
        uNameEt = findViewById(R.id.txt_userid);
        pass = findViewById(R.id.txt_password);
        tvErrorLogin = findViewById(R.id.tv_error_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getLogin(uNameEt.getText().toString(), pass.getText().toString());
            }
        });
    }

    void getLogin(String uName, String pass) {
        if (uName.matches("") || pass.isEmpty()) {
           tvErrorLogin.setText(getResources().getString(R.string.error_empty_email));
        } else if (!isValidEmail(uName)) {
            tvErrorLogin.setText(getResources().getString(R.string.error_email_wrong));
        } else if (pass.matches("") || pass.isEmpty()) {
            tvErrorLogin.setText(getResources().getString(R.string.error_empty_password));
        } else {
            Intent intent = new Intent(this, Barang.class);
            startActivity(intent);
            finish();
        }
    }

    public static boolean isValidEmail(String email) {
        boolean validate;
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        String emailPattern2 = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+\\.+[a-z]+";
        String emailPattern3 = "[A-Z0-9a-z._%+-]+@[a-z-*[@#$%^_.*&+=]]+\\.+[a-z]+\\.+[a-z]+";

        if (email.matches(emailPattern)) {
            validate = true;
        } else if (email.matches(emailPattern2)) {
            validate = true;
        } else if (email.matches(emailPattern3)) {
            validate = true;
        } else {
            validate = false;
        }
        return validate;
    }
}