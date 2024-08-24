package com.example.digitalmuseum;


import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Spinner exhibitSectionSpinner;
    private Button seekInfoButton;
    private TextView infoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exhibitSectionSpinner = findViewById(R.id.exhibit_section_spinner);
        seekInfoButton = findViewById(R.id.seek_info_button);
        infoTextView = findViewById(R.id.info_text_view);

        // Set up the spinner with data
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.museum_sections, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exhibitSectionSpinner.setAdapter(adapter);

        // Set onClickListener for the button
        seekInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displaySectionInfo();
            }
        });
    }

    // Method to update the text view based on selected spinner item
    private void displaySectionInfo() {
        String selectedSection = exhibitSectionSpinner.getSelectedItem().toString();
        String prefixText;
        String mainInfoText;

        // Determine prefix based on selected section
        switch (selectedSection) {
            case "Art Gallery":
                prefixText = "Explore art through...";
                mainInfoText = "\n\n- Renaissance Art (Leonardo da Vinci, Michelangelo, and Raphael.)" +
                        "\n\n- Modern Art (Pablo Picasso, Jackson Pollock, and Andy Warhol.)" +
                        "\n\n- Impressionism (Monet, Degas, and Renoir.)";
                break;
            case "History Section":
                prefixText = "Artifacts from...";
                mainInfoText = "\n\n- Ancient Civilizations (Egypt, Mesopotamia, and the Indus Valley.)" +
                        "\n\n- World Wars (World War I and II.)" +
                        "\n\n- Medieval History (Knights and Castles.)";
                break;
            case "Science Exhibits":
                prefixText = "Models of...";
                mainInfoText = "\n\n- Space Exploration (Solar system, Space missions, and Astronaut gear.)" +
                        "\n\n- Robotics (The evolution and Future of Robotics.)" +
                        "\n\n- Environmental Science (Climate change, Biodiversity, and Sustainable living.)";
                break;
            default:
                prefixText = "";
                mainInfoText = "Please select a section to view information.";
                break;
        }

        infoTextView.setText(prefixText);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                infoTextView.setText(prefixText + mainInfoText);
            }
        }, 2000); // Delay for 2 seconds
    }
}
