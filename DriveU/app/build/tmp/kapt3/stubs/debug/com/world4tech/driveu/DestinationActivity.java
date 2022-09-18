package com.world4tech.driveu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\u0018\u0000 /2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001/B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0012\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J-\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%2\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020(0\'2\u0006\u0010)\u001a\u00020*H\u0016\u00a2\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\bH\u0002J\b\u0010.\u001a\u00020\u0018H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u00060"}, d2 = {"Lcom/world4tech/driveu/DestinationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "()V", "binding", "Lcom/world4tech/driveu/databinding/ActivityDestinationBinding;", "dest", "Lcom/google/android/gms/maps/model/LatLng;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "lastLocation", "Landroid/location/Location;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "mViewModel", "Lcom/world4tech/homework/database/NotesViewModel;", "temporaryLoc", "viewModel", "getViewModel", "()Lcom/world4tech/homework/database/NotesViewModel;", "setViewModel", "(Lcom/world4tech/homework/database/NotesViewModel;)V", "checkInternet", "", "checkPermission", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "googleMap", "onMarkerClick", "", "p0", "Lcom/google/android/gms/maps/model/Marker;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "placeMarkerOnMap", "currentLatLong", "setupMap", "Companion", "app_debug"})
public final class DestinationActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.gms.maps.OnMapReadyCallback, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener {
    private com.google.android.gms.maps.model.LatLng dest;
    private com.google.android.gms.maps.GoogleMap mMap;
    private com.world4tech.driveu.databinding.ActivityDestinationBinding binding;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private com.google.android.gms.maps.model.LatLng temporaryLoc;
    private android.location.Location lastLocation;
    @org.jetbrains.annotations.NotNull()
    public static final com.world4tech.driveu.DestinationActivity.Companion Companion = null;
    private static final int LOCATION_REQUEST_CODE = 1;
    public com.world4tech.homework.database.NotesViewModel viewModel;
    private com.world4tech.homework.database.NotesViewModel mViewModel;
    
    public DestinationActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.world4tech.homework.database.NotesViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.world4tech.homework.database.NotesViewModel p0) {
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
    
    private final void placeMarkerOnMap(com.google.android.gms.maps.model.LatLng currentLatLong) {
    }
    
    private final void checkPermission() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public boolean onMarkerClick(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.Marker p0) {
        return false;
    }
    
    private final void checkInternet() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/world4tech/driveu/DestinationActivity$Companion;", "", "()V", "LOCATION_REQUEST_CODE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}