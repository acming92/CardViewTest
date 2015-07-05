package com.example.qimingchen.cardviewtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by qimingchen on 7/5/15.
 */
public class VerifyEmail extends DialogFragment {

    public VerifyEmail() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.verifyemaillayout, container, false);
        return v;

    }
}
