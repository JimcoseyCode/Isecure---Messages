package expo.modules.imagepicker.exporters;

import android.graphics.BitmapFactory;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.AbstractC2746i;
import java.io.File;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0006\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lexpo/modules/imagepicker/exporters/DimensionsExporter;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "file", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "isRotatedLandscape", PointerEventHelper.POINTER_TYPE_UNKNOWN, "()Z", "isRotatedLandscape$delegate", "Lkotlin/Lazy;", "metadata", "Landroid/graphics/BitmapFactory$Options;", "getMetadata", "()Landroid/graphics/BitmapFactory$Options;", "metadata$delegate", "width", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getWidth", "()I", "height", "getHeight", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DimensionsExporter {
    private final File file;

    /* JADX INFO: renamed from: isRotatedLandscape$delegate, reason: from kotlin metadata */
    private final Lazy isRotatedLandscape;

    /* JADX INFO: renamed from: metadata$delegate, reason: from kotlin metadata */
    private final Lazy metadata;

    public DimensionsExporter(File file) {
        AbstractC2855l.g(file, "file");
        this.file = file;
        this.isRotatedLandscape = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.imagepicker.exporters.c
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return Boolean.valueOf(DimensionsExporter.isRotatedLandscape_delegate$lambda$0(this.f26553g));
            }
        });
        this.metadata = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.imagepicker.exporters.d
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return DimensionsExporter.metadata_delegate$lambda$2(this.f26554g);
            }
        });
    }

    private final BitmapFactory.Options getMetadata() {
        return (BitmapFactory.Options) this.metadata.getValue();
    }

    private final boolean isRotatedLandscape() {
        return ((Boolean) this.isRotatedLandscape.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRotatedLandscape_delegate$lambda$0(DimensionsExporter dimensionsExporter) {
        int iM = new X0.a(dimensionsExporter.file.getAbsolutePath()).m("Orientation", 0);
        return iM == 6 || iM == 8 || iM == 5 || iM == 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BitmapFactory.Options metadata_delegate$lambda$2(DimensionsExporter dimensionsExporter) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(dimensionsExporter.file.getAbsolutePath(), options);
        return options;
    }

    public final int getHeight() {
        return isRotatedLandscape() ? getMetadata().outWidth : getMetadata().outHeight;
    }

    public final int getWidth() {
        return isRotatedLandscape() ? getMetadata().outHeight : getMetadata().outWidth;
    }
}
