package androidx.camera.extensions.internal.sessionprocessor;

import F.Y0;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import androidx.camera.extensions.internal.sessionprocessor.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class StillCaptureProcessor {
    private static final String TAG = "StillCaptureProcessor";
    private static final long UNSPECIFIED_TIMESTAMP = -1;
    W.b mCaptureOutputSurface;
    final CaptureProcessorImpl mCaptureProcessorImpl;
    private boolean mIsPostviewConfigured;
    final c mCaptureResultImageMatcher = new c();
    final Object mLock = new Object();
    HashMap<Integer, Pair<d, TotalCaptureResult>> mCaptureResults = new HashMap<>();
    OnCaptureResultCallback mOnCaptureResultCallback = null;
    TotalCaptureResult mSourceCaptureResult = null;
    boolean mIsClosed = false;
    long mTimeStampForOutputImage = UNSPECIFIED_TIMESTAMP;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface OnCaptureResultCallback {
        void onCaptureCompleted(long j10, List<Pair<CaptureResult.Key, Object>> list);

        void onCaptureProcessProgressed(int i10);

        void onError(Exception exc);

        void onProcessCompleted();
    }

    StillCaptureProcessor(CaptureProcessorImpl captureProcessorImpl, Surface surface, Size size, Y0 y02, boolean z10) {
        this.mCaptureProcessorImpl = captureProcessorImpl;
        W.b bVar = new W.b(surface, size, z10);
        this.mCaptureOutputSurface = bVar;
        captureProcessorImpl.onOutputSurface(bVar.c(), 35);
        captureProcessorImpl.onImageFormatUpdate(35);
        this.mIsPostviewConfigured = false;
        captureProcessorImpl.onResolutionUpdate(size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    public /* synthetic */ void lambda$process$1(boolean z10, HashMap map, final OnCaptureResultCallback onCaptureResultCallback) {
        synchronized (this.mLock) {
            try {
                try {
                    try {
                    } catch (Exception e10) {
                        AbstractC3583h0.d(TAG, "mCaptureProcessorImpl.process exception ", e10);
                        this.mOnCaptureResultCallback = null;
                        if (onCaptureResultCallback != null) {
                            onCaptureResultCallback.onError(e10);
                        }
                        AbstractC3583h0.a(TAG, "CaptureProcessorImpl.process() finish");
                        OnCaptureResultCallback onCaptureResultCallback2 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback2 != null) {
                            onCaptureResultCallback2.onProcessCompleted();
                        }
                    }
                    if (this.mIsClosed) {
                        AbstractC3583h0.a(TAG, "Ignore process() in closed state.");
                        AbstractC3583h0.a(TAG, "CaptureProcessorImpl.process() finish");
                        OnCaptureResultCallback onCaptureResultCallback3 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback3 != null) {
                            onCaptureResultCallback3.onProcessCompleted();
                            this.mOnCaptureResultCallback = null;
                        }
                        clearCaptureResults();
                        return;
                    }
                    AbstractC3583h0.a(TAG, "CaptureProcessorImpl.process() begin");
                    U.h hVar = U.h.f10725k;
                    if (U.e.d(hVar) && U.d.c(hVar) && z10 && this.mIsPostviewConfigured) {
                        this.mCaptureProcessorImpl.processWithPostview(map, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.1
                            public void onCaptureCompleted(long j10, List<Pair<CaptureResult.Key, Object>> list) {
                                onCaptureResultCallback.onCaptureCompleted(j10, list);
                            }

                            public void onCaptureProcessProgressed(int i10) {
                                onCaptureResultCallback.onCaptureProcessProgressed(i10);
                            }
                        }, I.c.b());
                    } else {
                        U.h hVar2 = U.h.f10724j;
                        if (U.e.d(hVar2) && U.d.c(hVar2)) {
                            this.mCaptureProcessorImpl.process(map, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.2
                                public void onCaptureCompleted(long j10, List<Pair<CaptureResult.Key, Object>> list) {
                                    onCaptureResultCallback.onCaptureCompleted(j10, list);
                                }

                                public void onCaptureProcessProgressed(int i10) {
                                    onCaptureResultCallback.onCaptureProcessProgressed(i10);
                                }
                            }, I.c.b());
                        } else {
                            this.mCaptureProcessorImpl.process(map);
                        }
                    }
                    AbstractC3583h0.a(TAG, "CaptureProcessorImpl.process() finish");
                    OnCaptureResultCallback onCaptureResultCallback4 = this.mOnCaptureResultCallback;
                    if (onCaptureResultCallback4 != null) {
                        onCaptureResultCallback4.onProcessCompleted();
                        this.mOnCaptureResultCallback = null;
                    }
                    clearCaptureResults();
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable th2) {
                AbstractC3583h0.a(TAG, "CaptureProcessorImpl.process() finish");
                OnCaptureResultCallback onCaptureResultCallback5 = this.mOnCaptureResultCallback;
                if (onCaptureResultCallback5 != null) {
                    onCaptureResultCallback5.onProcessCompleted();
                    this.mOnCaptureResultCallback = null;
                }
                clearCaptureResults();
                throw th2;
            }
        }
    }

    void clearCaptureResults() {
        synchronized (this.mLock) {
            try {
                Iterator<Pair<d, TotalCaptureResult>> it = this.mCaptureResults.values().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next().first);
                    throw null;
                }
                this.mCaptureResults.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void close() {
        synchronized (this.mLock) {
            AbstractC3583h0.a(TAG, "Close the StillCaptureProcessor");
            this.mIsClosed = true;
            clearCaptureResults();
            this.mCaptureResultImageMatcher.e();
            this.mCaptureResultImageMatcher.d();
            this.mCaptureOutputSurface.b();
        }
    }

    void notifyCaptureResult(TotalCaptureResult totalCaptureResult, int i10) {
        Long l10;
        this.mCaptureResultImageMatcher.c(totalCaptureResult, i10);
        if (this.mTimeStampForOutputImage == UNSPECIFIED_TIMESTAMP && (l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP)) != null) {
            long jLongValue = l10.longValue();
            this.mTimeStampForOutputImage = jLongValue;
            this.mCaptureOutputSurface.d(jLongValue);
        }
        synchronized (this.mLock) {
            try {
                if (this.mSourceCaptureResult == null) {
                    this.mSourceCaptureResult = totalCaptureResult;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void notifyImage(d dVar) {
        this.mCaptureResultImageMatcher.g(dVar);
    }

    void process(Map<Integer, Pair<d, TotalCaptureResult>> map, final OnCaptureResultCallback onCaptureResultCallback, final boolean z10) {
        final HashMap map2 = new HashMap();
        synchronized (this.mLock) {
            Iterator<Integer> it = map.keySet().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(map.get(it.next()).first);
                throw null;
            }
        }
        I.c.d().execute(new Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f15288g.lambda$process$1(z10, map2, onCaptureResultCallback);
            }
        });
    }

    void startCapture(final boolean z10, final List<Integer> list, final OnCaptureResultCallback onCaptureResultCallback) {
        AbstractC3583h0.a(TAG, "Start the capture: enablePostview=" + z10);
        this.mTimeStampForOutputImage = UNSPECIFIED_TIMESTAMP;
        synchronized (this.mLock) {
            H0.g.j(!this.mIsClosed, "StillCaptureProcessor is closed. Can't invoke startCapture()");
            this.mOnCaptureResultCallback = onCaptureResultCallback;
            clearCaptureResults();
        }
        this.mCaptureResultImageMatcher.d();
        this.mCaptureResultImageMatcher.k(new c.a() { // from class: androidx.camera.extensions.internal.sessionprocessor.i
        });
    }
}
