.class public final Lcom/facebook/react/views/text/PreparedLayoutTextView;
.super Landroid/view/ViewGroup;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/uimanager/ReactCompoundView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/text/PreparedLayoutTextView$Api34Utils;,
        Lcom/facebook/react/views/text/PreparedLayoutTextView$Companion;,
        Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\r\n\u0002\u0008\u0007\u0008\u0001\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0003\\][B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ5\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\u0008\u0000\u0010\n2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\tJ\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J7\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001d\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b\u00a2\u0006\u0004\u0008#\u0010$J\r\u0010%\u001a\u00020\u0007\u00a2\u0006\u0004\u0008%\u0010\tJ\u0017\u0010(\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u0017\u0010*\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008*\u0010)J)\u0010/\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u000b2\u0008\u0010.\u001a\u0004\u0018\u00010-H\u0016\u00a2\u0006\u0004\u0008/\u00100J\u0017\u00102\u001a\u00020\u00192\u0006\u0010\'\u001a\u000201H\u0016\u00a2\u0006\u0004\u00082\u00103J\u000f\u00104\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u00084\u00105J\u001f\u00109\u001a\u00020\u000b2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u000206H\u0016\u00a2\u0006\u0004\u00089\u0010:R\u001c\u0010=\u001a\u0008\u0012\u0004\u0012\u00020<0;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR.\u0010D\u001a\u0004\u0018\u00010B2\u0008\u0010C\u001a\u0004\u0018\u00010B8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008D\u0010E\u001a\u0004\u0008F\u0010G\"\u0004\u0008H\u0010IR*\u0010K\u001a\u00020J2\u0006\u0010C\u001a\u00020J8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008K\u0010L\u001a\u0004\u0008M\u0010N\"\u0004\u0008O\u0010PR$\u0010Q\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008Q\u0010R\u001a\u0004\u0008S\u0010T\"\u0004\u0008U\u0010VR\u0013\u0010Z\u001a\u0004\u0018\u00010W8G\u00a2\u0006\u0006\u001a\u0004\u0008X\u0010Y\u00a8\u0006^"
    }
    d2 = {
        "Lcom/facebook/react/views/text/PreparedLayoutTextView;",
        "Landroid/view/ViewGroup;",
        "Lcom/facebook/react/uimanager/ReactCompoundView;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Li7/B;",
        "initView",
        "()V",
        "T",
        "",
        "x",
        "y",
        "Ljava/lang/Class;",
        "clazz",
        "getSpanInCoords",
        "(IILjava/lang/Class;)Ljava/lang/Object;",
        "getTextOffsetAt",
        "(II)I",
        "recycleView",
        "Landroid/graphics/Canvas;",
        "canvas",
        "onDraw",
        "(Landroid/graphics/Canvas;)V",
        "",
        "changed",
        "l",
        "t",
        "r",
        "b",
        "onLayout",
        "(ZIIII)V",
        "start",
        "end",
        "setSelection",
        "(II)V",
        "clearSelection",
        "Landroid/view/MotionEvent;",
        "event",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "dispatchHoverEvent",
        "gainFocus",
        "direction",
        "Landroid/graphics/Rect;",
        "previouslyFocusedRect",
        "onFocusChanged",
        "(ZILandroid/graphics/Rect;)V",
        "Landroid/view/KeyEvent;",
        "dispatchKeyEvent",
        "(Landroid/view/KeyEvent;)Z",
        "hasOverlappingRendering",
        "()Z",
        "",
        "touchX",
        "touchY",
        "reactTagForTouch",
        "(FF)I",
        "",
        "Landroid/text/style/ClickableSpan;",
        "clickableSpans",
        "Ljava/util/List;",
        "Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;",
        "selection",
        "Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;",
        "Lcom/facebook/react/views/text/PreparedLayout;",
        "value",
        "preparedLayout",
        "Lcom/facebook/react/views/text/PreparedLayout;",
        "getPreparedLayout",
        "()Lcom/facebook/react/views/text/PreparedLayout;",
        "setPreparedLayout",
        "(Lcom/facebook/react/views/text/PreparedLayout;)V",
        "Lcom/facebook/react/uimanager/style/Overflow;",
        "overflow",
        "Lcom/facebook/react/uimanager/style/Overflow;",
        "getOverflow",
        "()Lcom/facebook/react/uimanager/style/Overflow;",
        "setOverflow",
        "(Lcom/facebook/react/uimanager/style/Overflow;)V",
        "selectionColor",
        "Ljava/lang/Integer;",
        "getSelectionColor",
        "()Ljava/lang/Integer;",
        "setSelectionColor",
        "(Ljava/lang/Integer;)V",
        "",
        "getText",
        "()Ljava/lang/CharSequence;",
        "text",
        "Companion",
        "Api34Utils",
        "TextSelection",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final Companion:Lcom/facebook/react/views/text/PreparedLayoutTextView$Companion;

.field private static final selectionPaint:Landroid/graphics/Paint;


# instance fields
.field private clickableSpans:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Landroid/text/style/ClickableSpan;",
            ">;"
        }
    .end annotation
