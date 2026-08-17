package e;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import e.AbstractC2379a;
import i7.C2750m;
import j7.AbstractC2800q;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: e.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2385g extends AbstractC2379a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f25802a = new a(null);

    /* JADX INFO: renamed from: e.g$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ResolveInfo a(Context context) {
            AbstractC2855l.g(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        public final String b(InterfaceC0255g input) {
            AbstractC2855l.g(input, "input");
            if (input instanceof d) {
                return "image/*";
            }
            if (input instanceof f) {
                return "video/*";
            }
            if (input instanceof c) {
                return null;
            }
            throw new C2750m();
        }

        public final boolean c(Context context) {
            AbstractC2855l.g(context, "context");
            return a(context) != null;
        }

        public final boolean d() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                return true;
            }
            return i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: e.g$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class b {

        /* JADX INFO: renamed from: e.g$b$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f25803a = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final int f25804b = 0;

            private a() {
                super(null);
            }

            @Override // e.C2385g.b
            public int a() {
                return f25804b;
            }
        }

        /* JADX INFO: renamed from: e.g$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0254b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0254b f25805a = new C0254b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final int f25806b = 1;

            private C0254b() {
                super(null);
            }

            @Override // e.C2385g.b
            public int a() {
                return f25806b;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int a();

        private b() {
        }
    }

    /* JADX INFO: renamed from: e.g$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c implements InterfaceC0255g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f25807a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: e.g$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d implements InterfaceC0255g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f25808a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: e.g$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class e {
    }

    /* JADX INFO: renamed from: e.g$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class f implements InterfaceC0255g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f25809a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: e.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface InterfaceC0255g {
    }

    @Override // e.AbstractC2379a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, d.g input) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(input, "input");
        a aVar = f25802a;
        if (aVar.d()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aVar.b(input.e()));
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.b().a());
            if (input.f()) {
                intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", input.a());
            }
            if (Build.VERSION.SDK_INT >= 33) {
                input.d();
            }
            return intent;
        }
        if (!aVar.c(context)) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(aVar.b(input.e()));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoA = aVar.a(context);
        if (resolveInfoA == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = resolveInfoA.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(aVar.b(input.e()));
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", input.b().a());
        if (input.f()) {
            intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR", input.a());
        }
        return intent3;
    }

    @Override // e.AbstractC2379a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC2379a.C0253a b(Context context, d.g input) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(input, "input");
        return null;
    }

    @Override // e.AbstractC2379a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Uri c(int i10, Intent intent) {
        if (i10 != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        return data == null ? (Uri) AbstractC2800q.g0(AbstractC2381c.f25799a.a(intent)) : data;
    }
}
