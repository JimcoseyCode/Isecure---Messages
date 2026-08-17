package t7;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class g extends IOException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f32485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final File f32486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f32487i;

    public /* synthetic */ g(File file, File file2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(File file, File file2, String str) {
        super(AbstractC3377d.b(file, file2, str));
        AbstractC2855l.g(file, "file");
        this.f32485g = file;
        this.f32486h = file2;
        this.f32487i = str;
    }
}
