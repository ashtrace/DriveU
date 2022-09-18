// Generated by view binder compiler. Do not edit!
package com.world4tech.driveu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public final class ActivityDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView call;

  @NonNull
  public final CircularProgress circularProgress;

  @NonNull
  public final TextView completeLoc;

  @NonNull
  public final TextView distance;

  @NonNull
  public final TextView email;

  @NonNull
  public final TextView estimatedTime;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView phone;

  @NonNull
  public final TextView status;

  @NonNull
  public final TextView website;

  private ActivityDetailBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView call,
      @NonNull CircularProgress circularProgress, @NonNull TextView completeLoc,
      @NonNull TextView distance, @NonNull TextView email, @NonNull TextView estimatedTime,
      @NonNull TextView name, @NonNull TextView phone, @NonNull TextView status,
      @NonNull TextView website) {
    this.rootView = rootView;
    this.call = call;
    this.circularProgress = circularProgress;
    this.completeLoc = completeLoc;
    this.distance = distance;
    this.email = email;
    this.estimatedTime = estimatedTime;
    this.name = name;
    this.phone = phone;
    this.status = status;
    this.website = website;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.call;
      ImageView call = ViewBindings.findChildViewById(rootView, id);
      if (call == null) {
        break missingId;
      }

      id = R.id.circularProgress;
      CircularProgress circularProgress = ViewBindings.findChildViewById(rootView, id);
      if (circularProgress == null) {
        break missingId;
      }

      id = R.id.completeLoc;
      TextView completeLoc = ViewBindings.findChildViewById(rootView, id);
      if (completeLoc == null) {
        break missingId;
      }

      id = R.id.distance;
      TextView distance = ViewBindings.findChildViewById(rootView, id);
      if (distance == null) {
        break missingId;
      }

      id = R.id.email;
      TextView email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.estimated_Time;
      TextView estimatedTime = ViewBindings.findChildViewById(rootView, id);
      if (estimatedTime == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.phone;
      TextView phone = ViewBindings.findChildViewById(rootView, id);
      if (phone == null) {
        break missingId;
      }

      id = R.id.status;
      TextView status = ViewBindings.findChildViewById(rootView, id);
      if (status == null) {
        break missingId;
      }

      id = R.id.website;
      TextView website = ViewBindings.findChildViewById(rootView, id);
      if (website == null) {
        break missingId;
      }

      return new ActivityDetailBinding((ConstraintLayout) rootView, call, circularProgress,
          completeLoc, distance, email, estimatedTime, name, phone, status, website);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
