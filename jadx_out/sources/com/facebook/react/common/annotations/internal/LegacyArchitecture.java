package com.facebook.react.common.annotations.internal;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\n\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/react/common/annotations/internal/LegacyArchitecture;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "logLevel", "Lcom/facebook/react/common/annotations/internal/LegacyArchitectureLogLevel;", "()Lcom/facebook/react/common/annotations/internal/LegacyArchitectureLogLevel;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public @interface LegacyArchitecture {
    LegacyArchitectureLogLevel logLevel() default LegacyArchitectureLogLevel.WARNING;
}
