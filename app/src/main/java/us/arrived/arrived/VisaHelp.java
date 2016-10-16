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
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class VisaHelp extends AppCompatActivity {

    private View Answer1;
    OnClickListener VisibleListener1 = new OnClickListener() {
        @Override
        public void onClick(View v) {
            if (Answer1.getVisibility() == View.VISIBLE) {
                Answer1.setVisibility(View.GONE);
            } else {
                Answer1.setVisibility(View.VISIBLE);
            }
        }
    };
    private View Answer2;
    OnClickListener VisibleListener2 = new OnClickListener() {
        @Override
        public void onClick(View v) {

            if (Answer2.getVisibility() == View.VISIBLE)
                Answer2.setVisibility(View.GONE);
            else
                Answer2.setVisibility(View.VISIBLE);
        }
    };
    private View Answer3;
    OnClickListener VisibleListener3 = new OnClickListener() {
        @Override
        public void onClick(View v) {

            if (Answer3.getVisibility() == View.VISIBLE)
                Answer3.setVisibility(View.GONE);
            else
                Answer3.setVisibility(View.VISIBLE);
        }
    };
    private View Answer4;
    OnClickListener VisibleListener4 = new OnClickListener() {
        @Override
        public void onClick(View v) {

            if (Answer4.getVisibility() == View.VISIBLE)
                Answer4.setVisibility(View.GONE);
            else
                Answer4.setVisibility(View.VISIBLE);
        }
    };
    private View Answer5;
    OnClickListener VisibleListener5 = new OnClickListener() {
        @Override
        public void onClick(View v) {

            if (Answer5.getVisibility() == View.VISIBLE)
                Answer5.setVisibility(View.GONE);
            else
                Answer5.setVisibility(View.VISIBLE);
        }
    };
    private View Answer6;
    OnClickListener VisibleListener6 = new OnClickListener() {
        @Override
        public void onClick(View v) {

            if (Answer6.getVisibility() == View.VISIBLE)
                Answer6.setVisibility(View.GONE);
            else
                Answer6.setVisibility(View.VISIBLE);
        }
    };
    private View Answer7;
    OnClickListener VisibleListener7 = new OnClickListener() {
        @Override
        public void onClick(View v) {

            if (Answer7.getVisibility() == View.VISIBLE)
                Answer7.setVisibility(View.GONE);
            else
                Answer7.setVisibility(View.VISIBLE);
        }
    };
    private View Answer8;
    OnClickListener VisibleListener8 = new OnClickListener() {
        @Override
        public void onClick(View v) {

            if (Answer8.getVisibility() == View.VISIBLE)
                Answer8.setVisibility(View.GONE);
            else
                Answer8.setVisibility(View.VISIBLE);
        }
    };
    private View Answer9;
    OnClickListener VisibleListener9 = new OnClickListener() {
        @Override
        public void onClick(View v) {

            if (Answer9.getVisibility() == View.VISIBLE)
                Answer9.setVisibility(View.GONE);
            else
                Answer9.setVisibility(View.VISIBLE);
        }
    };
    private View Answer10;
    OnClickListener VisibleListener10 = new OnClickListener() {
        @Override
        public void onClick(View v) {

            if (Answer10.getVisibility() == View.VISIBLE)
                Answer10.setVisibility(View.GONE);
            else
                Answer10.setVisibility(View.VISIBLE);
        }
    };
    private View Answer11;
    OnClickListener VisibleListener11 = new OnClickListener() {
        @Override
        public void onClick(View v) {

            if (Answer11.getVisibility() == View.VISIBLE)
                Answer11.setVisibility(View.GONE);
            else
                Answer11.setVisibility(View.VISIBLE);
        }
    };
    private View Answer12;
    OnClickListener VisibleListener12 = new OnClickListener() {
        @Override
        public void onClick(View v) {

            if (Answer12.getVisibility() == View.VISIBLE)
                Answer12.setVisibility(View.GONE);
            else
                Answer12.setVisibility(View.VISIBLE);
        }
    };

    private View Answer13;
    OnClickListener VisibleListener13 = new OnClickListener() {
        @Override
        public void onClick(View v) {

            if (Answer13.getVisibility() == View.VISIBLE)
                Answer13.setVisibility(View.GONE);
            else
                Answer13.setVisibility(View.VISIBLE);
        }
    };

    private View Answer14;
    OnClickListener VisibleListener14 = new OnClickListener() {
        @Override
        public void onClick(View v) {

            if (Answer14.getVisibility() == View.VISIBLE)
                Answer14.setVisibility(View.GONE);
            else
                Answer14.setVisibility(View.VISIBLE);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visa_help);

        TextView firstVisaHelpAnswer = (TextView) findViewById(R.id.firstVisaHelpAnswer);
        firstVisaHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView secondVisaHelpAnswer = (TextView) findViewById(R.id.secondVisaHelpAnswer);
        secondVisaHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView thirdVisaHelpAnswer = (TextView) findViewById(R.id.thirdVisaHelpAnswer);
        thirdVisaHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView fourthVisaHelpAnswer = (TextView) findViewById(R.id.fourthVisaHelpAnswer);
        fourthVisaHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView fifthVisaHelpAnswer = (TextView) findViewById(R.id.fifthVisaHelpAnswer);
        fifthVisaHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView sixthVisaHelpAnswer = (TextView) findViewById(R.id.sixthVisaHelpAnswer);
        sixthVisaHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView seventhVisaHelpAnswer = (TextView) findViewById(R.id.seventhVisaHelpAnswer);
        seventhVisaHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView eighthVisaHelpAnswer = (TextView) findViewById(R.id.eighthVisaHelpAnswer);
        eighthVisaHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView ninthVisaHelpAnswer = (TextView) findViewById(R.id.ninthVisaHelpAnswer);
        ninthVisaHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView tenthVisaHelpAnswer = (TextView) findViewById(R.id.tenthVisaHelpAnswer);
        tenthVisaHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView eleventhVisaHelpAnswer = (TextView) findViewById(R.id.eleventhVisaHelpAnswer);
        eleventhVisaHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView twelfthVisaHelpAnswer = (TextView) findViewById(R.id.twelfthVisaHelpAnswer);
        twelfthVisaHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView thirteenthVisaHelpAnswer = (TextView) findViewById(R.id.thirteenthVisaHelpAnswer);
        thirteenthVisaHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView fourteenthVisaHelpAnswer = (TextView) findViewById(R.id.fourteenthVisaHelpAnswer);
        thirteenthVisaHelpAnswer.setMovementMethod(LinkMovementMethod.getInstance());

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<font color=\"white\">" + getString(R.string.app_name) + "</font>"));
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.app_logo);
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));

        Answer1 = findViewById(R.id.firstVisaHelpAnswer);
        Answer2 = findViewById(R.id.secondVisaHelpAnswer);
        Answer3 = findViewById(R.id.thirdVisaHelpAnswer);
        Answer4 = findViewById(R.id.fourthVisaHelpAnswer);
        Answer5 = findViewById(R.id.fifthVisaHelpAnswer);
        Answer6 = findViewById(R.id.sixthVisaHelpAnswer);
        Answer7 = findViewById(R.id.seventhVisaHelpAnswer);
        Answer8 = findViewById(R.id.eighthVisaHelpAnswer);
        Answer9 = findViewById(R.id.ninthVisaHelpAnswer);
        Answer10 = findViewById(R.id.tenthVisaHelpAnswer);
        Answer11 = findViewById(R.id.eleventhVisaHelpAnswer);
        Answer12 = findViewById(R.id.twelfthVisaHelpAnswer);
        Answer13 = findViewById(R.id.thirteenthVisaHelpAnswer);
        Answer13 = findViewById(R.id.fourteenthVisaHelpAnswer);

        Button question1Button = (Button) findViewById(R.id.firstVisaHelpQuestion);
        Button question2Button = (Button) findViewById(R.id.secondVisaHelpQuestion);
        Button question3Button = (Button) findViewById(R.id.thirdVisaHelpQuestion);
        Button question4Button = (Button) findViewById(R.id.fourthVisaHelpQuestion);
        Button question5Button = (Button) findViewById(R.id.fifthVisaHelpQuestion);
        Button question6Button = (Button) findViewById(R.id.sixthVisaHelpQuestion);
        Button question7Button = (Button) findViewById(R.id.seventhVisaHelpQuestion);
        Button question8Button = (Button) findViewById(R.id.eighthVisaHelpQuestion);
        Button question9Button = (Button) findViewById(R.id.ninthVisaHelpQuestion);
        Button question10Button = (Button) findViewById(R.id.tenthVisaHelpQuestion);
        Button question11Button = (Button) findViewById(R.id.eleventhVisaHelpQuestion);
        Button question12Button = (Button) findViewById(R.id.twelfthVisaHelpQuestion);
        Button question13Button = (Button) findViewById(R.id.thirteenthVisaHelpQuestion);
        Button question14Button = (Button) findViewById(R.id.fourteenthVisaHelpQuestion);

        question1Button.setOnClickListener(VisibleListener1);
        question2Button.setOnClickListener(VisibleListener2);
        question3Button.setOnClickListener(VisibleListener3);
        question4Button.setOnClickListener(VisibleListener4);
        question5Button.setOnClickListener(VisibleListener5);
        question6Button.setOnClickListener(VisibleListener6);
        question7Button.setOnClickListener(VisibleListener7);
        question8Button.setOnClickListener(VisibleListener8);
        question9Button.setOnClickListener(VisibleListener9);
        question10Button.setOnClickListener(VisibleListener10);
        question11Button.setOnClickListener(VisibleListener11);
        question12Button.setOnClickListener(VisibleListener12);
        question13Button.setOnClickListener(VisibleListener13);
        question13Button.setOnClickListener(VisibleListener14);

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