.end field

.field private overflow:Lcom/facebook/react/uimanager/style/Overflow;

.field private preparedLayout:Lcom/facebook/react/views/text/PreparedLayout;

.field private selection:Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;

.field private selectionColor:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/text/PreparedLayoutTextView$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/PreparedLayoutTextView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->Companion:Lcom/facebook/react/views/text/PreparedLayoutTextView$Companion;

    .line 8
    .line 9
    new-instance v0, Landroid/graphics/Paint;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->selectionPaint:Landroid/graphics/Paint;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->clickableSpans:Ljava/util/List;

    .line 14
    .line 15
    sget-object p1, Lcom/facebook/react/uimanager/style/Overflow;->HIDDEN:Lcom/facebook/react/uimanager/style/Overflow;

    .line 16
    .line 17
    iput-object p1, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->overflow:Lcom/facebook/react/uimanager/style/Overflow;

    .line 18
    .line 19
    invoke-direct {p0}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->initView()V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private final getSpanInCoords(IILjava/lang/Class;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(II",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->getTextOffsetAt(II)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, 0x0

    .line 6
    if-gez p1, :cond_0

    .line 7
    .line 8
    return-object p2

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->getText()Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v1, v0, Landroid/text/Spanned;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast v0, Landroid/text/Spanned;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object v0, p2

    .line 21
    :goto_0
    if-nez v0, :cond_2

    .line 22
    .line 23
    return-object p2

    .line 24
    :cond_2
    invoke-interface {v0, p1, p1, p3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    invoke-static {p3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    array-length v1, p3

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return-object p2

    .line 35
    :cond_3
    array-length v1, p3

    .line 36
    const/4 v2, 0x2

    .line 37
    if-gt v1, v2, :cond_a

    .line 38
    .line 39
    invoke-static {p3}, Lkotlin/jvm/internal/b;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    :cond_4
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_9

    .line 48
    .line 49
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v0, v1}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    and-int/lit8 v3, v2, 0x12

    .line 58
    .line 59
    if-nez v3, :cond_6

    .line 60
    .line 61
    and-int/lit8 v4, v2, 0x11

    .line 62
    .line 63
    if-eqz v4, :cond_5

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_5
    invoke-interface {v0, v1}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    add-int/lit8 v4, v4, 0x1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_6
    :goto_1
    invoke-interface {v0, v1}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    :goto_2
    if-nez v3, :cond_8

    .line 78
    .line 79
    and-int/lit8 v2, v2, 0x22

    .line 80
    .line 81
    if-eqz v2, :cond_7

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_7
    invoke-interface {v0, v1}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    add-int/lit8 v2, v2, -0x1

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_8
    :goto_3
    invoke-interface {v0, v1}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    :goto_4
    if-lt p1, v4, :cond_4

    .line 96
    .line 97
    if-gt p1, v2, :cond_4

    .line 98
    .line 99
    return-object v1

    .line 100
    :cond_9
    return-object p2

    .line 101
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 102
    .line 103
    const-string p2, "Check failed."

    .line 104
    .line 105
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p1
.end method

.method private final getTextOffsetAt(II)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int/2addr p1, v0

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->preparedLayout:Lcom/facebook/react/views/text/PreparedLayout;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/facebook/react/views/text/PreparedLayout;->getVerticalOffset()F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {v1}, Ly7/a;->c(F)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v1, v2

    .line 25
    :goto_0
    add-int/2addr v0, v1

    .line 26
    sub-int/2addr p2, v0

    .line 27
    iget-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->preparedLayout:Lcom/facebook/react/views/text/PreparedLayout;

    .line 28
    .line 29
    const/4 v1, -0x1

    .line 30
    if-eqz v0, :cond_7

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/facebook/react/views/text/PreparedLayout;->getLayout()Landroid/text/Layout;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto :goto_4

    .line 39
    :cond_1
    invoke-virtual {v0, p2}, Landroid/text/Layout;->getLineForVertical(I)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    invoke-virtual {v0}, Landroid/text/Layout;->getAlignment()Landroid/text/Layout$Alignment;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 48
    .line 49
    if-ne v3, v4, :cond_2

    .line 50
    .line 51
    invoke-virtual {v0, p2}, Landroid/text/Layout;->getLineLeft(I)F

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-virtual {v0, p2}, Landroid/text/Layout;->getLineRight(I)F

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    goto :goto_3

    .line 60
    :cond_2
    invoke-virtual {v0, p2}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-ne v3, v1, :cond_3

    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    :cond_3
    if-eqz v2, :cond_4

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/text/Layout;->getWidth()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    int-to-float v3, v3

    .line 74
    invoke-virtual {v0, p2}, Landroid/text/Layout;->getLineMax(I)F

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    sub-float/2addr v3, v4

    .line 79
    goto :goto_1

    .line 80
    :cond_4
    invoke-virtual {v0, p2}, Landroid/text/Layout;->getParagraphLeft(I)I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    int-to-float v3, v3

    .line 85
    :goto_1
    if-eqz v2, :cond_5

    .line 86
    .line 87
    invoke-virtual {v0, p2}, Landroid/text/Layout;->getParagraphRight(I)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    int-to-float v2, v2

    .line 92
    goto :goto_2

    .line 93
    :cond_5
    invoke-virtual {v0, p2}, Landroid/text/Layout;->getLineMax(I)F

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    :goto_2
    move v5, v3

    .line 98
    move v3, v2

    .line 99
    move v2, v5

    .line 100
    :goto_3
    int-to-float p1, p1

    .line 101
    cmpg-float v2, p1, v2

    .line 102
    .line 103
    if-ltz v2, :cond_7

    .line 104
    .line 105
    cmpl-float v2, p1, v3

    .line 106
    .line 107
    if-lez v2, :cond_6

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_6
    :try_start_0
    invoke-virtual {v0, p2, p1}, Landroid/text/Layout;->getOffsetForHorizontal(IF)I

    .line 111
    .line 112
    .line 113
    move-result p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    return p1

    .line 115
    :catch_0
    :cond_7
    :goto_4
    return v1
.end method

.method private final initView()V
    .locals 1

    .line 1
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->clickableSpans:Ljava/util/List;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->selection:Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->setPreparedLayout(Lcom/facebook/react/views/text/PreparedLayout;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final clearSelection()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->selection:Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public dispatchHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchHoverEvent(Landroid/view/MotionEvent;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/core/view/a0;->k(Landroid/view/View;)Landroidx/core/view/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast v0, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroidx/customview/widget/a;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    :goto_0
    const/4 p1, 0x1

    .line 30
    return p1

    .line 31
    :cond_1
    const/4 p1, 0x0

    .line 32
    return p1
.end method

.method public final getOverflow()Lcom/facebook/react/uimanager/style/Overflow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->overflow:Lcom/facebook/react/uimanager/style/Overflow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPreparedLayout()Lcom/facebook/react/views/text/PreparedLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->preparedLayout:Lcom/facebook/react/views/text/PreparedLayout;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSelectionColor()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->selectionColor:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getText()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->preparedLayout:Lcom/facebook/react/views/text/PreparedLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/views/text/PreparedLayout;->getLayout()Landroid/text/Layout;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method

.method public hasOverlappingRendering()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->overflow:Lcom/facebook/react/uimanager/style/Overflow;

    .line 7
    .line 8
    sget-object v1, Lcom/facebook/react/uimanager/style/Overflow;->VISIBLE:Lcom/facebook/react/uimanager/style/Overflow;

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->clipToPaddingBox(Landroid/view/View;Landroid/graphics/Canvas;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    int-to-float v0, v0

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    int-to-float v1, v1

    .line 28
    iget-object v2, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->preparedLayout:Lcom/facebook/react/views/text/PreparedLayout;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v2}, Lcom/facebook/react/views/text/PreparedLayout;->getVerticalOffset()F

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v2, 0x0

    .line 38
    :goto_0
    add-float/2addr v1, v2

    .line 39
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->preparedLayout:Lcom/facebook/react/views/text/PreparedLayout;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/facebook/react/views/text/PreparedLayout;->getLayout()Landroid/text/Layout;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move-object v0, v1

    .line 53
    :goto_1
    if-eqz v0, :cond_8

    .line 54
    .line 55
    iget-object v2, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->selection:Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;

    .line 56
    .line 57
    if-eqz v2, :cond_4

    .line 58
    .line 59
    sget-object v2, Lcom/facebook/react/views/text/PreparedLayoutTextView;->selectionPaint:Landroid/graphics/Paint;

    .line 60
    .line 61
    iget-object v3, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->selectionColor:Ljava/lang/Integer;

    .line 62
    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    const-string v4, "getContext(...)"

    .line 75
    .line 76
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v3}, Lcom/facebook/react/views/text/DefaultStyleValuesUtil;->getDefaultTextColorHighlight(Landroid/content/Context;)I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    :goto_2
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 84
    .line 85
    .line 86
    :cond_4
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 87
    .line 88
    const/16 v3, 0x22

    .line 89
    .line 90
    if-lt v2, v3, :cond_6

    .line 91
    .line 92
    sget-object v2, Lcom/facebook/react/views/text/PreparedLayoutTextView$Api34Utils;->INSTANCE:Lcom/facebook/react/views/text/PreparedLayoutTextView$Api34Utils;

    .line 93
    .line 94
    iget-object v3, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->selection:Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;

    .line 95
    .line 96
    if-eqz v3, :cond_5

    .line 97
    .line 98
    invoke-virtual {v3}, Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;->getPath()Landroid/graphics/Path;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    :cond_5
    sget-object v3, Lcom/facebook/react/views/text/PreparedLayoutTextView;->selectionPaint:Landroid/graphics/Paint;

    .line 103
    .line 104
    invoke-virtual {v2, v0, p1, v1, v3}, Lcom/facebook/react/views/text/PreparedLayoutTextView$Api34Utils;->draw(Landroid/text/Layout;Landroid/graphics/Canvas;Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_6
    iget-object v2, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->selection:Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;

    .line 109
    .line 110
    if-eqz v2, :cond_7

    .line 111
    .line 112
    invoke-virtual {v2}, Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;->getPath()Landroid/graphics/Path;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    :cond_7
    sget-object v2, Lcom/facebook/react/views/text/PreparedLayoutTextView;->selectionPaint:Landroid/graphics/Paint;

    .line 117
    .line 118
    const/4 v3, 0x0

    .line 119
    invoke-virtual {v0, p1, v1, v2, v3}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;Landroid/graphics/Path;Landroid/graphics/Paint;I)V

    .line 120
    .line 121
    .line 122
    :cond_8
    return-void
.end method

.method public onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->clickableSpans:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->clearSelection()V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Landroidx/core/view/a0;->k(Landroid/view/View;)Landroidx/core/view/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    instance-of v1, v0, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    check-cast v0, Lcom/facebook/react/views/text/ReactTextViewAccessibilityDelegate;

    .line 28
    .line 29
    invoke-virtual {v0, p1, p2, p3}, Landroidx/customview/widget/a;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_6

    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->clickableSpans:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x3

    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->clearSelection()V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    return p1

    .line 33
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    float-to-int v1, v1

    .line 38
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    float-to-int v2, v2

    .line 43
    const-class v3, Landroid/text/style/ClickableSpan;

    .line 44
    .line 45
    invoke-direct {p0, v1, v2, v3}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->getSpanInCoords(IILjava/lang/Class;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Landroid/text/style/ClickableSpan;

    .line 50
    .line 51
    if-nez v1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->clearSelection()V

    .line 54
    .line 55
    .line 56
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    return p1

    .line 61
    :cond_2
    const/4 p1, 0x1

    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    if-eq v0, p1, :cond_3

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    invoke-virtual {p0}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->clearSelection()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, p0}, Landroid/text/style/ClickableSpan;->onClick(Landroid/view/View;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    iget-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->preparedLayout:Lcom/facebook/react/views/text/PreparedLayout;

    .line 75
    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/facebook/react/views/text/PreparedLayout;->getLayout()Landroid/text/Layout;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    const-string v3, "null cannot be cast to non-null type android.text.Spanned"

    .line 87
    .line 88
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    check-cast v2, Landroid/text/Spanned;

    .line 92
    .line 93
    invoke-interface {v2, v1}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    check-cast v0, Landroid/text/Spanned;

    .line 105
    .line 106
    invoke-interface {v0, v1}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    invoke-virtual {p0, v2, v0}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->setSelection(II)V

    .line 111
    .line 112
    .line 113
    :goto_0
    return p1

    .line 114
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 115
    .line 116
    const-string v0, "Required value was null."

    .line 117
    .line 118
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p1

    .line 122
    :cond_6
    :goto_1
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    return p1
.end method

.method public reactTagForTouch(FF)I
    .locals 1

    .line 1
    invoke-static {p1}, Ly7/a;->c(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p2}, Ly7/a;->c(F)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const-class v0, Lcom/facebook/react/views/text/internal/span/ReactFragmentIndexSpan;

    .line 10
    .line 11
    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->getSpanInCoords(IILjava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lcom/facebook/react/views/text/internal/span/ReactFragmentIndexSpan;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/facebook/react/views/text/internal/span/ReactFragmentIndexSpan;->getFragmentIndex()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget-object p2, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->preparedLayout:Lcom/facebook/react/views/text/PreparedLayout;

    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p2}, Lcom/facebook/react/views/text/PreparedLayout;->getReactTags()[I

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    aget p1, p2, p1

    .line 32
    .line 33
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    :goto_0
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1

    .line 46
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1
.end method

.method public final recycleView()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lcom/facebook/react/uimanager/BackgroundStyleApplicator;->reset(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lcom/facebook/react/uimanager/style/Overflow;->HIDDEN:Lcom/facebook/react/uimanager/style/Overflow;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->setOverflow(Lcom/facebook/react/uimanager/style/Overflow;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setOverflow(Lcom/facebook/react/uimanager/style/Overflow;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->overflow:Lcom/facebook/react/uimanager/style/Overflow;

    .line 7
    .line 8
    if-eq v0, p1, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->overflow:Lcom/facebook/react/uimanager/style/Overflow;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final setPreparedLayout(Lcom/facebook/react/views/text/PreparedLayout;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->preparedLayout:Lcom/facebook/react/views/text/PreparedLayout;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_5

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->selection:Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->preparedLayout:Lcom/facebook/react/views/text/PreparedLayout;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/facebook/react/views/text/PreparedLayout;->getLayout()Landroid/text/Layout;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v1, 0x0

    .line 31
    :goto_0
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p1}, Lcom/facebook/react/views/text/PreparedLayout;->getLayout()Landroid/text/Layout;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/facebook/react/views/text/PreparedLayout;->getLayout()Landroid/text/Layout;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0}, Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;->getStart()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-virtual {v0}, Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;->getEnd()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    invoke-virtual {v0}, Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;->getPath()Landroid/graphics/Path;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v1, v2, v3, v0}, Landroid/text/Layout;->getSelectionPath(IILandroid/graphics/Path;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->clearSelection()V

    .line 74
    .line 75
    .line 76
    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/facebook/react/views/text/PreparedLayout;->getLayout()Landroid/text/Layout;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    if-eqz v0, :cond_3

    .line 89
    .line 90
    sget-object v1, Lcom/facebook/react/views/text/PreparedLayoutTextView;->Companion:Lcom/facebook/react/views/text/PreparedLayoutTextView$Companion;

    .line 91
    .line 92
    invoke-static {v1, v0}, Lcom/facebook/react/views/text/PreparedLayoutTextView$Companion;->access$filterClickableSpans(Lcom/facebook/react/views/text/PreparedLayoutTextView$Companion;Ljava/lang/CharSequence;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-nez v0, :cond_4

    .line 97
    .line 98
    :cond_3
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    :cond_4
    iput-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->clickableSpans:Ljava/util/List;

    .line 103
    .line 104
    iput-object p1, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->preparedLayout:Lcom/facebook/react/views/text/PreparedLayout;

    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 107
    .line 108
    .line 109
    :cond_5
    return-void
.end method

.method public final setSelection(II)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->preparedLayout:Lcom/facebook/react/views/text/PreparedLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/views/text/PreparedLayout;->getLayout()Landroid/text/Layout;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-ltz p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-gt p2, v1, :cond_1

    .line 20
    .line 21
    if-ge p1, p2, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->selection:Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    new-instance v1, Landroid/graphics/Path;

    .line 28
    .line 29
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1, p2, v1}, Landroid/text/Layout;->getSelectionPath(IILandroid/graphics/Path;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;

    .line 36
    .line 37
    invoke-direct {v0, p1, p2, v1}, Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;-><init>(IILandroid/graphics/Path;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->selection:Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {v1, p1}, Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;->setStart(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p2}, Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;->setEnd(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;->getPath()Landroid/graphics/Path;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, p1, p2, v1}, Landroid/text/Layout;->getSelectionPath(IILandroid/graphics/Path;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    new-instance v2, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v3, "setSelection start and end are not in valid range. start: "

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string p1, ", end: "

    .line 84
    .line 85
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string p1, ", text length: "

    .line 92
    .line 93
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v1

    .line 107
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 108
    .line 109
    const-string p2, "Required value was null."

    .line 110
    .line 111
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p1
.end method

.method public final setSelectionColor(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/text/PreparedLayoutTextView;->selectionColor:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method
