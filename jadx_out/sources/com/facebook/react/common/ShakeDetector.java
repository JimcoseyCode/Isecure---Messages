package com.facebook.react.common;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u00010B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\nJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010)\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010%R\u0016\u0010/\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-¨\u00061"}, d2 = {"Lcom/facebook/react/common/ShakeDetector;", "Landroid/hardware/SensorEventListener;", "Lcom/facebook/react/common/ShakeDetector$ShakeListener;", "shakeListener", PointerEventHelper.POINTER_TYPE_UNKNOWN, "minNumShakes", "<init>", "(Lcom/facebook/react/common/ShakeDetector$ShakeListener;I)V", "Li7/B;", "reset", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "a", PointerEventHelper.POINTER_TYPE_UNKNOWN, "atLeastRequiredForce", "(F)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "timestamp", "recordShake", "(J)V", "currentTimestamp", "maybeDispatchShake", "Landroid/hardware/SensorManager;", "manager", ViewProps.START, "(Landroid/hardware/SensorManager;)V", "stop", "Landroid/hardware/SensorEvent;", "sensorEvent", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "i", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "Lcom/facebook/react/common/ShakeDetector$ShakeListener;", "I", "accelerationX", "F", "accelerationY", "accelerationZ", "sensorManager", "Landroid/hardware/SensorManager;", "lastTimestamp", "J", "numShakes", "lastShakeTimestamp", "ShakeListener", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShakeDetector implements SensorEventListener {
    private float accelerationX;
    private float accelerationY;
    private float accelerationZ;
    private long lastShakeTimestamp;
    private long lastTimestamp;
    private final int minNumShakes;
    private int numShakes;
    private SensorManager sensorManager;
    private final ShakeListener shakeListener;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/facebook/react/common/ShakeDetector$ShakeListener;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Li7/B;", "onShake", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ShakeListener {
        void onShake();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShakeDetector(ShakeListener shakeListener) {
        this(shakeListener, 0, 2, null);
        AbstractC2855l.g(shakeListener, "shakeListener");
    }

    private final boolean atLeastRequiredForce(float a10) {
        return Math.abs(a10) > 13.042845f;
    }

    private final void maybeDispatchShake(long currentTimestamp) {
        if (this.numShakes >= this.minNumShakes * 8) {
            reset();
            this.shakeListener.onShake();
        }
        if (currentTimestamp - this.lastShakeTimestamp > ShakeDetectorKt.SHAKING_WINDOW_NS) {
            reset();
        }
    }

    private final void recordShake(long timestamp) {
        this.lastShakeTimestamp = timestamp;
        this.numShakes++;
    }

    private final void reset() {
        this.numShakes = 0;
        this.accelerationX = 0.0f;
        this.accelerationY = 0.0f;
        this.accelerationZ = 0.0f;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
        AbstractC2855l.g(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        AbstractC2855l.g(sensorEvent, "sensorEvent");
        if (sensorEvent.timestamp - this.lastTimestamp < ShakeDetectorKt.MIN_TIME_BETWEEN_SAMPLES_NS) {
            return;
        }
        float[] fArr = sensorEvent.values;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2] - 9.80665f;
        this.lastTimestamp = sensorEvent.timestamp;
        if (atLeastRequiredForce(f10) && this.accelerationX * f10 <= 0.0f) {
            recordShake(sensorEvent.timestamp);
            this.accelerationX = f10;
        } else if (atLeastRequiredForce(f11) && this.accelerationY * f11 <= 0.0f) {
            recordShake(sensorEvent.timestamp);
            this.accelerationY = f11;
        } else if (atLeastRequiredForce(f12) && this.accelerationZ * f12 <= 0.0f) {
            recordShake(sensorEvent.timestamp);
            this.accelerationZ = f12;
        }
        maybeDispatchShake(sensorEvent.timestamp);
    }

    public final void start(SensorManager manager) {
        AbstractC2855l.g(manager, "manager");
        Sensor defaultSensor = manager.getDefaultSensor(1);
        if (defaultSensor == null) {
            return;
        }
        this.sensorManager = manager;
        this.lastTimestamp = -1L;
        manager.registerListener(this, defaultSensor, 2);
        this.lastShakeTimestamp = 0L;
        reset();
    }

    public final void stop() {
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        this.sensorManager = null;
    }

    public ShakeDetector(ShakeListener shakeListener, int i10) {
        AbstractC2855l.g(shakeListener, "shakeListener");
        this.shakeListener = shakeListener;
        this.minNumShakes = i10;
    }

    public /* synthetic */ ShakeDetector(ShakeListener shakeListener, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(shakeListener, (i11 & 2) != 0 ? 1 : i10);
    }
}
