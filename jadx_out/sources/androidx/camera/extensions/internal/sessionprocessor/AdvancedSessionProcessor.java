package androidx.camera.extensions.internal.sessionprocessor;

import F.B;
import F.C0508t;
import F.InterfaceC0490j0;
import F.Y0;
import F.Z0;
import F.i1;
import F.m1;
import F.u1;
import U.f;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.advanced.ImageProcessorImpl;
import androidx.camera.extensions.impl.advanced.ImageReferenceImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceConfigurationImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceImpl;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import androidx.camera.extensions.impl.advanced.SessionProcessorImpl;
import androidx.lifecycle.A;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AdvancedSessionProcessor extends g {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class CallbackAdapter implements i1.a {
        private final RequestProcessorImpl.Callback mCallback;

        CallbackAdapter(RequestProcessorImpl.Callback callback) {
            this.mCallback = callback;
        }

        private RequestProcessorImpl.Request getImplRequest(i1.b bVar) {
            H0.g.a(bVar instanceof RequestAdapter);
            return ((RequestAdapter) bVar).getImplRequest();
        }

        public void onCaptureBufferLost(i1.b bVar, long j10, int i10) {
            this.mCallback.onCaptureBufferLost(getImplRequest(bVar), j10, i10);
        }

        public void onCaptureCompleted(i1.b bVar, B b10) {
            CaptureResult captureResultI = b10.i();
            H0.g.b(captureResultI instanceof TotalCaptureResult, "CaptureResult in cameraCaptureResult is not a TotalCaptureResult");
            this.mCallback.onCaptureCompleted(getImplRequest(bVar), (TotalCaptureResult) captureResultI);
        }

        public void onCaptureFailed(i1.b bVar, C0508t c0508t) {
            Object objA = c0508t.a();
            H0.g.b(objA instanceof CaptureFailure, "CameraCaptureFailure does not contain CaptureFailure.");
            this.mCallback.onCaptureFailed(getImplRequest(bVar), (CaptureFailure) objA);
        }

        public void onCaptureProgressed(i1.b bVar, B b10) {
            CaptureResult captureResultI = b10.i();
            H0.g.b(captureResultI != null, "Cannot get CaptureResult from the cameraCaptureResult ");
            this.mCallback.onCaptureProgressed(getImplRequest(bVar), captureResultI);
        }

        public void onCaptureSequenceAborted(int i10) {
            this.mCallback.onCaptureSequenceAborted(i10);
        }

        public void onCaptureSequenceCompleted(int i10, long j10) {
            this.mCallback.onCaptureSequenceCompleted(i10, j10);
        }

        public void onCaptureStarted(i1.b bVar, long j10, long j11) {
            this.mCallback.onCaptureStarted(getImplRequest(bVar), j10, j11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class ExtensionMetadataMonitor {
        private final A mCurrentExtensionTypeLiveData;
        private final A mExtensionStrengthLiveData;

        ExtensionMetadataMonitor(A a10, A a11) {
            this.mCurrentExtensionTypeLiveData = a10;
            this.mExtensionStrengthLiveData = a11;
        }

        private int convertExtensionMode(int i10) {
            if (i10 == 0) {
                return 5;
            }
            if (i10 == 1) {
                return 4;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 != 3) {
                return i10 != 4 ? 0 : 3;
            }
            return 2;
        }

        void checkExtensionMetadata(Map<CaptureResult.Key, Object> map) {
            Object obj;
            Object obj2;
            if (Build.VERSION.SDK_INT >= 34) {
                if (this.mCurrentExtensionTypeLiveData != null && (obj2 = map.get(CaptureResult.EXTENSION_CURRENT_TYPE)) != null) {
                    Integer num = (Integer) obj2;
                    if (!Objects.equals(this.mCurrentExtensionTypeLiveData.e(), Integer.valueOf(convertExtensionMode(num.intValue())))) {
                        this.mCurrentExtensionTypeLiveData.l(Integer.valueOf(convertExtensionMode(num.intValue())));
                    }
                }
                if (this.mExtensionStrengthLiveData == null || (obj = map.get(CaptureResult.EXTENSION_STRENGTH)) == null || Objects.equals(this.mExtensionStrengthLiveData.e(), obj)) {
                    return;
                }
                this.mExtensionStrengthLiveData.l((Integer) obj);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class ImageProcessorAdapter {
        private final ImageProcessorImpl mImpl;

        ImageProcessorAdapter(ImageProcessorImpl imageProcessorImpl) {
            this.mImpl = imageProcessorImpl;
        }

        public void onNextImageAvailable(int i10, long j10, d dVar, String str) {
            this.mImpl.onNextImageAvailable(i10, j10, new ImageReferenceImplAdapter(dVar), str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class ImageReferenceImplAdapter implements ImageReferenceImpl {
        private final d mImageReference;

        ImageReferenceImplAdapter(d dVar) {
        }

        public boolean decrement() {
            throw null;
        }

        public Image get() {
            throw null;
        }

        public boolean increment() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class OutputSurfaceConfigurationImplAdapter implements OutputSurfaceConfigurationImpl {
        private final OutputSurfaceImpl mAnalysisOutputSurface;
        private final OutputSurfaceImpl mCaptureOutputSurface;
        private final OutputSurfaceImpl mPostviewOutputSurface;
        private final OutputSurfaceImpl mPreviewOutputSurface;

        OutputSurfaceConfigurationImplAdapter(Z0 z02) {
            this.mPreviewOutputSurface = new OutputSurfaceImplAdapter(z02.d());
            this.mCaptureOutputSurface = new OutputSurfaceImplAdapter(z02.b());
            z02.a();
            this.mAnalysisOutputSurface = null;
            z02.c();
            this.mPostviewOutputSurface = null;
        }

        public OutputSurfaceImpl getImageAnalysisOutputSurface() {
            return this.mAnalysisOutputSurface;
        }

        public OutputSurfaceImpl getImageCaptureOutputSurface() {
            return this.mCaptureOutputSurface;
        }

        public OutputSurfaceImpl getPostviewOutputSurface() {
            return this.mPostviewOutputSurface;
        }

        public OutputSurfaceImpl getPreviewOutputSurface() {
            return this.mPreviewOutputSurface;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class OutputSurfaceImplAdapter implements OutputSurfaceImpl {
        private final Y0 mOutputSurface;

        OutputSurfaceImplAdapter(Y0 y02) {
            this.mOutputSurface = y02;
        }

        public int getImageFormat() {
            return this.mOutputSurface.a();
        }

        public Size getSize() {
            return this.mOutputSurface.b();
        }

        public Surface getSurface() {
            return this.mOutputSurface.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class RequestAdapter implements i1.b {
        private final RequestProcessorImpl.Request mImplRequest;
        private final InterfaceC0490j0 mParameters;
        private final List<Integer> mTargetOutputConfigIds;
        private final int mTemplateId;

        RequestAdapter(RequestProcessorImpl.Request request) {
            this.mImplRequest = request;
            ArrayList arrayList = new ArrayList();
            Iterator it = request.getTargetOutputConfigIds().iterator();
            while (it.hasNext()) {
                arrayList.add((Integer) it.next());
            }
            this.mTargetOutputConfigIds = arrayList;
            f.b bVar = new f.b();
            for (CaptureRequest.Key key : request.getParameters().keySet()) {
                bVar.b(key, request.getParameters().get(key));
            }
            this.mParameters = bVar.a();
            this.mTemplateId = request.getTemplateId().intValue();
        }

        public RequestProcessorImpl.Request getImplRequest() {
            return this.mImplRequest;
        }

        public InterfaceC0490j0 getParameters() {
            return this.mParameters;
        }

        public List<Integer> getTargetOutputConfigIds() {
            return this.mTargetOutputConfigIds;
        }

        public int getTemplateId() {
            return this.mTemplateId;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class RequestProcessorImplAdapter implements RequestProcessorImpl {
        private final i1 mRequestProcessor;
        final /* synthetic */ AdvancedSessionProcessor this$0;

        RequestProcessorImplAdapter(AdvancedSessionProcessor advancedSessionProcessor, i1 i1Var) {
            this.mRequestProcessor = i1Var;
        }

        public void abortCaptures() {
            this.mRequestProcessor.a();
        }

        public void setImageProcessor(int i10, ImageProcessorImpl imageProcessorImpl) {
            new ImageProcessorAdapter(imageProcessorImpl);
            throw null;
        }

        public int setRepeating(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
            return this.mRequestProcessor.g(new RequestAdapter(request), new CallbackAdapter(callback));
        }

        public void stopRepeating() {
            this.mRequestProcessor.d();
        }

        public int submit(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
            return this.mRequestProcessor.f(new RequestAdapter(request), new CallbackAdapter(callback));
        }

        public int submit(List<RequestProcessorImpl.Request> list, RequestProcessorImpl.Callback callback) {
            ArrayList arrayList = new ArrayList();
            Iterator<RequestProcessorImpl.Request> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new RequestAdapter(it.next()));
            }
            return this.mRequestProcessor.e(arrayList, new CallbackAdapter(callback));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class SessionProcessorImplCaptureCallbackAdapter implements SessionProcessorImpl.CaptureCallback {
        private final m1.a mCaptureCallback;
        private final ExtensionMetadataMonitor mExtensionMetadataMonitor;
        private long mOnCaptureStartedTimestamp;
        private final u1 mTagBundle;
        private boolean mWillReceiveOnCaptureCompleted;

        SessionProcessorImplCaptureCallbackAdapter(m1.a aVar, u1 u1Var, boolean z10) {
            this(aVar, u1Var, null, z10);
        }

        public void onCaptureCompleted(long j10, int i10, Map<CaptureResult.Key, Object> map) {
            ExtensionMetadataMonitor extensionMetadataMonitor = this.mExtensionMetadataMonitor;
            if (extensionMetadataMonitor != null) {
                extensionMetadataMonitor.checkExtensionMetadata(map);
            }
            if (this.mWillReceiveOnCaptureCompleted) {
                this.mCaptureCallback.e(j10, i10, new e(j10, this.mTagBundle, map));
                this.mCaptureCallback.b(i10);
            }
        }

        public void onCaptureFailed(int i10) {
            this.mCaptureCallback.c(i10);
        }

        public void onCaptureProcessProgressed(int i10) {
            this.mCaptureCallback.onCaptureProcessProgressed(i10);
        }

        public void onCaptureProcessStarted(int i10) {
            this.mCaptureCallback.a(i10);
        }

        public void onCaptureSequenceAborted(int i10) {
            this.mCaptureCallback.f(i10);
        }

        public void onCaptureSequenceCompleted(int i10) {
            if (this.mWillReceiveOnCaptureCompleted) {
                return;
            }
            m1.a aVar = this.mCaptureCallback;
            long j10 = this.mOnCaptureStartedTimestamp;
            aVar.e(j10, i10, new e(j10, this.mTagBundle, Collections.EMPTY_MAP));
            this.mCaptureCallback.b(i10);
        }

        public void onCaptureStarted(int i10, long j10) {
            this.mOnCaptureStartedTimestamp = j10;
            this.mCaptureCallback.d(i10, j10);
        }

        SessionProcessorImplCaptureCallbackAdapter(m1.a aVar, u1 u1Var, ExtensionMetadataMonitor extensionMetadataMonitor, boolean z10) {
            this.mOnCaptureStartedTimestamp = -1L;
            this.mCaptureCallback = aVar;
            this.mTagBundle = u1Var;
            this.mExtensionMetadataMonitor = extensionMetadataMonitor;
            this.mWillReceiveOnCaptureCompleted = z10;
        }
    }
}
