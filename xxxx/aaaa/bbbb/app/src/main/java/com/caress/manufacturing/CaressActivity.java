package com.caress.manufacturing;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import com.caress.caress.R;
import com.yarolegovich.lovelydialog.AbsLovelyDialog;
import com.yarolegovich.lovelydialog.LovelyInfoDialog;

public abstract class CaressActivity extends AppCompatActivity {
    private static final String TAG = "CaressActivity";

    private AbsLovelyDialog mAbsLovelyDialog;

    /**
     * Display a warning dialog
     *
     * @param warningTitle
     * @param warningMessage
     */
    protected void displayWarning(@NonNull final String warningTitle, @NonNull final String warningMessage) {

        runOnUiThread(() -> {
            mAbsLovelyDialog = new LovelyInfoDialog(CaressActivity.this)
                    .setTopColorRes(R.color.colorCaressPurple)
                    .setIcon(R.drawable.ic_caress_warning)
                    .setTitle(warningTitle)
                    .setCancelable(false)
                    .setMessage(warningMessage);

            mAbsLovelyDialog.show();
        });
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    protected void onPause() {
        super.onPause();

        if (mAbsLovelyDialog == null) {

        } else {
            mAbsLovelyDialog.dismiss();
        }
    }

}
