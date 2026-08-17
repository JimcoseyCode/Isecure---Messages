package com.google.android.gms.common.api.internal;

import P4.AbstractC1378l;
import P4.C1379m;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.react.views.text.TextAttributeProps;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import expo.modules.kotlin.activityresult.DataPersistorKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o4.AbstractC3012e;
import p4.C3055b;
import p4.C3072s;
import p4.InterfaceC3063j;
import r4.C3269j;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2098b implements Handler.Callback {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Status f21031p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Status f21032q = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f21033r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static C2098b f21034s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TelemetryData f21037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r4.m f21038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f21039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.common.a f21040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r4.w f21041g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f21048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f21049o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f21035a = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21036b = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicInteger f21042h = new AtomicInteger(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicInteger f21043i = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f21044j = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private h f21045k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Set f21046l = new m0.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f21047m = new m0.b();

    private C2098b(Context context, Looper looper, com.google.android.gms.common.a aVar) {
        this.f21049o = true;
        this.f21039e = context;
        D4.i iVar = new D4.i(looper, this);
        this.f21048n = iVar;
        this.f21040f = aVar;
        this.f21041g = new r4.w(aVar);
        if (y4.g.a(context)) {
            this.f21049o = false;
        }
        iVar.sendMessage(iVar.obtainMessage(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status f(C3055b c3055b, ConnectionResult connectionResult) {
        return new Status(connectionResult, "API: " + c3055b.b() + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult));
    }

    private final n g(AbstractC3012e abstractC3012e) {
        Map map = this.f21044j;
        C3055b c3055bH = abstractC3012e.h();
        n nVar = (n) map.get(c3055bH);
        if (nVar == null) {
            nVar = new n(this, abstractC3012e);
            this.f21044j.put(c3055bH, nVar);
        }
        if (nVar.a()) {
            this.f21047m.add(c3055bH);
        }
        nVar.E();
        return nVar;
    }

    private final r4.m h() {
        if (this.f21038d == null) {
            this.f21038d = r4.l.a(this.f21039e);
        }
        return this.f21038d;
    }

    private final void i() {
        TelemetryData telemetryData = this.f21037c;
        if (telemetryData != null) {
            if (telemetryData.e() > 0 || d()) {
                h().a(telemetryData);
            }
            this.f21037c = null;
        }
    }

    private final void j(C1379m c1379m, int i10, AbstractC3012e abstractC3012e) {
        r rVarA;
        if (i10 == 0 || (rVarA = r.a(this, i10, abstractC3012e.h())) == null) {
            return;
        }
        AbstractC1378l abstractC1378lA = c1379m.a();
        final Handler handler = this.f21048n;
        handler.getClass();
        abstractC1378lA.d(new Executor() { // from class: p4.m
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, rVarA);
    }

    public static C2098b t(Context context) {
        C2098b c2098b;
        synchronized (f21033r) {
            try {
                if (f21034s == null) {
                    f21034s = new C2098b(context.getApplicationContext(), com.google.android.gms.common.internal.d.b().getLooper(), com.google.android.gms.common.a.m());
                }
                c2098b = f21034s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2098b;
    }

    final void A(MethodInvocation methodInvocation, int i10, long j10, int i11) {
        this.f21048n.sendMessage(this.f21048n.obtainMessage(18, new s(methodInvocation, i10, j10, i11)));
    }

    public final void B(ConnectionResult connectionResult, int i10) {
        if (e(connectionResult, i10)) {
            return;
        }
        Handler handler = this.f21048n;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, connectionResult));
    }

    public final void C() {
        Handler handler = this.f21048n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void D(AbstractC3012e abstractC3012e) {
        Handler handler = this.f21048n;
        handler.sendMessage(handler.obtainMessage(7, abstractC3012e));
    }

    public final void a(h hVar) {
        synchronized (f21033r) {
            try {
                if (this.f21045k != hVar) {
                    this.f21045k = hVar;
                    this.f21046l.clear();
                }
                this.f21046l.addAll(hVar.t());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void b(h hVar) {
        synchronized (f21033r) {
            try {
                if (this.f21045k == hVar) {
                    this.f21045k = null;
                    this.f21046l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final boolean d() {
        if (this.f21036b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfigurationA = C3269j.b().a();
        if (rootTelemetryConfigurationA != null && !rootTelemetryConfigurationA.X()) {
            return false;
        }
        int iA = this.f21041g.a(this.f21039e, 203400000);
        return iA == -1 || iA == 0;
    }

    final boolean e(ConnectionResult connectionResult, int i10) {
        return this.f21040f.w(this.f21039e, connectionResult, i10);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        long j10 = DataPersistorKt.EXPIRATION_TIME;
        n nVar = null;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j10 = 10000;
                }
                this.f21035a = j10;
                this.f21048n.removeMessages(12);
                for (C3055b c3055b : this.f21044j.keySet()) {
                    Handler handler = this.f21048n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c3055b), this.f21035a);
                }
                return true;
            case 2:
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            case 3:
                for (n nVar2 : this.f21044j.values()) {
                    nVar2.D();
                    nVar2.E();
                }
                return true;
            case 4:
            case 8:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                C3072s c3072s = (C3072s) message.obj;
                n nVarG = (n) this.f21044j.get(c3072s.f30645c.h());
                if (nVarG == null) {
                    nVarG = g(c3072s.f30645c);
                }
                if (!nVarG.a() || this.f21043i.get() == c3072s.f30644b) {
                    nVarG.F(c3072s.f30643a);
                } else {
                    c3072s.f30643a.a(f21031p);
                    nVarG.K();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it = this.f21044j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        n nVar3 = (n) it.next();
                        if (nVar3.s() == i11) {
                            nVar = nVar3;
                        }
                    }
                }
                if (nVar == null) {
                    new Exception();
                } else if (connectionResult.e() == 13) {
                    nVar.h(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f21040f.e(connectionResult.e()) + ": " + connectionResult.s()));
                } else {
                    nVar.h(f(nVar.f21071e, connectionResult));
                }
                return true;
            case 6:
                if (this.f21039e.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C2097a.c((Application) this.f21039e.getApplicationContext());
                    ComponentCallbacks2C2097a.b().a(new i(this));
                    if (!ComponentCallbacks2C2097a.b().e(true)) {
                        this.f21035a = DataPersistorKt.EXPIRATION_TIME;
                    }
                }
                return true;
            case 7:
                g((AbstractC3012e) message.obj);
                return true;
            case 9:
                if (this.f21044j.containsKey(message.obj)) {
                    ((n) this.f21044j.get(message.obj)).J();
                }
                return true;
            case 10:
                Iterator it2 = this.f21047m.iterator();
                while (it2.hasNext()) {
                    n nVar4 = (n) this.f21044j.remove((C3055b) it2.next());
                    if (nVar4 != null) {
                        nVar4.K();
                    }
                }
                this.f21047m.clear();
                return true;
            case 11:
                if (this.f21044j.containsKey(message.obj)) {
                    ((n) this.f21044j.get(message.obj)).L();
                }
                return true;
            case 12:
                if (this.f21044j.containsKey(message.obj)) {
                    ((n) this.f21044j.get(message.obj)).b();
                }
                return true;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                o oVar = (o) message.obj;
                if (this.f21044j.containsKey(oVar.f21082a)) {
                    n.B((n) this.f21044j.get(oVar.f21082a), oVar);
                }
                return true;
            case 16:
                o oVar2 = (o) message.obj;
                if (this.f21044j.containsKey(oVar2.f21082a)) {
                    n.C((n) this.f21044j.get(oVar2.f21082a), oVar2);
                }
                return true;
            case 17:
                i();
                return true;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                s sVar = (s) message.obj;
                if (sVar.f21099c == 0) {
                    h().a(new TelemetryData(sVar.f21098b, Arrays.asList(sVar.f21097a)));
                } else {
                    TelemetryData telemetryData = this.f21037c;
                    if (telemetryData != null) {
                        List listS = telemetryData.s();
                        if (telemetryData.e() != sVar.f21098b || (listS != null && listS.size() >= sVar.f21100d)) {
                            this.f21048n.removeMessages(17);
                            i();
                        } else {
                            this.f21037c.X(sVar.f21097a);
                        }
                    }
                    if (this.f21037c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(sVar.f21097a);
                        this.f21037c = new TelemetryData(sVar.f21098b, arrayList);
                        Handler handler2 = this.f21048n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), sVar.f21099c);
                    }
                }
                return true;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                this.f21036b = false;
                return true;
            default:
                return false;
        }
    }

    public final int k() {
        return this.f21042h.getAndIncrement();
    }

    final n s(C3055b c3055b) {
        return (n) this.f21044j.get(c3055b);
    }

    public final void z(AbstractC3012e abstractC3012e, int i10, d dVar, C1379m c1379m, InterfaceC3063j interfaceC3063j) {
        j(c1379m, dVar.d(), abstractC3012e);
        this.f21048n.sendMessage(this.f21048n.obtainMessage(4, new C3072s(new v(i10, dVar, c1379m, interfaceC3063j), this.f21043i.get(), abstractC3012e)));
    }
}
