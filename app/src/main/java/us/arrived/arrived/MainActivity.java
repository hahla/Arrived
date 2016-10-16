package us.arrived.arrived;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<font color=\"white\">" + getString(R.string.app_name) + "</font>"));
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.app_logo);
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));

        new SimpleEula(this).show();

        Intent intent;

        Button btn = (Button) findViewById(R.id.learnButton);
        btn.setOnClickListener(new View.OnClickListener() {
                                   public void onClick(View v) {
                                       Intent i = new Intent(getApplicationContext(), menu.class);
                                       startActivity(i);
                                   }
                               }
        );

        Button btn1 = (Button) findViewById(R.id.seeButton);
        btn1.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Intent i = new Intent(getApplicationContext(), Maps.class);
                                        startActivity(i);
                                    }
                                }
        );

        Button btn2 = (Button) findViewById(R.id.startingButton);
        btn2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Intent i = new Intent(getApplicationContext(), GettingStarted.class);
                                        startActivity(i);
                                    }
                                }
        );


        Button btn3 = (Button) findViewById(R.id.aboutButton);
        btn3.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Intent i = new Intent(getApplicationContext(), AboutUs.class);
                                        startActivity(i);
                                    }
                                }
        );

        Button btn4 = (Button) findViewById(R.id.tubeButton);
        btn4.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        Intent i = new Intent(getApplicationContext(), youTube.class);
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



    public class SimpleEula {

        private String EULA_PREFIX = "eula_";
        private Activity mActivity;

        public SimpleEula(Activity context) {
            mActivity = context;
        }

        private PackageInfo getPackageInfo() {
            PackageInfo pi = null;
            try {
                pi = mActivity.getPackageManager().getPackageInfo(mActivity.getPackageName(), PackageManager.GET_ACTIVITIES);
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
            return pi;
        }

        public void show() {
            PackageInfo versionInfo = getPackageInfo();

            // the eulaKey changes every time you increment the version number in the AndroidManifest.xml
            final String eulaKey = EULA_PREFIX + versionInfo.versionCode;
            final SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(mActivity);
            boolean hasBeenShown = prefs.getBoolean(eulaKey, false);
            if(hasBeenShown == false){

                // Show the Eula
                String title = mActivity.getString(R.string.app_name) + " v" + versionInfo.versionName;

                //Includes the updates as well so users know what changed.
                String message = mActivity.getString(R.string.updates) + "\n\n" + mActivity.getString(R.string.eula);

                AlertDialog.Builder builder = new AlertDialog.Builder(mActivity)
                        .setTitle(title)
                        .setMessage(message)
                        .setPositiveButton(android.R.string.ok, new Dialog.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Mark this version as read.
                                SharedPreferences.Editor editor = prefs.edit();
                                editor.putBoolean(eulaKey, true);
                                editor.commit();
                                dialogInterface.dismiss();
                            }
                        })
                        .setCancelable(false)
                        .setNegativeButton(android.R.string.cancel, new Dialog.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // Close the activity as they have declined the EULA
                                mActivity.finish();
                            }

                        });
                builder.create().show();
            }
        }

    }


}


