package com.example.abcbuilders;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class location extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng prop1 = new LatLng(12.949712, 77.548439);
        mMap.addMarker(new MarkerOptions().position(prop1).title("Marker in BBMP Office"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(prop1));

        LatLng prop2 = new LatLng(12.948519, 77.547471);
        mMap.addMarker(new MarkerOptions().position(prop2).title("Marker in House"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(prop2));

        LatLng prop3 = new LatLng(12.938100, 77.543189);
        mMap.addMarker(new MarkerOptions().position(prop3).title("Marker in School"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(prop3));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(prop3, 12.0f));
    }

}