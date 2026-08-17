package com.facebook.react.common.mapbuffer;

import B7.c;
import P8.C1385d;
import com.facebook.jni.HybridClassBase;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.service.NotificationsService;
import i7.C2750m;
import i7.z;
import j7.AbstractC2800q;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\f\b\u0007\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0002RQB\u0019\b\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010\u0011J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0005H\u0002¢\u0006\u0004\b-\u0010\u000bJ\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00000.2\u0006\u0010,\u001a\u00020\u0005H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b1\u0010\u0011J\u0017\u00102\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b2\u0010(J\u0017\u00103\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u0010\u0011J\u0017\u00105\u001a\u0002042\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b7\u0010\u0015J\u0017\u00108\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b8\u0010\u0011J\u0017\u00109\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b9\u0010%J\u0017\u0010:\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b:\u0010!J\u0017\u0010;\u001a\u00020)2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b;\u0010+J\u0017\u0010<\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b<\u0010(J\u0017\u0010=\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b=\u0010\u000bJ\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00000.2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b>\u00100J\u000f\u0010?\u001a\u00020\u0005H\u0016¢\u0006\u0004\b?\u0010@J\u001a\u0010C\u001a\u00020&2\b\u0010B\u001a\u0004\u0018\u00010AH\u0096\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020)H\u0016¢\u0006\u0004\bE\u0010FJ\u0016\u0010H\u001a\b\u0012\u0004\u0012\u0002040GH\u0096\u0002¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010JR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010KR$\u0010M\u001a\u00020\u00052\u0006\u0010L\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bM\u0010K\u001a\u0004\bN\u0010@R\u0014\u0010P\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010@¨\u0006S"}, d2 = {"Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "Lcom/facebook/jni/HybridClassBase;", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "Ljava/nio/ByteBuffer;", "buffer", PointerEventHelper.POINTER_TYPE_UNKNOWN, "offsetToMapBuffer", "<init>", "(Ljava/nio/ByteBuffer;I)V", "offset", "cloneWithOffset", "(I)Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "Li7/B;", "readHeader", "()V", "intKey", "getBucketIndexForKey", "(I)I", "bucketIndex", "Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "readDataType", "(I)Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "key", "expected", "getTypedValueOffsetForKey", "(ILcom/facebook/react/common/mapbuffer/MapBuffer$DataType;)I", "bufferPosition", "Li7/z;", "readUnsignedShort-BwKQO78", "(I)S", "readUnsignedShort", PointerEventHelper.POINTER_TYPE_UNKNOWN, "readDoubleValue", "(I)D", "readIntValue", PointerEventHelper.POINTER_TYPE_UNKNOWN, "readLongValue", "(I)J", PointerEventHelper.POINTER_TYPE_UNKNOWN, "readBooleanValue", "(I)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "readStringValue", "(I)Ljava/lang/String;", ViewProps.POSITION, "readMapBufferValue", PointerEventHelper.POINTER_TYPE_UNKNOWN, "readMapBufferListValue", "(I)Ljava/util/List;", "getKeyOffsetForBucketIndex", "contains", "getKeyOffset", "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "entryAt", "(I)Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "getType", "getInt", "getLong", "getDouble", "getString", "getBoolean", "getMapBuffer", "getMapBufferList", "hashCode", "()I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "iterator", "()Ljava/util/Iterator;", "Ljava/nio/ByteBuffer;", "I", "value", "count", "getCount", "getOffsetForDynamicData", "offsetForDynamicData", "Companion", "MapBufferEntry", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReadableMapBuffer extends HybridClassBase implements MapBuffer {
    private static final int ALIGNMENT = 254;
    private static final int BUCKET_SIZE = 12;
    private static final MapBuffer.DataType[] DATA_TYPES = MapBuffer.DataType.values();
    private static final int HEADER_SIZE = 8;
    private static final int TYPE_OFFSET = 2;
    private static final int VALUE_OFFSET = 4;
    private final ByteBuffer buffer;
    private int count;
    private final int offsetToMapBuffer;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\rR\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$MapBufferEntry;", "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "bucketOffset", "<init>", "(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)V", "Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "expected", "Li7/B;", "assertType", "(Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;)V", "I", "getKey", "()I", "key", "getType", "()Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", NotificationsService.EVENT_TYPE_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getDoubleValue", "()D", "doubleValue", "getIntValue", "intValue", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getLongValue", "()J", "longValue", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getBooleanValue", "()Z", "booleanValue", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getStringValue", "()Ljava/lang/String;", "stringValue", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "getMapBufferValue", "()Lcom/facebook/react/common/mapbuffer/MapBuffer;", "mapBufferValue", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class MapBufferEntry implements MapBuffer.Entry {
        private final int bucketOffset;

        public MapBufferEntry(int i10) {
            this.bucketOffset = i10;
        }

        private final void assertType(MapBuffer.DataType expected) {
            MapBuffer.DataType type = getType();
            if (expected == type) {
                return;
            }
            throw new IllegalStateException(("Expected " + expected + " for key: " + getKey() + " found " + type + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public boolean getBooleanValue() {
            assertType(MapBuffer.DataType.BOOL);
            return ReadableMapBuffer.this.readBooleanValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public double getDoubleValue() {
            assertType(MapBuffer.DataType.DOUBLE);
            return ReadableMapBuffer.this.readDoubleValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public int getIntValue() {
            assertType(MapBuffer.DataType.INT);
            return ReadableMapBuffer.this.readIntValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public int getKey() {
            return ReadableMapBuffer.this.m6readUnsignedShortBwKQO78(this.bucketOffset) & 65535;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public long getLongValue() {
            assertType(MapBuffer.DataType.LONG);
            return ReadableMapBuffer.this.readLongValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public MapBuffer getMapBufferValue() {
            assertType(MapBuffer.DataType.MAP);
            return ReadableMapBuffer.this.readMapBufferValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public String getStringValue() {
            assertType(MapBuffer.DataType.STRING);
            return ReadableMapBuffer.this.readStringValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public MapBuffer.DataType getType() {
            return ReactNativeFeatureFlags.enableAndroidTextMeasurementOptimizations() ? ReadableMapBuffer.DATA_TYPES[65535 & ReadableMapBuffer.this.m6readUnsignedShortBwKQO78(this.bucketOffset + 2)] : MapBuffer.DataType.values()[65535 & ReadableMapBuffer.this.m6readUnsignedShortBwKQO78(this.bucketOffset + 2)];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapBuffer.DataType.values().length];
            try {
                iArr[MapBuffer.DataType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MapBuffer.DataType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MapBuffer.DataType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MapBuffer.DataType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MapBuffer.DataType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MapBuffer.DataType.MAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.common.mapbuffer.ReadableMapBuffer$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\t\u0010\r\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000e"}, d2 = {"com/facebook/react/common/mapbuffer/ReadableMapBuffer$iterator$1", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "current", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCurrent", "()I", "setCurrent", "(I)V", "last", "getLast", "hasNext", PointerEventHelper.POINTER_TYPE_UNKNOWN, "next", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<MapBuffer.Entry>, InterfaceC3550a {
        private int current;
        private final int last;

        AnonymousClass1() {
            this.last = ReadableMapBuffer.this.getCount() - 1;
        }

        public final int getCurrent() {
            return this.current;
        }

        public final int getLast() {
            return this.last;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current <= this.last;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCurrent(int i10) {
            this.current = i10;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public MapBuffer.Entry next() {
            ReadableMapBuffer readableMapBuffer = ReadableMapBuffer.this;
            int i10 = this.current;
            this.current = i10 + 1;
            return readableMapBuffer.new MapBufferEntry(readableMapBuffer.getKeyOffsetForBucketIndex(i10));
        }
    }

    private ReadableMapBuffer(ByteBuffer byteBuffer, int i10) {
        this.buffer = byteBuffer;
        this.offsetToMapBuffer = i10;
        readHeader();
    }

    private final ReadableMapBuffer cloneWithOffset(int offset) {
        ByteBuffer byteBufferDuplicate = this.buffer.duplicate();
        byteBufferDuplicate.position(offset);
        AbstractC2855l.f(byteBufferDuplicate, "apply(...)");
        return new ReadableMapBuffer(byteBufferDuplicate, offset);
    }

    private final int getBucketIndexForKey(int intKey) {
        c kEY_RANGE$ReactAndroid_release = MapBuffer.INSTANCE.getKEY_RANGE$ReactAndroid_release();
        int iD = kEY_RANGE$ReactAndroid_release.d();
        if (intKey <= kEY_RANGE$ReactAndroid_release.o() && iD <= intKey) {
            short sJ = z.j((short) intKey);
            int count = getCount() - 1;
            int i10 = 0;
            while (i10 <= count) {
                int i11 = (i10 + count) >>> 1;
                int iM6readUnsignedShortBwKQO78 = m6readUnsignedShortBwKQO78(getKeyOffsetForBucketIndex(i11)) & 65535;
                int i12 = 65535 & sJ;
                if (AbstractC2855l.i(iM6readUnsignedShortBwKQO78, i12) < 0) {
                    i10 = i11 + 1;
                } else {
                    if (AbstractC2855l.i(iM6readUnsignedShortBwKQO78, i12) <= 0) {
                        return i11;
                    }
                    count = i11 - 1;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getKeyOffsetForBucketIndex(int bucketIndex) {
        return this.offsetToMapBuffer + 8 + (bucketIndex * 12);
    }

    private final int getOffsetForDynamicData() {
        return getKeyOffsetForBucketIndex(getCount());
    }

    private final int getTypedValueOffsetForKey(int key, MapBuffer.DataType expected) {
        int bucketIndexForKey = getBucketIndexForKey(key);
        if (bucketIndexForKey == -1) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        MapBuffer.DataType dataType = readDataType(bucketIndexForKey);
        if (dataType == expected) {
            return getKeyOffsetForBucketIndex(bucketIndexForKey) + 4;
        }
        throw new IllegalStateException(("Expected " + expected + " for key: " + key + ", found " + dataType + " instead.").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean readBooleanValue(int bufferPosition) {
        return readIntValue(bufferPosition) == 1;
    }

    private final MapBuffer.DataType readDataType(int bucketIndex) {
        int iM6readUnsignedShortBwKQO78 = m6readUnsignedShortBwKQO78(getKeyOffsetForBucketIndex(bucketIndex) + 2) & 65535;
        return ReactNativeFeatureFlags.enableAndroidTextMeasurementOptimizations() ? DATA_TYPES[iM6readUnsignedShortBwKQO78] : MapBuffer.DataType.values()[iM6readUnsignedShortBwKQO78];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double readDoubleValue(int bufferPosition) {
        return this.buffer.getDouble(bufferPosition);
    }

    private final void readHeader() {
        if (this.buffer.getShort() != ALIGNMENT) {
            this.buffer.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.count = m6readUnsignedShortBwKQO78(this.buffer.position()) & 65535;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int readIntValue(int bufferPosition) {
        return this.buffer.getInt(bufferPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long readLongValue(int bufferPosition) {
        return this.buffer.getLong(bufferPosition);
    }

    private final List<ReadableMapBuffer> readMapBufferListValue(int position) {
        ArrayList arrayList = new ArrayList();
        int offsetForDynamicData = getOffsetForDynamicData() + this.buffer.getInt(position);
        int i10 = this.buffer.getInt(offsetForDynamicData);
        int i11 = offsetForDynamicData + 4;
        int i12 = 0;
        while (i12 < i10) {
            int i13 = this.buffer.getInt(i11 + i12);
            int i14 = i12 + 4;
            arrayList.add(cloneWithOffset(i11 + i14));
            i12 = i14 + i13;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReadableMapBuffer readMapBufferValue(int position) {
        return cloneWithOffset(getOffsetForDynamicData() + this.buffer.getInt(position) + 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String readStringValue(int bufferPosition) {
        int offsetForDynamicData = getOffsetForDynamicData() + this.buffer.getInt(bufferPosition);
        int i10 = this.buffer.getInt(offsetForDynamicData);
        byte[] bArr = new byte[i10];
        this.buffer.position(offsetForDynamicData + 4);
        this.buffer.get(bArr, 0, i10);
        return new String(bArr, C1385d.f8858b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readUnsignedShort-BwKQO78, reason: not valid java name */
    public final short m6readUnsignedShortBwKQO78(int bufferPosition) {
        return z.j(this.buffer.getShort(bufferPosition));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$5(MapBuffer.Entry entry) {
        AbstractC2855l.g(entry, "entry");
        StringBuilder sb = new StringBuilder();
        sb.append(entry.getKey());
        sb.append('=');
        switch (WhenMappings.$EnumSwitchMapping$0[entry.getType().ordinal()]) {
            case 1:
                sb.append(entry.getBooleanValue());
                return sb;
            case 2:
                sb.append(entry.getIntValue());
                return sb;
            case 3:
                sb.append(entry.getLongValue());
                return sb;
            case 4:
                sb.append(entry.getDoubleValue());
                return sb;
            case 5:
                sb.append('\"');
                sb.append(entry.getStringValue());
                sb.append('\"');
                return sb;
            case 6:
                sb.append(entry.getMapBufferValue().toString());
                return sb;
            default:
                throw new C2750m();
        }
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean contains(int key) {
        return getBucketIndexForKey(key) != -1;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public MapBuffer.Entry entryAt(int offset) {
        return new MapBufferEntry(getKeyOffsetForBucketIndex(offset));
    }

    public boolean equals(Object other) {
        if (!(other instanceof ReadableMapBuffer)) {
            return false;
        }
        ByteBuffer byteBuffer = this.buffer;
        ByteBuffer byteBuffer2 = ((ReadableMapBuffer) other).buffer;
        if (byteBuffer == byteBuffer2) {
            return true;
        }
        byteBuffer.rewind();
        byteBuffer2.rewind();
        return AbstractC2855l.b(byteBuffer, byteBuffer2);
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean getBoolean(int key) {
        return readBooleanValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.BOOL));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getCount() {
        return this.count;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public double getDouble(int key) {
        return readDoubleValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.DOUBLE));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getInt(int key) {
        return readIntValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.INT));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getKeyOffset(int key) {
        return getBucketIndexForKey(key);
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public long getLong(int key) {
        return readLongValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.LONG));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public List<ReadableMapBuffer> getMapBufferList(int key) {
        return readMapBufferListValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.MAP));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public String getString(int key) {
        return readStringValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.STRING));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public MapBuffer.DataType getType(int key) {
        int bucketIndexForKey = getBucketIndexForKey(key);
        if (bucketIndexForKey != -1) {
            return readDataType(bucketIndexForKey);
        }
        throw new IllegalArgumentException(("Key not found: " + key).toString());
    }

    public int hashCode() {
        this.buffer.rewind();
        return this.buffer.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<MapBuffer.Entry> iterator() {
        return new AnonymousClass1();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        AbstractC2800q.m0(this, sb, null, null, null, 0, null, new Function1() { // from class: com.facebook.react.common.mapbuffer.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReadableMapBuffer.toString$lambda$5((MapBuffer.Entry) obj);
            }
        }, 62, null);
        sb.append('}');
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public ReadableMapBuffer getMapBuffer(int key) {
        return readMapBufferValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.MAP));
    }
}
