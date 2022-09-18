// Generated by view binder compiler. Do not edit!
package com.world4tech.driveu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.clk.progress.CircularProgress;
import com.world4tech.driveu.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMapsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView areaname;

  @NonNull
  public final ImageView avatar;

  @NonNull
  public final CircularProgress circularProgress;

  @NonNull
  public final LinearLayout data;

  @NonNull
  public final TextView destination;

  @NonNull
  public final TextView duration;

  @NonNull
  public final ImageView navigation;

  @NonNull
  public final LinearLayout overviewContainer;

  @NonNull
  public final ImageView search;

  @NonNull
  public final ImageView sos;

  @NonNull
  public final ImageView sound;

  @NonNull
  public final TextView speed;

  @NonNull
  public final LinearLayout speedData;

  @NonNull
  public final TextView speedlimit;

  @NonNull
  public final ImageView startBtn;

  @NonNull
  public final TextView status;

  @NonNull
  public final TextView temp;

  @NonNull
  public final TextView timenow;

  @NonNull
  public final ImageView weathericon;

  private ActivityMapsBinding(@NonNull ConstraintLayout rootView, @NonNull TextView areaname,
      @NonNull ImageView avatar, @NonNull CircularProgress circularProgress,
      @NonNull LinearLayout data, @NonNull TextView destination, @NonNull TextView duration,
      @NonNull ImageView navigation, @NonNull LinearLayout overviewContainer,
      @NonNull ImageView search, @NonNull ImageView sos, @NonNull ImageView sound,
      @NonNull TextView speed, @NonNull LinearLayout speedData, @NonNull TextView speedlimit,
      @NonNull ImageView startBtn, @NonNull TextView status, @NonNull TextView temp,
      @NonNull TextView timenow, @NonNull ImageView weathericon) {
    this.rootView = rootView;
    this.areaname = areaname;
    this.avatar = avatar;
    this.circularProgress = circularProgress;
    this.data = data;
    this.destination = destination;
    this.duration = duration;
    this.navigation = navigation;
    this.overviewContainer = overviewContainer;
    this.search = search;
    this.sos = sos;
    this.sound = sound;
    this.speed = speed;
    this.speedData = speedData;
    this.speedlimit = speedlimit;
    this.startBtn = startBtn;
    this.status = status;
    this.temp = temp;
    this.timenow = timenow;
    this.weathericon = weathericon;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMapsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMapsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_maps, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMapsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.areaname;
      TextView areaname = ViewBindings.findChildViewById(rootView, id);
      if (areaname == null) {
        break missingId;
      }

      id = R.id.avatar;
      ImageView avatar = ViewBindings.findChildViewById(rootView, id);
      if (avatar == null) {
        break missingId;
      }

      id = R.id.circularProgress;
      CircularProgress circularProgress = ViewBindings.findChildViewById(rootView, id);
      if (circularProgress == null) {
        break missingId;
      }

      id = R.id.data;
      LinearLayout data = ViewBindings.findChildViewById(rootView, id);
      if (data == null) {
        break missingId;
      }

      id = R.id.destination;
      TextView destination = ViewBindings.findChildViewById(rootView, id);
      if (destination == null) {
        break missingId;
      }

      id = R.id.duration;
      TextView duration = ViewBindings.findChildViewById(rootView, id);
      if (duration == null) {
        break missingId;
      }

      id = R.id.navigation;
      ImageView navigation = ViewBindings.findChildViewById(rootView, id);
      if (navigation == null) {
        break missingId;
      }

      id = R.id.overviewContainer;
      LinearLayout overviewContainer = ViewBindings.findChildViewById(rootView, id);
      if (overviewContainer == null) {
        break missingId;
      }

      id = R.id.search;
      ImageView search = ViewBindings.findChildViewById(rootView, id);
      if (search == null) {
        break missingId;
      }

      id = R.id.sos;
      ImageView sos = ViewBindings.findChildViewById(rootView, id);
      if (sos == null) {
        break missingId;
      }

      id = R.id.sound;
      ImageView sound = ViewBindings.findChildViewById(rootView, id);
      if (sound == null) {
        break missingId;
      }

      id = R.id.speed;
      TextView speed = ViewBindings.findChildViewById(rootView, id);
      if (speed == null) {
        break missingId;
      }

      id = R.id.speedData;
      LinearLayout speedData = ViewBindings.findChildViewById(rootView, id);
      if (speedData == null) {
        break missingId;
      }

      id = R.id.speedlimit;
      TextView speedlimit = ViewBindings.findChildViewById(rootView, id);
      if (speedlimit == null) {
        break missingId;
      }

      id = R.id.startBtn;
      ImageView startBtn = ViewBindings.findChildViewById(rootView, id);
      if (startBtn == null) {
        break missingId;
      }

      id = R.id.status;
      TextView status = ViewBindings.findChildViewById(rootView, id);
      if (status == null) {
        break missingId;
      }

      id = R.id.temp;
      TextView temp = ViewBindings.findChildViewById(rootView, id);
      if (temp == null) {
        break missingId;
      }

      id = R.id.timenow;
      TextView timenow = ViewBindings.findChildViewById(rootView, id);
      if (timenow == null) {
        break missingId;
      }

      id = R.id.weathericon;
      ImageView weathericon = ViewBindings.findChildViewById(rootView, id);
      if (weathericon == null) {
        break missingId;
      }

      return new ActivityMapsBinding((ConstraintLayout) rootView, areaname, avatar,
          circularProgress, data, destination, duration, navigation, overviewContainer, search, sos,
          sound, speed, speedData, speedlimit, startBtn, status, temp, timenow, weathericon);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
