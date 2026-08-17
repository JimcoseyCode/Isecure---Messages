package com.canhub.cropper;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.canhub.cropper.CropImageView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2750m;
import j7.AbstractC2800q;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0000\u0018\u0000 Õ\u00012\u00020\u0001:\u0004Ö\u0001(\u0014B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J/\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ7\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J/\u0010!\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\u001cJ\u001f\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010\nJ\u001f\u0010&\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b&\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\b¢\u0006\u0004\b.\u0010\nJ'\u00104\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\b¢\u0006\u0004\b6\u0010\nJ\u0015\u00109\u001a\u00020\b2\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u0015\u0010@\u001a\u00020\b2\u0006\u0010?\u001a\u00020'¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\b2\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\b2\u0006\u0010F\u001a\u00020\u0018¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\b2\u0006\u0010I\u001a\u000201¢\u0006\u0004\bJ\u0010KJ\u0015\u0010N\u001a\u00020\b2\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020\b2\u0006\u0010P\u001a\u00020'¢\u0006\u0004\bQ\u0010AJ\u0015\u0010S\u001a\u00020\b2\u0006\u0010R\u001a\u00020\u0018¢\u0006\u0004\bS\u0010HJ\u0015\u0010U\u001a\u00020\b2\u0006\u0010T\u001a\u00020\u0018¢\u0006\u0004\bU\u0010HJ\u0015\u0010\"\u001a\u00020'2\u0006\u0010V\u001a\u00020'¢\u0006\u0004\b\"\u0010WJ\u0015\u0010Y\u001a\u00020'2\u0006\u0010X\u001a\u00020'¢\u0006\u0004\bY\u0010WJ-\u0010^\u001a\u00020\b2\u0006\u0010Z\u001a\u00020\u00182\u0006\u0010[\u001a\u00020\u00182\u0006\u0010\\\u001a\u00020\u00182\u0006\u0010]\u001a\u00020\u0018¢\u0006\u0004\b^\u0010_J\u0015\u0010b\u001a\u00020\b2\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\bd\u0010\u0013J\u0017\u0010g\u001a\u00020'2\u0006\u0010f\u001a\u00020eH\u0017¢\u0006\u0004\bg\u0010hR\u0016\u0010j\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010iR\u0018\u0010l\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010kR\u0018\u0010n\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010mR\u0018\u0010q\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010pR\u0016\u0010s\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010rR\u0016\u0010t\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010rR\u0014\u0010w\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010vR\u0018\u0010y\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010xR\u0014\u0010|\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0019\u0010\u0081\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u007fR\u0019\u0010\u0082\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u007fR\u0019\u0010\u0083\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u007fR\u0019\u0010\u0084\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010\u007fR\u0019\u0010\u0085\u0001\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010kR\u0017\u0010\u0088\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bY\u0010\u0087\u0001R\u0016\u0010\u008a\u0001\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b^\u0010\u0089\u0001R\u0015\u0010\u008b\u0001\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010{R\u0018\u0010\u008d\u0001\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000f\u0010\u008c\u0001R\u0019\u0010\u008f\u0001\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008c\u0001R\u0018\u0010\u0091\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010iR\u0018\u0010\u0093\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010iR\u0018\u0010\u0095\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010iR\u0018\u0010\u0097\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010iR\u0018\u0010\u0099\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010iR\u001b\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bi\u0010\u009b\u0001R(\u0010 \u0001\u001a\u00020'2\u0007\u0010\u009d\u0001\u001a\u00020'8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010r\u001a\u0005\bz\u0010\u009f\u0001R\u0019\u0010¢\u0001\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u008c\u0001R\u0019\u0010£\u0001\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008c\u0001R\u0018\u0010¥\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010iR-\u0010M\u001a\u0004\u0018\u00010L2\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010L8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001R-\u00108\u001a\u0004\u0018\u0001072\t\u0010\u009d\u0001\u001a\u0004\u0018\u0001078\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R.\u0010²\u0001\u001a\u0004\u0018\u00010;2\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010;8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R\u0018\u0010´\u0001\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b³\u0001\u0010rR\u0019\u0010·\u0001\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0018\u0010¹\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¸\u0001\u0010iR\u0019\u0010»\u0001\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010\u008c\u0001R\u0018\u0010¿\u0001\u001a\u00030¼\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u0018\u0010Á\u0001\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÀ\u0001\u0010rR\u0016\u0010Ã\u0001\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÂ\u0001\u0010iR\u0016\u0010Ä\u0001\u001a\u00020'8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b~\u0010\u009f\u0001R(\u0010È\u0001\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0005\bÇ\u0001\u0010\u000eR)\u0010É\u0001\u001a\u0002012\u0007\u0010É\u0001\u001a\u0002018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0005\bÌ\u0001\u0010KR)\u0010Í\u0001\u001a\u0002012\u0007\u0010Í\u0001\u001a\u0002018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bÎ\u0001\u0010Ë\u0001\"\u0005\bÏ\u0001\u0010KR/\u0010Ô\u0001\u001a\u0005\u0018\u00010¼\u00012\t\u0010\f\u001a\u0005\u0018\u00010¼\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001¨\u0006×\u0001"}, d2 = {"Lcom/canhub/cropper/CropOverlayView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Li7/B;", "n", "()V", "Landroid/graphics/RectF;", "rect", "l", "(Landroid/graphics/RectF;)V", "y", "Landroid/graphics/Canvas;", "canvas", "i", "(Landroid/graphics/Canvas;)V", "c", "j", "d", "h", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cornerOffset", "cornerExtension", "f", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;FF)V", "k", "radius", "g", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;FFF)V", "e", "x", "q", "(FF)V", "s", "r", PointerEventHelper.POINTER_TYPE_UNKNOWN, "b", "(Landroid/graphics/RectF;)Z", "Lcom/canhub/cropper/CropOverlayView$b;", "listener", "setCropWindowChangeListener", "(Lcom/canhub/cropper/CropOverlayView$b;)V", "m", PointerEventHelper.POINTER_TYPE_UNKNOWN, "boundsPoints", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewWidth", "viewHeight", "u", "([FII)V", "t", "Lcom/canhub/cropper/CropImageView$d;", "cropShape", "setCropShape", "(Lcom/canhub/cropper/CropImageView$d;)V", "Lcom/canhub/cropper/CropImageView$b;", "cropCornerShape", "setCropCornerShape", "(Lcom/canhub/cropper/CropImageView$b;)V", "isEnabled", "setCropperTextLabelVisibility", "(Z)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "textLabel", "setCropLabelText", "(Ljava/lang/String;)V", "textSize", "setCropLabelTextSize", "(F)V", "textColor", "setCropLabelTextColor", "(I)V", "Lcom/canhub/cropper/CropImageView$e;", "guidelines", "setGuidelines", "(Lcom/canhub/cropper/CropImageView$e;)V", "fixAspectRatio", "setFixedAspectRatio", "snapRadius", "setSnapRadius", "cornerRadius", "setCropCornerRadius", "multiTouchEnabled", "(Z)Z", "centerMoveEnabled", "v", ViewProps.MAX_WIDTH, ViewProps.MAX_HEIGHT, "scaleFactorWidth", "scaleFactorHeight", "w", "(FFFF)V", "Lcom/canhub/cropper/CropImageOptions;", "options", "setInitialAttributeValues", "(Lcom/canhub/cropper/CropImageOptions;)V", "onDraw", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "F", "mCropCornerRadius", "Ljava/lang/Integer;", "mCircleCornerFillColor", "Lcom/canhub/cropper/CropImageOptions;", "mOptions", "Landroid/view/ScaleGestureDetector;", "Landroid/view/ScaleGestureDetector;", "mScaleDetector", "Z", "mMultiTouchEnabled", "mCenterMoveEnabled", "Lcom/canhub/cropper/u;", "Lcom/canhub/cropper/u;", "mCropWindowHandler", "Lcom/canhub/cropper/CropOverlayView$b;", "mCropWindowChangeListener", "o", "Landroid/graphics/RectF;", "mDrawRect", "Landroid/graphics/Paint;", "p", "Landroid/graphics/Paint;", "mBorderPaint", "mBorderCornerPaint", "mGuidelinePaint", "mBackgroundPaint", "textLabelPaint", "currentPointerId", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "mPath", "[F", "mBoundsPoints", "mCalcBounds", "I", "mViewWidth", "z", "mViewHeight", "A", "mBorderCornerOffset", "B", "mBorderCornerLength", "C", "mInitialCropWindowPaddingRatio", "D", "mTouchRadius", "E", "mSnapRadius", "Lcom/canhub/cropper/v;", "Lcom/canhub/cropper/v;", "mMoveHandler", "value", "G", "()Z", "isFixAspectRatio", "H", "mAspectRatioX", "mAspectRatioY", "J", "mTargetAspectRatio", "K", "Lcom/canhub/cropper/CropImageView$e;", "getGuidelines", "()Lcom/canhub/cropper/CropImageView$e;", "L", "Lcom/canhub/cropper/CropImageView$d;", "getCropShape", "()Lcom/canhub/cropper/CropImageView$d;", "M", "Lcom/canhub/cropper/CropImageView$b;", "getCornerShape", "()Lcom/canhub/cropper/CropImageView$b;", "cornerShape", "N", "isCropLabelEnabled", "O", "Ljava/lang/String;", "cropLabelText", "P", "cropLabelTextSize", "Q", "cropLabelTextColor", "Landroid/graphics/Rect;", "R", "Landroid/graphics/Rect;", "mInitialCropWindowRect", "S", "initializedCropWindow", "T", "maxVerticalGestureExclusion", "isNonStraightAngleRotated", "getCropWindowRect", "()Landroid/graphics/RectF;", "setCropWindowRect", "cropWindowRect", "aspectRatioX", "getAspectRatioX", "()I", "setAspectRatioX", "aspectRatioY", "getAspectRatioY", "setAspectRatioY", "getInitialCropWindowRect", "()Landroid/graphics/Rect;", "setInitialCropWindowRect", "(Landroid/graphics/Rect;)V", "initialCropWindowRect", "U", "a", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CropOverlayView extends View {

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name and from kotlin metadata */
    private float mBorderCornerOffset;

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private float mBorderCornerLength;

    /* JADX INFO: renamed from: C, reason: collision with root package name and from kotlin metadata */
    private float mInitialCropWindowPaddingRatio;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private float mTouchRadius;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private float mSnapRadius;

    /* JADX INFO: renamed from: F, reason: collision with root package name and from kotlin metadata */
    private v mMoveHandler;

    /* JADX INFO: renamed from: G, reason: collision with root package name and from kotlin metadata */
    private boolean isFixAspectRatio;

    /* JADX INFO: renamed from: H, reason: collision with root package name and from kotlin metadata */
    private int mAspectRatioX;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private int mAspectRatioY;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private float mTargetAspectRatio;

    /* JADX INFO: renamed from: K, reason: collision with root package name and from kotlin metadata */
    private CropImageView.e guidelines;

    /* JADX INFO: renamed from: L, reason: collision with root package name and from kotlin metadata */
    private CropImageView.d cropShape;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private CropImageView.b cornerShape;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private boolean isCropLabelEnabled;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private String cropLabelText;

    /* JADX INFO: renamed from: P, reason: collision with root package name and from kotlin metadata */
    private float cropLabelTextSize;

    /* JADX INFO: renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private int cropLabelTextColor;

    /* JADX INFO: renamed from: R, reason: collision with root package name and from kotlin metadata */
    private final Rect mInitialCropWindowRect;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private boolean initializedCropWindow;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final float maxVerticalGestureExclusion;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float mCropCornerRadius;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Integer mCircleCornerFillColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private CropImageOptions mOptions;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private ScaleGestureDetector mScaleDetector;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean mMultiTouchEnabled;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean mCenterMoveEnabled;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final u mCropWindowHandler;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private b mCropWindowChangeListener;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final RectF mDrawRect;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Paint mBorderPaint;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Paint mBorderCornerPaint;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Paint mGuidelinePaint;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Paint mBackgroundPaint;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Paint textLabelPaint;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private Integer currentPointerId;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Path mPath;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final float[] mBoundsPoints;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final RectF mCalcBounds;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private int mViewWidth;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private int mViewHeight;

    /* JADX INFO: renamed from: com.canhub.cropper.CropOverlayView$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Paint a(int i10) {
            Paint paint = new Paint();
            paint.setColor(i10);
            return paint;
        }

        public final Paint b(float f10, int i10) {
            if (f10 <= 0.0f) {
                return null;
            }
            Paint paint = new Paint();
            paint.setColor(i10);
            paint.setStrokeWidth(f10);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            return paint;
        }

        public final Paint c(int i10) {
            Paint paint = new Paint();
            paint.setColor(i10);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            return paint;
        }

        public final Paint d(CropImageOptions options) {
            AbstractC2855l.g(options, "options");
            Paint paint = new Paint();
            paint.setStrokeWidth(1.0f);
            paint.setTextSize(options.cropperLabelTextSize);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setColor(options.cropperLabelTextColor);
            return paint;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        void a(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public c() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            AbstractC2855l.g(detector, "detector");
            RectF rectFI = CropOverlayView.this.mCropWindowHandler.i();
            float focusX = detector.getFocusX();
            float focusY = detector.getFocusY();
            float f10 = 2;
            float currentSpanY = detector.getCurrentSpanY() / f10;
            float currentSpanX = detector.getCurrentSpanX() / f10;
            float f11 = focusY - currentSpanY;
            float f12 = focusX - currentSpanX;
            float f13 = focusX + currentSpanX;
            float f14 = focusY + currentSpanY;
            if (f12 >= f13 || f11 > f14 || f12 < 0.0f || f13 > CropOverlayView.this.mCropWindowHandler.d() || f11 < 0.0f || f14 > CropOverlayView.this.mCropWindowHandler.c()) {
                return true;
            }
            rectFI.set(f12, f11, f13, f14);
            CropOverlayView.this.mCropWindowHandler.w(rectFI);
            CropOverlayView.this.invalidate();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f19536b;

        static {
            int[] iArr = new int[CropImageView.d.values().length];
            try {
                iArr[CropImageView.d.f19469g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropImageView.d.f19471i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CropImageView.d.f19472j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CropImageView.d.f19470h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f19535a = iArr;
            int[] iArr2 = new int[CropImageView.b.values().length];
            try {
                iArr2[CropImageView.b.f19456h.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CropImageView.b.f19455g.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f19536b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC2855l.g(context, "context");
        this.mCenterMoveEnabled = true;
        this.mCropWindowHandler = new u();
        this.mDrawRect = new RectF();
        this.mPath = new Path();
        this.mBoundsPoints = new float[8];
        this.mCalcBounds = new RectF();
        this.mTargetAspectRatio = this.mAspectRatioX / this.mAspectRatioY;
        this.cropLabelText = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        this.cropLabelTextSize = 20.0f;
        this.cropLabelTextColor = -1;
        this.mInitialCropWindowRect = new Rect();
        this.maxVerticalGestureExclusion = TypedValue.applyDimension(1, 200.0f, Resources.getSystem().getDisplayMetrics());
    }

    private final boolean b(RectF rect) {
        float f10;
        float f11;
        com.canhub.cropper.d dVar = com.canhub.cropper.d.f19592a;
        float fA = dVar.A(this.mBoundsPoints);
        float fC = dVar.C(this.mBoundsPoints);
        float fB = dVar.B(this.mBoundsPoints);
        float fV = dVar.v(this.mBoundsPoints);
        if (!p()) {
            this.mCalcBounds.set(fA, fC, fB, fV);
            return false;
        }
        float[] fArr = this.mBoundsPoints;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        if (f17 < f13) {
            float f18 = fArr[3];
            if (f13 < f18) {
                f14 = fArr[2];
                f12 = f14;
                f13 = f15;
                f11 = f16;
                f15 = f18;
                f10 = f17;
            } else {
                f12 = fArr[2];
                f11 = f14;
                f14 = f12;
                f15 = f13;
                f13 = f18;
                f10 = f15;
            }
        } else {
            f10 = fArr[3];
            if (f13 > f10) {
                f11 = fArr[2];
                f14 = f16;
                f15 = f17;
            } else {
                f11 = f12;
                f10 = f13;
                f12 = f16;
                f13 = f17;
            }
        }
        float f19 = (f13 - f10) / (f12 - f11);
        float f20 = (-1.0f) / f19;
        float f21 = f10 - (f19 * f11);
        float f22 = f10 - (f11 * f20);
        float f23 = f15 - (f19 * f14);
        float f24 = f15 - (f14 * f20);
        float fCenterY = rect.centerY() - rect.top;
        float fCenterX = rect.centerX();
        float f25 = rect.left;
        float f26 = fCenterY / (fCenterX - f25);
        float f27 = -f26;
        float f28 = rect.top;
        float f29 = f28 - (f25 * f26);
        float f30 = rect.right;
        float f31 = f28 - (f27 * f30);
        float f32 = f19 - f26;
        float f33 = (f29 - f21) / f32;
        float fMax = Math.max(fA, f33 < f30 ? f33 : fA);
        float f34 = (f29 - f22) / (f20 - f26);
        if (f34 >= rect.right) {
            f34 = fMax;
        }
        float fMax2 = Math.max(fMax, f34);
        float f35 = f20 - f27;
        float f36 = (f31 - f24) / f35;
        float fMax3 = Math.max(fMax2, f36 < rect.right ? f36 : fMax2);
        float f37 = (f31 - f22) / f35;
        if (f37 <= rect.left) {
            f37 = fB;
        }
        float fMin = Math.min(fB, f37);
        float f38 = (f31 - f23) / (f19 - f27);
        if (f38 <= rect.left) {
            f38 = fMin;
        }
        float fMin2 = Math.min(fMin, f38);
        float f39 = (f29 - f23) / f32;
        if (f39 <= rect.left) {
            f39 = fMin2;
        }
        float fMin3 = Math.min(fMin2, f39);
        float fMax4 = Math.max(fC, Math.max((f19 * fMax3) + f21, (f20 * fMin3) + f22));
        float fMin4 = Math.min(fV, Math.min((f20 * fMax3) + f24, (f19 * fMin3) + f23));
        RectF rectF = this.mCalcBounds;
        rectF.left = fMax3;
        rectF.top = fMax4;
        rectF.right = fMin3;
        rectF.bottom = fMin4;
        return true;
    }

    private final void c(Canvas canvas) {
        RectF rectFI = this.mCropWindowHandler.i();
        com.canhub.cropper.d dVar = com.canhub.cropper.d.f19592a;
        float fMax = Math.max(dVar.A(this.mBoundsPoints), 0.0f);
        float fMax2 = Math.max(dVar.C(this.mBoundsPoints), 0.0f);
        float fMin = Math.min(dVar.B(this.mBoundsPoints), getWidth());
        float fMin2 = Math.min(dVar.v(this.mBoundsPoints), getHeight());
        CropImageView.d dVar2 = this.cropShape;
        int i10 = dVar2 == null ? -1 : d.f19535a[dVar2.ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            if (i10 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            this.mPath.reset();
            this.mDrawRect.set(rectFI.left, rectFI.top, rectFI.right, rectFI.bottom);
            this.mPath.addOval(this.mDrawRect, Path.Direction.CW);
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.mPath);
            } else {
                canvas.clipPath(this.mPath, Region.Op.XOR);
            }
            Paint paint = this.mBackgroundPaint;
            AbstractC2855l.d(paint);
            canvas.drawRect(fMax, fMax2, fMin, fMin2, paint);
            canvas.restore();
            return;
        }
        if (!p()) {
            float f10 = rectFI.top;
            Paint paint2 = this.mBackgroundPaint;
            AbstractC2855l.d(paint2);
            canvas.drawRect(fMax, fMax2, fMin, f10, paint2);
            float f11 = rectFI.bottom;
            Paint paint3 = this.mBackgroundPaint;
            AbstractC2855l.d(paint3);
            canvas.drawRect(fMax, f11, fMin, fMin2, paint3);
            float f12 = rectFI.top;
            float f13 = rectFI.left;
            float f14 = rectFI.bottom;
            Paint paint4 = this.mBackgroundPaint;
            AbstractC2855l.d(paint4);
            canvas.drawRect(fMax, f12, f13, f14, paint4);
            float f15 = rectFI.right;
            float f16 = rectFI.top;
            float f17 = rectFI.bottom;
            Paint paint5 = this.mBackgroundPaint;
            AbstractC2855l.d(paint5);
            canvas.drawRect(f15, f16, fMin, f17, paint5);
            return;
        }
        this.mPath.reset();
        Path path = this.mPath;
        float[] fArr = this.mBoundsPoints;
        path.moveTo(fArr[0], fArr[1]);
        Path path2 = this.mPath;
        float[] fArr2 = this.mBoundsPoints;
        path2.lineTo(fArr2[2], fArr2[3]);
        Path path3 = this.mPath;
        float[] fArr3 = this.mBoundsPoints;
        path3.lineTo(fArr3[4], fArr3[5]);
        Path path4 = this.mPath;
        float[] fArr4 = this.mBoundsPoints;
        path4.lineTo(fArr4[6], fArr4[7]);
        this.mPath.close();
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(this.mPath);
        } else {
            canvas.clipPath(this.mPath, Region.Op.INTERSECT);
        }
        Paint paint6 = this.mBackgroundPaint;
        AbstractC2855l.d(paint6);
        canvas.drawRect(fMax, fMax2, fMin, fMin2, paint6);
        canvas.restore();
    }

    private final void d(Canvas canvas) {
        Paint paint = this.mBorderPaint;
        if (paint != null) {
            AbstractC2855l.d(paint);
            float strokeWidth = paint.getStrokeWidth();
            RectF rectFI = this.mCropWindowHandler.i();
            float f10 = strokeWidth / 2;
            rectFI.inset(f10, f10);
            CropImageView.d dVar = this.cropShape;
            int i10 = dVar == null ? -1 : d.f19535a[dVar.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                Paint paint2 = this.mBorderPaint;
                AbstractC2855l.d(paint2);
                canvas.drawRect(rectFI, paint2);
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("Unrecognized crop shape");
                }
                Paint paint3 = this.mBorderPaint;
                AbstractC2855l.d(paint3);
                canvas.drawOval(rectFI, paint3);
            }
        }
    }

    private final void e(Canvas canvas, RectF rect, float cornerExtension, float radius) {
        float f10 = rect.left - cornerExtension;
        float f11 = rect.top - cornerExtension;
        Paint paint = this.mBorderCornerPaint;
        AbstractC2855l.d(paint);
        canvas.drawCircle(f10, f11, radius, paint);
        float f12 = rect.right + cornerExtension;
        float f13 = rect.top - cornerExtension;
        Paint paint2 = this.mBorderCornerPaint;
        AbstractC2855l.d(paint2);
        canvas.drawCircle(f12, f13, radius, paint2);
        float f14 = rect.left - cornerExtension;
        float f15 = rect.bottom + cornerExtension;
        Paint paint3 = this.mBorderCornerPaint;
        AbstractC2855l.d(paint3);
        canvas.drawCircle(f14, f15, radius, paint3);
        float f16 = rect.right + cornerExtension;
        float f17 = rect.bottom + cornerExtension;
        Paint paint4 = this.mBorderCornerPaint;
        AbstractC2855l.d(paint4);
        canvas.drawCircle(f16, f17, radius, paint4);
    }

    private final void f(Canvas canvas, RectF rect, float cornerOffset, float cornerExtension) {
        CropImageView.d dVar = this.cropShape;
        int i10 = dVar == null ? -1 : d.f19535a[dVar.ordinal()];
        if (i10 == 1) {
            g(canvas, rect, cornerOffset, cornerExtension, this.mCropCornerRadius);
            return;
        }
        if (i10 == 2) {
            float fCenterX = rect.centerX() - this.mBorderCornerLength;
            float f10 = rect.top - cornerOffset;
            float fCenterX2 = rect.centerX() + this.mBorderCornerLength;
            float f11 = rect.top - cornerOffset;
            Paint paint = this.mBorderCornerPaint;
            AbstractC2855l.d(paint);
            canvas.drawLine(fCenterX, f10, fCenterX2, f11, paint);
            float fCenterX3 = rect.centerX() - this.mBorderCornerLength;
            float f12 = rect.bottom + cornerOffset;
            float fCenterX4 = rect.centerX() + this.mBorderCornerLength;
            float f13 = rect.bottom + cornerOffset;
            Paint paint2 = this.mBorderCornerPaint;
            AbstractC2855l.d(paint2);
            canvas.drawLine(fCenterX3, f12, fCenterX4, f13, paint2);
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            k(canvas, rect, cornerOffset, cornerExtension);
            return;
        }
        float f14 = rect.left - cornerOffset;
        float fCenterY = rect.centerY() - this.mBorderCornerLength;
        float f15 = rect.left - cornerOffset;
        float fCenterY2 = rect.centerY() + this.mBorderCornerLength;
        Paint paint3 = this.mBorderCornerPaint;
        AbstractC2855l.d(paint3);
        canvas.drawLine(f14, fCenterY, f15, fCenterY2, paint3);
        float f16 = rect.right + cornerOffset;
        float fCenterY3 = rect.centerY() - this.mBorderCornerLength;
        float f17 = rect.right + cornerOffset;
        float fCenterY4 = rect.centerY() + this.mBorderCornerLength;
        Paint paint4 = this.mBorderCornerPaint;
        AbstractC2855l.d(paint4);
        canvas.drawLine(f16, fCenterY3, f17, fCenterY4, paint4);
    }

    private final void g(Canvas canvas, RectF rect, float cornerOffset, float cornerExtension, float radius) {
        CropImageView.b bVar = this.cornerShape;
        int i10 = bVar == null ? -1 : d.f19536b[bVar.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                e(canvas, rect, cornerOffset, radius);
            } else {
                if (i10 != 2) {
                    throw new C2750m();
                }
                k(canvas, rect, cornerOffset, cornerExtension);
            }
        }
    }

    private final void h(Canvas canvas) {
        float strokeWidth;
        if (this.mBorderCornerPaint != null) {
            Paint paint = this.mBorderPaint;
            if (paint != null) {
                AbstractC2855l.d(paint);
                strokeWidth = paint.getStrokeWidth();
            } else {
                strokeWidth = 0.0f;
            }
            Paint paint2 = this.mBorderCornerPaint;
            AbstractC2855l.d(paint2);
            float strokeWidth2 = paint2.getStrokeWidth();
            float f10 = 2;
            float f11 = (strokeWidth2 - strokeWidth) / f10;
            float f12 = strokeWidth2 / f10;
            float f13 = f12 + f11;
            CropImageView.d dVar = this.cropShape;
            int i10 = dVar == null ? -1 : d.f19535a[dVar.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                f12 += this.mBorderCornerOffset;
            } else if (i10 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            RectF rectFI = this.mCropWindowHandler.i();
            rectFI.inset(f12, f12);
            f(canvas, rectFI, f11, f13);
            if (this.cornerShape == CropImageView.b.f19456h) {
                Integer num = this.mCircleCornerFillColor;
                this.mBorderCornerPaint = num != null ? INSTANCE.c(num.intValue()) : null;
                f(canvas, rectFI, f11, f13);
            }
        }
    }

    private final void i(Canvas canvas) {
        if (this.isCropLabelEnabled) {
            RectF rectFI = this.mCropWindowHandler.i();
            float f10 = (rectFI.left + rectFI.right) / 2;
            float f11 = rectFI.top - 50;
            Paint paint = this.textLabelPaint;
            if (paint != null) {
                paint.setTextSize(this.cropLabelTextSize);
                paint.setColor(this.cropLabelTextColor);
            }
            String str = this.cropLabelText;
            Paint paint2 = this.textLabelPaint;
            AbstractC2855l.d(paint2);
            canvas.drawText(str, f10, f11, paint2);
            canvas.save();
        }
    }

    private final void j(Canvas canvas) {
        float strokeWidth;
        if (this.mGuidelinePaint != null) {
            Paint paint = this.mBorderPaint;
            if (paint != null) {
                AbstractC2855l.d(paint);
                strokeWidth = paint.getStrokeWidth();
            } else {
                strokeWidth = 0.0f;
            }
            RectF rectFI = this.mCropWindowHandler.i();
            rectFI.inset(strokeWidth, strokeWidth);
            float f10 = 3;
            float fWidth = rectFI.width() / f10;
            float fHeight = rectFI.height() / f10;
            CropImageView.d dVar = this.cropShape;
            int i10 = dVar == null ? -1 : d.f19535a[dVar.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                float f11 = rectFI.left + fWidth;
                float f12 = rectFI.right - fWidth;
                float f13 = rectFI.top;
                float f14 = rectFI.bottom;
                Paint paint2 = this.mGuidelinePaint;
                AbstractC2855l.d(paint2);
                canvas.drawLine(f11, f13, f11, f14, paint2);
                float f15 = rectFI.top;
                float f16 = rectFI.bottom;
                Paint paint3 = this.mGuidelinePaint;
                AbstractC2855l.d(paint3);
                canvas.drawLine(f12, f15, f12, f16, paint3);
                float f17 = rectFI.top + fHeight;
                float f18 = rectFI.bottom - fHeight;
                float f19 = rectFI.left;
                float f20 = rectFI.right;
                Paint paint4 = this.mGuidelinePaint;
                AbstractC2855l.d(paint4);
                canvas.drawLine(f19, f17, f20, f17, paint4);
                float f21 = rectFI.left;
                float f22 = rectFI.right;
                Paint paint5 = this.mGuidelinePaint;
                AbstractC2855l.d(paint5);
                canvas.drawLine(f21, f18, f22, f18, paint5);
                return;
            }
            if (i10 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            float f23 = 2;
            float fWidth2 = (rectFI.width() / f23) - strokeWidth;
            float fHeight2 = (rectFI.height() / f23) - strokeWidth;
            float f24 = rectFI.left + fWidth;
            float f25 = rectFI.right - fWidth;
            float fSin = (float) (((double) fHeight2) * Math.sin(Math.acos((fWidth2 - fWidth) / fWidth2)));
            float f26 = (rectFI.top + fHeight2) - fSin;
            float f27 = (rectFI.bottom - fHeight2) + fSin;
            Paint paint6 = this.mGuidelinePaint;
            AbstractC2855l.d(paint6);
            canvas.drawLine(f24, f26, f24, f27, paint6);
            float f28 = (rectFI.top + fHeight2) - fSin;
            float f29 = (rectFI.bottom - fHeight2) + fSin;
            Paint paint7 = this.mGuidelinePaint;
            AbstractC2855l.d(paint7);
            canvas.drawLine(f25, f28, f25, f29, paint7);
            float f30 = rectFI.top + fHeight;
            float f31 = rectFI.bottom - fHeight;
            float fCos = (float) (((double) fWidth2) * Math.cos(Math.asin((fHeight2 - fHeight) / fHeight2)));
            float f32 = (rectFI.left + fWidth2) - fCos;
            float f33 = (rectFI.right - fWidth2) + fCos;
            Paint paint8 = this.mGuidelinePaint;
            AbstractC2855l.d(paint8);
            canvas.drawLine(f32, f30, f33, f30, paint8);
            float f34 = (rectFI.left + fWidth2) - fCos;
            float f35 = (rectFI.right - fWidth2) + fCos;
            Paint paint9 = this.mGuidelinePaint;
            AbstractC2855l.d(paint9);
            canvas.drawLine(f34, f31, f35, f31, paint9);
        }
    }

    private final void k(Canvas canvas, RectF rect, float cornerOffset, float cornerExtension) {
        float f10 = rect.left;
        float f11 = rect.top;
        float f12 = f11 + this.mBorderCornerLength;
        Paint paint = this.mBorderCornerPaint;
        AbstractC2855l.d(paint);
        canvas.drawLine(f10 - cornerOffset, f11 - cornerExtension, f10 - cornerOffset, f12, paint);
        float f13 = rect.left;
        float f14 = rect.top;
        Paint paint2 = this.mBorderCornerPaint;
        AbstractC2855l.d(paint2);
        canvas.drawLine(f13 - cornerExtension, f14 - cornerOffset, f13 + this.mBorderCornerLength, f14 - cornerOffset, paint2);
        float f15 = rect.right;
        float f16 = rect.top;
        float f17 = f16 + this.mBorderCornerLength;
        Paint paint3 = this.mBorderCornerPaint;
        AbstractC2855l.d(paint3);
        canvas.drawLine(f15 + cornerOffset, f16 - cornerExtension, f15 + cornerOffset, f17, paint3);
        float f18 = rect.right;
        float f19 = rect.top;
        Paint paint4 = this.mBorderCornerPaint;
        AbstractC2855l.d(paint4);
        canvas.drawLine(f18 + cornerExtension, f19 - cornerOffset, f18 - this.mBorderCornerLength, f19 - cornerOffset, paint4);
        float f20 = rect.left;
        float f21 = rect.bottom;
        float f22 = f21 - this.mBorderCornerLength;
        Paint paint5 = this.mBorderCornerPaint;
        AbstractC2855l.d(paint5);
        canvas.drawLine(f20 - cornerOffset, f21 + cornerExtension, f20 - cornerOffset, f22, paint5);
        float f23 = rect.left;
        float f24 = rect.bottom;
        Paint paint6 = this.mBorderCornerPaint;
        AbstractC2855l.d(paint6);
        canvas.drawLine(f23 - cornerExtension, f24 + cornerOffset, f23 + this.mBorderCornerLength, f24 + cornerOffset, paint6);
        float f25 = rect.right;
        float f26 = rect.bottom;
        float f27 = f26 - this.mBorderCornerLength;
        Paint paint7 = this.mBorderCornerPaint;
        AbstractC2855l.d(paint7);
        canvas.drawLine(f25 + cornerOffset, f26 + cornerExtension, f25 + cornerOffset, f27, paint7);
        float f28 = rect.right;
        float f29 = rect.bottom;
        Paint paint8 = this.mBorderCornerPaint;
        AbstractC2855l.d(paint8);
        canvas.drawLine(f28 + cornerExtension, f29 + cornerOffset, f28 - this.mBorderCornerLength, f29 + cornerOffset, paint8);
    }

    private final void l(RectF rect) {
        if (rect.width() < this.mCropWindowHandler.f()) {
            float f10 = (this.mCropWindowHandler.f() - rect.width()) / 2;
            rect.left -= f10;
            rect.right += f10;
        }
        if (rect.height() < this.mCropWindowHandler.e()) {
            float fE = (this.mCropWindowHandler.e() - rect.height()) / 2;
            rect.top -= fE;
            rect.bottom += fE;
        }
        if (rect.width() > this.mCropWindowHandler.d()) {
            float fWidth = (rect.width() - this.mCropWindowHandler.d()) / 2;
            rect.left += fWidth;
            rect.right -= fWidth;
        }
        if (rect.height() > this.mCropWindowHandler.c()) {
            float fHeight = (rect.height() - this.mCropWindowHandler.c()) / 2;
            rect.top += fHeight;
            rect.bottom -= fHeight;
        }
        b(rect);
        if (this.mCalcBounds.width() > 0.0f && this.mCalcBounds.height() > 0.0f) {
            float fMax = Math.max(this.mCalcBounds.left, 0.0f);
            float fMax2 = Math.max(this.mCalcBounds.top, 0.0f);
            float fMin = Math.min(this.mCalcBounds.right, getWidth());
            float fMin2 = Math.min(this.mCalcBounds.bottom, getHeight());
            if (rect.left < fMax) {
                rect.left = fMax;
            }
            if (rect.top < fMax2) {
                rect.top = fMax2;
            }
            if (rect.right > fMin) {
                rect.right = fMin;
            }
            if (rect.bottom > fMin2) {
                rect.bottom = fMin2;
            }
        }
        if (!this.isFixAspectRatio || Math.abs(rect.width() - (rect.height() * this.mTargetAspectRatio)) <= 0.1d) {
            return;
        }
        if (rect.width() > rect.height() * this.mTargetAspectRatio) {
            float fAbs = Math.abs((rect.height() * this.mTargetAspectRatio) - rect.width()) / 2;
            rect.left += fAbs;
            rect.right -= fAbs;
        } else {
            float fAbs2 = Math.abs((rect.width() / this.mTargetAspectRatio) - rect.height()) / 2;
            rect.top += fAbs2;
            rect.bottom -= fAbs2;
        }
    }

    private final void n() {
        com.canhub.cropper.d dVar = com.canhub.cropper.d.f19592a;
        float fMax = Math.max(dVar.A(this.mBoundsPoints), 0.0f);
        float fMax2 = Math.max(dVar.C(this.mBoundsPoints), 0.0f);
        float fMin = Math.min(dVar.B(this.mBoundsPoints), getWidth());
        float fMin2 = Math.min(dVar.v(this.mBoundsPoints), getHeight());
        if (fMin <= fMax || fMin2 <= fMax2) {
            return;
        }
        RectF rectF = new RectF();
        this.initializedCropWindow = true;
        float f10 = this.mInitialCropWindowPaddingRatio;
        float f11 = fMin - fMax;
        float f12 = f10 * f11;
        float f13 = fMin2 - fMax2;
        float f14 = f10 * f13;
        if (this.mInitialCropWindowRect.width() > 0 && this.mInitialCropWindowRect.height() > 0) {
            rectF.left = (this.mInitialCropWindowRect.left / this.mCropWindowHandler.n()) + fMax;
            rectF.top = (this.mInitialCropWindowRect.top / this.mCropWindowHandler.m()) + fMax2;
            rectF.right = rectF.left + (this.mInitialCropWindowRect.width() / this.mCropWindowHandler.n());
            rectF.bottom = rectF.top + (this.mInitialCropWindowRect.height() / this.mCropWindowHandler.m());
            rectF.left = Math.max(fMax, rectF.left);
            rectF.top = Math.max(fMax2, rectF.top);
            rectF.right = Math.min(fMin, rectF.right);
            rectF.bottom = Math.min(fMin2, rectF.bottom);
        } else if (!this.isFixAspectRatio || fMin <= fMax || fMin2 <= fMax2) {
            rectF.left = fMax + f12;
            rectF.top = fMax2 + f14;
            rectF.right = fMin - f12;
            rectF.bottom = fMin2 - f14;
        } else if (f11 / f13 > this.mTargetAspectRatio) {
            rectF.top = fMax2 + f14;
            rectF.bottom = fMin2 - f14;
            float width = getWidth() / 2.0f;
            this.mTargetAspectRatio = this.mAspectRatioX / this.mAspectRatioY;
            float fMax3 = Math.max(this.mCropWindowHandler.f(), rectF.height() * this.mTargetAspectRatio) / 2.0f;
            rectF.left = width - fMax3;
            rectF.right = width + fMax3;
        } else {
            rectF.left = fMax + f12;
            rectF.right = fMin - f12;
            float height = getHeight() / 2.0f;
            float fMax4 = Math.max(this.mCropWindowHandler.e(), rectF.width() / this.mTargetAspectRatio) / 2.0f;
            rectF.top = height - fMax4;
            rectF.bottom = height + fMax4;
        }
        l(rectF);
        this.mCropWindowHandler.w(rectF);
    }

    private final boolean p() {
        float[] fArr = this.mBoundsPoints;
        return (fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true;
    }

    private final void q(float x10, float y10) {
        u uVar = this.mCropWindowHandler;
        float f10 = this.mTouchRadius;
        CropImageView.d dVar = this.cropShape;
        AbstractC2855l.d(dVar);
        v vVarG = uVar.g(x10, y10, f10, dVar, this.mCenterMoveEnabled);
        this.mMoveHandler = vVarG;
        if (vVarG != null) {
            invalidate();
        }
    }

    private final void r(float x10, float y10) {
        if (this.mMoveHandler != null) {
            float f10 = this.mSnapRadius;
            RectF rectFI = this.mCropWindowHandler.i();
            if (b(rectFI)) {
                f10 = 0.0f;
            }
            v vVar = this.mMoveHandler;
            AbstractC2855l.d(vVar);
            vVar.l(rectFI, x10, y10, this.mCalcBounds, this.mViewWidth, this.mViewHeight, f10, this.isFixAspectRatio, this.mTargetAspectRatio);
            this.mCropWindowHandler.w(rectFI);
            b bVar = this.mCropWindowChangeListener;
            if (bVar != null) {
                bVar.a(true);
            }
            invalidate();
        }
    }

    private final void s() {
        if (this.mMoveHandler != null) {
            this.mMoveHandler = null;
            b bVar = this.mCropWindowChangeListener;
            if (bVar != null) {
                bVar.a(false);
            }
            invalidate();
        }
    }

    private final void y() {
        RectF rectFI = this.mCropWindowHandler.i();
        List systemGestureExclusionRects = getSystemGestureExclusionRects();
        AbstractC2855l.f(systemGestureExclusionRects, "getSystemGestureExclusionRects(...)");
        Rect rect = (Rect) (systemGestureExclusionRects.size() > 0 ? systemGestureExclusionRects.get(0) : new Rect());
        List systemGestureExclusionRects2 = getSystemGestureExclusionRects();
        AbstractC2855l.f(systemGestureExclusionRects2, "getSystemGestureExclusionRects(...)");
        Rect rect2 = (Rect) (1 < systemGestureExclusionRects2.size() ? systemGestureExclusionRects2.get(1) : new Rect());
        List systemGestureExclusionRects3 = getSystemGestureExclusionRects();
        AbstractC2855l.f(systemGestureExclusionRects3, "getSystemGestureExclusionRects(...)");
        Rect rect3 = (Rect) (2 < systemGestureExclusionRects3.size() ? systemGestureExclusionRects3.get(2) : new Rect());
        float f10 = rectFI.left;
        float f11 = this.mTouchRadius;
        int i10 = (int) (f10 - f11);
        rect.left = i10;
        int i11 = (int) (rectFI.right + f11);
        rect.right = i11;
        float f12 = rectFI.top;
        int i12 = (int) (f12 - f11);
        rect.top = i12;
        float f13 = this.maxVerticalGestureExclusion;
        rect.bottom = (int) (i12 + (f13 * 0.3f));
        rect2.left = i10;
        rect2.right = i11;
        float f14 = rectFI.bottom;
        int i13 = (int) (((f12 + f14) / 2.0f) - (0.2f * f13));
        rect2.top = i13;
        rect2.bottom = (int) (i13 + (0.4f * f13));
        rect3.left = rect.left;
        rect3.right = rect.right;
        int i14 = (int) (f14 + f11);
        rect3.bottom = i14;
        rect3.top = (int) (i14 - (f13 * 0.3f));
        setSystemGestureExclusionRects(AbstractC2800q.m(rect, rect2, rect3));
    }

    /* JADX INFO: renamed from: getAspectRatioX, reason: from getter */
    public final int getMAspectRatioX() {
        return this.mAspectRatioX;
    }

    /* JADX INFO: renamed from: getAspectRatioY, reason: from getter */
    public final int getMAspectRatioY() {
        return this.mAspectRatioY;
    }

    public final CropImageView.b getCornerShape() {
        return this.cornerShape;
    }

    public final CropImageView.d getCropShape() {
        return this.cropShape;
    }

    public final RectF getCropWindowRect() {
        return this.mCropWindowHandler.i();
    }

    public final CropImageView.e getGuidelines() {
        return this.guidelines;
    }

    /* JADX INFO: renamed from: getInitialCropWindowRect, reason: from getter */
    public final Rect getMInitialCropWindowRect() {
        return this.mInitialCropWindowRect;
    }

    public final void m() {
        RectF cropWindowRect = getCropWindowRect();
        l(cropWindowRect);
        this.mCropWindowHandler.w(cropWindowRect);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsFixAspectRatio() {
        return this.isFixAspectRatio;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC2855l.g(canvas, "canvas");
        super.onDraw(canvas);
        c(canvas);
        if (this.mCropWindowHandler.x()) {
            CropImageView.e eVar = this.guidelines;
            if (eVar == CropImageView.e.f19477i) {
                j(canvas);
            } else if (eVar == CropImageView.e.f19476h && this.mMoveHandler != null) {
                j(canvas);
            }
        }
        Companion companion = INSTANCE;
        CropImageOptions cropImageOptions = this.mOptions;
        this.mBorderCornerPaint = companion.b(cropImageOptions != null ? cropImageOptions.borderCornerThickness : 0.0f, cropImageOptions != null ? cropImageOptions.borderCornerColor : -1);
        i(canvas);
        d(canvas);
        h(canvas);
        if (Build.VERSION.SDK_INT >= 29) {
            y();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        ScaleGestureDetector scaleGestureDetector;
        AbstractC2855l.g(event, "event");
        if (!isEnabled()) {
            return false;
        }
        if (this.mMultiTouchEnabled && (scaleGestureDetector = this.mScaleDetector) != null) {
            scaleGestureDetector.onTouchEvent(event);
        }
        int action = event.getAction();
        if (action == 0) {
            this.currentPointerId = Integer.valueOf(event.getPointerId(0));
            q(event.getX(), event.getY());
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                Integer num = this.currentPointerId;
                int pointerId = event.getPointerId(0);
                if (num == null || num.intValue() != pointerId) {
                    return false;
                }
                r(event.getX(), event.getY());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        this.currentPointerId = Integer.valueOf(event.getPointerId(0));
        getParent().requestDisallowInterceptTouchEvent(false);
        s();
        return true;
    }

    public final void setAspectRatioX(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.mAspectRatioX != i10) {
            this.mAspectRatioX = i10;
            this.mTargetAspectRatio = i10 / this.mAspectRatioY;
            if (this.initializedCropWindow) {
                n();
                invalidate();
            }
        }
    }

    public final void setAspectRatioY(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.mAspectRatioY != i10) {
            this.mAspectRatioY = i10;
            this.mTargetAspectRatio = this.mAspectRatioX / i10;
            if (this.initializedCropWindow) {
                n();
                invalidate();
            }
        }
    }

    public final void setCropCornerRadius(float cornerRadius) {
        this.mCropCornerRadius = cornerRadius;
    }

    public final void setCropCornerShape(CropImageView.b cropCornerShape) {
        AbstractC2855l.g(cropCornerShape, "cropCornerShape");
        if (this.cornerShape != cropCornerShape) {
            this.cornerShape = cropCornerShape;
            invalidate();
        }
    }

    public final void setCropLabelText(String textLabel) {
        if (textLabel != null) {
            this.cropLabelText = textLabel;
        }
    }

    public final void setCropLabelTextColor(int textColor) {
        this.cropLabelTextColor = textColor;
        invalidate();
    }

    public final void setCropLabelTextSize(float textSize) {
        this.cropLabelTextSize = textSize;
        invalidate();
    }

    public final void setCropShape(CropImageView.d cropShape) {
        AbstractC2855l.g(cropShape, "cropShape");
        if (this.cropShape != cropShape) {
            this.cropShape = cropShape;
            invalidate();
        }
    }

    public final void setCropWindowChangeListener(b listener) {
        this.mCropWindowChangeListener = listener;
    }

    public final void setCropWindowRect(RectF rect) {
        AbstractC2855l.g(rect, "rect");
        this.mCropWindowHandler.w(rect);
    }

    public final void setCropperTextLabelVisibility(boolean isEnabled) {
        this.isCropLabelEnabled = isEnabled;
        invalidate();
    }

    public final void setFixedAspectRatio(boolean fixAspectRatio) {
        if (this.isFixAspectRatio != fixAspectRatio) {
            this.isFixAspectRatio = fixAspectRatio;
            if (this.initializedCropWindow) {
                n();
                invalidate();
            }
        }
    }

    public final void setGuidelines(CropImageView.e guidelines) {
        AbstractC2855l.g(guidelines, "guidelines");
        if (this.guidelines != guidelines) {
            this.guidelines = guidelines;
            if (this.initializedCropWindow) {
                invalidate();
            }
        }
    }

    public final void setInitialAttributeValues(CropImageOptions options) {
        b bVar;
        AbstractC2855l.g(options, "options");
        boolean zB = AbstractC2855l.b(this.mOptions, options);
        CropImageOptions cropImageOptions = this.mOptions;
        boolean z10 = cropImageOptions == null || options.fixAspectRatio != cropImageOptions.fixAspectRatio || cropImageOptions == null || options.aspectRatioX != cropImageOptions.aspectRatioX || cropImageOptions == null || options.aspectRatioY != cropImageOptions.aspectRatioY;
        this.mOptions = options;
        this.mCropWindowHandler.v(options.minCropResultWidth, options.minCropResultHeight);
        this.mCropWindowHandler.u(options.maxCropResultWidth, options.maxCropResultHeight);
        if (zB) {
            return;
        }
        this.mCropWindowHandler.t(options);
        this.cropLabelTextColor = options.cropperLabelTextColor;
        this.cropLabelTextSize = options.cropperLabelTextSize;
        String str = options.cropperLabelText;
        if (str == null) {
            str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        this.cropLabelText = str;
        this.isCropLabelEnabled = options.showCropLabel;
        this.mCropCornerRadius = options.cropCornerRadius;
        this.cornerShape = options.cornerShape;
        this.cropShape = options.cropShape;
        this.mSnapRadius = options.snapRadius;
        setEnabled(options.canChangeCropWindow);
        this.guidelines = options.guidelines;
        this.isFixAspectRatio = options.fixAspectRatio;
        setAspectRatioX(options.aspectRatioX);
        setAspectRatioY(options.aspectRatioY);
        boolean z11 = options.multiTouchEnabled;
        this.mMultiTouchEnabled = z11;
        if (z11 && this.mScaleDetector == null) {
            this.mScaleDetector = new ScaleGestureDetector(getContext(), new c());
        }
        this.mCenterMoveEnabled = options.centerMoveEnabled;
        this.mTouchRadius = options.touchRadius;
        this.mInitialCropWindowPaddingRatio = options.initialCropWindowPaddingRatio;
        Companion companion = INSTANCE;
        this.mBorderPaint = companion.b(options.borderLineThickness, options.borderLineColor);
        this.mBorderCornerOffset = options.borderCornerOffset;
        this.mBorderCornerLength = options.borderCornerLength;
        this.mCircleCornerFillColor = Integer.valueOf(options.circleCornerFillColorHexValue);
        this.mBorderCornerPaint = companion.b(options.borderCornerThickness, options.borderCornerColor);
        this.mGuidelinePaint = companion.b(options.guidelinesThickness, options.guidelinesColor);
        this.mBackgroundPaint = companion.a(options.backgroundColor);
        this.textLabelPaint = companion.d(options);
        if (z10) {
            n();
        }
        invalidate();
        if (!z10 || (bVar = this.mCropWindowChangeListener) == null) {
            return;
        }
        bVar.a(false);
    }

    public final void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.mInitialCropWindowRect;
        if (rect == null) {
            rect = com.canhub.cropper.d.f19592a.o();
        }
        rect2.set(rect);
        if (this.initializedCropWindow) {
            n();
            invalidate();
            b bVar = this.mCropWindowChangeListener;
            if (bVar != null) {
                bVar.a(false);
            }
        }
    }

    public final void setSnapRadius(float snapRadius) {
        this.mSnapRadius = snapRadius;
    }

    public final void t() {
        if (this.initializedCropWindow) {
            setCropWindowRect(com.canhub.cropper.d.f19592a.p());
            n();
            invalidate();
        }
    }

    public final void u(float[] boundsPoints, int viewWidth, int viewHeight) {
        if (boundsPoints == null || !Arrays.equals(this.mBoundsPoints, boundsPoints)) {
            if (boundsPoints == null) {
                Arrays.fill(this.mBoundsPoints, 0.0f);
            } else {
                System.arraycopy(boundsPoints, 0, this.mBoundsPoints, 0, boundsPoints.length);
            }
            this.mViewWidth = viewWidth;
            this.mViewHeight = viewHeight;
            RectF rectFI = this.mCropWindowHandler.i();
            if (rectFI.width() == 0.0f || rectFI.height() == 0.0f) {
                n();
            }
        }
    }

    public final boolean v(boolean centerMoveEnabled) {
        if (this.mCenterMoveEnabled == centerMoveEnabled) {
            return false;
        }
        this.mCenterMoveEnabled = centerMoveEnabled;
        return true;
    }

    public final void w(float maxWidth, float maxHeight, float scaleFactorWidth, float scaleFactorHeight) {
        this.mCropWindowHandler.s(maxWidth, maxHeight, scaleFactorWidth, scaleFactorHeight);
    }

    public final boolean x(boolean multiTouchEnabled) {
        if (this.mMultiTouchEnabled == multiTouchEnabled) {
            return false;
        }
        this.mMultiTouchEnabled = multiTouchEnabled;
        if (!multiTouchEnabled || this.mScaleDetector != null) {
            return true;
        }
        this.mScaleDetector = new ScaleGestureDetector(getContext(), new c());
        return true;
    }
}
