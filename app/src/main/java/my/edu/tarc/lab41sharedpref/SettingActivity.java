package my.edu.tarc.lab41sharedpref;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SettingActivity extends AppCompatActivity {
    private static final String PREF_FILE = "my.edu.tarc.lab41sharedpref";
    private EditText editTextName;
    private RadioGroup radioGroupGender;
    private RadioButton radioButtonMale, radioButtonFemale;
    private ImageView imageViewProfile;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        editTextName = findViewById(R.id.editTextName);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        radioButtonMale = findViewById(R.id.radioButtonMale);
        radioButtonFemale = findViewById(R.id.radioButtonFemale);
        imageViewProfile = findViewById(R.id.imageViewProfile);
        sharedPreferences = getSharedPreferences(PREF_FILE, MODE_PRIVATE);

    }

    @Override
    protected void onResume() {
        super.onResume();
        
    }
}
