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

public class LegalHelp extends AppCompatActivity {

    public View Answer1;
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

    public View Answer2;
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

    public View Answer3;
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

    public View Answer4;
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

    public View Answer5;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legal_help);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<font color=\"white\">" + getString(R.string.app_name) + "</font>"));
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.app_logo);
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));

        Answer1 = findViewById(R.id.firstLegalHelpAnswer);
        Answer2 = findViewById(R.id.secondLegalHelpAnswer);
        Answer3 = findViewById(R.id.thirdLegalHelpAnswer);
        Answer4 = findViewById(R.id.fourthLegalHelpAnswer);
        Answer5 = findViewById(R.id.fifthLegalHelpAnswer);

        TextView firstLegalHelpAnswer = (TextView) findViewById(R.id.firstLegalHelpAnswer);
        firstLegalHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView secondLegalHelpAnswer = (TextView) findViewById(R.id.secondLegalHelpAnswer);
        secondLegalHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView thirdLegalHelpAnswer = (TextView) findViewById(R.id.thirdLegalHelpAnswer);
        thirdLegalHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView fourthLegalHelpAnswer = (TextView) findViewById(R.id.fourthLegalHelpAnswer);
        fourthLegalHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView fifthLegalHelpAnswer = (TextView) findViewById(R.id.fifthLegalHelpAnswer);
        fifthLegalHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());


        Button question1Button = (Button) findViewById(R.id.firstLegalHelpQuestion);
        Button question2Button = (Button) findViewById(R.id.secondLegalHelpQuestion);
        Button question3Button = (Button) findViewById(R.id.thirdLegalHelpQuestion);
        Button question4Button = (Button) findViewById(R.id.fourthLegalHelpQuestion);
        Button question5Button = (Button) findViewById(R.id.fifthLegalHelpQuestion);

        question1Button.setOnClickListener(VisibleListener1);
        question2Button.setOnClickListener(VisibleListener2);
        question3Button.setOnClickListener(VisibleListener3);
        question4Button.setOnClickListener(VisibleListener4);
        question5Button.setOnClickListener(VisibleListener5);

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
