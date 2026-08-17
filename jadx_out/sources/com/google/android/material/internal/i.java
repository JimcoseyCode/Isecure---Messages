package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f23475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f23476d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e5.e f23479g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f23473a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e5.g f23474b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23477e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f23478f = new WeakReference(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends e5.g {
        a() {
        }

        @Override // e5.g
        public void a(int i10) {
            i.this.f23477e = true;
            b bVar = (b) i.this.f23478f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // e5.g
        public void b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            i.this.f23477e = true;
            b bVar = (b) i.this.f23478f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public i(b bVar) {
        j(bVar);
    }

    private float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f23473a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f23473a.measureText(charSequence, 0, charSequence.length());
    }

    private void i(String str) {
        this.f23475c = d(str);
        this.f23476d = c(str);
        this.f23477e = false;
    }

    public e5.e e() {
        return this.f23479g;
    }

    public float f(String str) {
        if (!this.f23477e) {
            return this.f23476d;
        }
        i(str);
        return this.f23476d;
    }

    public TextPaint g() {
        return this.f23473a;
    }

    public float h(String str) {
        if (!this.f23477e) {
            return this.f23475c;
        }
        i(str);
        return this.f23475c;
    }

    public void j(b bVar) {
        this.f23478f = new WeakReference(bVar);
    }

    public void k(e5.e eVar, Context context) {
        if (this.f23479g != eVar) {
            this.f23479g = eVar;
            if (eVar != null) {
                eVar.q(context, this.f23473a, this.f23474b);
                b bVar = (b) this.f23478f.get();
                if (bVar != null) {
                    this.f23473a.drawableState = bVar.getState();
                }
                eVar.p(context, this.f23473a, this.f23474b);
                this.f23477e = true;
            }
            b bVar2 = (b) this.f23478f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void l(boolean z10) {
        this.f23477e = z10;
    }

    public void m(boolean z10) {
        this.f23477e = z10;
    }

    public void n(Context context) {
        this.f23479g.p(context, this.f23473a, this.f23474b);
    }
}
