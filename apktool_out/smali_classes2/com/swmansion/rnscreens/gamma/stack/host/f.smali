.class public final Lcom/swmansion/rnscreens/gamma/stack/host/f;
.super Lcom/swmansion/rnscreens/gamma/stack/host/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:Lcom/swmansion/rnscreens/gamma/stack/screen/a;


# direct methods
.method public constructor <init>(Lcom/swmansion/rnscreens/gamma/stack/screen/a;)V
    .locals 1

    .line 1
    const-string v0, "screen"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/gamma/stack/host/l;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/stack/host/f;->a:Lcom/swmansion/rnscreens/gamma/stack/screen/a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Lcom/swmansion/rnscreens/gamma/stack/screen/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/stack/host/f;->a:Lcom/swmansion/rnscreens/gamma/stack/screen/a;

    .line 2
    .line 3
    return-object v0
.end method
