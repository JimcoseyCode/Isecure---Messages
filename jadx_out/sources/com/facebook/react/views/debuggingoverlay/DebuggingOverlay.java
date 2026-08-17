package com.facebook.react.views.debuggingoverlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R0\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\u0019j\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0007`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR0\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001e0\u0019j\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001e`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlay;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/views/debuggingoverlay/TraceUpdate;", "traceUpdates", "Li7/B;", "setTraceUpdates", "(Ljava/util/List;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/graphics/RectF;", "elementsRectangles", "setHighlightedElementsRectangles", "clearElementsHighlights", "()V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "traceUpdatePaint", "Landroid/graphics/Paint;", "Ljava/util/HashMap;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/collections/HashMap;", "traceUpdatesToDisplayMap", "Ljava/util/HashMap;", "Ljava/lang/Runnable;", "traceUpdateIdToCleanupRunnableMap", "highlightedElementsPaint", "highlightedElementsRectangles", "Ljava/util/List;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DebuggingOverlay extends View {
    private final Paint highlightedElementsPaint;
    private List<RectF> highlightedElementsRectangles;
    private final HashMap<Integer, Runnable> traceUpdateIdToCleanupRunnableMap;
    private final Paint traceUpdatePaint;
    private final HashMap<Integer, TraceUpdate> traceUpdatesToDisplayMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebuggingOverlay(Context context) {
        super(context);
        AbstractC2855l.g(context, "context");
        Paint paint = new Paint();
        this.traceUpdatePaint = paint;
        this.traceUpdatesToDisplayMap = new HashMap<>();
        this.traceUpdateIdToCleanupRunnableMap = new HashMap<>();
        Paint paint2 = new Paint();
        this.highlightedElementsPaint = paint2;
        this.highlightedElementsRectangles = new ArrayList();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6.0f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-859248897);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDraw$lambda$1(DebuggingOverlay debuggingOverlay, int i10) {
        debuggingOverlay.traceUpdatesToDisplayMap.remove(Integer.valueOf(i10));
        debuggingOverlay.traceUpdateIdToCleanupRunnableMap.remove(Integer.valueOf(i10));
        debuggingOverlay.invalidate();
    }

    public final void clearElementsHighlights() {
        this.highlightedElementsRectangles.clear();
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC2855l.g(canvas, "canvas");
        super.onDraw(canvas);
        for (TraceUpdate traceUpdate : this.traceUpdatesToDisplayMap.values()) {
            AbstractC2855l.f(traceUpdate, "next(...)");
            TraceUpdate traceUpdate2 = traceUpdate;
            this.traceUpdatePaint.setColor(traceUpdate2.getColor());
            canvas.drawRect(traceUpdate2.getRectangle(), this.traceUpdatePaint);
            final int id = traceUpdate2.getId();
            Runnable runnable = new Runnable() { // from class: com.facebook.react.views.debuggingoverlay.a
                @Override // java.lang.Runnable
                public final void run() {
                    DebuggingOverlay.onDraw$lambda$1(this.f20612g, id);
                }
            };
            if (!this.traceUpdateIdToCleanupRunnableMap.containsKey(Integer.valueOf(id))) {
                this.traceUpdateIdToCleanupRunnableMap.put(Integer.valueOf(id), runnable);
                UiThreadUtil.runOnUiThread(runnable, 2000L);
            }
        }
        Iterator<RectF> it = this.highlightedElementsRectangles.iterator();
        while (it.hasNext()) {
            canvas.drawRect(it.next(), this.highlightedElementsPaint);
        }
    }

    public final void setHighlightedElementsRectangles(List<RectF> elementsRectangles) {
        AbstractC2855l.g(elementsRectangles, "elementsRectangles");
        this.highlightedElementsRectangles = elementsRectangles;
        invalidate();
    }

    public final void setTraceUpdates(List<TraceUpdate> traceUpdates) {
        AbstractC2855l.g(traceUpdates, "traceUpdates");
        for (TraceUpdate traceUpdate : traceUpdates) {
            int id = traceUpdate.getId();
            if (this.traceUpdateIdToCleanupRunnableMap.containsKey(Integer.valueOf(id))) {
                Runnable runnable = this.traceUpdateIdToCleanupRunnableMap.get(Integer.valueOf(id));
                if (runnable != null) {
                    UiThreadUtil.removeOnUiThread(runnable);
                }
                this.traceUpdateIdToCleanupRunnableMap.remove(Integer.valueOf(id));
            }
            this.traceUpdatesToDisplayMap.put(Integer.valueOf(id), traceUpdate);
        }
        invalidate();
    }
}
