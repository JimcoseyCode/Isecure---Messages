package expo.modules.fetch;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JC\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R.\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lexpo/modules/fetch/NativeRequestInit;", "Lexpo/modules/kotlin/records/Record;", "credentials", "Lexpo/modules/fetch/NativeRequestCredentials;", "headers", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Pair;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "method", "redirect", "Lexpo/modules/fetch/NativeRequestRedirect;", "<init>", "(Lexpo/modules/fetch/NativeRequestCredentials;Ljava/util/List;Ljava/lang/String;Lexpo/modules/fetch/NativeRequestRedirect;)V", "getCredentials$annotations", "()V", "getCredentials", "()Lexpo/modules/fetch/NativeRequestCredentials;", "getHeaders$annotations", "getHeaders", "()Ljava/util/List;", "getMethod$annotations", "getMethod", "()Ljava/lang/String;", "getRedirect$annotations", "getRedirect", "()Lexpo/modules/fetch/NativeRequestRedirect;", "component1", "component2", "component3", "component4", "copy", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class NativeRequestInit implements Record {
    private final NativeRequestCredentials credentials;
    private final List<Pair<String, String>> headers;
    private final String method;
    private final NativeRequestRedirect redirect;

    public NativeRequestInit() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeRequestInit copy$default(NativeRequestInit nativeRequestInit, NativeRequestCredentials nativeRequestCredentials, List list, String str, NativeRequestRedirect nativeRequestRedirect, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nativeRequestCredentials = nativeRequestInit.credentials;
        }
        if ((i10 & 2) != 0) {
            list = nativeRequestInit.headers;
        }
        if ((i10 & 4) != 0) {
            str = nativeRequestInit.method;
        }
        if ((i10 & 8) != 0) {
            nativeRequestRedirect = nativeRequestInit.redirect;
        }
        return nativeRequestInit.copy(nativeRequestCredentials, list, str, nativeRequestRedirect);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NativeRequestCredentials getCredentials() {
        return this.credentials;
    }

    public final List<Pair<String, String>> component2() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final NativeRequestRedirect getRedirect() {
        return this.redirect;
    }

    public final NativeRequestInit copy(NativeRequestCredentials credentials, List<Pair<String, String>> headers, String method, NativeRequestRedirect redirect) {
        AbstractC2855l.g(credentials, "credentials");
        AbstractC2855l.g(headers, "headers");
        AbstractC2855l.g(method, "method");
        AbstractC2855l.g(redirect, "redirect");
        return new NativeRequestInit(credentials, headers, method, redirect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeRequestInit)) {
            return false;
        }
        NativeRequestInit nativeRequestInit = (NativeRequestInit) other;
        return this.credentials == nativeRequestInit.credentials && AbstractC2855l.b(this.headers, nativeRequestInit.headers) && AbstractC2855l.b(this.method, nativeRequestInit.method) && this.redirect == nativeRequestInit.redirect;
    }

    public final NativeRequestCredentials getCredentials() {
        return this.credentials;
    }

    public final List<Pair<String, String>> getHeaders() {
        return this.headers;
    }

    public final String getMethod() {
        return this.method;
    }

    public final NativeRequestRedirect getRedirect() {
        return this.redirect;
    }

    public int hashCode() {
        return (((((this.credentials.hashCode() * 31) + this.headers.hashCode()) * 31) + this.method.hashCode()) * 31) + this.redirect.hashCode();
    }

    public String toString() {
        return "NativeRequestInit(credentials=" + this.credentials + ", headers=" + this.headers + ", method=" + this.method + ", redirect=" + this.redirect + ")";
    }

    public NativeRequestInit(NativeRequestCredentials credentials, List<Pair<String, String>> headers, String method, NativeRequestRedirect redirect) {
        AbstractC2855l.g(credentials, "credentials");
        AbstractC2855l.g(headers, "headers");
        AbstractC2855l.g(method, "method");
        AbstractC2855l.g(redirect, "redirect");
        this.credentials = credentials;
        this.headers = headers;
        this.method = method;
        this.redirect = redirect;
    }

    public /* synthetic */ NativeRequestInit(NativeRequestCredentials nativeRequestCredentials, List list, String str, NativeRequestRedirect nativeRequestRedirect, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? NativeRequestCredentials.INCLUDE : nativeRequestCredentials, (i10 & 2) != 0 ? AbstractC2800q.j() : list, (i10 & 4) != 0 ? "GET" : str, (i10 & 8) != 0 ? NativeRequestRedirect.FOLLOW : nativeRequestRedirect);
    }

    @Field
    public static /* synthetic */ void getCredentials$annotations() {
    }

    @Field
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @Field
    public static /* synthetic */ void getMethod$annotations() {
    }

    @Field
    public static /* synthetic */ void getRedirect$annotations() {
    }
}
