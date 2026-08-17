package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f24227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24229c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f24231e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ArrayDeque f24230d = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24232f = false;

    private b0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f24227a = sharedPreferences;
        this.f24228b = str;
        this.f24229c = str2;
        this.f24231e = executor;
    }

    private boolean c(boolean z10) {
        if (z10 && !this.f24232f) {
            j();
        }
        return z10;
    }

    static b0 d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        b0 b0Var = new b0(sharedPreferences, str, str2, executor);
        b0Var.e();
        return b0Var;
    }

    private void e() {
        synchronized (this.f24230d) {
            try {
                this.f24230d.clear();
                String string = this.f24227a.getString(this.f24228b, PointerEventHelper.POINTER_TYPE_UNKNOWN);
                if (!TextUtils.isEmpty(string) && string.contains(this.f24229c)) {
                    String[] strArrSplit = string.split(this.f24229c, -1);
                    int length = strArrSplit.length;
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f24230d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        synchronized (this.f24230d) {
            this.f24227a.edit().putString(this.f24228b, h()).commit();
        }
    }

    private void j() {
        this.f24231e.execute(new Runnable() { // from class: com.google.firebase.messaging.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f24224g.i();
            }
        });
    }

    public boolean b(String str) {
        boolean zC;
        if (TextUtils.isEmpty(str) || str.contains(this.f24229c)) {
            return false;
        }
        synchronized (this.f24230d) {
            zC = c(this.f24230d.add(str));
        }
        return zC;
    }

    public String f() {
        String str;
        synchronized (this.f24230d) {
            str = (String) this.f24230d.peek();
        }
        return str;
    }

    public boolean g(Object obj) {
        boolean zC;
        synchronized (this.f24230d) {
            zC = c(this.f24230d.remove(obj));
        }
        return zC;
    }

    public String h() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f24230d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.f24229c);
        }
        return sb.toString();
    }
}
