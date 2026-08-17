.class public final synthetic Lcom/swmansion/rnscreens/L;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic g:Lkotlin/jvm/internal/C;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/C;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/swmansion/rnscreens/L;->g:Lkotlin/jvm/internal/C;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/L;->g:Lkotlin/jvm/internal/C;

    .line 2
    .line 3
    check-cast p1, Lcom/swmansion/rnscreens/G;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lcom/swmansion/rnscreens/S;->G(Lkotlin/jvm/internal/C;Lcom/swmansion/rnscreens/G;)Z

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
