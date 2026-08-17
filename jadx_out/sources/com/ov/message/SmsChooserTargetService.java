package com.ov.message;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.List;
import y.AbstractC3567L;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class SmsChooserTargetService extends ChooserTargetService {
    private static final String TAG = "SmsChooserTargetService";

    @Override // android.service.chooser.ChooserTargetService
    public List<ChooserTarget> onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("smsto:"));
        intent.putExtra("sms_body", PointerEventHelper.POINTER_TYPE_UNKNOWN);
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.intent.extra.INTENT", intent);
        return AbstractC3567L.a(new Object[]{new ChooserTarget("Envoyer SMS", Icon.createWithResource(this, android.R.drawable.ic_dialog_email), 1.0f, new ComponentName(this, (Class<?>) MainActivity.class), bundle)});
    }
}
