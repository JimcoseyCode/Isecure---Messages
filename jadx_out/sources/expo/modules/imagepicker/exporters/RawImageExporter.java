package expo.modules.imagepicker.exporters;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.imagepicker.ImagePickerUtilsKt;
import i7.AbstractC2753p;
import java.io.File;
import kotlin.Metadata;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lexpo/modules/imagepicker/exporters/RawImageExporter;", "Lexpo/modules/imagepicker/exporters/ImageExporter;", "<init>", "()V", "Landroid/net/Uri;", "source", "Ljava/io/File;", "output", "Landroid/content/ContentResolver;", "contentResolver", "Lexpo/modules/imagepicker/exporters/ImageExportResult;", "exportAsync", "(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RawImageExporter implements ImageExporter {

    /* JADX INFO: renamed from: expo.modules.imagepicker.exporters.RawImageExporter$exportAsync$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.imagepicker.exporters.RawImageExporter", f = "RawImageExporter.kt", l = {TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR}, m = "exportAsync")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return RawImageExporter.this.exportAsync(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // expo.modules.imagepicker.exporters.ImageExporter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object exportAsync(Uri uri, File file, ContentResolver contentResolver, n7.f fVar) {
        AnonymousClass1 anonymousClass1;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object obj = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(obj);
            anonymousClass1.L$0 = file;
            anonymousClass1.label = 1;
            if (ImagePickerUtilsKt.copyFile(uri, file, contentResolver, anonymousClass1) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (File) anonymousClass1.L$0;
            AbstractC2753p.b(obj);
        }
        DimensionsExporter dimensionsExporter = new DimensionsExporter(file);
        return new ImageExportResult(dimensionsExporter.getWidth(), dimensionsExporter.getHeight(), file);
    }
}
