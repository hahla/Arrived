package us.arrived.arrived;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DeportationHelp extends AppCompatActivity {

    public View Answer1;
    public View Answer2;
    public View Answer3;
    public View Answer4;
    public View Answer5;
    public View Answer6;
    public View Answer7;
    public View Answer8;
    public View Answer9;
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
    View.OnClickListener VisibleListener7 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (Answer7.getVisibility() == View.VISIBLE) {
                Answer7.setVisibility(View.GONE);
            } else {
                Answer7.setVisibility(View.VISIBLE);
            }
        }
    };
    View.OnClickListener VisibleListener8 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (Answer8.getVisibility() == View.VISIBLE) {
                Answer8.setVisibility(View.GONE);
            } else {
                Answer8.setVisibility(View.VISIBLE);
            }
        }
    };
    View.OnClickListener VisibleListener9 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (Answer9.getVisibility() == View.VISIBLE) {
                Answer9.setVisibility(View.GONE);
            } else {
                Answer9.setVisibility(View.VISIBLE);
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deportation_help);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<font color=\"white\">" + getString(R.string.app_name) + "</font>"));
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.app_logo);
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));

        TextView firstDeportationHelpAnswer = (TextView) findViewById(R.id.firstDeportationHelpAnswer);
        firstDeportationHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView secondDeportationHelpAnswer = (TextView) findViewById(R.id.secondDeportationHelpAnswer);
        secondDeportationHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView thirdDeportationHelpAnswer = (TextView) findViewById(R.id.thirdDeportationHelpAnswer);
        thirdDeportationHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView fourthDeportationHelpAnswer = (TextView) findViewById(R.id.fourthDeportationHelpAnswer);
        fourthDeportationHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView fifthDeportationHelpAnswer = (TextView) findViewById(R.id.fifthDeportationHelpAnswer);
        fifthDeportationHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView sixthDeportationHelpAnswer = (TextView) findViewById(R.id.sixthDeportationHelpAnswer);
        sixthDeportationHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView seventhDeportationHelpAnswer = (TextView) findViewById(R.id.seventhDeportationHelpAnswer);
        seventhDeportationHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView eighthDeportationHelpAnswer = (TextView) findViewById(R.id.eighthDeportationHelpAnswer);
        eighthDeportationHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView ninthDeportationHelpAnswer = (TextView) findViewById(R.id.ninthDeportationHelpAnswer);
        ninthDeportationHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());

        Answer1 = findViewById(R.id.firstDeportationHelpAnswer);
        Answer2 = findViewById(R.id.secondDeportationHelpAnswer);
        Answer3 = findViewById(R.id.thirdDeportationHelpAnswer);
        Answer4 = findViewById(R.id.fourthDeportationHelpAnswer);
        Answer5 = findViewById(R.id.fifthDeportationHelpAnswer);
        Answer6 = findViewById(R.id.sixthDeportationHelpAnswer);
        Answer7 = findViewById(R.id.seventhDeportationHelpAnswer);
        Answer8 = findViewById(R.id.eighthDeportationHelpAnswer);
        Answer9 = findViewById(R.id.ninthDeportationHelpAnswer);

        Button question1Button = (Button) findViewById(R.id.firstDeportationHelpQuestion);
        Button question2Button = (Button) findViewById(R.id.secondDeportationHelpQuestion);
        Button question3Button = (Button) findViewById(R.id.thirdDeportationHelpQuestion);
        Button question4Button = (Button) findViewById(R.id.fourthDeportationHelpQuestion);
        Button question5Button = (Button) findViewById(R.id.fifthDeportationHelpQuestion);
        Button question6Button = (Button) findViewById(R.id.sixthDeportationHelpQuestion);
        Button question7Button = (Button) findViewById(R.id.seventhDeportationHelpQuestion);
        Button question8Button = (Button) findViewById(R.id.eighthDeportationHelpQuestion);
        Button question9Button = (Button) findViewById(R.id.ninthDeportationHelpQuestion);

        question1Button.setOnClickListener(VisibleListener1);
        question2Button.setOnClickListener(VisibleListener2);
        question3Button.setOnClickListener(VisibleListener3);
        question4Button.setOnClickListener(VisibleListener4);
        question5Button.setOnClickListener(VisibleListener5);
        question6Button.setOnClickListener(VisibleListener6);
        question7Button.setOnClickListener(VisibleListener7);
        question8Button.setOnClickListener(VisibleListener8);
        question9Button.setOnClickListener(VisibleListener9);

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
