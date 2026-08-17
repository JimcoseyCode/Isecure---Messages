.class public final synthetic Lcom/swmansion/rnscreens/M;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic g:Lkotlin/jvm/internal/C;

.field public final synthetic h:Lcom/swmansion/rnscreens/S;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/C;Lcom/swmansion/rnscreens/S;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/swmansion/rnscreens/M;->g:Lkotlin/jvm/internal/C;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/swmansion/rnscreens/M;->h:Lcom/swmansion/rnscreens/S;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/M;->g:Lkotlin/jvm/internal/C;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/swmansion/rnscreens/M;->h:Lcom/swmansion/rnscreens/S;

    .line 4
    .line 5
    check-cast p1, Lcom/swmansion/rnscreens/G;

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Lcom/swmansion/rnscreens/S;->E(Lkotlin/jvm/internal/C;Lcom/swmansion/rnscreens/S;Lcom/swmansion/rnscreens/G;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
