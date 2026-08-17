package com.facebook.react.views.image;

import W1.f;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.request.d;
import com.facebook.react.uimanager.events.PointerEventHelper;
import g2.AbstractC2662a;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/views/image/MultiPostprocessor;", "Lcom/facebook/imagepipeline/request/d;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "postprocessors", "<init>", "(Ljava/util/List;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getName", "()Ljava/lang/String;", "LW1/d;", "getPostprocessorCacheKey", "()LW1/d;", "Landroid/graphics/Bitmap;", "sourceBitmap", "LV2/d;", "bitmapFactory", "Lg2/a;", "process", "(Landroid/graphics/Bitmap;LV2/d;)Lg2/a;", "Ljava/util/List;", "getPostprocessors$ReactAndroid_release", "()Ljava/util/List;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiPostprocessor implements d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<d> postprocessors;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/views/image/MultiPostprocessor$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/imagepipeline/request/d;", "postprocessors", "from", "(Ljava/util/List;)Lcom/facebook/imagepipeline/request/d;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d from(List<? extends d> postprocessors) {
            AbstractC2855l.g(postprocessors, "postprocessors");
            int size = postprocessors.size();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (size != 0) {
                return size != 1 ? new MultiPostprocessor(postprocessors, defaultConstructorMarker) : postprocessors.get(0);
            }
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MultiPostprocessor(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    public static final d from(List<? extends d> list) {
        return INSTANCE.from(list);
    }

    @Override // com.facebook.imagepipeline.request.d
    public String getName() {
        return "MultiPostProcessor (" + AbstractC2800q.o0(this.postprocessors, ",", null, null, 0, null, null, 62, null) + ")";
    }

    @Override // com.facebook.imagepipeline.request.d
    public W1.d getPostprocessorCacheKey() {
        List<d> list = this.postprocessors;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) it.next()).getPostprocessorCacheKey());
        }
        return new f(arrayList);
    }

    public final List<d> getPostprocessors$ReactAndroid_release() {
        return this.postprocessors;
    }

    @Override // com.facebook.imagepipeline.request.d
    public AbstractC2662a process(Bitmap sourceBitmap, V2.d bitmapFactory) {
        Bitmap bitmap;
        AbstractC2855l.g(sourceBitmap, "sourceBitmap");
        AbstractC2855l.g(bitmapFactory, "bitmapFactory");
        AbstractC2662a abstractC2662aProcess = null;
        try {
            AbstractC2662a abstractC2662aClone = null;
            for (d dVar : this.postprocessors) {
                if (abstractC2662aClone == null || (bitmap = (Bitmap) abstractC2662aClone.J()) == null) {
                    bitmap = sourceBitmap;
                }
                abstractC2662aProcess = dVar.process(bitmap, bitmapFactory);
                AbstractC2662a.B(abstractC2662aClone);
                abstractC2662aClone = abstractC2662aProcess.clone();
            }
            if (abstractC2662aProcess != null) {
                AbstractC2662a abstractC2662aClone2 = abstractC2662aProcess.clone();
                AbstractC2855l.f(abstractC2662aClone2, "clone(...)");
                AbstractC2662a.B(abstractC2662aProcess);
                return abstractC2662aClone2;
            }
            throw new IllegalStateException(("MultiPostprocessor returned null bitmap - Number of Postprocessors: " + this.postprocessors.size()).toString());
        } catch (Throwable th) {
            AbstractC2662a.B(null);
            throw th;
        }
    }

    private MultiPostprocessor(List<? extends d> list) {
        this.postprocessors = new LinkedList(list);
    }
}
