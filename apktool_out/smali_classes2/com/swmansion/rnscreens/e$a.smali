.class public final Lcom/swmansion/rnscreens/e$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/rnscreens/e;-><init>(Landroid/content/Context;Lcom/swmansion/rnscreens/a0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/swmansion/rnscreens/e;


# direct methods
.method constructor <init>(Lcom/swmansion/rnscreens/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/e$a;->a:Lcom/swmansion/rnscreens/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public doFrame(J)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/swmansion/rnscreens/e$a;->a:Lcom/swmansion/rnscreens/e;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    invoke-static {p1, p2}, Lcom/swmansion/rnscreens/e;->S(Lcom/swmansion/rnscreens/e;Z)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/swmansion/rnscreens/e$a;->a:Lcom/swmansion/rnscreens/e;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/high16 v0, -0x80000000

    .line 14
    .line 15
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iget-object v1, p0, Lcom/swmansion/rnscreens/e$a;->a:Lcom/swmansion/rnscreens/e;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/swmansion/rnscreens/e$a;->a:Lcom/swmansion/rnscreens/e;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    iget-object v0, p0, Lcom/swmansion/rnscreens/e$a;->a:Lcom/swmansion/rnscreens/e;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v1, p0, Lcom/swmansion/rnscreens/e$a;->a:Lcom/swmansion/rnscreens/e;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    iget-object v2, p0, Lcom/swmansion/rnscreens/e$a;->a:Lcom/swmansion/rnscreens/e;

    .line 51
    .line 52
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 57
    .line 58
    .line 59
    return-void
.end method
