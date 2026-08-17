package com.facebook.react.fabric;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0004!\"# B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\fJ1\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/facebook/react/fabric/DevToolsReactPerfLogger;", "Lcom/facebook/react/bridge/ReactMarker$FabricMarkerListener;", "<init>", "()V", "Lcom/facebook/react/fabric/DevToolsReactPerfLogger$FabricCommitPoint;", "commitPoint", "Li7/B;", "onFabricCommitEnd", "(Lcom/facebook/react/fabric/DevToolsReactPerfLogger$FabricCommitPoint;)V", "Lcom/facebook/react/fabric/DevToolsReactPerfLogger$DevToolsReactPerfLoggerListener;", "listener", "addDevToolsReactPerfLoggerListener", "(Lcom/facebook/react/fabric/DevToolsReactPerfLogger$DevToolsReactPerfLoggerListener;)V", "removeDevToolsReactPerfLoggerListener", "Lcom/facebook/react/bridge/ReactMarkerConstants;", "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "tag", PointerEventHelper.POINTER_TYPE_UNKNOWN, "instanceKey", PointerEventHelper.POINTER_TYPE_UNKNOWN, "timestamp", "logFabricMarker", "(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJ)V", "counter", "(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJI)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "fabricCommitMarkers", "Ljava/util/Map;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "devToolsReactPerfLoggerListeners", "Ljava/util/List;", "Companion", "DevToolsReactPerfLoggerListener", "FabricCommitPointData", "FabricCommitPoint", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DevToolsReactPerfLogger implements ReactMarker.FabricMarkerListener {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final LongStreamingStats streamingCommitStats = new LongStreamingStats();

    @Deprecated
    public static final LongStreamingStats streamingLayoutStats = new LongStreamingStats();

    @Deprecated
    public static final LongStreamingStats streamingDiffStats = new LongStreamingStats();

    @Deprecated
    public static final LongStreamingStats streamingTransactionEndStats = new LongStreamingStats();

    @Deprecated
    public static final LongStreamingStats streamingBatchExecutionStats = new LongStreamingStats();
    private final Map<Integer, FabricCommitPoint> fabricCommitMarkers = new LinkedHashMap();
    private final List<DevToolsReactPerfLoggerListener> devToolsReactPerfLoggerListeners = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u0010\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/fabric/DevToolsReactPerfLogger$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "streamingCommitStats", "Lcom/facebook/react/fabric/LongStreamingStats;", "streamingLayoutStats", "streamingDiffStats", "streamingTransactionEndStats", "streamingBatchExecutionStats", "isFabricCommitMarker", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "Lcom/facebook/react/bridge/ReactMarkerConstants;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isFabricCommitMarker(ReactMarkerConstants name) {
            return name == ReactMarkerConstants.FABRIC_COMMIT_START || name == ReactMarkerConstants.FABRIC_COMMIT_END || name == ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START || name == ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END || name == ReactMarkerConstants.FABRIC_DIFF_START || name == ReactMarkerConstants.FABRIC_DIFF_END || name == ReactMarkerConstants.FABRIC_LAYOUT_START || name == ReactMarkerConstants.FABRIC_LAYOUT_END || name == ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START || name == ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END || name == ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START || name == ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END || name == ReactMarkerConstants.FABRIC_LAYOUT_AFFECTED_NODES;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/facebook/react/fabric/DevToolsReactPerfLogger$DevToolsReactPerfLoggerListener;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/fabric/DevToolsReactPerfLogger$FabricCommitPoint;", "commitPoint", "Li7/B;", "onFabricCommitEnd", "(Lcom/facebook/react/fabric/DevToolsReactPerfLogger$FabricCommitPoint;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface DevToolsReactPerfLoggerListener {
        void onFabricCommitEnd(FabricCommitPoint commitPoint);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b*\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010 \u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\"\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0011\u0010$\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0019R\u0011\u0010&\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0019R\u0011\u0010(\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0019R\u0011\u0010*\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0019R\u0011\u0010,\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0019R\u0011\u0010/\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00101\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u0019R\u0011\u00103\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\u0019R\u0011\u00105\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u0010\u0019R\u0011\u00107\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b6\u0010\u0019R\u0011\u00109\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b8\u0010\u0019R\u0011\u0010;\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b:\u0010\u0019R\u0011\u0010=\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b<\u0010\u0019R\u0011\u0010?\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b>\u0010\u0019R\u0011\u0010A\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b@\u0010\u0019R\u0011\u0010C\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bB\u0010\u0019¨\u0006D"}, d2 = {"Lcom/facebook/react/fabric/DevToolsReactPerfLogger$FabricCommitPoint;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "commitNumber", "<init>", "(I)V", "Lcom/facebook/react/bridge/ReactMarkerConstants;", "marker", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getTimestamp", "(Lcom/facebook/react/bridge/ReactMarkerConstants;)J", "getCounter", "(Lcom/facebook/react/bridge/ReactMarkerConstants;)I", "key", "Lcom/facebook/react/fabric/DevToolsReactPerfLogger$FabricCommitPointData;", "data", "Li7/B;", "addPoint$ReactAndroid_release", "(Lcom/facebook/react/bridge/ReactMarkerConstants;Lcom/facebook/react/fabric/DevToolsReactPerfLogger$FabricCommitPointData;)V", "addPoint", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "()Ljava/lang/String;", "J", "getCommitNumber", "()J", PointerEventHelper.POINTER_TYPE_UNKNOWN, "points", "Ljava/util/Map;", "getCommitStart", "commitStart", "getCommitEnd", "commitEnd", "getFinishTransactionStart", "finishTransactionStart", "getFinishTransactionEnd", "finishTransactionEnd", "getDiffStart", "diffStart", "getDiffEnd", "diffEnd", "getLayoutStart", "layoutStart", "getLayoutEnd", "layoutEnd", "getAffectedLayoutNodesCount", "()I", "affectedLayoutNodesCount", "getAffectedLayoutNodesCountTime", "affectedLayoutNodesCountTime", "getBatchExecutionStart", "batchExecutionStart", "getBatchExecutionEnd", "batchExecutionEnd", "getUpdateUIMainThreadStart", "updateUIMainThreadStart", "getUpdateUIMainThreadEnd", "updateUIMainThreadEnd", "getCommitDuration", "commitDuration", "getLayoutDuration", "layoutDuration", "getDiffDuration", "diffDuration", "getTransactionEndDuration", "transactionEndDuration", "getBatchExecutionDuration", "batchExecutionDuration", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FabricCommitPoint {
        private final long commitNumber;

        /* JADX INFO: renamed from: points, reason: from kotlin metadata and from toString */
        private final Map<ReactMarkerConstants, FabricCommitPointData> mPoints = new LinkedHashMap();

        public FabricCommitPoint(int i10) {
            this.commitNumber = i10;
        }

        private final int getCounter(ReactMarkerConstants marker) {
            FabricCommitPointData fabricCommitPointData = this.mPoints.get(marker);
            if (fabricCommitPointData != null) {
                return fabricCommitPointData.getCounter();
            }
            return 0;
        }

        private final long getTimestamp(ReactMarkerConstants marker) {
            FabricCommitPointData fabricCommitPointData = this.mPoints.get(marker);
            if (fabricCommitPointData != null) {
                return fabricCommitPointData.getTimeStamp();
            }
            return -1L;
        }

        public final void addPoint$ReactAndroid_release(ReactMarkerConstants key, FabricCommitPointData data) {
            AbstractC2855l.g(key, "key");
            AbstractC2855l.g(data, "data");
            this.mPoints.put(key, data);
        }

        public final int getAffectedLayoutNodesCount() {
            return getCounter(ReactMarkerConstants.FABRIC_LAYOUT_AFFECTED_NODES);
        }

        public final long getAffectedLayoutNodesCountTime() {
            return getTimestamp(ReactMarkerConstants.FABRIC_LAYOUT_AFFECTED_NODES);
        }

        public final long getBatchExecutionDuration() {
            return getBatchExecutionEnd() - getBatchExecutionStart();
        }

        public final long getBatchExecutionEnd() {
            return getTimestamp(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END);
        }

        public final long getBatchExecutionStart() {
            return getTimestamp(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START);
        }

        public final long getCommitDuration() {
            return getCommitEnd() - getCommitStart();
        }

        public final long getCommitEnd() {
            return getTimestamp(ReactMarkerConstants.FABRIC_COMMIT_END);
        }

        public final long getCommitNumber() {
            return this.commitNumber;
        }

        public final long getCommitStart() {
            return getTimestamp(ReactMarkerConstants.FABRIC_COMMIT_START);
        }

        public final long getDiffDuration() {
            return getDiffEnd() - getDiffStart();
        }

        public final long getDiffEnd() {
            return getTimestamp(ReactMarkerConstants.FABRIC_DIFF_END);
        }

        public final long getDiffStart() {
            return getTimestamp(ReactMarkerConstants.FABRIC_DIFF_START);
        }

        public final long getFinishTransactionEnd() {
            return getTimestamp(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END);
        }

        public final long getFinishTransactionStart() {
            return getTimestamp(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START);
        }

        public final long getLayoutDuration() {
            return getLayoutEnd() - getLayoutStart();
        }

        public final long getLayoutEnd() {
            return getTimestamp(ReactMarkerConstants.FABRIC_LAYOUT_END);
        }

        public final long getLayoutStart() {
            return getTimestamp(ReactMarkerConstants.FABRIC_LAYOUT_START);
        }

        public final long getTransactionEndDuration() {
            return getFinishTransactionEnd() - getFinishTransactionStart();
        }

        public final long getUpdateUIMainThreadEnd() {
            return getTimestamp(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END);
        }

        public final long getUpdateUIMainThreadStart() {
            return getTimestamp(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START);
        }

        public String toString() {
            return "FabricCommitPoint{mCommitNumber=" + this.commitNumber + ", mPoints=" + this.mPoints + "}";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/react/fabric/DevToolsReactPerfLogger$FabricCommitPointData;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "timeStamp", PointerEventHelper.POINTER_TYPE_UNKNOWN, "counter", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(JI)V", "getTimeStamp", "()J", "getCounter", "()I", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FabricCommitPointData {
        private final int counter;
        private final long timeStamp;

        public FabricCommitPointData(long j10, int i10) {
            this.timeStamp = j10;
            this.counter = i10;
        }

        public final int getCounter() {
            return this.counter;
        }

        public final long getTimeStamp() {
            return this.timeStamp;
        }
    }

    private final void onFabricCommitEnd(FabricCommitPoint commitPoint) {
        Iterator<DevToolsReactPerfLoggerListener> it = this.devToolsReactPerfLoggerListeners.iterator();
        while (it.hasNext()) {
            it.next().onFabricCommitEnd(commitPoint);
        }
    }

    public final void addDevToolsReactPerfLoggerListener(DevToolsReactPerfLoggerListener listener) {
        AbstractC2855l.g(listener, "listener");
        this.devToolsReactPerfLoggerListeners.add(listener);
    }

    @Override // com.facebook.react.bridge.ReactMarker.FabricMarkerListener
    public void logFabricMarker(ReactMarkerConstants name, String tag, int instanceKey, long timestamp) {
        AbstractC2855l.g(name, "name");
        logFabricMarker(name, tag, instanceKey, timestamp, 0);
    }

    public final void removeDevToolsReactPerfLoggerListener(DevToolsReactPerfLoggerListener listener) {
        AbstractC2855l.g(listener, "listener");
        this.devToolsReactPerfLoggerListeners.remove(listener);
    }

    @Override // com.facebook.react.bridge.ReactMarker.FabricMarkerListener
    public void logFabricMarker(ReactMarkerConstants name, String tag, int instanceKey, long timestamp, int counter) {
        AbstractC2855l.g(name, "name");
        if (Companion.isFabricCommitMarker(name)) {
            FabricCommitPoint fabricCommitPoint = this.fabricCommitMarkers.get(Integer.valueOf(instanceKey));
            if (fabricCommitPoint == null) {
                fabricCommitPoint = new FabricCommitPoint(instanceKey);
                this.fabricCommitMarkers.put(Integer.valueOf(instanceKey), fabricCommitPoint);
            }
            fabricCommitPoint.addPoint$ReactAndroid_release(name, new FabricCommitPointData(timestamp, counter));
            if (name != ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END || timestamp <= 0) {
                return;
            }
            onFabricCommitEnd(fabricCommitPoint);
            this.fabricCommitMarkers.remove(Integer.valueOf(instanceKey));
        }
    }
}
