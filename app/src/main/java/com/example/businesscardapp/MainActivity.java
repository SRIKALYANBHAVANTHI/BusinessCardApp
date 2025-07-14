package com.example.businesscardapp;
public class MainActivity extends AppCompatActivity {

    private ImageView logoImage;
    private TextView nameText;
    private TextView phoneText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the views from the layout
        logoImage = findViewById(R.id.logo_image);
        nameText = findViewById(R.id.name_text);
        phoneText = findViewById(R.id.phone_text);

        // You can update the content of TextViews dynamically here (optional)
        nameText.setText("John Doe");  // Update name
        phoneText.setText("+1234567890");  // Update phone number

        // You can also set the logo image programmatically here (optional)
        // logoImage.setImageResource(R.drawable.your_logo);  // Replace with your logo resource ID
    }
}