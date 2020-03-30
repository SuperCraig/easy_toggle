package com.example.custom_toggle_java.interfaces;

import android.view.View;

public interface OnStateChangedListener {
    /**
     * Called when a view changes it's state.
     *
     * @param view The view whose state was changed.
     * @param state The state of the view.
     */
    void onStateChanged(View view, int state);
}
