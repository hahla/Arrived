package us.arrived.arrived;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.app_name);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.app_logo);
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));

        Button btn1 = (Button) findViewById(R.id.secondMenuButton);
        btn1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Intent i = new Intent(getApplicationContext(), VisaHelp.class);
                                        startActivity(i);
                                    }
                                }
        );

        Button btn2 = (Button) findViewById(R.id.thirdMenuButton);
        btn2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Intent i = new Intent(getApplicationContext(), Housing.class);
                                        startActivity(i);
                                    }
                                }
        );

        Button btn3 = (Button) findViewById(R.id.fourthMenuButton);
        btn3.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Intent i = new Intent(getApplicationContext(), CareerGuidance.class);
                                        startActivity(i);
                                    }
                                }
        );

        Button btn4 = (Button) findViewById(R.id.fifthMenuButton);
        btn4.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Intent i = new Intent(getApplicationContext(), LegalHelp.class);
                                        startActivity(i);
                                    }
                                }
        );

        Button btn5 = (Button) findViewById(R.id.sixthMenuButton);
        btn5.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Intent i = new Intent(getApplicationContext(), DeportationHelp.class);
                                        startActivity(i);
                                    }
                                }
        );

        Button btn6 = (Button) findViewById(R.id.seventhMenuButton);
        btn6.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Intent i = new Intent(getApplicationContext(), EnglishHelp.class);
                                        startActivity(i);
                                    }
                                }
        );

        Button btn7 = (Button) findViewById(R.id.eighthMenuButton);
        btn7.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Intent i = new Intent(getApplicationContext(), SupportGroups.class);
                                        startActivity(i);
                                    }
                                }
        );

        Button btn8 = (Button) findViewById(R.id.ninthMenuButton);
        btn8.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Intent i = new Intent(getApplicationContext(), FAQ.class);
                                        startActivity(i);
                                    }
                                }
        );

        Button btn9 = (Button) findViewById(R.id.twelfthMenuButton);
        btn9.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Intent i = new Intent(getApplicationContext(), driving.class);
                                        startActivity(i);
                                    }
                                }
        );

        Button btn10 = (Button) findViewById(R.id.eleventhMenuButton);
        btn10.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Intent i = new Intent(getApplicationContext(), financialAdvice.class);
                                        startActivity(i);
                                    }
                                }
        );


        Button btn11 = (Button) findViewById(R.id.tenthMenuButton);
        btn11.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Intent i = new Intent(getApplicationContext(), healthKnowledge.class);
                                        startActivity(i);
                                    }
                                }
        );



        Button fbButton = (Button) findViewById(R.id.facebook_button);
        fbButton.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Uri uri = Uri.parse("https://www.facebook.com/arrivedapp/?fref=ts");
                                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                            startActivity(intent);
                                        }
                                    }
        );

        Button arrivedButton = (Button) findViewById(R.id.arrived_button);
        arrivedButton.setOnClickListener(new View.OnClickListener() {
                                             public void onClick(View v) {
                                                 Uri uri = Uri.parse("http://www.arrived.us");
                                                 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                                 startActivity(intent);
                                             }
                                         }
        );

        Button twButton = (Button) findViewById(R.id.twitter_button);
        twButton.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Uri uri = Uri.parse("https://twitter.com/arrived_app");
                                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                            startActivity(intent);
                                        }
                                    }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setType("text/plain");
        sendIntent.putExtra(Intent.EXTRA_TEXT, getResources().getString(R.string.sharing_text_message));
        startActivity(Intent.createChooser(sendIntent, getResources().getString(R.string.sharing_header)));
        return true;
    }


}


