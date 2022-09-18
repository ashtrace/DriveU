package com.world4tech.driveu.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0015B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/world4tech/driveu/util/OnSwipeTouchListener;", "Landroid/view/View$OnTouchListener;", "c", "Landroid/content/Context;", "(Landroid/content/Context;)V", "gestureDetector", "Landroid/view/GestureDetector;", "onClick", "", "onDoubleClick", "onLongClick", "onSwipeDown", "onSwipeLeft", "onSwipeRight", "onSwipeUp", "onTouch", "", "view", "Landroid/view/View;", "motionEvent", "Landroid/view/MotionEvent;", "GestureListener", "app_debug"})
public class OnSwipeTouchListener implements android.view.View.OnTouchListener {
    private final android.view.GestureDetector gestureDetector = null;
    
    public OnSwipeTouchListener(@org.jetbrains.annotations.Nullable()
    android.content.Context c) {
        super();
    }
    
    @java.lang.Override()
    public boolean onTouch(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent motionEvent) {
        return false;
    }
    
    public void onSwipeRight() {
    }
    
    public void onSwipeLeft() {
    }
    
    public void onSwipeUp() {
    }
    
    public void onSwipeDown() {
    }
    
    private final void onClick() {
    }
    
    private final void onDoubleClick() {
    }
    
    private final void onLongClick() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J(\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/world4tech/driveu/util/OnSwipeTouchListener$GestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lcom/world4tech/driveu/util/OnSwipeTouchListener;)V", "SWIPE_THRESHOLD", "", "SWIPE_VELOCITY_THRESHOLD", "onDoubleTap", "", "e", "Landroid/view/MotionEvent;", "onDown", "onFling", "e1", "e2", "velocityX", "", "velocityY", "onLongPress", "", "onSingleTapUp", "app_debug"})
    final class GestureListener extends android.view.GestureDetector.SimpleOnGestureListener {
        private final int SWIPE_THRESHOLD = 100;
        private final int SWIPE_VELOCITY_THRESHOLD = 100;
        
        public GestureListener() {
            super();
        }
        
        @java.lang.Override()
        public boolean onDown(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e) {
            return false;
        }
        
        @java.lang.Override()
        public boolean onSingleTapUp(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e) {
            return false;
        }
        
        @java.lang.Override()
        public boolean onDoubleTap(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e) {
            return false;
        }
        
        @java.lang.Override()
        public void onLongPress(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e) {
        }
        
        @java.lang.Override()
        public boolean onFling(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e1, @org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e2, float velocityX, float velocityY) {
            return false;
        }
    }
}