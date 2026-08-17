package com.google.android.gms.common.moduleinstall.internal;

import D4.j;
import P4.AbstractC1378l;
import P4.AbstractC1381o;
import P4.C1379m;
import android.content.Context;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import java.util.Arrays;
import o4.AbstractC3012e;
import o4.C3008a;
import o4.g;
import p4.InterfaceC3062i;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC3012e implements u4.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final C3008a.g f21310k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final C3008a.AbstractC0335a f21311l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final C3008a f21312m;

    static {
        C3008a.g gVar = new C3008a.g();
        f21310k = gVar;
        b bVar = new b();
        f21311l = bVar;
        f21312m = new C3008a("ModuleInstall.API", bVar, gVar);
    }

    public c(Context context) {
        super(context, f21312m, C3008a.d.f30480f, AbstractC3012e.a.f30492c);
    }

    static final ApiFeatureRequest n(boolean z10, g... gVarArr) {
        AbstractC3268i.l(gVarArr, "Requested APIs must not be null.");
        AbstractC3268i.b(gVarArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (g gVar : gVarArr) {
            AbstractC3268i.l(gVar, "Requested API must not be null.");
        }
        return ApiFeatureRequest.X(Arrays.asList(gVarArr), z10);
    }

    @Override // u4.c
    public final AbstractC1378l b(g... gVarArr) {
        final ApiFeatureRequest apiFeatureRequestN = n(false, gVarArr);
        if (apiFeatureRequestN.s().isEmpty()) {
            return AbstractC1381o.f(new ModuleAvailabilityResponse(true, 0));
        }
        d.a aVarA = com.google.android.gms.common.api.internal.d.a();
        aVarA.d(j.f793a);
        aVarA.e(27301);
        aVarA.c(false);
        aVarA.b(new InterfaceC3062i() { // from class: v4.g
            @Override // p4.InterfaceC3062i
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.common.moduleinstall.internal.a) ((com.google.android.gms.common.moduleinstall.internal.d) obj).C()).x(new i(this.f32938a, (C1379m) obj2), apiFeatureRequestN);
            }
        });
        return f(aVarA.a());
    }

    @Override // u4.c
    public final AbstractC1378l c(u4.d dVar) {
        final ApiFeatureRequest apiFeatureRequestE = ApiFeatureRequest.e(dVar);
        dVar.b();
        dVar.c();
        if (apiFeatureRequestE.s().isEmpty()) {
            return AbstractC1381o.f(new ModuleInstallResponse(0));
        }
        d.a aVarA = com.google.android.gms.common.api.internal.d.a();
        aVarA.d(j.f793a);
        aVarA.c(true);
        aVarA.e(27304);
        aVarA.b(new InterfaceC3062i() { // from class: v4.h
            @Override // p4.InterfaceC3062i
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.common.moduleinstall.internal.a) ((com.google.android.gms.common.moduleinstall.internal.d) obj).C()).y(new j(this.f32940a, (C1379m) obj2), apiFeatureRequestE, null);
            }
        });
        return f(aVarA.a());
    }
}
