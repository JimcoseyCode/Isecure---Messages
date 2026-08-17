package com.canhub.cropper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.canhub.cropper.C1956a;
import com.canhub.cropper.C1957b;
import com.canhub.cropper.CropOverlayView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2735B;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 «\u00022\u00020\u00012\u00020\u0002:\f=\u001f[W^q7\u0019!X\u0014vB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u0012\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010\"\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010\u0015J\u000f\u0010#\u001a\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010\u0015J\u0017\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0016¢\u0006\u0004\b(\u0010&J\u0015\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0016¢\u0006\u0004\b*\u0010&J\u0015\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0016¢\u0006\u0004\b,\u0010&J\u0015\u0010/\u001a\u00020\u00112\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u001b¢\u0006\u0004\b2\u00103J/\u00107\u001a\u0004\u0018\u00010\t2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u000206H\u0007¢\u0006\u0004\b7\u00108JK\u0010=\u001a\u00020\u00112\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u0002062\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010C¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010F¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010I¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010L¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\u00112\b\u0010Q\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bR\u0010SJ\u0015\u0010U\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\u000b¢\u0006\u0004\bU\u0010VJ\r\u0010W\u001a\u00020\u0011¢\u0006\u0004\bW\u0010\u0015J\r\u0010X\u001a\u00020\u0011¢\u0006\u0004\bX\u0010\u0015J\u0017\u0010[\u001a\u00020\u00112\u0006\u0010Z\u001a\u00020YH\u0000¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\u00112\u0006\u0010Z\u001a\u00020]H\u0000¢\u0006\u0004\b^\u0010_J?\u0010`\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010.\u001a\u0002062\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b`\u0010aJ\u0011\u0010c\u001a\u0004\u0018\u00010bH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u00112\u0006\u0010e\u001a\u00020bH\u0016¢\u0006\u0004\bf\u0010gJ\u001f\u0010j\u001a\u00020\u00112\u0006\u0010h\u001a\u00020\u000b2\u0006\u0010i\u001a\u00020\u000bH\u0014¢\u0006\u0004\bj\u0010kJ7\u0010n\u001a\u00020\u00112\u0006\u0010l\u001a\u00020\u00162\u0006\u0010[\u001a\u00020\u000b2\u0006\u0010m\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\bn\u0010oJ/\u0010t\u001a\u00020\u00112\u0006\u0010p\u001a\u00020\u000b2\u0006\u0010q\u001a\u00020\u000b2\u0006\u0010r\u001a\u00020\u000b2\u0006\u0010s\u001a\u00020\u000bH\u0014¢\u0006\u0004\bt\u0010uJ\u0017\u0010v\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\bv\u0010&R\u0014\u0010y\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010xR\u0016\u0010|\u001a\u0004\u0018\u00010z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010{R\u0014\u0010\u007f\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010~R\u0015\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010~R\u0017\u0010\u0083\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b^\u0010\u0082\u0001R\u0017\u0010\u0086\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b[\u0010\u0085\u0001R\u0017\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bU\u0010\u0085\u0001R\u001b\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0012\u0010\u0089\u0001R\u001a\u0010\u008c\u0001\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010\u008b\u0001R\u0018\u0010\u008e\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010\u008d\u0001R\u0018\u0010\u008f\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b`\u0010\u008d\u0001R\u0018\u0010\u0091\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b%\u0010\u0090\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0090\u0001R\u0018\u0010\u0094\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bm\u0010\u008d\u0001R\u0019\u0010\u0096\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u008d\u0001R\u0019\u0010\u0098\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u008d\u0001R\u0019\u0010\u009b\u0001\u001a\u00030\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bp\u0010\u009a\u0001R/\u0010\u009d\u0001\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0006\b\u009c\u0001\u0010\u0090\u0001\u0012\u0005\b \u0001\u0010\u0015\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0005\b\u009f\u0001\u0010&R\u0019\u0010¢\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u0090\u0001R\u0019\u0010¤\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u0090\u0001R\u001a\u0010¨\u0001\u001a\u00030¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0019\u0010«\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0019\u0010\u00ad\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u008d\u0001R\u0019\u0010¯\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010\u0090\u0001R\u0019\u0010±\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010\u0090\u0001R\u0019\u0010²\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u008d\u0001R\u001b\u0010µ\u0001\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u001b\u0010¸\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R-\u0010\u000e\u001a\u0004\u0018\u00010\r2\t\u0010¹\u0001\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001R\u0019\u0010¾\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010\u008d\u0001R\u0019\u0010À\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010ª\u0001R\u0019\u0010Â\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010ª\u0001R\u0019\u0010Ä\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010ª\u0001R\u001c\u0010È\u0001\u001a\u0005\u0018\u00010Å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0019\u0010Ê\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010\u008d\u0001R\u0019\u0010Ì\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010\u0090\u0001R#\u0010Ñ\u0001\u001a\f\u0012\u0005\u0012\u00030Î\u0001\u0018\u00010Í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R#\u0010Ô\u0001\u001a\f\u0012\u0005\u0012\u00030Ò\u0001\u0018\u00010Í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ð\u0001R)\u0010<\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÕ\u0001\u0010º\u0001\u001a\u0006\bÖ\u0001\u0010¼\u0001\"\u0005\b×\u0001\u0010SR,\u0010Ø\u0001\u001a\u00030\u0099\u00012\b\u0010Ø\u0001\u001a\u00030\u0099\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R0\u0010Þ\u0001\u001a\u0005\u0018\u00010Ý\u00012\n\u0010Þ\u0001\u001a\u0005\u0018\u00010Ý\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R0\u0010ä\u0001\u001a\u0005\u0018\u00010ã\u00012\n\u0010ä\u0001\u001a\u0005\u0018\u00010ã\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bå\u0001\u0010æ\u0001\"\u0006\bç\u0001\u0010è\u0001R)\u0010ê\u0001\u001a\u00020\u00162\u0007\u0010é\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bê\u0001\u0010\u009e\u0001\"\u0005\bë\u0001\u0010&R)\u0010ì\u0001\u001a\u00020\u000b2\u0007\u0010ì\u0001\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bí\u0001\u0010î\u0001\"\u0005\bï\u0001\u0010VR(\u0010ò\u0001\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bð\u0001\u0010î\u0001\"\u0005\bñ\u0001\u0010VR)\u0010ô\u0001\u001a\u00020\u00162\u0007\u0010ó\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bô\u0001\u0010\u009e\u0001\"\u0005\bõ\u0001\u0010&R)\u0010÷\u0001\u001a\u00020\u00162\u0007\u0010ö\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b÷\u0001\u0010\u009e\u0001\"\u0005\bø\u0001\u0010&R0\u0010ú\u0001\u001a\u0005\u0018\u00010ù\u00012\n\u0010ú\u0001\u001a\u0005\u0018\u00010ù\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bû\u0001\u0010ü\u0001\"\u0006\bý\u0001\u0010þ\u0001R!\u0010\u0082\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0ÿ\u00018F¢\u0006\b\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002R)\u0010\u0084\u0002\u001a\u00020\u00162\u0007\u0010\u0083\u0002\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0084\u0002\u0010\u009e\u0001\"\u0005\b\u0085\u0002\u0010&R)\u0010\u0087\u0002\u001a\u00020\u00162\u0007\u0010\u0086\u0002\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0087\u0002\u0010\u009e\u0001\"\u0005\b\u0088\u0002\u0010&R)\u0010\u008a\u0002\u001a\u00020\u00162\u0007\u0010\u0089\u0002\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u008a\u0002\u0010\u009e\u0001\"\u0005\b\u008b\u0002\u0010&R,\u0010\u008c\u0002\u001a\u00030¥\u00012\b\u0010\u008c\u0002\u001a\u00030¥\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002\"\u0006\b\u008f\u0002\u0010\u0090\u0002R)\u0010\u0095\u0002\u001a\u00020\u001b2\u0007\u0010\u0091\u0002\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002\"\u0005\b\u0094\u0002\u00103R)\u0010\u0096\u0002\u001a\u00020\u000b2\u0007\u0010\u0096\u0002\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0097\u0002\u0010î\u0001\"\u0005\b\u0098\u0002\u0010VR(\u0010\f\u001a\u00020\u000b2\u0007\u0010\u0099\u0002\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u009a\u0002\u0010î\u0001\"\u0005\b\u009b\u0002\u0010VR\u0017\u0010\u009f\u0002\u001a\u0005\u0018\u00010\u009c\u00028F¢\u0006\b\u001a\u0006\b\u009d\u0002\u0010\u009e\u0002R0\u0010¤\u0002\u001a\u0005\u0018\u00010\u009c\u00022\n\u0010 \u0002\u001a\u0005\u0018\u00010\u009c\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¡\u0002\u0010\u009e\u0002\"\u0006\b¢\u0002\u0010£\u0002R\u0017\u0010§\u0002\u001a\u0005\u0018\u00010Å\u00018F¢\u0006\b\u001a\u0006\b¥\u0002\u0010¦\u0002R\u0015\u0010ª\u0002\u001a\u00030\u0084\u00018F¢\u0006\b\u001a\u0006\b¨\u0002\u0010©\u0002¨\u0006¬\u0002"}, d2 = {"Lcom/canhub/cropper/CropImageView;", "Landroid/widget/FrameLayout;", "Lcom/canhub/cropper/CropOverlayView$b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Bitmap;", "bitmap", PointerEventHelper.POINTER_TYPE_UNKNOWN, "imageResource", "Landroid/net/Uri;", "imageUri", "loadSampleSize", "degreesRotated", "Li7/B;", "n", "(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V", "c", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "inProgress", "animate", "i", "(ZZ)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", "height", "center", "b", "(FFZZ)V", "j", "o", "p", "clear", "r", "(Z)V", "multiTouchEnabled", "setMultiTouchEnabled", "centerMoveEnabled", "setCenterMoveEnabled", "fixAspectRatio", "setFixedAspectRatio", "Lcom/canhub/cropper/CropImageOptions;", "options", "setImageCropOptions", "(Lcom/canhub/cropper/CropImageOptions;)V", "snapRadius", "setSnapRadius", "(F)V", "reqWidth", "reqHeight", "Lcom/canhub/cropper/CropImageView$k;", "g", "(IILcom/canhub/cropper/CropImageView$k;)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$CompressFormat;", "saveCompressFormat", "saveCompressQuality", "customOutputUri", "d", "(Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$k;Landroid/net/Uri;)V", "Lcom/canhub/cropper/CropImageView$h;", "listener", "setOnSetCropOverlayReleasedListener", "(Lcom/canhub/cropper/CropImageView$h;)V", "Lcom/canhub/cropper/CropImageView$g;", "setOnSetCropOverlayMovedListener", "(Lcom/canhub/cropper/CropImageView$g;)V", "Lcom/canhub/cropper/CropImageView$i;", "setOnCropWindowChangedListener", "(Lcom/canhub/cropper/CropImageView$i;)V", "Lcom/canhub/cropper/CropImageView$j;", "setOnSetImageUriCompleteListener", "(Lcom/canhub/cropper/CropImageView$j;)V", "Lcom/canhub/cropper/CropImageView$f;", "setOnCropImageCompleteListener", "(Lcom/canhub/cropper/CropImageView$f;)V", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "uri", "setImageUriAsync", "(Landroid/net/Uri;)V", "degrees", "m", "(I)V", "e", "f", "Lcom/canhub/cropper/b$a;", "result", "l", "(Lcom/canhub/cropper/b$a;)V", "Lcom/canhub/cropper/a$a;", "k", "(Lcom/canhub/cropper/a$a;)V", "q", "(IILcom/canhub/cropper/CropImageView$k;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "t", "onLayout", "(ZIIII)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "a", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "imageView", "Lcom/canhub/cropper/CropOverlayView;", "Lcom/canhub/cropper/CropOverlayView;", "mCropOverlayView", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "mImageMatrix", "mImageInverseMatrix", "Landroid/widget/ProgressBar;", "Landroid/widget/ProgressBar;", "mProgressBar", PointerEventHelper.POINTER_TYPE_UNKNOWN, "[F", "mImagePoints", "mScaleImagePoints", "Lcom/canhub/cropper/k;", "Lcom/canhub/cropper/k;", "mAnimation", "Landroid/graphics/Bitmap;", "originalBitmap", "I", "mInitialDegreesRotated", "mDegreesRotated", "Z", "mFlipHorizontally", "s", "mFlipVertically", "mLayoutWidth", "u", "mLayoutHeight", "v", "mImageResource", "Lcom/canhub/cropper/CropImageView$l;", "Lcom/canhub/cropper/CropImageView$l;", "mScaleType", "x", "isSaveBitmapToInstanceState", "()Z", "setSaveBitmapToInstanceState", "isSaveBitmapToInstanceState$annotations", "y", "mShowCropOverlay", "z", "mShowCropLabel", PointerEventHelper.POINTER_TYPE_UNKNOWN, "A", "Ljava/lang/String;", "mCropTextLabel", "B", "F", "mCropLabelTextSize", "C", "mCropLabelTextColor", "D", "mShowProgressBar", "E", "mAutoZoomEnabled", "mMaxZoom", "G", "Lcom/canhub/cropper/CropImageView$j;", "mOnSetImageUriCompleteListener", "H", "Lcom/canhub/cropper/CropImageView$f;", "mOnCropImageCompleteListener", "value", "Landroid/net/Uri;", "getImageUri", "()Landroid/net/Uri;", "J", "loadedSampleSize", "K", "mZoom", "L", "mZoomOffsetX", "M", "mZoomOffsetY", "Landroid/graphics/RectF;", "N", "Landroid/graphics/RectF;", "mRestoreCropWindowRect", "O", "mRestoreDegreesRotated", "P", "mSizeChanged", "Ljava/lang/ref/WeakReference;", "Lcom/canhub/cropper/b;", "Q", "Ljava/lang/ref/WeakReference;", "bitmapLoadingWorkerJob", "Lcom/canhub/cropper/a;", "R", "bitmapCroppingWorkerJob", "S", "getCustomOutputUri", "setCustomOutputUri", "scaleType", "getScaleType", "()Lcom/canhub/cropper/CropImageView$l;", "setScaleType", "(Lcom/canhub/cropper/CropImageView$l;)V", "Lcom/canhub/cropper/CropImageView$d;", "cropShape", "getCropShape", "()Lcom/canhub/cropper/CropImageView$d;", "setCropShape", "(Lcom/canhub/cropper/CropImageView$d;)V", "Lcom/canhub/cropper/CropImageView$b;", "cornerShape", "getCornerShape", "()Lcom/canhub/cropper/CropImageView$b;", "setCornerShape", "(Lcom/canhub/cropper/CropImageView$b;)V", "autoZoomEnabled", "isAutoZoomEnabled", "setAutoZoomEnabled", "maxZoom", "getMaxZoom", "()I", "setMaxZoom", "getRotatedDegrees", "setRotatedDegrees", "rotatedDegrees", "flipHorizontally", "isFlippedHorizontally", "setFlippedHorizontally", "flipVertically", "isFlippedVertically", "setFlippedVertically", "Lcom/canhub/cropper/CropImageView$e;", "guidelines", "getGuidelines", "()Lcom/canhub/cropper/CropImageView$e;", "setGuidelines", "(Lcom/canhub/cropper/CropImageView$e;)V", "Landroid/util/Pair;", "getAspectRatio", "()Landroid/util/Pair;", ViewProps.ASPECT_RATIO, "showProgressBar", "isShowProgressBar", "setShowProgressBar", "showCropOverlay", "isShowCropOverlay", "setShowCropOverlay", "showCropLabel", "isShowCropLabel", "setShowCropLabel", "cropLabelText", "getCropLabelText", "()Ljava/lang/String;", "setCropLabelText", "(Ljava/lang/String;)V", "textSize", "getCropLabelTextSize", "()F", "setCropLabelTextSize", "cropLabelTextSize", "cropLabelTextColor", "getCropLabelTextColor", "setCropLabelTextColor", "resId", "getImageResource", "setImageResource", "Landroid/graphics/Rect;", "getWholeImageRect", "()Landroid/graphics/Rect;", "wholeImageRect", "rect", "getCropRect", "setCropRect", "(Landroid/graphics/Rect;)V", "cropRect", "getCropWindowRect", "()Landroid/graphics/RectF;", "cropWindowRect", "getCropPoints", "()[F", "cropPoints", "T", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CropImageView extends FrameLayout implements CropOverlayView.b {

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name and from kotlin metadata */
    private String mCropTextLabel;

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private float mCropLabelTextSize;

    /* JADX INFO: renamed from: C, reason: collision with root package name and from kotlin metadata */
    private int mCropLabelTextColor;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean mShowProgressBar;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean mAutoZoomEnabled;

    /* JADX INFO: renamed from: F, reason: collision with root package name and from kotlin metadata */
    private int mMaxZoom;

    /* JADX INFO: renamed from: G, reason: collision with root package name and from kotlin metadata */
    private j mOnSetImageUriCompleteListener;

    /* JADX INFO: renamed from: H, reason: collision with root package name and from kotlin metadata */
    private f mOnCropImageCompleteListener;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private Uri imageUri;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private int loadedSampleSize;

    /* JADX INFO: renamed from: K, reason: collision with root package name and from kotlin metadata */
    private float mZoom;

    /* JADX INFO: renamed from: L, reason: collision with root package name and from kotlin metadata */
    private float mZoomOffsetX;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private float mZoomOffsetY;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private RectF mRestoreCropWindowRect;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int mRestoreDegreesRotated;

    /* JADX INFO: renamed from: P, reason: collision with root package name and from kotlin metadata */
    private boolean mSizeChanged;

    /* JADX INFO: renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private WeakReference bitmapLoadingWorkerJob;

    /* JADX INFO: renamed from: R, reason: collision with root package name and from kotlin metadata */
    private WeakReference bitmapCroppingWorkerJob;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private Uri customOutputUri;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ImageView imageView;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final CropOverlayView mCropOverlayView;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Matrix mImageMatrix;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Matrix mImageInverseMatrix;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ProgressBar mProgressBar;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final float[] mImagePoints;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final float[] mScaleImagePoints;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private com.canhub.cropper.k mAnimation;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Bitmap originalBitmap;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int mInitialDegreesRotated;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int mDegreesRotated;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean mFlipHorizontally;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean mFlipVertically;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int mLayoutWidth;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int mLayoutHeight;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int mImageResource;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private l mScaleType;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean isSaveBitmapToInstanceState;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean mShowCropOverlay;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean mShowCropLabel;

    /* JADX INFO: renamed from: com.canhub.cropper.CropImageView$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(int i10, int i11, int i12) {
            return i10 != Integer.MIN_VALUE ? i10 != 1073741824 ? i12 : i11 : Math.min(i12, i11);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f19455g = new b("RECTANGLE", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f19456h = new b("OVAL", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ b[] f19457i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f19458j;

        static {
            b[] bVarArrH = h();
            f19457i = bVarArrH;
            f19458j = AbstractC3083a.a(bVarArrH);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] h() {
            return new b[]{f19455g, f19456h};
        }

        public static EnumEntries j() {
            return f19458j;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f19457i.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Bitmap f19459g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Uri f19460h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Bitmap f19461i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Uri f19462j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final Exception f19463k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final float[] f19464l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Rect f19465m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Rect f19466n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f19467o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f19468p;

        public c(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] cropPoints, Rect rect, Rect rect2, int i10, int i11) {
            AbstractC2855l.g(cropPoints, "cropPoints");
            this.f19459g = bitmap;
            this.f19460h = uri;
            this.f19461i = bitmap2;
            this.f19462j = uri2;
            this.f19463k = exc;
            this.f19464l = cropPoints;
            this.f19465m = rect;
            this.f19466n = rect2;
            this.f19467o = i10;
            this.f19468p = i11;
        }

        public final float[] a() {
            return this.f19464l;
        }

        public final Rect b() {
            return this.f19465m;
        }

        public final Exception c() {
            return this.f19463k;
        }

        public final Uri d() {
            return this.f19460h;
        }

        public final int e() {
            return this.f19467o;
        }

        public final int f() {
            return this.f19468p;
        }

        public final Uri g() {
            return this.f19462j;
        }

        public final Rect h() {
            return this.f19466n;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f19469g = new d("RECTANGLE", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final d f19470h = new d("OVAL", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final d f19471i = new d("RECTANGLE_VERTICAL_ONLY", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final d f19472j = new d("RECTANGLE_HORIZONTAL_ONLY", 3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ d[] f19473k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f19474l;

        static {
            d[] dVarArrH = h();
            f19473k = dVarArrH;
            f19474l = AbstractC3083a.a(dVarArrH);
        }

        private d(String str, int i10) {
        }

        private static final /* synthetic */ d[] h() {
            return new d[]{f19469g, f19470h, f19471i, f19472j};
        }

        public static EnumEntries j() {
            return f19474l;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f19473k.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class e {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final e f19475g = new e("OFF", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final e f19476h = new e("ON_TOUCH", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final e f19477i = new e("ON", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ e[] f19478j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f19479k;

        static {
            e[] eVarArrH = h();
            f19478j = eVarArrH;
            f19479k = AbstractC3083a.a(eVarArrH);
        }

        private e(String str, int i10) {
        }

        private static final /* synthetic */ e[] h() {
            return new e[]{f19475g, f19476h, f19477i};
        }

        public static EnumEntries j() {
            return f19479k;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f19478j.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface f {
        void onCropImageComplete(CropImageView cropImageView, c cVar);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface g {
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface h {
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface i {
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface j {
        void onSetImageUriComplete(CropImageView cropImageView, Uri uri, Exception exc);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class k {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final k f19480g = new k("NONE", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final k f19481h = new k("SAMPLING", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final k f19482i = new k("RESIZE_INSIDE", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final k f19483j = new k("RESIZE_FIT", 3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final k f19484k = new k("RESIZE_EXACT", 4);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ k[] f19485l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f19486m;

        static {
            k[] kVarArrH = h();
            f19485l = kVarArrH;
            f19486m = AbstractC3083a.a(kVarArrH);
        }

        private k(String str, int i10) {
        }

        private static final /* synthetic */ k[] h() {
            return new k[]{f19480g, f19481h, f19482i, f19483j, f19484k};
        }

        public static k valueOf(String str) {
            return (k) Enum.valueOf(k.class, str);
        }

        public static k[] values() {
            return (k[]) f19485l.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class l {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final l f19487g = new l("FIT_CENTER", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final l f19488h = new l("CENTER", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final l f19489i = new l("CENTER_CROP", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final l f19490j = new l("CENTER_INSIDE", 3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ l[] f19491k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f19492l;

        static {
            l[] lVarArrH = h();
            f19491k = lVarArrH;
            f19492l = AbstractC3083a.a(lVarArrH);
        }

        private l(String str, int i10) {
        }

        private static final /* synthetic */ l[] h() {
            return new l[]{f19487g, f19488h, f19489i, f19490j};
        }

        public static EnumEntries j() {
            return f19492l;
        }

        public static l valueOf(String str) {
            return (l) Enum.valueOf(l.class, str);
        }

        public static l[] values() {
            return (l[]) f19491k.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CropImageView(Context context, AttributeSet attributeSet) {
        CropImageOptions cropImageOptions;
        Intent intent;
        Bundle bundleExtra;
        super(context, attributeSet);
        AbstractC2855l.g(context, "context");
        this.mImageMatrix = new Matrix();
        this.mImageInverseMatrix = new Matrix();
        this.mImagePoints = new float[8];
        this.mScaleImagePoints = new float[8];
        this.mShowCropOverlay = true;
        this.mCropTextLabel = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        this.mCropLabelTextSize = 20.0f;
        this.mCropLabelTextColor = -1;
        this.mShowProgressBar = true;
        this.mAutoZoomEnabled = true;
        this.loadedSampleSize = 1;
        this.mZoom = 1.0f;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (intent = activity.getIntent()) != null && (bundleExtra = intent.getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE")) != null) {
            Parcelable parcelable = bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
            cropImageOptions = (CropImageOptions) (parcelable instanceof CropImageOptions ? parcelable : null);
            if (cropImageOptions == null) {
            }
        } else if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B.f19311a, 0, 0);
            AbstractC2855l.f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            CropImageOptions cropImageOptions2 = new CropImageOptions(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 63, null);
            try {
                this.isSaveBitmapToInstanceState = typedArrayObtainStyledAttributes.getBoolean(B.f19300D, this.isSaveBitmapToInstanceState);
                l lVar = (l) l.j().get(typedArrayObtainStyledAttributes.getInt(B.f19301E, cropImageOptions2.scaleType.ordinal()));
                d dVar = (d) d.j().get(typedArrayObtainStyledAttributes.getInt(B.f19302F, cropImageOptions2.cropShape.ordinal()));
                b bVar = (b) b.j().get(typedArrayObtainStyledAttributes.getInt(B.f19312b, cropImageOptions2.cornerShape.ordinal()));
                e eVar = (e) e.j().get(typedArrayObtainStyledAttributes.getInt(B.f19328r, cropImageOptions2.guidelines.ordinal()));
                int integer = typedArrayObtainStyledAttributes.getInteger(B.f19313c, cropImageOptions2.aspectRatioX);
                int integer2 = typedArrayObtainStyledAttributes.getInteger(B.f19314d, cropImageOptions2.aspectRatioY);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(B.f19315e, cropImageOptions2.autoZoomEnabled);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(B.f19299C, cropImageOptions2.multiTouchEnabled);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(B.f19323m, cropImageOptions2.centerMoveEnabled);
                float dimension = typedArrayObtainStyledAttributes.getDimension(B.f19325o, cropImageOptions2.cropCornerRadius);
                float dimension2 = typedArrayObtainStyledAttributes.getDimension(B.f19306J, cropImageOptions2.snapRadius);
                float dimension3 = typedArrayObtainStyledAttributes.getDimension(B.f19307K, cropImageOptions2.touchRadius);
                float f10 = typedArrayObtainStyledAttributes.getFloat(B.f19331u, cropImageOptions2.initialCropWindowPaddingRatio);
                int integer3 = typedArrayObtainStyledAttributes.getInteger(B.f19324n, cropImageOptions2.circleCornerFillColorHexValue);
                float dimension4 = typedArrayObtainStyledAttributes.getDimension(B.f19322l, cropImageOptions2.borderLineThickness);
                int integer4 = typedArrayObtainStyledAttributes.getInteger(B.f19321k, cropImageOptions2.borderLineColor);
                float dimension5 = typedArrayObtainStyledAttributes.getDimension(B.f19320j, cropImageOptions2.borderCornerThickness);
                float dimension6 = typedArrayObtainStyledAttributes.getDimension(B.f19319i, cropImageOptions2.borderCornerOffset);
                float dimension7 = typedArrayObtainStyledAttributes.getDimension(B.f19318h, cropImageOptions2.borderCornerLength);
                int integer5 = typedArrayObtainStyledAttributes.getInteger(B.f19317g, cropImageOptions2.borderCornerColor);
                float dimension8 = typedArrayObtainStyledAttributes.getDimension(B.f19330t, cropImageOptions2.guidelinesThickness);
                int integer6 = typedArrayObtainStyledAttributes.getInteger(B.f19329s, cropImageOptions2.guidelinesColor);
                int integer7 = typedArrayObtainStyledAttributes.getInteger(B.f19316f, cropImageOptions2.backgroundColor);
                int dimension9 = (int) typedArrayObtainStyledAttributes.getDimension(B.f19298B, cropImageOptions2.minCropWindowWidth);
                int dimension10 = (int) typedArrayObtainStyledAttributes.getDimension(B.f19297A, cropImageOptions2.minCropWindowHeight);
                int i10 = (int) typedArrayObtainStyledAttributes.getFloat(B.f19336z, cropImageOptions2.minCropResultWidth);
                int i11 = (int) typedArrayObtainStyledAttributes.getFloat(B.f19335y, cropImageOptions2.minCropResultHeight);
                int i12 = (int) typedArrayObtainStyledAttributes.getFloat(B.f19333w, cropImageOptions2.maxCropResultWidth);
                int i13 = (int) typedArrayObtainStyledAttributes.getFloat(B.f19332v, cropImageOptions2.maxCropResultHeight);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(B.f19327q, cropImageOptions2.flipHorizontally);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(B.f19327q, cropImageOptions2.flipVertically);
                float dimension11 = typedArrayObtainStyledAttributes.getDimension(B.f19310N, cropImageOptions2.cropperLabelTextSize);
                int integer8 = typedArrayObtainStyledAttributes.getInteger(B.f19309M, cropImageOptions2.cropperLabelTextColor);
                CropImageOptions cropImageOptions3 = new CropImageOptions(false, false, dVar, bVar, dimension, dimension2, dimension3, eVar, lVar, typedArrayObtainStyledAttributes.getBoolean(B.f19303G, cropImageOptions2.showCropOverlay), typedArrayObtainStyledAttributes.getBoolean(B.f19304H, cropImageOptions2.showCropLabel), typedArrayObtainStyledAttributes.getBoolean(B.f19305I, cropImageOptions2.showProgressBar), 0, z10, z11, z12, false, typedArrayObtainStyledAttributes.getInteger(B.f19334x, cropImageOptions2.maxZoom), f10, typedArrayObtainStyledAttributes.getBoolean(B.f19326p, cropImageOptions2.fixAspectRatio) || (typedArrayObtainStyledAttributes.hasValue(B.f19313c) && typedArrayObtainStyledAttributes.hasValue(B.f19313c)), integer, integer2, dimension4, integer4, dimension5, dimension6, dimension7, integer5, integer3, dimension8, integer6, integer7, dimension9, dimension10, i10, i11, i12, i13, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, z13, z14, null, 0, false, false, null, null, dimension11, integer8, typedArrayObtainStyledAttributes.getString(B.f19308L), 0, null, null, null, null, 69635, 1061158848, 62, null);
                typedArrayObtainStyledAttributes.recycle();
                cropImageOptions = cropImageOptions3;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            cropImageOptions = new CropImageOptions(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 63, null);
        }
        this.mScaleType = cropImageOptions.scaleType;
        this.mAutoZoomEnabled = cropImageOptions.autoZoomEnabled;
        this.mMaxZoom = cropImageOptions.maxZoom;
        this.mCropLabelTextSize = cropImageOptions.cropperLabelTextSize;
        this.mShowCropLabel = cropImageOptions.showCropLabel;
        this.mShowCropOverlay = cropImageOptions.showCropOverlay;
        this.mShowProgressBar = cropImageOptions.showProgressBar;
        this.mFlipHorizontally = cropImageOptions.flipHorizontally;
        this.mFlipVertically = cropImageOptions.flipVertically;
        View viewInflate = LayoutInflater.from(context).inflate(y.f19674b, (ViewGroup) this, true);
        ImageView imageView = (ImageView) viewInflate.findViewById(x.f19666c);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        CropOverlayView cropOverlayView = (CropOverlayView) viewInflate.findViewById(x.f19664a);
        this.mCropOverlayView = cropOverlayView;
        cropOverlayView.setCropWindowChangeListener(this);
        cropOverlayView.setInitialAttributeValues(cropImageOptions);
        ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(x.f19665b);
        this.mProgressBar = progressBar;
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(cropImageOptions.progressBarColor));
        p();
    }

    private final void b(float width, float height, boolean center, boolean animate) {
        if (this.originalBitmap != null) {
            if (width <= 0.0f || height <= 0.0f) {
                return;
            }
            this.mImageMatrix.invert(this.mImageInverseMatrix);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            AbstractC2855l.d(cropOverlayView);
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            this.mImageInverseMatrix.mapRect(cropWindowRect);
            this.mImageMatrix.reset();
            float f10 = 2;
            this.mImageMatrix.postTranslate((width - r0.getWidth()) / f10, (height - r0.getHeight()) / f10);
            j();
            int i10 = this.mDegreesRotated;
            if (i10 > 0) {
                com.canhub.cropper.d dVar = com.canhub.cropper.d.f19592a;
                this.mImageMatrix.postRotate(i10, dVar.w(this.mImagePoints), dVar.x(this.mImagePoints));
                j();
            }
            com.canhub.cropper.d dVar2 = com.canhub.cropper.d.f19592a;
            float fMin = Math.min(width / dVar2.D(this.mImagePoints), height / dVar2.z(this.mImagePoints));
            l lVar = this.mScaleType;
            if (lVar == l.f19487g || ((lVar == l.f19490j && fMin < 1.0f) || (fMin > 1.0f && this.mAutoZoomEnabled))) {
                this.mImageMatrix.postScale(fMin, fMin, dVar2.w(this.mImagePoints), dVar2.x(this.mImagePoints));
                j();
            } else if (lVar == l.f19489i) {
                this.mZoom = Math.max(getWidth() / dVar2.D(this.mImagePoints), getHeight() / dVar2.z(this.mImagePoints));
            }
            float f11 = this.mFlipHorizontally ? -this.mZoom : this.mZoom;
            float f12 = this.mFlipVertically ? -this.mZoom : this.mZoom;
            this.mImageMatrix.postScale(f11, f12, dVar2.w(this.mImagePoints), dVar2.x(this.mImagePoints));
            j();
            this.mImageMatrix.mapRect(cropWindowRect);
            if (this.mScaleType == l.f19489i && center && !animate) {
                this.mZoomOffsetX = 0.0f;
                this.mZoomOffsetY = 0.0f;
            } else if (center) {
                this.mZoomOffsetX = width > dVar2.D(this.mImagePoints) ? 0.0f : Math.max(Math.min((width / f10) - cropWindowRect.centerX(), -dVar2.A(this.mImagePoints)), getWidth() - dVar2.B(this.mImagePoints)) / f11;
                this.mZoomOffsetY = height <= dVar2.z(this.mImagePoints) ? Math.max(Math.min((height / f10) - cropWindowRect.centerY(), -dVar2.C(this.mImagePoints)), getHeight() - dVar2.v(this.mImagePoints)) / f12 : 0.0f;
            } else {
                this.mZoomOffsetX = Math.min(Math.max(this.mZoomOffsetX * f11, -cropWindowRect.left), (-cropWindowRect.right) + width) / f11;
                this.mZoomOffsetY = Math.min(Math.max(this.mZoomOffsetY * f12, -cropWindowRect.top), (-cropWindowRect.bottom) + height) / f12;
            }
            this.mImageMatrix.postTranslate(this.mZoomOffsetX * f11, this.mZoomOffsetY * f12);
            cropWindowRect.offset(this.mZoomOffsetX * f11, this.mZoomOffsetY * f12);
            this.mCropOverlayView.setCropWindowRect(cropWindowRect);
            j();
            this.mCropOverlayView.invalidate();
            if (animate) {
                com.canhub.cropper.k kVar = this.mAnimation;
                AbstractC2855l.d(kVar);
                kVar.a(this.mImagePoints, this.mImageMatrix);
                this.imageView.startAnimation(this.mAnimation);
            } else {
                this.imageView.setImageMatrix(this.mImageMatrix);
            }
            r(false);
        }
    }

    private final void c() {
        Bitmap bitmap = this.originalBitmap;
        if (bitmap != null && (this.mImageResource > 0 || this.imageUri != null)) {
            AbstractC2855l.d(bitmap);
            bitmap.recycle();
        }
        this.originalBitmap = null;
        this.mImageResource = 0;
        this.imageUri = null;
        this.loadedSampleSize = 1;
        this.mDegreesRotated = 0;
        this.mZoom = 1.0f;
        this.mZoomOffsetX = 0.0f;
        this.mZoomOffsetY = 0.0f;
        this.mImageMatrix.reset();
        this.mRestoreCropWindowRect = null;
        this.mRestoreDegreesRotated = 0;
        this.imageView.setImageBitmap(null);
        o();
    }

    public static /* synthetic */ Bitmap h(CropImageView cropImageView, int i10, int i11, k kVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            kVar = k.f19482i;
        }
        return cropImageView.g(i10, i11, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void i(boolean inProgress, boolean animate) {
        float fMin;
        int width = getWidth();
        int height = getHeight();
        if (this.originalBitmap == null || width <= 0 || height <= 0) {
            return;
        }
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        AbstractC2855l.d(cropOverlayView);
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        if (inProgress) {
            if (cropWindowRect.left < 0.0f || cropWindowRect.top < 0.0f || cropWindowRect.right > width || cropWindowRect.bottom > height) {
                b(width, height, false, false);
                return;
            }
            return;
        }
        if (this.mAutoZoomEnabled || this.mZoom > 1.0f) {
            if (this.mZoom < this.mMaxZoom) {
                float f10 = width;
                if (cropWindowRect.width() < f10 * 0.5f) {
                    float f11 = height;
                    fMin = cropWindowRect.height() < 0.5f * f11 ? Math.min(this.mMaxZoom, Math.min(f10 / ((cropWindowRect.width() / this.mZoom) / 0.64f), f11 / ((cropWindowRect.height() / this.mZoom) / 0.64f))) : 0.0f;
                }
            }
            if (this.mZoom > 1.0f) {
                float f12 = width;
                if (cropWindowRect.width() > f12 * 0.65f || cropWindowRect.height() > height * 0.65f) {
                    fMin = Math.max(1.0f, Math.min(f12 / ((cropWindowRect.width() / this.mZoom) / 0.51f), height / ((cropWindowRect.height() / this.mZoom) / 0.51f)));
                }
            }
            float f13 = this.mAutoZoomEnabled ? fMin : 1.0f;
            if (f13 <= 0.0f || f13 == this.mZoom) {
                return;
            }
            if (animate) {
                if (this.mAnimation == null) {
                    this.mAnimation = new com.canhub.cropper.k(this.imageView, this.mCropOverlayView);
                }
                com.canhub.cropper.k kVar = this.mAnimation;
                AbstractC2855l.d(kVar);
                kVar.b(this.mImagePoints, this.mImageMatrix);
            }
            this.mZoom = f13;
            b(width, height, true, animate);
        }
    }

    private final void j() {
        float[] fArr = this.mImagePoints;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        AbstractC2855l.d(this.originalBitmap);
        fArr[2] = r4.getWidth();
        float[] fArr2 = this.mImagePoints;
        fArr2[3] = 0.0f;
        AbstractC2855l.d(this.originalBitmap);
        fArr2[4] = r6.getWidth();
        float[] fArr3 = this.mImagePoints;
        AbstractC2855l.d(this.originalBitmap);
        fArr3[5] = r6.getHeight();
        float[] fArr4 = this.mImagePoints;
        fArr4[6] = 0.0f;
        AbstractC2855l.d(this.originalBitmap);
        fArr4[7] = r9.getHeight();
        this.mImageMatrix.mapPoints(this.mImagePoints);
        float[] fArr5 = this.mScaleImagePoints;
        fArr5[0] = 0.0f;
        fArr5[1] = 0.0f;
        fArr5[2] = 100.0f;
        fArr5[3] = 0.0f;
        fArr5[4] = 100.0f;
        fArr5[5] = 100.0f;
        fArr5[6] = 0.0f;
        fArr5[7] = 100.0f;
        this.mImageMatrix.mapPoints(fArr5);
    }

    private final void n(Bitmap bitmap, int imageResource, Uri imageUri, int loadSampleSize, int degreesRotated) {
        Bitmap bitmap2 = this.originalBitmap;
        if (bitmap2 == null || !AbstractC2855l.b(bitmap2, bitmap)) {
            c();
            this.originalBitmap = bitmap;
            this.imageView.setImageBitmap(bitmap);
            this.imageUri = imageUri;
            this.mImageResource = imageResource;
            this.loadedSampleSize = loadSampleSize;
            this.mDegreesRotated = degreesRotated;
            b(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            if (cropOverlayView != null) {
                cropOverlayView.t();
                o();
            }
        }
    }

    private final void o() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.mShowCropOverlay || this.originalBitmap == null) ? 4 : 0);
        }
    }

    private final void p() {
        this.mProgressBar.setVisibility(this.mShowProgressBar && ((this.originalBitmap == null && this.bitmapLoadingWorkerJob != null) || this.bitmapCroppingWorkerJob != null) ? 0 : 4);
    }

    private final void r(boolean clear) {
        if (this.originalBitmap != null && !clear) {
            com.canhub.cropper.d dVar = com.canhub.cropper.d.f19592a;
            float fD = (this.loadedSampleSize * 100.0f) / dVar.D(this.mScaleImagePoints);
            float fZ = (this.loadedSampleSize * 100.0f) / dVar.z(this.mScaleImagePoints);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            AbstractC2855l.d(cropOverlayView);
            cropOverlayView.w(getWidth(), getHeight(), fD, fZ);
        }
        CropOverlayView cropOverlayView2 = this.mCropOverlayView;
        AbstractC2855l.d(cropOverlayView2);
        cropOverlayView2.u(clear ? null : this.mImagePoints, getWidth(), getHeight());
    }

    @Override // com.canhub.cropper.CropOverlayView.b
    public void a(boolean inProgress) {
        i(inProgress, true);
    }

    public final void d(Bitmap.CompressFormat saveCompressFormat, int saveCompressQuality, int reqWidth, int reqHeight, k options, Uri customOutputUri) {
        AbstractC2855l.g(saveCompressFormat, "saveCompressFormat");
        AbstractC2855l.g(options, "options");
        if (this.mOnCropImageCompleteListener == null) {
            throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
        }
        q(reqWidth, reqHeight, options, saveCompressFormat, saveCompressQuality, customOutputUri);
    }

    public final void e() {
        this.mFlipHorizontally = !this.mFlipHorizontally;
        b(getWidth(), getHeight(), true, false);
    }

    public final void f() {
        this.mFlipVertically = !this.mFlipVertically;
        b(getWidth(), getHeight(), true, false);
    }

    public final Bitmap g(int reqWidth, int reqHeight, k options) {
        int i10;
        Bitmap bitmapA;
        AbstractC2855l.g(options, "options");
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            return null;
        }
        k kVar = k.f19480g;
        int i11 = options != kVar ? reqWidth : 0;
        int i12 = options != kVar ? reqHeight : 0;
        if (this.imageUri == null || (this.loadedSampleSize <= 1 && options != k.f19481h)) {
            i10 = i12;
            com.canhub.cropper.d dVar = com.canhub.cropper.d.f19592a;
            float[] cropPoints = getCropPoints();
            int i13 = this.mDegreesRotated;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            AbstractC2855l.d(cropOverlayView);
            bitmapA = dVar.g(bitmap, cropPoints, i13, cropOverlayView.getIsFixAspectRatio(), this.mCropOverlayView.getMAspectRatioX(), this.mCropOverlayView.getMAspectRatioY(), this.mFlipHorizontally, this.mFlipVertically).a();
        } else {
            com.canhub.cropper.d dVar2 = com.canhub.cropper.d.f19592a;
            Context context = getContext();
            AbstractC2855l.f(context, "getContext(...)");
            Uri uri = this.imageUri;
            float[] cropPoints2 = getCropPoints();
            int i14 = this.mDegreesRotated;
            Bitmap bitmap2 = this.originalBitmap;
            AbstractC2855l.d(bitmap2);
            int width = bitmap2.getWidth() * this.loadedSampleSize;
            Bitmap bitmap3 = this.originalBitmap;
            AbstractC2855l.d(bitmap3);
            int height = bitmap3.getHeight() * this.loadedSampleSize;
            CropOverlayView cropOverlayView2 = this.mCropOverlayView;
            AbstractC2855l.d(cropOverlayView2);
            i10 = i12;
            bitmapA = dVar2.d(context, uri, cropPoints2, i14, width, height, cropOverlayView2.getIsFixAspectRatio(), this.mCropOverlayView.getMAspectRatioX(), this.mCropOverlayView.getMAspectRatioY(), i11, i12, this.mFlipHorizontally, this.mFlipVertically).a();
        }
        return com.canhub.cropper.d.f19592a.G(bitmapA, i11, i10, options);
    }

    public final Pair<Integer, Integer> getAspectRatio() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        AbstractC2855l.d(cropOverlayView);
        return new Pair<>(Integer.valueOf(cropOverlayView.getMAspectRatioX()), Integer.valueOf(this.mCropOverlayView.getMAspectRatioY()));
    }

    public final b getCornerShape() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        AbstractC2855l.d(cropOverlayView);
        return cropOverlayView.getCornerShape();
    }

    /* JADX INFO: renamed from: getCropLabelText, reason: from getter */
    public final String getMCropTextLabel() {
        return this.mCropTextLabel;
    }

    /* JADX INFO: renamed from: getCropLabelTextColor, reason: from getter */
    public final int getMCropLabelTextColor() {
        return this.mCropLabelTextColor;
    }

    /* JADX INFO: renamed from: getCropLabelTextSize, reason: from getter */
    public final float getMCropLabelTextSize() {
        return this.mCropLabelTextSize;
    }

    public final float[] getCropPoints() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        AbstractC2855l.d(cropOverlayView);
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        float f10 = cropWindowRect.left;
        float f11 = cropWindowRect.top;
        float f12 = cropWindowRect.right;
        float f13 = cropWindowRect.bottom;
        float[] fArr = {f10, f11, f12, f11, f12, f13, f10, f13};
        this.mImageMatrix.invert(this.mImageInverseMatrix);
        this.mImageInverseMatrix.mapPoints(fArr);
        float[] fArr2 = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            fArr2[i10] = fArr[i10] * this.loadedSampleSize;
        }
        return fArr2;
    }

    public final Rect getCropRect() {
        int i10 = this.loadedSampleSize;
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i10;
        int height = bitmap.getHeight() * i10;
        com.canhub.cropper.d dVar = com.canhub.cropper.d.f19592a;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        AbstractC2855l.d(cropOverlayView);
        return dVar.y(cropPoints, width, height, cropOverlayView.getIsFixAspectRatio(), this.mCropOverlayView.getMAspectRatioX(), this.mCropOverlayView.getMAspectRatioY());
    }

    public final d getCropShape() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        AbstractC2855l.d(cropOverlayView);
        return cropOverlayView.getCropShape();
    }

    public final RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            return cropOverlayView.getCropWindowRect();
        }
        return null;
    }

    public final Bitmap getCroppedImage() {
        return h(this, 0, 0, null, 7, null);
    }

    public final Uri getCustomOutputUri() {
        return this.customOutputUri;
    }

    public final e getGuidelines() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        AbstractC2855l.d(cropOverlayView);
        return cropOverlayView.getGuidelines();
    }

    /* JADX INFO: renamed from: getImageResource, reason: from getter */
    public final int getMImageResource() {
        return this.mImageResource;
    }

    public final Uri getImageUri() {
        return this.imageUri;
    }

    /* JADX INFO: renamed from: getMaxZoom, reason: from getter */
    public final int getMMaxZoom() {
        return this.mMaxZoom;
    }

    /* JADX INFO: renamed from: getRotatedDegrees, reason: from getter */
    public final int getMDegreesRotated() {
        return this.mDegreesRotated;
    }

    /* JADX INFO: renamed from: getScaleType, reason: from getter */
    public final l getMScaleType() {
        return this.mScaleType;
    }

    public final Rect getWholeImageRect() {
        int i10 = this.loadedSampleSize;
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i10, bitmap.getHeight() * i10);
    }

    public final void k(C1956a.C0206a result) {
        AbstractC2855l.g(result, "result");
        this.bitmapCroppingWorkerJob = null;
        p();
        f fVar = this.mOnCropImageCompleteListener;
        if (fVar != null) {
            fVar.onCropImageComplete(this, new c(this.originalBitmap, this.imageUri, result.a(), result.d(), result.b(), getCropPoints(), getCropRect(), getWholeImageRect(), getMDegreesRotated(), result.c()));
        }
    }

    public final void l(C1957b.a result) {
        CropImageView cropImageView;
        AbstractC2855l.g(result, "result");
        this.bitmapLoadingWorkerJob = null;
        p();
        if (result.c() == null) {
            this.mInitialDegreesRotated = result.b();
            this.mFlipHorizontally = result.d();
            this.mFlipVertically = result.e();
            cropImageView = this;
            cropImageView.n(result.a(), 0, result.g(), result.f(), result.b());
        } else {
            cropImageView = this;
        }
        j jVar = cropImageView.mOnSetImageUriCompleteListener;
        if (jVar != null) {
            jVar.onSetImageUriComplete(this, result.g(), result.c());
        }
    }

    public final void m(int degrees) {
        if (this.originalBitmap != null) {
            int i10 = degrees < 0 ? (degrees % 360) + 360 : degrees % 360;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            AbstractC2855l.d(cropOverlayView);
            boolean z10 = !cropOverlayView.getIsFixAspectRatio() && ((46 <= i10 && i10 < 135) || (216 <= i10 && i10 < 305));
            com.canhub.cropper.d dVar = com.canhub.cropper.d.f19592a;
            dVar.u().set(this.mCropOverlayView.getCropWindowRect());
            RectF rectFU = dVar.u();
            float fHeight = (z10 ? rectFU.height() : rectFU.width()) / 2.0f;
            RectF rectFU2 = dVar.u();
            float fWidth = (z10 ? rectFU2.width() : rectFU2.height()) / 2.0f;
            if (z10) {
                boolean z11 = this.mFlipHorizontally;
                this.mFlipHorizontally = this.mFlipVertically;
                this.mFlipVertically = z11;
            }
            this.mImageMatrix.invert(this.mImageInverseMatrix);
            dVar.s()[0] = dVar.u().centerX();
            dVar.s()[1] = dVar.u().centerY();
            dVar.s()[2] = 0.0f;
            dVar.s()[3] = 0.0f;
            dVar.s()[4] = 1.0f;
            dVar.s()[5] = 0.0f;
            this.mImageInverseMatrix.mapPoints(dVar.s());
            this.mDegreesRotated = (this.mDegreesRotated + i10) % 360;
            b(getWidth(), getHeight(), true, false);
            this.mImageMatrix.mapPoints(dVar.t(), dVar.s());
            float fSqrt = this.mZoom / ((float) Math.sqrt(Math.pow(dVar.t()[4] - dVar.t()[2], 2.0d) + Math.pow(dVar.t()[5] - dVar.t()[3], 2.0d)));
            this.mZoom = fSqrt;
            this.mZoom = Math.max(fSqrt, 1.0f);
            b(getWidth(), getHeight(), true, false);
            this.mImageMatrix.mapPoints(dVar.t(), dVar.s());
            float fSqrt2 = (float) Math.sqrt(Math.pow(dVar.t()[4] - dVar.t()[2], 2.0d) + Math.pow(dVar.t()[5] - dVar.t()[3], 2.0d));
            float f10 = fHeight * fSqrt2;
            float f11 = fWidth * fSqrt2;
            dVar.u().set(dVar.t()[0] - f10, dVar.t()[1] - f11, dVar.t()[0] + f10, dVar.t()[1] + f11);
            this.mCropOverlayView.t();
            this.mCropOverlayView.setCropWindowRect(dVar.u());
            b(getWidth(), getHeight(), true, false);
            i(false, false);
            this.mCropOverlayView.m();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
        super.onLayout(changed, l10, t10, r10, b10);
        if (this.mLayoutWidth <= 0 || this.mLayoutHeight <= 0) {
            r(true);
            return;
        }
        if (this.originalBitmap == null) {
            r(true);
            return;
        }
        float f10 = r10 - l10;
        float f11 = b10 - t10;
        b(f10, f11, true, false);
        RectF rectF = this.mRestoreCropWindowRect;
        if (rectF == null) {
            if (this.mSizeChanged) {
                this.mSizeChanged = false;
                i(false, false);
                return;
            }
            return;
        }
        int i10 = this.mRestoreDegreesRotated;
        if (i10 != this.mInitialDegreesRotated) {
            this.mDegreesRotated = i10;
            b(f10, f11, true, false);
            this.mRestoreDegreesRotated = 0;
        }
        this.mImageMatrix.mapRect(this.mRestoreCropWindowRect);
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropWindowRect(rectF);
        }
        i(false, false);
        CropOverlayView cropOverlayView2 = this.mCropOverlayView;
        if (cropOverlayView2 != null) {
            cropOverlayView2.m();
        }
        this.mRestoreCropWindowRect = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width;
        int height;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (size2 == 0) {
            size2 = bitmap.getHeight();
        }
        double width2 = size < bitmap.getWidth() ? ((double) size) / ((double) bitmap.getWidth()) : Double.POSITIVE_INFINITY;
        double height2 = size2 < bitmap.getHeight() ? ((double) size2) / ((double) bitmap.getHeight()) : Double.POSITIVE_INFINITY;
        if (width2 == Double.POSITIVE_INFINITY && height2 == Double.POSITIVE_INFINITY) {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        } else if (width2 <= height2) {
            height = (int) (((double) bitmap.getHeight()) * width2);
            width = size;
        } else {
            width = (int) (((double) bitmap.getWidth()) * height2);
            height = size2;
        }
        Companion companion = INSTANCE;
        int iA = companion.a(mode, size, width);
        int iA2 = companion.a(mode2, size2, height);
        this.mLayoutWidth = iA;
        this.mLayoutHeight = iA2;
        setMeasuredDimension(iA, iA2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onRestoreInstanceState(Parcelable state) {
        CropImageView cropImageView;
        Bitmap bitmap;
        AbstractC2855l.g(state, "state");
        if (!(state instanceof Bundle)) {
            super.onRestoreInstanceState(state);
            return;
        }
        if (this.bitmapLoadingWorkerJob == null && this.imageUri == null && this.originalBitmap == null && this.mImageResource == 0) {
            Bundle bundle = (Bundle) state;
            Parcelable parcelable = bundle.getParcelable("LOADED_IMAGE_URI");
            if (!(parcelable instanceof Uri)) {
                parcelable = null;
            }
            Uri uri = (Uri) parcelable;
            if (uri != null) {
                String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                if (string == null) {
                    cropImageView = this;
                    if (cropImageView.imageUri == null) {
                        setImageUriAsync(uri);
                        C2735B c2735b = C2735B.f28704a;
                    }
                } else {
                    com.canhub.cropper.d dVar = com.canhub.cropper.d.f19592a;
                    Pair pairQ = dVar.q();
                    if (pairQ != null) {
                        bitmap = AbstractC2855l.b(pairQ.first, string) ? (Bitmap) ((WeakReference) pairQ.second).get() : null;
                    } else {
                        bitmap = null;
                    }
                    dVar.I(null);
                    if (bitmap != null && !bitmap.isRecycled()) {
                        cropImageView = this;
                        cropImageView.n(bitmap, 0, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                    }
                    if (cropImageView.imageUri == null) {
                    }
                }
            } else {
                cropImageView = this;
                int i10 = bundle.getInt("LOADED_IMAGE_RESOURCE");
                if (i10 > 0) {
                    setImageResource(i10);
                    C2735B c2735b2 = C2735B.f28704a;
                } else {
                    Parcelable parcelable2 = bundle.getParcelable("LOADING_IMAGE_URI");
                    if (!(parcelable2 instanceof Uri)) {
                        parcelable2 = null;
                    }
                    Uri uri2 = (Uri) parcelable2;
                    if (uri2 != null) {
                        setImageUriAsync(uri2);
                        C2735B c2735b3 = C2735B.f28704a;
                    }
                }
            }
            int i11 = bundle.getInt("DEGREES_ROTATED");
            cropImageView.mRestoreDegreesRotated = i11;
            cropImageView.mDegreesRotated = i11;
            Parcelable parcelable3 = bundle.getParcelable("INITIAL_CROP_RECT");
            if (!(parcelable3 instanceof Rect)) {
                parcelable3 = null;
            }
            Rect rect = (Rect) parcelable3;
            if (rect != null && (rect.width() > 0 || rect.height() > 0)) {
                CropOverlayView cropOverlayView = cropImageView.mCropOverlayView;
                AbstractC2855l.d(cropOverlayView);
                cropOverlayView.setInitialCropWindowRect(rect);
            }
            Parcelable parcelable4 = bundle.getParcelable("CROP_WINDOW_RECT");
            if (!(parcelable4 instanceof RectF)) {
                parcelable4 = null;
            }
            RectF rectF = (RectF) parcelable4;
            if (rectF != null && (rectF.width() > 0.0f || rectF.height() > 0.0f)) {
                cropImageView.mRestoreCropWindowRect = rectF;
            }
            CropOverlayView cropOverlayView2 = cropImageView.mCropOverlayView;
            AbstractC2855l.d(cropOverlayView2);
            String string2 = bundle.getString("CROP_SHAPE");
            AbstractC2855l.d(string2);
            cropOverlayView2.setCropShape(d.valueOf(string2));
            cropImageView.mAutoZoomEnabled = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
            cropImageView.mMaxZoom = bundle.getInt("CROP_MAX_ZOOM");
            cropImageView.mFlipHorizontally = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
            cropImageView.mFlipVertically = bundle.getBoolean("CROP_FLIP_VERTICALLY");
            boolean z10 = bundle.getBoolean("SHOW_CROP_LABEL");
            cropImageView.mShowCropLabel = z10;
            cropImageView.mCropOverlayView.setCropperTextLabelVisibility(z10);
        }
        Parcelable parcelable5 = ((Bundle) state).getParcelable("instanceState");
        super.onRestoreInstanceState(parcelable5 != null ? parcelable5 : null);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Uri uriL;
        if (this.imageUri == null && this.originalBitmap == null && this.mImageResource < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        if (this.isSaveBitmapToInstanceState && this.imageUri == null && this.mImageResource < 1) {
            com.canhub.cropper.d dVar = com.canhub.cropper.d.f19592a;
            Context context = getContext();
            AbstractC2855l.f(context, "getContext(...)");
            uriL = dVar.L(context, this.originalBitmap, this.customOutputUri);
        } else {
            uriL = this.imageUri;
        }
        if (uriL != null && this.originalBitmap != null) {
            String string = UUID.randomUUID().toString();
            AbstractC2855l.f(string, "toString(...)");
            com.canhub.cropper.d.f19592a.I(new Pair(string, new WeakReference(this.originalBitmap)));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", string);
        }
        WeakReference weakReference = this.bitmapLoadingWorkerJob;
        C1957b c1957b = weakReference != null ? (C1957b) weakReference.get() : null;
        if (c1957b != null) {
            bundle.putParcelable("LOADING_IMAGE_URI", c1957b.g());
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uriL);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.mImageResource);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.loadedSampleSize);
        bundle.putInt("DEGREES_ROTATED", this.mDegreesRotated);
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        AbstractC2855l.d(cropOverlayView);
        bundle.putParcelable("INITIAL_CROP_RECT", cropOverlayView.getMInitialCropWindowRect());
        com.canhub.cropper.d dVar2 = com.canhub.cropper.d.f19592a;
        dVar2.u().set(this.mCropOverlayView.getCropWindowRect());
        this.mImageMatrix.invert(this.mImageInverseMatrix);
        this.mImageInverseMatrix.mapRect(dVar2.u());
        bundle.putParcelable("CROP_WINDOW_RECT", dVar2.u());
        d cropShape = this.mCropOverlayView.getCropShape();
        AbstractC2855l.d(cropShape);
        bundle.putString("CROP_SHAPE", cropShape.name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.mAutoZoomEnabled);
        bundle.putInt("CROP_MAX_ZOOM", this.mMaxZoom);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.mFlipHorizontally);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.mFlipVertically);
        bundle.putBoolean("SHOW_CROP_LABEL", this.mShowCropLabel);
        return bundle;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        this.mSizeChanged = oldw > 0 && oldh > 0;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final void q(int r22, int r23, com.canhub.cropper.CropImageView.k r24, android.graphics.Bitmap.CompressFormat r25, int r26, android.net.Uri r27) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.q(int, int, com.canhub.cropper.CropImageView$k, android.graphics.Bitmap$CompressFormat, int, android.net.Uri):void");
    }

    public final void setAutoZoomEnabled(boolean z10) {
        if (this.mAutoZoomEnabled != z10) {
            this.mAutoZoomEnabled = z10;
            i(false, false);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            AbstractC2855l.d(cropOverlayView);
            cropOverlayView.invalidate();
        }
    }

    public final void setCenterMoveEnabled(boolean centerMoveEnabled) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        AbstractC2855l.d(cropOverlayView);
        if (cropOverlayView.v(centerMoveEnabled)) {
            i(false, false);
            this.mCropOverlayView.invalidate();
        }
    }

    public final void setCornerShape(b bVar) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        AbstractC2855l.d(cropOverlayView);
        AbstractC2855l.d(bVar);
        cropOverlayView.setCropCornerShape(bVar);
    }

    public final void setCropLabelText(String cropLabelText) {
        AbstractC2855l.g(cropLabelText, "cropLabelText");
        this.mCropTextLabel = cropLabelText;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelText(cropLabelText);
        }
    }

    public final void setCropLabelTextColor(int i10) {
        this.mCropLabelTextColor = i10;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextColor(i10);
        }
    }

    public final void setCropLabelTextSize(float f10) {
        this.mCropLabelTextSize = getMCropLabelTextSize();
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextSize(f10);
        }
    }

    public final void setCropRect(Rect rect) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        AbstractC2855l.d(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(rect);
    }

    public final void setCropShape(d dVar) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        AbstractC2855l.d(cropOverlayView);
        AbstractC2855l.d(dVar);
        cropOverlayView.setCropShape(dVar);
    }

    public final void setCustomOutputUri(Uri uri) {
        this.customOutputUri = uri;
    }

    public final void setFixedAspectRatio(boolean fixAspectRatio) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        AbstractC2855l.d(cropOverlayView);
        cropOverlayView.setFixedAspectRatio(fixAspectRatio);
    }

    public final void setFlippedHorizontally(boolean z10) {
        if (this.mFlipHorizontally != z10) {
            this.mFlipHorizontally = z10;
            b(getWidth(), getHeight(), true, false);
        }
    }

    public final void setFlippedVertically(boolean z10) {
        if (this.mFlipVertically != z10) {
            this.mFlipVertically = z10;
            b(getWidth(), getHeight(), true, false);
        }
    }

    public final void setGuidelines(e eVar) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        AbstractC2855l.d(cropOverlayView);
        AbstractC2855l.d(eVar);
        cropOverlayView.setGuidelines(eVar);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        AbstractC2855l.d(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(null);
        n(bitmap, 0, null, 1, 0);
    }

    public final void setImageCropOptions(CropImageOptions options) {
        AbstractC2855l.g(options, "options");
        setScaleType(options.scaleType);
        this.customOutputUri = options.customOutputUri;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setInitialAttributeValues(options);
        }
        setMultiTouchEnabled(options.multiTouchEnabled);
        setCenterMoveEnabled(options.centerMoveEnabled);
        setShowCropOverlay(options.showCropOverlay);
        setShowProgressBar(options.showProgressBar);
        setAutoZoomEnabled(options.autoZoomEnabled);
        setMaxZoom(options.maxZoom);
        setFlippedHorizontally(options.flipHorizontally);
        setFlippedVertically(options.flipVertically);
        this.mAutoZoomEnabled = options.autoZoomEnabled;
        this.mShowCropOverlay = options.showCropOverlay;
        this.mShowProgressBar = options.showProgressBar;
        this.mProgressBar.setIndeterminateTintList(ColorStateList.valueOf(options.progressBarColor));
    }

    public final void setImageResource(int i10) {
        if (i10 != 0) {
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            AbstractC2855l.d(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            n(BitmapFactory.decodeResource(getResources(), i10), i10, null, 1, 0);
        }
    }

    public final void setImageUriAsync(Uri uri) {
        C1957b c1957b;
        if (uri != null) {
            WeakReference weakReference = this.bitmapLoadingWorkerJob;
            if (weakReference != null && (c1957b = (C1957b) weakReference.get()) != null) {
                c1957b.f();
            }
            c();
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            AbstractC2855l.d(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            Context context = getContext();
            AbstractC2855l.f(context, "getContext(...)");
            WeakReference weakReference2 = new WeakReference(new C1957b(context, this, uri));
            this.bitmapLoadingWorkerJob = weakReference2;
            C1957b c1957b2 = (C1957b) weakReference2.get();
            if (c1957b2 != null) {
                c1957b2.j();
            }
            p();
        }
    }

    public final void setMaxZoom(int i10) {
        if (this.mMaxZoom == i10 || i10 <= 0) {
            return;
        }
        this.mMaxZoom = i10;
        i(false, false);
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        AbstractC2855l.d(cropOverlayView);
        cropOverlayView.invalidate();
    }

    public final void setMultiTouchEnabled(boolean multiTouchEnabled) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        AbstractC2855l.d(cropOverlayView);
        if (cropOverlayView.x(multiTouchEnabled)) {
            i(false, false);
            this.mCropOverlayView.invalidate();
        }
    }

    public final void setOnCropImageCompleteListener(f listener) {
        this.mOnCropImageCompleteListener = listener;
    }

    public final void setOnSetImageUriCompleteListener(j listener) {
        this.mOnSetImageUriCompleteListener = listener;
    }

    public final void setRotatedDegrees(int i10) {
        int i11 = this.mDegreesRotated;
        if (i11 != i10) {
            m(i10 - i11);
        }
    }

    public final void setSaveBitmapToInstanceState(boolean z10) {
        this.isSaveBitmapToInstanceState = z10;
    }

    public final void setScaleType(l scaleType) {
        AbstractC2855l.g(scaleType, "scaleType");
        if (scaleType != this.mScaleType) {
            this.mScaleType = scaleType;
            this.mZoom = 1.0f;
            this.mZoomOffsetY = 0.0f;
            this.mZoomOffsetX = 0.0f;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            if (cropOverlayView != null) {
                cropOverlayView.t();
            }
            requestLayout();
        }
    }

    public final void setShowCropLabel(boolean z10) {
        if (this.mShowCropLabel != z10) {
            this.mShowCropLabel = z10;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            if (cropOverlayView != null) {
                cropOverlayView.setCropperTextLabelVisibility(z10);
            }
        }
    }

    public final void setShowCropOverlay(boolean z10) {
        if (this.mShowCropOverlay != z10) {
            this.mShowCropOverlay = z10;
            o();
        }
    }

    public final void setShowProgressBar(boolean z10) {
        if (this.mShowProgressBar != z10) {
            this.mShowProgressBar = z10;
            p();
        }
    }

    public final void setSnapRadius(float snapRadius) {
        if (snapRadius >= 0.0f) {
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            AbstractC2855l.d(cropOverlayView);
            cropOverlayView.setSnapRadius(snapRadius);
        }
    }

    public final void setOnCropWindowChangedListener(i listener) {
    }

    public final void setOnSetCropOverlayMovedListener(g listener) {
    }

    public final void setOnSetCropOverlayReleasedListener(h listener) {
    }
}
