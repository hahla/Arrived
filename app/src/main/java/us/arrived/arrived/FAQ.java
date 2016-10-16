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

public class FAQ extends AppCompatActivity {

    public View Answer1;
    public View Answer2;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<font color=\"white\">" + getString(R.string.app_name) + "</font>"));
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.app_logo);
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));

        TextView firstFAQAnswer = (TextView) findViewById(R.id.firstFAQAnswer);
        firstFAQAnswer.setMovementMethod(LinkMovementMethod.getInstance());
        TextView secondFAQAnswer = (TextView) findViewById(R.id.secondFAQAnswer);
        secondFAQAnswer.setMovementMethod(LinkMovementMethod.getInstance());

        Answer1 = findViewById(R.id.firstFAQAnswer);
        Answer2 = findViewById(R.id.secondFAQAnswer);

        Button question1Button = (Button) findViewById(R.id.firstFAQQuestion);
        Button question2Button = (Button) findViewById(R.id.secondFAQQuestion);

        question1Button.setOnClickListener(VisibleListener1);
        question2Button.setOnClickListener(VisibleListener2);

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
