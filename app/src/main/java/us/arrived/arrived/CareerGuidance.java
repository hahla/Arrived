package us.arrived.arrived;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CareerGuidance extends AppCompatActivity {

    public View Answer1;
    public View Answer2;
    public View Answer3;
    public View Answer4;
    public View Answer5;
    public View Answer6;

    View.OnClickListener VisibleListener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (Answer1.getVisibility() == View.VISIBLE) {
                Answer1.setVisibility(View.GONE);
            } else {
                Answer1.setVisibility(View.VISIBLE);
            }
        }
    };
    View.OnClickListener VisibleListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (Answer2.getVisibility() == View.VISIBLE) {
                Answer2.setVisibility(View.GONE);
            } else {
                Answer2.setVisibility(View.VISIBLE);
            }
        }
    };
    View.OnClickListener VisibleListener3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (Answer3.getVisibility() == View.VISIBLE) {
                Answer3.setVisibility(View.GONE);
            } else {
                Answer3.setVisibility(View.VISIBLE);
            }
        }
    };
    View.OnClickListener VisibleListener4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (Answer4.getVisibility() == View.VISIBLE) {
                Answer4.setVisibility(View.GONE);
            } else {
                Answer4.setVisibility(View.VISIBLE);
            }
        }
    };

    View.OnClickListener VisibleListener5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (Answer5.getVisibility() == View.VISIBLE) {
                Answer5.setVisibility(View.GONE);
            } else {
                Answer5.setVisibility(View.VISIBLE);
            }
        }
    };

    View.OnClickListener VisibleListener6 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (Answer6.getVisibility() == View.VISIBLE) {
                Answer6.setVisibility(View.GONE);
            } else {
                Answer6.setVisibility(View.VISIBLE);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_guidance);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.app_name);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.app_logo);
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));

        TextView firstCareerGuidanceAnswer = (TextView) findViewById(R.id.firstCareerGuidanceAnswer);
        firstCareerGuidanceAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView secondCareerGuidanceAnswer = (TextView) findViewById(R.id.secondCareerGuidanceAnswer);
        secondCareerGuidanceAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView thirdCareerGuidanceAnswer = (TextView) findViewById(R.id.thirdCareerGuidanceAnswer);
        thirdCareerGuidanceAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView fourthCareerGuidanceAnswer = (TextView) findViewById(R.id.fourthCareerGuidanceAnswer);
        fourthCareerGuidanceAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView fifthCareerGuidanceAnswer = (TextView) findViewById(R.id.fifthCareerGuidanceAnswer);
        fourthCareerGuidanceAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView sixthCareerGuidanceAnswer = (TextView) findViewById(R.id.sixthCareerGuidanceAnswer);
        fourthCareerGuidanceAnswer.setMovementMethod(LinkMovementMethod.getInstance());

        Answer1 = findViewById(R.id.firstCareerGuidanceAnswer);
        Answer2 = findViewById(R.id.secondCareerGuidanceAnswer);
        Answer3 = findViewById(R.id.thirdCareerGuidanceAnswer);
        Answer4 = findViewById(R.id.fourthCareerGuidanceAnswer);
        Answer5 = findViewById(R.id.fifthCareerGuidanceAnswer);
        Answer6 = findViewById(R.id.sixthCareerGuidanceAnswer);

        Button question1Button = (Button) findViewById(R.id.firstCareerGuidanceQuestion);
        Button question2Button = (Button) findViewById(R.id.secondCareerGuidanceQuestion);
        Button question3Button = (Button) findViewById(R.id.thirdCareerGuidanceQuestion);
        Button question4Button = (Button) findViewById(R.id.fourthCareerGuidanceQuestion);
        Button question5Button = (Button) findViewById(R.id.fifthCareerGuidanceQuestion);
        Button question6Button = (Button) findViewById(R.id.sixthCareerGuidanceQuestion);

        question1Button.setOnClickListener(VisibleListener1);
        question2Button.setOnClickListener(VisibleListener2);
        question3Button.setOnClickListener(VisibleListener3);
        question4Button.setOnClickListener(VisibleListener4);
        question5Button.setOnClickListener(VisibleListener5);
        question6Button.setOnClickListener(VisibleListener6);

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
