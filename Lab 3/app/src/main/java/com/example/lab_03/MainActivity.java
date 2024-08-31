package com.example.lab_03;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Spinner exhibitSectionSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exhibitSectionSpinner = findViewById(R.id.exhibit_section_spinner);
        Button seekInfoButton = findViewById(R.id.seek_info_button);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.museum_sections, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exhibitSectionSpinner.setAdapter(adapter);

        seekInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSendMessage(v);
            }
        });
    }

    public void onSendMessage(View view) {
        String selectedSection = exhibitSectionSpinner.getSelectedItem().toString();

        Intent intent;
        String message;

        switch (selectedSection) {
            case "Art Gallery":
                intent = new Intent(MainActivity.this, ArtActivity.class);
                message = "\n\n- Renaissance Art (Leonardo da Vinci, Michelangelo, and Raphael.)" +
                        "\n\n- Modern Art (Pablo Picasso, Jackson Pollock, and Andy Warhol.)" +
                        "\n\n- Impressionism (Monet, Degas, and Renoir.)";
                intent.putExtra("EXTRA_MESSAGE", message);
                startActivity(intent);
                break;
            case "Eras and Epochs":
                intent = new Intent(MainActivity.this, HistoryActivity.class);
                message = "\n\n- Ancient Civilizations (Egyptians, Greeks, Romans.)" +
                        "\n\n- Medieval Times (Knights, Castles, and Feudalism.)" +
                        "\n\n- Modern History (Industrial Revolution, World Wars.)";
                intent.putExtra("EXTRA_MESSAGE", message);
                startActivity(intent);
                break;
            case "Science Sphere":
                intent = new Intent(MainActivity.this, ScienceActivity.class);
                message = "\n\n- Physics (Newton, Einstein, Quantum Mechanics.)" +
                        "\n\n- Biology (Evolution, DNA, Ecosystems.)" +
                        "\n\n- Chemistry (Periodic Table, Chemical Reactions, Molecules.)";
                intent.putExtra("EXTRA_MESSAGE", message);
                startActivity(intent);
                break;
            default:
                Log.d("MainActivity", "No valid section selected");
                break;
        }
    }
}
