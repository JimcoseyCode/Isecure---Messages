.class public final synthetic Lcom/swmansion/rnscreens/H;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic g:Lcom/swmansion/rnscreens/S;


# direct methods
.method public synthetic constructor <init>(Lcom/swmansion/rnscreens/S;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/swmansion/rnscreens/H;->g:Lcom/swmansion/rnscreens/S;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/H;->g:Lcom/swmansion/rnscreens/S;

    .line 2
    .line 3
    check-cast p1, Lcom/swmansion/rnscreens/G;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lcom/swmansion/rnscreens/S;->D(Lcom/swmansion/rnscreens/S;Lcom/swmansion/rnscreens/G;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
