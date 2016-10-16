package us.arrived.arrived;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.kml.KmlLayer;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class Maps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    protected GoogleMap getMap() {
        return mMap;
    }

    protected int getLayoutId() {
        return R.layout.activity_maps;
    }

    private void setUpMap() {
        ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMapAsync(this);

    }

    public void startDemo() {
        try {
            mMap = getMap();
            retrieveFileFromResource();

        } catch (Exception e) {
            Log.e("Exception caught", e.toString());
        }
    }

    private void retrieveFileFromResource() {
        try {
            KmlLayer sanctuaryCities = new KmlLayer(mMap, R.raw.sanctuary, getApplicationContext());
            KmlLayer ngos = new KmlLayer(mMap, R.raw.ngos, getApplicationContext());
            sanctuaryCities.addLayerToMap();
            ngos.addLayerToMap();
            LatLng coordinate = new LatLng(41.8781, -87.6298); //Store these lat lng values somewhere. These should be constant.
            CameraUpdate location = CameraUpdateFactory.newLatLngZoom(
                    coordinate, 4);
            mMap.animateCamera(location);



        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        setUpMap();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        setUpMap();


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        if (mMap != null) {
            return;
        }
        mMap = googleMap;
        startDemo();

    }
}
