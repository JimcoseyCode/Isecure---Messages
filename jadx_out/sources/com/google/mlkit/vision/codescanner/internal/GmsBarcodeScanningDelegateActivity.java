package com.google.mlkit.vision.codescanner.internal;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import androidx.activity.AbstractActivityC1618q;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.internal.mlkit_code_scanner.zzoz;
import com.google.mlkit.vision.codescanner.internal.GmsBarcodeScanningDelegateActivity;
import d.InterfaceC2313a;
import e.C2387i;
import f6.C2615a;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class GmsBarcodeScanningDelegateActivity extends AbstractActivityC1618q {
    @Override // androidx.activity.AbstractActivityC1618q, androidx.core.app.h, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent action = new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.mlkit.ACTION_SCAN_BARCODE");
        ApplicationInfo applicationInfo = getApplicationInfo();
        int i10 = applicationInfo.labelRes;
        registerForActivityResult(new C2387i(), new InterfaceC2313a() { // from class: j6.f
            @Override // d.InterfaceC2313a
            public final void onActivityResult(Object obj) {
                GmsBarcodeScanningDelegateActivity gmsBarcodeScanningDelegateActivity = this.f28891a;
                ActivityResult activityResult = (ActivityResult) obj;
                Intent data = activityResult.getData();
                if (activityResult.getResultCode() == -1 && data != null && data.hasExtra("extra_barcode_result")) {
                    C2775e.c(new C2615a(new C2771a((zzoz) s4.c.a((byte[]) AbstractC3268i.k(data.getByteArrayExtra("extra_barcode_result")), zzoz.CREATOR))), 0);
                } else {
                    C2775e.c(null, data != null ? data.getIntExtra("extra_error_code", 13) : 13);
                }
                gmsBarcodeScanningDelegateActivity.finish();
            }
        }).a(action.putExtra("extra_calling_app_name", i10 != 0 ? getString(i10) : getPackageManager().getApplicationLabel(applicationInfo).toString()).putExtra("extra_supported_formats", getIntent().getIntExtra("extra_supported_formats", 0)).putExtra("extra_allow_manual_input", getIntent().getBooleanExtra("extra_allow_manual_input", false)).putExtra("extra_enable_auto_zoom", getIntent().getBooleanExtra("extra_enable_auto_zoom", false)));
    }
}
