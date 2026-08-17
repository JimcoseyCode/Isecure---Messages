package com.swmansion.rnscreens.gamma.stack.screen;

import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.InterfaceC1768o;
import androidx.lifecycle.r;
import i7.C2750m;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements InterfaceC1768o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final P6.c f25173g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25174a;

        static {
            int[] iArr = new int[AbstractC1764k.a.values().length];
            try {
                iArr[AbstractC1764k.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1764k.a.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1764k.a.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1764k.a.ON_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1764k.a.ON_DESTROY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC1764k.a.ON_CREATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC1764k.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f25174a = iArr;
        }
    }

    public b(AbstractC1764k screenLifecycle, P6.c appearanceEventEmitter) {
        AbstractC2855l.g(screenLifecycle, "screenLifecycle");
        AbstractC2855l.g(appearanceEventEmitter, "appearanceEventEmitter");
        this.f25173g = appearanceEventEmitter;
        screenLifecycle.a(this);
    }

    private final void a(r rVar) {
        rVar.getLifecycle().d(this);
    }

    @Override // androidx.lifecycle.InterfaceC1768o
    public void k(r source, AbstractC1764k.a event) {
        AbstractC2855l.g(source, "source");
        AbstractC2855l.g(event, "event");
        switch (a.f25174a[event.ordinal()]) {
            case 1:
                this.f25173g.c();
                return;
            case 2:
                this.f25173g.b();
                return;
            case 3:
                this.f25173g.d();
                return;
            case 4:
                this.f25173g.a();
                return;
            case 5:
                a(source);
                return;
            case 6:
            case 7:
                return;
            default:
                throw new C2750m();
        }
    }
}
