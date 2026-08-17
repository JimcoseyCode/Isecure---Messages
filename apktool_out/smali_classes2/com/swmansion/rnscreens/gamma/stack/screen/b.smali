.class public final Lcom/swmansion/rnscreens/gamma/stack/screen/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/lifecycle/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/gamma/stack/screen/b$a;
    }
.end annotation


# instance fields
.field private final g:LP6/c;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/k;LP6/c;)V
    .locals 1

    .line 1
    const-string v0, "screenLifecycle"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "appearanceEventEmitter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lcom/swmansion/rnscreens/gamma/stack/screen/b;->g:LP6/c;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/q;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private final a(Landroidx/lifecycle/r;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Landroidx/lifecycle/r;->getLifecycle()Landroidx/lifecycle/k;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p0}, Landroidx/lifecycle/k;->d(Landroidx/lifecycle/q;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public k(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "event"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/swmansion/rnscreens/gamma/stack/screen/b$a;->a:[I

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    aget p2, v0, p2

    .line 18
    .line 19
    packed-switch p2, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    new-instance p1, Li7/m;

    .line 23
    .line 24
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :pswitch_0
    return-void

    .line 29
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/gamma/stack/screen/b;->a(Landroidx/lifecycle/r;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_2
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/stack/screen/b;->g:LP6/c;

    .line 34
    .line 35
    invoke-interface {p1}, LP6/c;->a()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_3
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/stack/screen/b;->g:LP6/c;

    .line 40
    .line 41
    invoke-interface {p1}, LP6/c;->d()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_4
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/stack/screen/b;->g:LP6/c;

    .line 46
    .line 47
    invoke-interface {p1}, LP6/c;->b()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_5
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/stack/screen/b;->g:LP6/c;

    .line 52
    .line 53
    invoke-interface {p1}, LP6/c;->c()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
