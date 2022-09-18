package com.world4tech.driveu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\u0018\u0000 U2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002UVB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u00102\u001a\u000203H\u0002J\u000e\u00104\u001a\u0002032\u0006\u00105\u001a\u000206J\u0016\u00107\u001a\u0002062\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209J \u0010;\u001a\u0004\u0018\u0001062\u0006\u0010<\u001a\u0002092\u0006\u0010=\u001a\u0002092\u0006\u0010>\u001a\u000206J\u0012\u0010?\u001a\u0002032\b\u0010@\u001a\u0004\u0018\u00010AH\u0014J\u0010\u0010B\u001a\u0002032\u0006\u0010C\u001a\u00020\u0019H\u0016J\u0010\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020-H\u0016J-\u0010G\u001a\u0002032\u0006\u0010H\u001a\u00020\t2\u000e\u0010I\u001a\n\u0012\u0006\b\u0001\u0012\u0002060J2\u0006\u0010K\u001a\u00020LH\u0016\u00a2\u0006\u0002\u0010MJ\b\u0010N\u001a\u000203H\u0003J\u0010\u0010O\u001a\u0002032\u0006\u0010P\u001a\u000206H\u0002J\u0010\u0010Q\u001a\u0002032\u0006\u0010R\u001a\u000206H\u0002J\u0010\u00100\u001a\u0002032\u0006\u0010S\u001a\u00020\u0015H\u0002J\b\u0010T\u001a\u000203H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u0010\u0010%\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\u00a8\u0006W"}, d2 = {"Lcom/world4tech/driveu/HelpActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "()V", "FASTEST_INTERVAL", "", "INTERVAL", "PROXIMITY_RADIUS", "", "getPROXIMITY_RADIUS", "()I", "setPROXIMITY_RADIUS", "(I)V", "binding", "Lcom/world4tech/driveu/databinding/ActivityHelpBinding;", "destinationLoc", "Lcom/google/android/gms/maps/model/LatLng;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "lastLocation", "Landroid/location/Location;", "mLocationCallback", "Lcom/google/android/gms/location/LocationCallback;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "markerOptions", "Lcom/google/android/gms/maps/model/MarkerOptions;", "p3", "", "getP3", "()F", "setP3", "(F)V", "p4", "getP4", "setP4", "temporaryLoc", "userLocationAccuracyCircle", "Lcom/google/android/gms/maps/model/Circle;", "getUserLocationAccuracyCircle", "()Lcom/google/android/gms/maps/model/Circle;", "setUserLocationAccuracyCircle", "(Lcom/google/android/gms/maps/model/Circle;)V", "userLocationMarker", "Lcom/google/android/gms/maps/model/Marker;", "getUserLocationMarker", "()Lcom/google/android/gms/maps/model/Marker;", "setUserLocationMarker", "(Lcom/google/android/gms/maps/model/Marker;)V", "checkPermission", "", "findNearByPlace", "type", "", "getSosArea", "lat", "", "lon", "getUrl", "latitude", "longitude", "nearby", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "googleMap", "onMarkerClick", "", "p0", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestNewLocationData", "setTextwithno", "s", "setTextwithnotwo", "i", "location", "setupMap", "Companion", "FetchDistance", "app_debug"})
public final class HelpActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.gms.maps.OnMapReadyCallback, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener {
    private com.world4tech.driveu.databinding.ActivityHelpBinding binding;
    private com.google.android.gms.maps.GoogleMap mMap;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private com.google.android.gms.maps.model.LatLng temporaryLoc;
    private int PROXIMITY_RADIUS = 3000;
    @org.jetbrains.annotations.NotNull()
    public static final com.world4tech.driveu.HelpActivity.Companion Companion = null;
    private static final int LOCATION_REQUEST_CODE = 1;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.Marker userLocationMarker;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.Circle userLocationAccuracyCircle;
    private android.location.Location lastLocation;
    private com.google.android.gms.maps.model.MarkerOptions markerOptions;
    private float p3 = 0.0F;
    private float p4 = 0.0F;
    private com.google.android.gms.maps.model.LatLng destinationLoc;
    private final long INTERVAL = 2000L;
    private final long FASTEST_INTERVAL = 1000L;
    private final com.google.android.gms.location.LocationCallback mLocationCallback = null;
    
    public HelpActivity() {
        super();
    }
    
    public final int getPROXIMITY_RADIUS() {
        return 0;
    }
    
    public final void setPROXIMITY_RADIUS(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.Marker getUserLocationMarker() {
        return null;
    }
    
    public final void setUserLocationMarker(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.Circle getUserLocationAccuracyCircle() {
        return null;
    }
    
    public final void setUserLocationAccuracyCircle(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Circle p0) {
    }
    
    public final float getP3() {
        return 0.0F;
    }
    
    public final void setP3(float p0) {
    }
    
    public final float getP4() {
        return 0.0F;
    }
    
    public final void setP4(float p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    private final void setupMap() {
    }
    
    private final void checkPermission() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void requestNewLocationData() {
    }
    
    private final void setUserLocationMarker(android.location.Location location) {
    }
    
    @java.lang.Override()
    public boolean onMarkerClick(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.Marker p0) {
        return false;
    }
    
    private final void setTextwithnotwo(java.lang.String i) {
    }
    
    private final void setTextwithno(java.lang.String s) {
    }
    
    public final void findNearByPlace(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl(double latitude, double longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String nearby) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSosArea(double lat, double lon) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0007\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/world4tech/driveu/HelpActivity$FetchDistance;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "(Lcom/world4tech/driveu/HelpActivity;)V", "doInBackground", "p0", "", "([Ljava/lang/Void;)Ljava/lang/String;", "app_debug"})
    public final class FetchDistance extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.String> {
        
        public FetchDistance() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.lang.String doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... p0) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/world4tech/driveu/HelpActivity$Companion;", "", "()V", "LOCATION_REQUEST_CODE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}